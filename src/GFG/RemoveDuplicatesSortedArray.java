package GFG;

//Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
//Note:
//1. Don't use set or HashMap to solve the problem.
//2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.
//Examples :
//Input: arr = [2, 2, 2, 2, 2]
//Output: [2]
//Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] arr) {
        // Code Here
        int res = 1;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2, 2, 2, 2, 2, 4, 3, 9, 9};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
