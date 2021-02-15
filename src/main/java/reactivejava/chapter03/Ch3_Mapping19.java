package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;
import java.util.Comparator;

public class Ch3_Mapping19 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .sorted(Comparator.comparingInt(String::length))
                .subscribe(System.out::println);
    }
}