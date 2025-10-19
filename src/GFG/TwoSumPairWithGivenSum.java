package GFG;

//Given an array arr[] of integers and another integer target. Determine
//if there exist two distinct indices such that the sum of their elements is equal to the target.
//Examples:
//Input: arr[] = [0, -1, 2, -3, 1], target = -2
//Output: true
//Explanation: arr[3] + arr[4] = -3 + 1 = -2

import java.util.HashSet;

public class TwoSumPairWithGivenSum {

    public static boolean twoSum(int arr[], int target) {
        // code here
        //since input array is not sorted -- hashing
        HashSet<Integer> h = new HashSet<>();
        for(int x : arr){
            if(h.contains(target-x)){
                return true;
            }
            h.add(x);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {0,-1,2,-3,1};
        int target=-2;
        System.out.println(twoSum(arr,target));
    }
}
