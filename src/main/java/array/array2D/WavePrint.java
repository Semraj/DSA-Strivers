package array.array2D;

import java.util.ArrayList;
import java.util.List;

public class WavePrint {
    public static List<Integer> wavePrintMatrix(int[][] matrix,int m,int  n){
        List<Integer> result =new ArrayList<>();
        for(int col=0;col<n;col++){
            if((col & 1)==1){
                for(int row=m-1;row>=0;row--){
                    result.add(matrix[row][col]);
                }
            }else {
                for(int row=0;row<m;row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,0},{4,5,6,1},{7,8,9,2}};
        List<Integer> result=wavePrintMatrix(arr,3,4);
        System.out.println(result);
    }
}
