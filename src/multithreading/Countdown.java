package multithreading;

import java.util.concurrent.CountDownLatch;

class testClass extends Thread {
    private CountDownLatch latch;

    public testClass(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        latch.countDown();
    }
}

public class Countdown {
    public static void main(String[] args) {
        CountDownLatch latch;
        latch = new CountDownLatch(2);
        testClass t1 = new testClass(latch);
        testClass t2 = new testClass(latch);
        testClass t3 = new testClass(latch);
        testClass t4 = new testClass(latch);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");
    }
}
