package Searching;

//Sorted Array
public class IndexOfFirstOccurence {

    //Iterative Binary Search
    public static int firstOcc(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            } else if (arr[mid]<x) {
                low = mid+1;
            } else {
                //arr[mid] is equal to x, this might or might not be the first occurrence
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                } else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,10,10,10,20,20,40};
        System.out.println(firstOcc(arr,40));
    }
}

//time: O(logn)
//space: O(1)
