package GFG;

//You are given an array arr[] containing positive integers.
//The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
//Examples:
//Input: arr[] = [2, 3, 2, 3, 5]
//Output: [0, 2, 2, 0, 1]
//Explanation: We have: 1 occurring 0 times, 2 occurring 2 times,
//3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesInALimitedArray {

    public static List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = arr.length;
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int i=0;i<n;i++){
            if(h.containsKey(i+1)){
                res.add(h.get(i+1));
            } else{
                res.add(0);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr ={2, 3, 2, 3, 5};
        System.out.println(frequencyCount(arr));
    }
}
