package Searching.TwoPointer;

public class TripletSum {

    public static boolean isPair(int[] arr,int x,int si){
        int n=arr.length;
        int i=si;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x) return true;
            else if(arr[i]+arr[j]>x) j--;
            else i++;
        }
        return false;
    }

    public static boolean isTriplet(int[] arr,int x){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(isPair(arr,x-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,8,9,20,40};
        System.out.println(isTriplet(arr,32));
    }
}
//SORTED ARRAY
//O(n^2)
