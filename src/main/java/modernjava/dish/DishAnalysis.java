package modernjava.dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DishAnalysis {
    public static void main(String[] args) {

        List<Dish> dishes = Dish.menu;

        // 필터링 400칼로리 이하 메뉴
        List<Dish> result = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCalories() <= 400) {
                result.add(dish);
            }
        }

        System.out.println("before: " + result);

        // sorting by calories
        result.sort(Comparator.comparingInt(Dish::getCalories));
        System.out.println("after: " + result);

        List<Dish> finalList = result.subList(0, 2);
        System.out.println("final: " + finalList);

    }
}


