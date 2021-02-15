package modernjava.dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishAnalysisStream {
    public static void main(String[] args) {
        Stream<String> stringStream = Dish.menu.stream()  // make stream Stream<Dish>
                .filter(dish -> dish.getCalories() <= 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName);

        List<String> collect = stringStream.collect(Collectors.toList());

        System.out.println(collect);

    }
}

