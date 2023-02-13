package lambda;

interface Lambda {
    public void testMethod();
}

public class Practice {
    public static void main(String[] args) {
        Lambda lambda = () -> System.out.println("test");
        Lambda newLambda = () -> {
            System.out.println("Test");
            System.out.println("Test number 2");
        };

        newLambda.testMethod();

        System.out.println("**************");
        Thread t1 = new Thread(() -> {
            System.out.println("Inside run method");
            System.out.println("Printing multiple lines");
        });

        t1.start();


    }
}
