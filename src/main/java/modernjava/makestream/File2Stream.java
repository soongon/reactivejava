package modernjava.makestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File2Stream {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get(
                "C:\\Users\\Administrator\\IdeaProjects\\hello\\src\\main\\resources\\Salaries.csv");


        Files.lines(file)
            .forEach(d -> System.out.println(d));

    }
}
