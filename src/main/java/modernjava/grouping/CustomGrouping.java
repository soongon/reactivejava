package modernjava.grouping;

import modernjava.majorleague.Player;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class CustomGrouping {
    public static void main(String[] args) throws Exception {
        // 1. 파일을 스트림으로 변환
        var file = Paths.get(
                "C:\\Users\\Administrator\\IdeaProjects\\hello\\src\\main\\resources\\Salaries.csv");

        var collect = Files.lines(file)
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
                        p -> {
                            if (p.getYear() < 2000)
                                return "1990s";
                            else if (p.getYear() < 2010)
                                return "2000s";
                            else
                                return "2010s";
                        }
                ));
        System.out.println(collect.keySet());

        // 연봉 1000만불 이상 "고액연봉"
        // 연봉 100만불에서 1000만불 "일반연봉"
        // 100만불 미만은 "저액연봉"


        var list = Files.lines(file)
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
                .filter(p -> p.getYear() == 2016)
                .filter(p -> p.getTeam().equals("LAD"))
                .filter(p -> p.getSalary() >= 10_000_000)
                .collect(Collectors.toList());
    }
}
