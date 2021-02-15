package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Utility66 {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .filter(s -> s.contains("z"))
                .single("Four")
                .subscribe(i -> System.out.println("Received: " + i));
    }
}