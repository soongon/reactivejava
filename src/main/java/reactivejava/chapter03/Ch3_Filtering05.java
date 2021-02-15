package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Filtering05 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .filter(s -> s.length() != 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}