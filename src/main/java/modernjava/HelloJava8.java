package modernjava;

public class HelloJava8 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread2());
        t1.start();
        System.out.println("main thread run..");
    }
}


class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("my thread2 running..");
    }
}
