package modernjava.makestream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MakeStreamDemo {

    public static void main(String[] args) {
        // 1. 컬렉션을 스트림으로
        List<String> listOfString = Arrays.asList("a", "b", "c", "d");
        listOfString.stream()
            .forEach(d -> { System.out.println(d); });

        // 2. 배열을 스트림으로
        String[] strArray = new String[] {"a", "2", "3", "4"};
        Stream<String> stream = Arrays.stream(strArray);
        Stream<String> strArray1 = Stream.of(strArray);

        int[] intArray = {1,2,3,4,5};
        IntStream stream1 = Arrays.stream(intArray);
        IntStream intArray1 = IntStream.of(intArray);

        // 3. 숫자 스트림 생성(숫자로된)
        long sum = LongStream.range(1, 100_000L).sum();
        System.out.println(sum);

        // 4. 랜덤넘버 생성 (무한스트림)
        new Random().longs()
            .forEach(d -> System.out.println(d));
    }
}

