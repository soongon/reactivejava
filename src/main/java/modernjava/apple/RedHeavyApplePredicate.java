package modernjava.apple;

import java.util.function.Predicate;

public class RedHeavyApplePredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red") && apple.getWeight() >= 100;
    }
}
