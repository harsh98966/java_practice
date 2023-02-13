package arrays;

import java.util.Scanner;

public class Find_missing {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            int z = sc.nextInt();
            arr[z-1] = 1;
        }

        System.out.println("Missing numbers: ");
        for(int i= 0; i < size; i++){
            if(arr[i] == 0) {
                System.out.print(i+1 + " ");
            }
        }


    }
}
