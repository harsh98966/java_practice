package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Practice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        // printing list items
        Iterator<Integer> it = lst.listIterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
