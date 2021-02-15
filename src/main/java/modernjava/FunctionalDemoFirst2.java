package modernjava;

public class FunctionalDemoFirst2 {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread run..");
            }
        });
        t.start();
        System.out.println("main thread run..");
    }
}
