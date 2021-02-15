package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Filtering12 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta")
                .distinctUntilChanged(String::length)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}