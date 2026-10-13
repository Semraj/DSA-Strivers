package array;

public class Sort0And1 {
    static int [] sortArray(int nums[]){
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if(nums[i]==0)
                i++;
            if(nums[j]==1)
                j--;
        }
//        int arr[]={i,j};
        return nums;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0,0,1,0,0,0,0};
        int result[] = sortArray(arr);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        }
    }
