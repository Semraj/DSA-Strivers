package array;

import java.util.Arrays;

public class SwapAltArray {
    static int[] swapAltArr(int arr[]){
        for (int i=0;i<arr.length-1;i+=2){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Test array with an even length
        int arr[] = {4,5,1,3,8,2,6};
       swapAltArr(arr);
        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
//        System.out.print(swappedArr);
    }
}
