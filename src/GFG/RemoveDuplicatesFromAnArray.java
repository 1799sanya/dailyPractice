package GFG;

//Given an array arr[] consisting of positive integers,
//return the array by removing all duplicate numbers.
//Example:
//Input: arr[] = [2, 2, 3, 3, 7, 5]
//Output: [2, 3, 7, 5]
//Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromAnArray {

    public static ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int x:arr){
            h.add(x);
        }
        for(int i=0;i<arr.length;i++){
            if(h.contains(arr[i])){
                res.add(arr[i]);
                h.remove(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr={2,2,3,3,7,5};
        System.out.println(remDuplicate(arr));
    }
}
