package GFG;

import java.util.HashMap;
import java.util.Iterator;

public class SubArraysWithSumK {

    public static int countSubArrays(int[] arr,int k){
        HashMap<Integer, Integer> h = new HashMap<>();
        int res = 0;
        int pre_sum = 0;
        for(int x : arr){
            pre_sum = pre_sum + x;
            if(pre_sum==k) res++;
            if(h.containsKey(pre_sum-k)){
                res = res + h.get(pre_sum-k);
            }
            h.put(pre_sum,h.getOrDefault(pre_sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {9,4,20,3,10,5};
        int k=33;
        System.out.println(countSubArrays(arr,k));
    }
}
