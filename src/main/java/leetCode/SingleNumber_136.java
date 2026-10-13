package leetCode;

public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        int xorSum=0;
        for(int i=0;i<nums.length;i++){
             xorSum=xorSum^nums[i];
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,2};
        int result=singleNumber(arr);
        System.out.println(result);
    }
}
