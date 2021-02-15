package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Collecting33 {
    public static void main(String[] args) {
        Observable.just("Beta", "Gamma", "Alpha")
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}