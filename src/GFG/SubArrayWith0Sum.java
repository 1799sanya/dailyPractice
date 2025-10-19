package GFG;

//Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum.
//Return true/false depending upon whether there is a subarray present with 0-sum or not.
//Examples:
//Input: arr[] = [4, 2, -3, 1, 6]
//Output: true
//Explanation: 2, -3, 1 is the subarray with a sum of 0.

import java.util.HashSet;

public class SubArrayWith0Sum {

    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            pre_sum = pre_sum + arr[i];
            if(pre_sum==0) return true;
            if(h.contains(pre_sum)) return true;
            h.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {4,2,-3,1,6};
        System.out.println(findsum(arr));
    }
}
