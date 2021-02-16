package modernjava.dish;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishAnalysisStream_Exercise {
    public static void main(String[] args) {

        List<Dish> foodList = Dish.menu;

        System.out.println(foodList);

        // 400칼로리 이하의 요리를
        List<Dish> result = foodList.stream()
                .filter(dish -> dish.getCalories() <= 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .collect(Collectors.toList())
                ;

        System.out.println(result);

        // 칼로리순으로 정렬(오름차순)
        // 리스트로 담아서
        // 콘솔에 출력
    }

    /*
    static class MyPredicate implements Predicate<Dish> {
        @Override
        public boolean test(Dish dish) {
            return dish.getCalories() <= 400;
        }
    }
    */
}
