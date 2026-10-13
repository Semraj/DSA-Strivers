package array;

public class UniqueElement {
    static int findUniqueElement(int[] nums){
        int xorSum=0;
        for(int n:nums){
            xorSum=xorSum^n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[]={1,5,5,3,4,4,1};
        int uniqueElemtn=findUniqueElement(arr);
        System.out.println(uniqueElemtn);
    }
}
