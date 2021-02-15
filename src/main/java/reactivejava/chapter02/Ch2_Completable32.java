package reactivejava.chapter02;

import io.reactivex.rxjava3.core.Completable;

public class Ch2_Completable32 {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.println("Done!"));
    }

    private static void runProcess() {
       //run process here
    }
}