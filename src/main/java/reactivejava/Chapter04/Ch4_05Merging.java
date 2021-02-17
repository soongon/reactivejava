package reactivejava.Chapter04;

import io.reactivex.rxjava3.core.Observable;

public class Ch4_05Merging {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }
}