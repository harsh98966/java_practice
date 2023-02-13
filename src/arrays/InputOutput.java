package arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the number of integers you want to store: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " items:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered items: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("--");
    }
}
