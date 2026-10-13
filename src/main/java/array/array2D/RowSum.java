package array.array2D;

import java.util.ArrayList;
import java.util.List;

public class RowSum {
    public static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m=arr.length;
        int n=arr[0].length;

        for(int row=0;row<m;row++){
            int sum=0;
            for(int col=0;col<n;col++){
                sum=sum+arr[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result=rowSums(arr);
        System.out.println(result);
    }
}
