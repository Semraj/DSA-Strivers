package array.array2D;

public class Rotate90ClockWise {
    public static int[][] rotate90ClockWise(int[][] matrix,int N){
        //step1: transpose of a matrix without using extra memory
        // swap matrix[i][j],matrix[j][i]
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
//                System.out.println(matrix[i][j]);
//                System.out.println("---------------");
            }
        }
        //step2: reverse all rows of the matrix
        //har row pr jaunga and use reverse kr dunga
        for(int row=0;row<N;row++){
            int startCol=0;
            int endCol=N-1;
            while(startCol<=endCol) {
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                startCol++;
                endCol--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][] =rotate90ClockWise(arr,3);
        for(int[] row:result){
            for(int element: row) {
                System.out.println(element);
            }
        }
    }
}
