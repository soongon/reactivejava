package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Action51 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .doAfterNext(s -> System.out.println("After: " + s))
                .map(String::length)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}