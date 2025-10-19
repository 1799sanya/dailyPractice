package GFG;

//Count Non-Repeated Elements
//Difficulty: EasyAccuracy: 65.14%Submissions: 31K+Points: 2
//You are given an array of integers arr[]. You need to return the count of non-repeated elements in the array.
//Example 1:
//Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 5, 6, 7]
//Output: 4
//Explanation: 4, 5, 6 and 7 are the elements with frequency 1 and rest elements are repeated so the number of non-repeated elements are 4.

import java.util.HashMap;
import java.util.Map;

public class CountNonRepeatedElements {

    public static int countNonRepeated(int arr[]) {
        //  code here
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getValue()==1) res++;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,5,6,7};
        System.out.println(countNonRepeated(arr));
    }
}
