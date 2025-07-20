package GFG;

//You are given an array arr of positive integers. Your task is to find all the leaders in the array.
//An element is considered a leader if it is greater than or equal to all elements to its right.
//The rightmost element is always a leader.
//Examples:
//Input: arr = [16, 17, 4, 3, 5, 2]
//Output: [17, 5, 2]
//Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

import java.util.ArrayList;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int curr_ldr = arr[n-1];
        leaders.add(curr_ldr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=curr_ldr){
                curr_ldr = arr[i];
                leaders.add(curr_ldr);
            }
        }
        int low = 0;
        int high = leaders.size()-1;
        while(low<high){
            int temp = leaders.get(low);
            leaders.set(low,leaders.get(high));
            leaders.set(high,temp);
            low++;
            high--;
        }
        return leaders;
    }

    public static void main(String[] args){
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr));
    }
}

//O(n) time
//O(1) space
