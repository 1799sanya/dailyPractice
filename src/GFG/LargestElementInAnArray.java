package GFG;

//Given an array arr[]. The task is to find the largest element and return it.
//Examples:
//Input: arr[] = [1, 8, 7, 56, 90]
//Output: 90
//Explanation: The largest element of the given array is 90.

public class LargestElementInAnArray {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        return arr[largest];
    }

    public static void main(String[] args){
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }
}
