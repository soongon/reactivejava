package reactivejava.chapter02;

import io.reactivex.rxjava3.core.Single;

public class Ch2_Single28 {
    public static void main(String[] args) {
        Single.just("Hello!")
                .map(String::length)
                .subscribe(System.out::println,
                        e -> System.out.println("Error captured: " + e));
    }
}