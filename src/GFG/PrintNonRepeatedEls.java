package GFG;

//Print Non-Repeated Elements
//Difficulty: EasyAccuracy: 46.54%Submissions: 43K+Points: 2Average Time: 20m
//Hashing is very useful to keep track of the frequency of the elements in a list.
//You are given an array of integers.
//You need to print the non-repeated elements as they appear in the array.
//Example 1:
//Input:
//n = 10
//arr[] = {1,1,2,2,3,3,4,5,6,7}
//Output: 4 5 6 7
//Explanation: 4, 5, 6 and 7 are the only
//elements which is having only 1
//frequency and hence, Non-repeating.

import java.util.ArrayList;
import java.util.HashMap;

public class PrintNonRepeatedEls {

    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        // add your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : arr){
            h.put(x, h.getOrDefault(x,0)+1);
        }
        /*for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getValue()==1){
                res.add(e.getKey());
            }
        }*/
        for(int i=0;i<n;i++){
            if(h.get(arr[i])==1){
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,1,3,6,2,8,9};
        int n=9;
        System.out.println(printNonRepeated(arr,n));
    }
}
