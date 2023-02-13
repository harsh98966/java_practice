package generic;

import java.util.ArrayList;
import java.util.List;

class test<T, J>{
    public T t;
    public J j;
    public test(T t, J j){
        this.t = t;
        this.j = j;
    }

}
public class Generic_Test {
    public static <T> void printList(ArrayList<T> list){
        for(T item : list){
            System.out.print(item + " ");
        }
    }

    public static <T> void printArray(T[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        /*Generic_Methods<String, String> gen = new Generic_Methods<>("Harsh", "19BCS2551");
        System.out.println(gen.getKey() + ": " + gen.getValue());

        System.out.println("After changing: ");
        gen.setKey("Hrsh");;
        gen.setValue("2551");
        System.out.println(gen.getKey() + ": " + gen.getValue());*/
        ArrayList<Integer> lst = new ArrayList<>();
        Integer[] arr = new Integer[2];

        arr[0] = 1;
        arr[1] = 2;

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(6);
        lst.add(7);

        System.out.println("** Printing list **");
        printList(lst);

        System.out.println("\n** Printing array **");
        printArray(arr);

    }
}
