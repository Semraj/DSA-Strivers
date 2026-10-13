package recursion;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,4,8};
        int n=arr.length;
    ReverseArray reverseArray = new ReverseArray();
    reverseArray.reverse(0,arr);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    }
     void reverse(int i,int arr[]){
        if(i>=(arr.length)/2)
            return;
        swap(arr,i,arr.length-i-1);
        reverse(i+1,arr);
    }
    void swap(int arr[],int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
