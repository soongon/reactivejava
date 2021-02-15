package reactivejava.chapter02;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_Observable15 {
    public static void main(String[] args) {
        Observable.range(1, 3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}