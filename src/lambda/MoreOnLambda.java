package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pair{
    public int d1, d2;

    public Pair(int d1, int d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "d1=" + d1 +
                ", d2=" + d2 +
                '}';
    }
}
public class MoreOnLambda {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();

        list.add(new Pair(2, 3));
        list.add(new Pair(3, 1));
        list.add(new Pair(2, 4));
        list.add(new Pair(1, 5));
        list.add(new Pair(25, 10));

        Collections.sort(list, (Pair p1, Pair p2) -> {
            return p1.d2 - p2.d2;
        });

        System.out.println(list);
    }
}
