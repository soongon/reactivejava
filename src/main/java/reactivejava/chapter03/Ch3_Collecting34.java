package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Collecting34 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMap(s -> s.charAt(0))
                .subscribe(s -> System.out.println("Received: " + s));
    }
}