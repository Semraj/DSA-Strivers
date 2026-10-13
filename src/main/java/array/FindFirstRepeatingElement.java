package array;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingElement {
    static int findFirstRepeatingElement(int nums[]){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int n:nums){
            if(freq.get(n)>1)
                return n;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,5,3,4,3,5,6};
        int firstElement=findFirstRepeatingElement(arr);
        System.out.println(firstElement);
    }
}
