package reactivejava.chapter02;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_Maybe31 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta");
        source.firstElement()
                .subscribe(s -> System.out.println("RECEIVED " + s),
                        e -> System.out.println("Error captured: " + e),
                           () -> System.out.println("Done!")
                );
    }
}