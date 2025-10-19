package GFG;

//Hashing for pair - 1
//Difficulty: EasyAccuracy: 56.07%Submissions: 36K+Points: 2
//You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.
//Examples :
//Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], sum = 14
//Output: 1
//Explanation: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and sum = 14.  There is a pair [4, 10] with sum 14.

import java.util.HashSet;

public class HashingForPair1 {

    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks
        HashSet<Integer> h = new HashSet<>();
        for(int x : arr){
            if(h.contains(sum-x)) return 1;
            h.add(x);
        }
        return 0;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n=10;
        int sum=14;
        System.out.println(sumExists(arr,n,sum));
    }
}
