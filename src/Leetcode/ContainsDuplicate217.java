package Leetcode;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//Example:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation:
//The element 1 occurs at the indices 0 and 3.

import java.util.Arrays;

public class ContainsDuplicate217 {

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        //sort the array
        Arrays.sort(nums);
        int freq=1;
        int i = 1;
        while(i<n){
            while(i<n && nums[i]==nums[i-1]){
                freq++;
                i++;
            }
            if(freq>=2) return true;
            freq=1;
            i++;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(containsDuplicate(arr));
    }
}
