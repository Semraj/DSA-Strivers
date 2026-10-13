package array;

public class MissingElement {
    static int missingElement(int arr[],int no){
        int xorSum=0;
        for (int n:arr){
            xorSum=xorSum^n;
        }
        for(int i=0;i<=no;i++){
            xorSum=xorSum^i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,8,6};
        int no=8;
        int missed =missingElement(arr,no);
        System.out.println(missed);

    }
}
