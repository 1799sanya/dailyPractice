package Searching;

//Sorted array
public class IndexOfLastOccurrence {

    public static int lastOcc(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            } else if (arr[mid]<x) {
                low = mid+1;
            } else{
                //arr[mid] is equal to x
                if(mid==n-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                } else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,15,20,20,40,40};
        System.out.println(lastOcc(arr,40));
    }
}

//Iterative Binary Search -- time=O(logn), space = O(1)
