package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparing_using_method {
    public static class Pair implements Comparable<Pair>{
        public int i, j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }

        @Override
        public int compareTo(Pair obj) {
            if (j < obj.j) return -1;
            if (j > obj.j) return 1;
            return 0;
        }
    }
    public static void main(String[] args) {
        List<Pair> lst = new ArrayList<>();
        lst.add(new Pair(1, 4));
        lst.add(new Pair(1, 1));
        lst.add(new Pair(1, 2));
        lst.add(new Pair(1, 3));

        System.out.println("Before Sorting: ");
        for(Pair p : lst){
            System.out.println(p.i + ", " + p.j);
        }

        Collections.sort(lst);

        System.out.println("After Sorting: ");
        for(Pair p : lst){
            System.out.println(p.i + ", " + p.j);
        }

    }
}
