package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Conditional03 {
    public static void main(String[] args) {
        Observable<String> items = Observable.just("Alpha", "Beta");
        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    }
}