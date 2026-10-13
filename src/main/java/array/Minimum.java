package array;

public class Minimum {
    static int minimumElement(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) {
                min= arr[i];
            }
        }
        return min;
    }
    static int findMin(int arr[]){
        int result=0;
        for(int i=0;i<= arr.length-1;i++) {
            result = Math.min(arr[i], arr[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,0,3,4,5,6,7,8,9};
        int result = findMin(arr);
//        int result = minimumElement(arr);
        System.out.println(result);
    }
}
