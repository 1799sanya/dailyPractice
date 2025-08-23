package Searching;

//Binary Search
public class PeakElement {

    public static int getPeak(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            //checking if mid is peak
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            if(arr[mid]<=arr[mid-1]){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,11,15,5,23,90,67};
        System.out.println(getPeak(arr));
    }
}
