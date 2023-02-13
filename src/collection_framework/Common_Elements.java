package collection_framework;

import java.util.*;

public class Common_Elements {
    public static ArrayList<Integer> common_element(int v1[], int v2[]) {
        int p1 = 0, p2 = 0;
        Arrays.sort(v1);
        Arrays.sort(v2);
        ArrayList<Integer> result = new ArrayList<>();
        for(; p1 < v1.length && p2 < v2.length; ){
            if(v1[p1] == v2[p2]) {
                result.add(v1[p1]);
                p1++;
                p2++;
            }
            else if(v1[p1] < v2[p2]){
                p1++;
            }
            else p2++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] l1 = {3, 4, 2, 2, 4};
        int[] l2 = {3, 2, 2, 7};

        common_element(l1, l2);
    }
}
