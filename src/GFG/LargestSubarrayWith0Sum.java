package GFG;

//Given an array arr[] containing both positive and negative integers,
//the task is to find the length of the longest subarray with a sum equals to 0.
//Note: A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order.
//Examples:
//Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
//Output: 5
//Explanation: The longest subarray with sum equals to 0 is [-2, 2, -8, 1, 7].

import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> h = new HashMap<>();
        int res=0;
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            pre_sum = pre_sum + arr[i];
            if(pre_sum==0){
                res=i+1;
            }
            if(h.containsKey(pre_sum)){
                res = Math.max(res,i-h.get(pre_sum));
            }
            if(h.containsKey(pre_sum)==false){
                h.put(pre_sum,i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLength(arr));
    }
}
