package modernjava.majorleague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;

public class PlayerAnalysis {
    public static void main(String[] args) throws IOException {
        // 1. 파일을 스트림으로 변환
        Path file = Paths.get(
                "C:\\Users\\Administrator\\IdeaProjects\\hello\\src\\main\\resources\\Salaries.csv");

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
                .filter(p -> p.getYear() == 2016)
                .filter(p -> p.getLeague().equals("AL"))
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
                .peek(p -> System.out.println(p))
                .filter(p -> p.getLeague().equals("NL"))
                .sorted((p1, p2) -> (int)(p2.getSalary() - p1.getSalary()))
                .limit(5)
                .forEach(System.out::println);



    }
}
