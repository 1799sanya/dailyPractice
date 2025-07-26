package GFG;

//Given an array of positive integer arr[]. Find the mean and median of the array.
//Where mean is the average value of the given array, median is the average of the two middle elements.
//Note: Return the floor value of mean and median.
//Examples:
//Input: arr[] = [1, 2, 19, 28, 5]
//Output: 11 5
//Explanation: mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
//median is 5 (middle element after sorting)

import java.util.Arrays;

public class MeanAndMedianOfArray {

    public static int mean(int[] arr) {
        // code here
        int n = arr.length;
        int arr_sum = 0;
        for(int i=0;i<n;i++){
            arr_sum = arr_sum + arr[i];
        }
        return arr_sum/n;
    }

    public static int median(int[] arr) {

        // code here
        int n = arr.length;
        Arrays.sort(arr);
        if(n%2!=0){
            int idx = n/2;
            return arr[idx];
        } else{
            int idx1 = n/2 - 1;
            int idx2 = n/2;
            return ((arr[idx1] + arr[idx2])/2);
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 6, 87, 4, 13};
        System.out.println(mean(arr));
        System.out.println(median(arr));
    }
}
