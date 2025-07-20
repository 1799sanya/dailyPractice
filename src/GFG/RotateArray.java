package GFG;

//Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
//Note: Consider the array as circular.
//Examples :
//Input: arr[] = [1, 2, 3, 4, 5], d = 2
//Output: [3, 4, 5, 1, 2]
//Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
//Input: arr[] = [7, 3, 9, 1], d = 9
//Output: [3, 9, 1, 7]
//Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.

import java.util.Arrays;

public class RotateArray {

    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        if(d>=n){
            d = d%n;
        }
        if(d==0) return;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int[] arr = {7,3,9,1};
        int d = 9;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
