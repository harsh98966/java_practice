package multithreading;

class App extends Thread{
    private int s;
    public App(int s){
        this.s = s;

    }

    @Override
    public void run() {
        synchronized (this){
            method();
        }
    }

    public synchronized void method(){
        for(int i = 0; i < 5; i++){
            Multithreading_Practice.counter++;
        }
    }
}

public class Multithreading_Practice {
    public static int counter = 1;
    public static void main(String[] args) {
        App a1 = new App(1);
        App a2 = new App(2);
        synchronized (a1){
            a1.start();
        }
        synchronized (a2){
            a2.start();
        }
        System.out.println(counter);

    }
}
