package Shreyansh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        //size
        System.out.println(values.size());
        //isEmpty
        System.out.println(values.isEmpty());
        //contains
        System.out.println(values.contains(2));
        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));
        Collections.sort(values);
        System.out.println("sorted");
        values.forEach((Integer val)-> System.out.println(val));

    }
}
