package lambda;

import java.util.ArrayList;
import java.util.List;

public class List_Iteration {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair(1, 2));
        list.add(new Pair(61, 3));
        list.add(new Pair(17, 4));
        list.add(new Pair(179, 5));
        list.add(new Pair(10, 66));

        list.forEach((pair) -> System.out.println(pair));

        // We can define Multiple statements using curly braces
        list.forEach((pair -> {
            pair.d2++;
            pair.d1--;
        }));

        // printing pair list
        System.out.println(list);
    }
}
