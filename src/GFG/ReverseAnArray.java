package GFG;

//You are given an array of integers arr[]. Your task is to reverse the given array.
//Note: Modify the array in place.
//Examples:
//Input: arr = [1, 4, 3, 2, 6, 5]
//Output: [5, 6, 2, 3, 4, 1]
//Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,1,7,8};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
