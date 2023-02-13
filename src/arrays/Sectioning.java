package arrays;
import java.util.Scanner;
public class Sectioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter array elements: ");
        /*
            number of negative numbers
            number of odd numbers
            number of even numbers
            number of 0s.
        */

        int positive_el = 0;
        int negative_el = 0;
        int odd_el = 0;
        int even_el = 0;
        int zero_el = 0;

        for(int i= 0; i < size; i++){
            int el = sc.nextInt();

            positive_el = (el > 0) ? positive_el+1 : positive_el;
            negative_el = (el < 0) ? negative_el+1 : negative_el;
            odd_el = !(el % 2 == 0) ? odd_el+1 : odd_el;
            even_el = (el % 2 == 0) ? even_el + 1 : even_el;
            zero_el = (el == 0) ? zero_el + 1 : zero_el;

        }

        System.out.println("Number of positive numbers: " + positive_el);
        System.out.println("Number of negative numbers: " + negative_el);
        System.out.println("Number of odd numbers: " + odd_el);
        System.out.println("Number of even numbers: " + even_el);
        System.out.println("Number of zero numbers: " + zero_el);

    }
}
