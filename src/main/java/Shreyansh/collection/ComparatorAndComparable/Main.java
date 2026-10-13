package Shreyansh.collection.ComparatorAndComparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer a[] = {6, 4, 1, 9, 2, 11};
        Arrays.sort(a);
        for (int v: a){
            System.out.println(v);
        }
        System.out.println("------------");
//        System.out.println(Arrays.sort(a));

        Arrays.sort(a,(Integer val1, Integer val2)->val2-val1);

        for (int v: a){
            System.out.println(v);
        }
    }
}
