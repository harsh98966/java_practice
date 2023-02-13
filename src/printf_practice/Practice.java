/*
    -Similar to C printf

    Conversion Characters
        %d – for signed decimal integer
        %f – for the floating point
        %c – for a character
        %s – a string
        %% – for writing % (percentage)
        %n – for new line = \n

    We can also
* */
package printf_practice;
public class Practice {
    public static void main(String[] args) {
        int test = -10000000;
        System.out.printf("The number is: %,d", test);

    }
}
