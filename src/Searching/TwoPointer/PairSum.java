package Searching.TwoPointer;

public class PairSum {

    public static boolean isPair(int[] arr,int x){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x) return true;
            else if(arr[i]+arr[j]>x) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {2,4,8,9,11,12,20,30};
        System.out.println(isPair(arr,23));
    }
}
//SORTED ARRAY
//time:O(n)

//FOR UNSORTED ARRAY -- USE HASHING