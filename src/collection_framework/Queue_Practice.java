package collection_framework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue_Practice {
    public static void main(String[] args) {
        // in array based queue we need to give the size beforehand
        Queue<Integer> test = new ArrayBlockingQueue<>(5);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        // test.add(6) // error
        System.out.println(test);

        // linkedlist based queue are dynamic in size
        Queue<Integer> test2 = new LinkedBlockingQueue<>();
//        test2.add(1);
//        test2.add(2);
//        test2.add(3);
//        test2.add(4);
        System.out.println("*******************************");
        System.out.println(test2.poll());


        System.out.println("********************************");
        Deque<Integer> dequeTest = new LinkedList<>();
        dequeTest.add(1);
        dequeTest.add(4);
        dequeTest.add(2);
        System.out.println(dequeTest);
    }
}
