package GFG;

//Given an integer k and array arr. Your task is to return the position of the first occurrence of k in the given array and if element k is not present in the array then return -1.
//Note: 1-based indexing is followed here.
//Examples:
//Input: k = 16 , arr = [9, 7, 16, 16, 4]
//Output: 3
//Explanation: The value 16 is found in the given array at positions 3 and 4, with position 3 being the first occurrence.

import java.util.ArrayList;

public class SearchingInAnArray {
    public static int search(int k, ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        for(int i=1;i<=n;i++){
            if((arr.get(i-1))==k) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(16);
        arr.add(16);
        arr.add(89);
        System.out.println(search(16,arr));
    }
}
