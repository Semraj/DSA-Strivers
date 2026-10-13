package array;

public class RemoveDuplicate {
   static int removeDuplicate(int nums[]) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2};
       int result= removeDuplicate(arr);
        System.out.println(result);
    }
}
