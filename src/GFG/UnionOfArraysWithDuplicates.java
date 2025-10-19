package GFG;

//Union of Arrays with Duplicates
//Difficulty: EasyAccuracy: 42.22%Submissions: 467K+Points: 2Average Time: 10m
//You are given two arrays a[] and b[], return the Union of both the arrays in any order.
//The Union of two arrays is a collection of all distinct elements present in either of the arrays.
// If an element appears more than once in one or both arrays, it should be included only once in the result.
//Note: Elements of a[] and b[] are not necessarily distinct.
//Note that, You can return the Union in any order but the driver code will print the result in sorted order only.
//Examples:
//Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
//Output: [1, 2, 3]
//Explanation: Union set of both the arrays will be 1, 2 and 3.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UnionOfArraysWithDuplicates {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        //hashing
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int x : a){
            h.add(x);
        }
        for(int y : b){
            h.add(y);
        }
        Iterator<Integer> i = h.iterator();
        while(i.hasNext()){
            res.add(i.next());
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,2,1};
        int[] b = {3,2,2,3,3,2};
        System.out.println(findUnion(a,b));
    }
}
