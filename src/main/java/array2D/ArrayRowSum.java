package array2D;

import java.util.ArrayList;
import java.util.List;

public class ArrayRowSum {
    public static List<Integer> rowSums(int[][] arr){
        List<Integer> result1 = new ArrayList<>();
        int totalRows= arr.length;
        int totalColumn= arr[0].length;
        for(int row=0;row<totalRows;row++){
            int sum=0;
            for (int column=0;column<totalColumn;column++){
                sum=sum + arr[row][column];
            }
            result1.add(sum);
        }
        return result1;
    }
    public static List<Integer> colSum(int [][] arr){
        List<Integer> result2=new ArrayList<>();
        int totalRow=arr.length;
        int totalCol=arr[0].length;
        for(int col=0;col<totalCol;col++){
            int sum=0;
            for(int row=0;row<totalRow;row++){
                sum=sum+arr[row][col];
            }
            result2.add(sum);
        }
        return result2;
    }
    public static List<Integer> wavePrintMatrix(int[][] matrix, int m, int n){
        List<Integer> result = new ArrayList<>();
        // Lets move column wise
        for(int col=0;col<n;col++){
            if((col & 1)==1){
                //odd
                //bottom to top
                for(int row=m-1;row>=0;row--){
                    result.add(matrix[row][col]);
                }
            }
            else {
                //even
                //top to bottom
                for(int row=0;row<m;row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix){
        //for original array
        int totalRows = matrix.length;
        int totalCols = matrix.length;

        //for new array
        int newTotalRows = totalCols;
        int newTotaCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotaCols];


        for(int i=0;i<newTotalRows;i++){
            for (int j=0;j<newTotaCols;j++){
              ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = transpose(arr);
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(transpose[i][j]);
            }
        }
        List<Integer> rowSum=rowSums(arr);
        List<Integer> colSum=colSum(arr);
        List<Integer> waveMatrix= wavePrintMatrix(arr,3,3);
        System.out.println(waveMatrix);
        System.out.println(rowSum);
        System.out.println(colSum);

    }
}
