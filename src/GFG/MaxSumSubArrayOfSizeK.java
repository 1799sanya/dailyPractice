package GFG;

//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
//Note: A subarray is a contiguous part of any given array.
//Examples:
//Input: arr[] = [100, 200, 300, 400] , k = 2
//Output: 700
//Explanation: arr3  + arr4 = 700, which is maximum.

import javax.swing.plaf.PanelUI;

//Sliding Window

public class MaxSumSubArrayOfSizeK {

    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int curr = 0;
        for(int i=0;i<k;i++){
            curr = curr + arr[i];
        }
        int res = curr;
        for(int i=k;i<n;i++){
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(curr,res);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {100,200,300,400};
        int k=2;
        System.out.println(maximumSumSubarray(arr,k));
    }
}
