package GFG;

//Given an array arr, rotate the array by one position in clockwise direction.
//Examples:
//Input: arr[] = [1, 2, 3, 4, 5]
//Output: [5, 1, 2, 3, 4]
//Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.

import java.util.Arrays;

public class RotateArrayByOne {
    public static void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
