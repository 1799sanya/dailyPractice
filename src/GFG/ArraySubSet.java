package GFG;

//Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
//Examples:
//Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
//Output: true
//Explanation: b[] is a subset of a[]

import java.util.HashMap;

public class ArraySubSet {

    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int x : b){
            if(h.containsKey(x) && h.get(x)>0){
                h.put(x,h.get(x)-1);
            } else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11,3,7,1,7};
        System.out.println(isSubset(a,b));
    }
}
