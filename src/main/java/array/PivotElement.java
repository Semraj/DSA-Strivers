package array;

public class PivotElement {
    static int findPivotElement(int[] arr){
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];
        leftSum[0]=arr[0];
        rightSum[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
             leftSum[i] = leftSum[i-1]+arr[i];
        }
        for(int j=arr.length-2;j>0;j--){
            rightSum[j]=rightSum[j+1]+arr[j];
        }
        for(int k=0;k<arr.length;k++){
            if(leftSum[k]==rightSum[k])
                return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        int pivotResult=findPivotElement(arr);
        System.out.println(pivotResult);
    }

}
