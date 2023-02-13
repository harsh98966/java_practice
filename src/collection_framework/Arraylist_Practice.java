package collection_framework;

import java.util.ArrayList;

public class Arraylist_Practice {

    // printing arraylist
    public static void printArr(ArrayList<String> arr){
        System.out.println("");
        for(String name : arr){
            System.out.print(name + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        // adding items
        arr.add("Harsh");
        arr.add("Shivani");
        arr.add("Yash");
        arr.add("Dhananjay");

        // printing all the names
        printArr(arr);

        // removing one item
        arr.remove("Shivani");

        // printing again
        printArr(arr);

        arr.remove(0);

        printArr(arr);

        // changing content of array
        arr.set(0, "Harsh");

        // displaying list
        printArr(arr);

        // adding more items
        arr.add("Ankit");
        arr.add("Balkar");

        System.out.println("\n***************");
        // searching for item
        if(arr.contains("Harsh")) System.out.println("Harsh is present");
        else System.out.println("Harsh is not present inside the list");

    }
}
