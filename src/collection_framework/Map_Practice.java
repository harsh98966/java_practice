package collection_framework;

import java.util.*;

public class Map_Practice {
    public static void main(String[] args) {
        /*Comparator<String, String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        }*/
        Map<String, String> map = new TreeMap<>();
        map.put("Harsh", "19BCS2551");
        map.put("Shivani", "19BCS2546");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("KEY: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println(map);


        System.out.println("****************************");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        String test = "Harsh";
        System.out.println(test.hashCode());



    }
}
