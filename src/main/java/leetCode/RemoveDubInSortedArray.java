package leetCode;

public class RemoveDubInSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j=1;
        while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                j++;
            }else {
                j++;
//                nums[i]=nums[j];
//                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2};
        int result=removeDuplicates(arr);
        System.out.println(result);
    }
}
