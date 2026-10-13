package Shreyansh.collection.Queue;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>((Integer a, Integer b)->b-a);
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);
        minPQ.forEach((Integer val)-> System.out.println(val));

        System.out.println("-----------------------------------");
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("remove from top: "+val);
        }
    }
}
