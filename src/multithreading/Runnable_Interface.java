package multithreading;

class runnable_practice implements Runnable {
    private String lock = "lock";

    runnable_practice(String lock) {
        this.lock = lock;
    }

    runnable_practice() {
        this.lock = "lock";
    }

    @Override
    public void run() {
        {
            synchronized (Runnable_Interface.lock) {
                for (int i = 0; i < 1000000; i++) {
//                System.out.println(Thread.currentThread().getName())
                    Runnable_Interface.count++;

                }
            }
        }
    }
}

public class Runnable_Interface {
    public static int count = 0;
    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new runnable_practice(), "T1");
        Thread t2 = new Thread(new runnable_practice(), "T2");

        t1.start();
        t2.start();

//        try {
//            t1.join(10000);
//            System.out.println(t1.isAlive());
//            t2.join(1000);
//        } catch (Exception e){
//
//        }
        Thread.sleep(200);
        System.out.println(count);
    }
}
