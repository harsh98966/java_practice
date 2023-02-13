import enum_practice.Weekdays;

import java.io.IOException;

public class Main {
    public static void testFunc(int x) throws Exception {
        x= x/ 0;
    }
    public static void main(String[] args) throws IOException {
        Weekdays day = Weekdays.MONDAY;
        switch (day){
            case MONDAY -> System.out.println("It's Monday.");
            case TUESDAY -> System.out.println("It's Tuesday.");
            case WEDNESDAY -> System.out.println("It's Wednesday.");
            case THURSDAY -> System.out.println("It's Thursday.");
            case FRIDAY -> System.out.println("It's Friday.");
            case SATURDAY -> System.out.println("It's Saturday.");
        }
        System.out.println("Enter: ");
        int c = System.in.read();
        System.out.println("You entered: " + (c));
    }
}