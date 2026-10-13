package array;

import java.util.ArrayList;
import java.util.List;

//public class ArrayIntersection {
//
//    static int[] arrIntersection(int arr1[],int arr2[]){
//        List<Integer> list =new ArrayList<>();
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr2.length;j++){
//                if(arr1[i]==arr2[j])
//                     if(!(list.contains(arr1[i])))
//                         list.add(arr1[i]);
//            }
//        }
//        int result[]=new int[list.size()];
//        for(int i=0;i< list.size();i++){
//            result[i]=list.get(i);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int arr1[]={2,6,5,8,9,12,13,1};
//        int arr2[]={6,3,9,1,12,1,2};
//        int result[]=arrIntersection(arr1,arr2);
//        for(int i=0;i<result.length;i++){
//            System.out.print(result[i]+" ");
//        }
//    }
//}

//Approach 2
import java.util.HashSet;

public class ArrayIntersection {
    public static void printIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements of the first array to the set
        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Intersection elements: ");

        // Step 2: Check if elements of the second array exist in the set
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                // Remove the element to avoid printing duplicates if arr2 has duplicates
                set.remove(num);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 1, 3, 8, 2, 6};
        int[] arr2 = {3, 9, 2, 4, 7};

        // Expected output: 4 3 2 (or in any order)
        printIntersection(arr1, arr2);
    }
}
