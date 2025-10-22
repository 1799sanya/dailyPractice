package GFG;

//Given an array arr[] containing integers and an integer k, your task is to
//find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.
//Examples:
//Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
//Output: 6
//Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.

import java.util.HashMap;

public class LongestSubArrayWithSumk {

    public static int longestSubarray(int[] arr, int k) {
        // code here
        int res = 0;
        int pre_sum = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            pre_sum = pre_sum + arr[i];
            if(pre_sum==k){
                res = i+1;
            }
            if(h.containsKey(pre_sum-k)){
                res = Math.max(res,i-h.get(pre_sum-k));
            }
            if(h.containsKey(pre_sum)==false){
                h.put(pre_sum,i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {10,5,2,7,1,-10};
        int k=15;
        System.out.println(longestSubarray(arr,k));
    }
}
