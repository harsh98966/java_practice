package Calculator;

import Calculator.calc.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = "";
        while(!query.equals("quit")){
            System.out.print("Enter Equation: ");
            query = sc.nextLine();
            System.out.println("***************** Result **************");
            System.out.println(new Calculator(query).getResult());
            System.out.println("***************************************");

        }
    }
}
