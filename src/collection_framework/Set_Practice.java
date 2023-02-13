package collection_framework;

import java.util.*;

public class Set_Practice {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                return -1;
            }
        };
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Harsh");
        arr.add("Vaibhav");
        arr.add("Harsh2");
        arr.add("Pandat");

        Collections.sort(arr, com);

        System.out.println(arr);

        System.out.println("*****************************");
        Set<String> test = new HashSet<>();
        test.add("Harsh");
        test.add("Shivani");
        test.add("Alisha");
        test.add("Vaibhav");
        test.add("Anmol");

        System.out.println(test);

        System.out.println("*********************************");
        Set<String> test2 = new LinkedHashSet<>();
        test2.add("Harsh");
        test2.add("Shivani");
        test2.add("Alisha");
        test2.add("Vaibhav");
        test2.add("Anmol");
        System.out.println(test2);

        System.out.println("*********************************");
        Set<String> test3 = new TreeSet<>();
        test3.add("Harsh");
        test3.add("Shivani");
        test3.add("Alisha");
        test3.add("Vaibhav");
        test3.add("Anmol");
        System.out.println(test3);


    }
}
