package GFG;

//Intersection of Two arrays with Duplicate Elements
//Difficulty: EasyAccuracy: 61.4%Submissions: 38K+Points: 2Average Time: 20m
//Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays
//is said to be elements that are common in both the arrays. The intersection should not have duplicate elements and the result should contain items in any order.
//Note: The driver code will sort the resulting array in increasing order before printing.
//Examples:
//Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
//Output: [1, 3]
//Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOf2ArraysWithDuplicateEls {

    public static ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        //hashing
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int x : a){
            h.add(x);
        }
        for(int y : b){
            if(h.contains(y)){
                res.add(y);
                h.remove(y);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {1,2,1,3,1};
        int[] b = {3,1,3,4,1};
        System.out.println(intersect(a,b));
    }
}
