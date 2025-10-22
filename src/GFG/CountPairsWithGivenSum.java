package GFG;

//You are given an array arr[] and an integer target.
//You have to count all pairs in the array such that their sum is equal to the given target.
//Examples:
//Input: arr[] = [1, 5, 7, -1, 5], target = 6
//Output: 3
//Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5).

import java.util.HashMap;

public class CountPairsWithGivenSum {

    public static int countPairs(int[] arr,int target){
        int res=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            if(h.containsKey(target-x)){
                res = res + h.get(target-x);
            }
            h.put(x,h.getOrDefault(x,0)+1);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,5,7,-1,5};
        int target=6;
        System.out.println(countPairs(arr,target));
    }
}
