package collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Gfg_Problem {
    public static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query)
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(Q == 1){
            A.add(Query.get(0), Query.get(1));
            result = A;
        } else {
            int index = -1;
            for(int i = 0; i < N; i++){
                if(A.get(i).equals(Query.get(0))){
                    index = i;
                }
            }
            result.add(index);
        }
        for(int i : result){
            System.out.println(": " + i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int q = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> queries = new ArrayList<>();
        if(q == 1){
            queries.add(sc.nextInt());
            queries.add(sc.nextInt());
        } else {
            queries.add(sc.nextInt());
        }
        solve(n, arr, q, queries);



    }
}
