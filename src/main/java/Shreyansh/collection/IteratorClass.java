package Shreyansh.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        //using iterator
        System.out.println("Iterating the value using iterator method");
        Iterator<Integer> valueIterator = values.iterator();
        while(valueIterator.hasNext()){
            int val = valueIterator.next();
            System.out.println(val);
            if(val==3)
                valueIterator.remove();
        }
        System.out.println("Iterating the values using for-each loop");
        for(int val: values){
            System.out.println(val);
        }
        System.out.println("testing forEach method");
        values.forEach((Integer val)-> System.out.println(val));
    }


}
