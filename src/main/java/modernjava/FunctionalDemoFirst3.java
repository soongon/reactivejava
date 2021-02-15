package modernjava;

public class FunctionalDemoFirst3 {

    public static void main(String[] args) {

        Runnable runnable = () -> { System.out.println("thread run.."); };

        Thread t = new Thread(runnable);
        t.start();
        System.out.println("main thread run..");
    }
}
