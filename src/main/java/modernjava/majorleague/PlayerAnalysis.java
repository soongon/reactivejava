package modernjava.majorleague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class PlayerAnalysis {
    public static void main(String[] args) throws IOException {
        // 1. 파일을 스트림으로 변환
        Path file = Paths.get(
                "/Users/soongonkim/IdeaProjects/reactivejava/src/main/resources/Salaries.csv");
    /* 최신방
        Files.lines(file)
                .filter(player -> player.contains("AL"))
                .filter(item -> item.contains("2016"))
                ;
        */
        // cf
        /* 옛날 방식.. 이렇게 하시면 안되
        List<String> linesList = Files.readAllLines(file);

        List<String> alList = new ArrayList<>();
        for (String line : linesList) {
            if (line.contains("AL") && line.contains("2016")) {
                alList.add(line);
            }
        }
        */

        // 스트림은 데이터를 immutable 하게 처리..
        // List(legacy)는 mutable 하게 처리 ..:: java9에서 immutableList 제


        OptionalDouble al = Files.lines(file)  // Stream<String>
                .skip(1)
                .map(line -> {
                    String[] splitted = line.split(",");
                    return new Player(
                            Integer.parseInt(splitted[0]),
                            splitted[1],
                            splitted[2],
                            splitted[3],
                            Long.parseLong(splitted[4]));
                }) // Stream<Player>
                .filter(p -> p.getYear() == 2016)  // Stream<Player>
                .filter(p -> p.getLeague().equals("AL"))  // Stream<Player>
                .mapToLong(Player::getSalary) // LongStream
                .average();

        al.ifPresentOrElse(
                d -> System.out.println(d),
                () -> System.out.println(0));


        System.out.println(al.getAsDouble());

        // 1. 아메리칸 리그 2016년도 평균연봉
        // 2. 내셔널리그 2000년도 이후에 연봉 랭크 탑 5
        Files.lines(file)  // Stream<String>
                .skip(1)
                .map(line -> {
                    String[] splitted = line.split(",");
                    return new Player(
                            Integer.parseInt(splitted[0]),
                            splitted[1],
                            splitted[2],
                            splitted[3],
                            Long.parseLong(splitted[4]));
                }) // Stream<Player>
                .filter(p -> p.getYear() >= 2000)
                //.peek(p -> System.out.println(p))
                .filter(p -> p.getLeague().equals("NL"))
                .sorted((p1, p2) -> (int)(p2.getSalary() - p1.getSalary()))
                .limit(5)
                .forEach(System.out::println);



    }
}
