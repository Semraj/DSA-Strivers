package array.array2D;

import java.util.ArrayList;
import java.util.List;

public class ColumnSum {
    public static List<Integer> colSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m=arr.length;
        int n=arr[0].length;

        for(int col=0;col<n;col++){
            int sum=0;
             for(int row=0;row<m;row++){
                sum=sum+arr[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result=colSums(arr);
        System.out.println(result);
    }
}
