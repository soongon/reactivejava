package modernjava.grouping;

import modernjava.majorleague.Player;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorleagueGrouping01 {
    public static void main(String[] args) throws Exception {
        // 1. 파일을 스트림으로 변환
        Path file = Paths.get(
                "C:\\Users\\Administrator\\IdeaProjects\\hello\\src\\main\\resources\\Salaries.csv");

        Map<Integer, Map<Boolean, List<Player>>> collect = Files.lines(file)
                .skip(1)
                .map(line -> {
                    String[] splitted = line.split(",");
                    return new Player(
                            Integer.parseInt(splitted[0]),
                            splitted[1],
                            splitted[2],
                            splitted[3],
                            Long.parseLong(splitted[4]));
                })
                .collect(Collectors.groupingBy(
                        Player::getYear,
                        Collectors.partitioningBy(p -> p.getSalary() > 1_000_000)
                ));

//        Map<String, List<Player>> list = result.get(2015);
//        System.out.println(list.keySet());

        //System.out.println(result.get(2015).get("LAD"));

//        double averageOfTEX2015 = result.get(2016).get("LAD").stream()
//                .mapToLong(p -> p.getSalary())
//                .average()
//                .orElse(0);
//        System.out.println(averageOfTEX2015);
    }
}
