package GFG;

//You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.
//Examples:
//Input: arr[] = [0, 0, 5, 5, 0, 0]
//Output: 6
//Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].

import java.util.HashMap;

public class ZeroSumSubArrays {

    public static int findSubArrays(int[] arr){
        int res = 0;
        int pre_sum = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            pre_sum = pre_sum + x;
            if(pre_sum==0) res++;
            if(h.containsKey(pre_sum)){
                res = res + h.get(pre_sum);
            }
            h.put(pre_sum,h.getOrDefault(pre_sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {0,0,5,5,0,0};
        System.out.println(findSubArrays(arr));
    }
}
