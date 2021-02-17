package reactivejava.Chapter05;

import io.reactivex.rxjava3.core.Observable;

public class Ch5_12Replay {
    public static void main(String[] args) {
        Observable<String> src = Observable.just("Alpha", "Beta", "Gamma")
                        .replay(1)
                        .autoConnect();
        //Observer 1
        src.subscribe(l -> System.out.println("Observer 1: " + l));

        //Observer 2
        src.subscribe(l -> System.out.println("Observer 2: " + l));
    }
}