package GFG;

//You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.
//Examples:
//Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
//Output: 1 2 3 4 5 90
//Explanation: 90 is inserted at index 5(0-based indexing). After inserting,array elements are like [1, 2, 3, 4, 5, 90].
//Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90
//Output: [1, 2, 90, 3, 4, 5]
//Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5].

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsertAtIndex {
    public static void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        arr.add(index,val); //direct inbuilt function available in arrayList
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        insertAtIndex(arr,2,90);
        System.out.println(arr);
    }
}
