package GFG;

//Check Equal Arrays
//Difficulty: EasyAccuracy: 42.18%Submissions: 411K+Points: 2Average Time: 30m
//Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
//Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
//Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.
//Examples:
//Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
//Output: true
//Explanation: Both the array can be rearranged to [0,1,2,4,5]
//Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
//Output: false
//Explanation: a[] and b[] have only one common value.

import java.util.HashMap;

public class CheckEqualArrays {

    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int x : a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int y : b){
            if(h.containsKey(y)){
                h.put(y,h.get(y)-1);
                if(h.get(y)==0){
                    h.remove(y);
                }
            }
        }
        if(h.size()==0) return true;
        else return false;
    }

    public static void main(String[] args){
        int[] a = {1,2,5,4,0};
        int[] b = {2,4,5,0,1};
        System.out.println(checkEqual(a,b));
    }
}
