package Searching;

public class BinarySearchRecursive {

    public static int bSearch(int[] arr,int low,int high,int x){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x) return mid;
        else if (arr[mid]>x) {
            return bSearch(arr,low,mid-1,x);
        }else {
            return bSearch(arr,mid+1,high,x);
        }
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int x = 400;
        System.out.println(bSearch(arr,0,5,x));
    }
}

//time: O(logn)
//space: O(logn)
