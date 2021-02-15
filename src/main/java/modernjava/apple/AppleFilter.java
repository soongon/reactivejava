package modernjava.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(55, "red"),
                new Apple(85, "green"),
                new Apple(120, "red"),
                new Apple(170, "green")
        );

        //System.out.println(apples);

        List<Apple> result = filterGreenApples(apples);

        List<Apple> result2 = filterApplesByColor(apples, "green");

        List<Apple> result3 =
                filterApples(apples, new RedHeavyApplePredicate());

//        List<Apple> result4 = filterApples(apples, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("green")
//                        && apple.getWeight() < 100;
//            }
//        });

        List<Apple> result4 =
                filterApples(apples,
                        apple -> apple.getColor().equals("green")
                                            && apple.getWeight() < 100);

        // System.out.println(result4);

        Predicate<Apple> p = (a) -> a.getWeight() >= 100;

        List<Apple> list5 =
                filterApples(apples, p.and(a -> a.getColor().equals("red")));
        System.out.println(list5);
    }

    public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : list) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> list, String color) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : list) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterGreenApples(List<Apple> list) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : list) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }
}
