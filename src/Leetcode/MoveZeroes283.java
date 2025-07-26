package Leetcode;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.Arrays;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int size = 0; //number of non zero elements found till now
        //if we find a non zero element swap it with the position just before
        //the first zero(count)
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[size];
                nums[size] = temp;
                size++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
