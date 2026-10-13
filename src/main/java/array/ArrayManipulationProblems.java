package array;

import java.util.HashMap;

public class ArrayManipulationProblems {
    static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k:arr){
            System.out.println(k);
        }
    }

    static void shiftBy1(int arr[]){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    static void printAlternate(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(i==j) {
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    static int getMode(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
//        for(int i: freq.keySet()){
//            System.out.println(i +"->"+freq.get(i));
//        }
        int maxFreq=-1;
        int maxFreqWaliKey=-1;

        for(int key: freq.keySet()){
            int currentKey=key;
            int currentKeyKiFrequency=freq.get(key);
            if(currentKeyKiFrequency>maxFreq){
                maxFreq=currentKeyKiFrequency;
                maxFreqWaliKey=currentKey;
            }
        }
        return maxFreqWaliKey;
    }

    static int[] getHighestLowestFrequency(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        //now hashmap is ready
        int highestFreq=Integer.MIN_VALUE;
        int highestNum=-1;
        for(int key:freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq>highestFreq){
                highestFreq=currentFreq;
                highestNum=currentKey;
            }
        }
        int lowestFreq=Integer.MAX_VALUE;
        int lowestNum=-1;
        for(int key:freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq<lowestFreq){
                lowestFreq=currentFreq;
                lowestNum=currentKey;
            }
        }
        int result[]={lowestNum,highestNum};
        return result;

    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4};
//        for(int k:arr){
//              System.out.println(k);
//          }
//        reverseArray(arr);
//        shiftBy1(arr);
//          printAlternate(arr);
//        int max=getMode(arr);
//        System.out.println(max);
//        int i=0;
        int results[]=getHighestLowestFrequency(arr);
        System.out.println(results[0]);
        System.out.println(results[1]);
//
    }
}

