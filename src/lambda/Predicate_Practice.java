package lambda;

import java.util.function.IntPredicate;

interface test{
    static void testMethod(){
        System.out.println("This method is static");
    }

//    void testMethod2(){
//
//    }
}
public class Predicate_Practice {

    public static void main(String[] args) {
        IntPredicate even_and_greaterthan_6 = (int val) -> (val%2 == 0) && val > 6;
        IntPredicate smaller_than_100 = (int val) -> val < 100;

        // Testing the predicate(s)
        System.out.println(even_and_greaterthan_6.and(smaller_than_100).test(90));

    }

}
