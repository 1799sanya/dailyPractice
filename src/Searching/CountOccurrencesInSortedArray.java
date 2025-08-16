package Searching;

//Iterative Binary Search
public class CountOccurrencesInSortedArray {

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

    public static int countOcc(int[] arr,int x){
        int first = firstOcc(arr,x);
        if(first==-1) return 0;
        else{
            return (lastOcc(arr,x) - first + 1);
        }
    }

    public static void main(String[] args){
        int[] arr = {10,10,20,20,20,30};
        System.out.println(countOcc(arr,20));
    }
}

//O(logn) time
