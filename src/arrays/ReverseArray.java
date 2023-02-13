package arrays;

import java.util.Scanner;

public class ReverseArray {
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

        // creating another array
        int[] another_arr = new int[size];
        for(int i = size - 1, j = 0; i >= 0; i--, j++){
            another_arr[j] = arr[i];
        }

        // printing both the arrays
        System.out.print("Original array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.print("Copied Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(another_arr[i] + " ");
        }
        System.out.println("\n--");

    }
}
