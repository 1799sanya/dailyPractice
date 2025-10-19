package Leetcode;

//Given an integer array nums and an integer k, return true if there are two distinct
//indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                if(i - h.get(nums[i]) <= k) return true;
            }
            h.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
