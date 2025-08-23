package Searching;

//Binary Search
public class SearchInSortedRotatedArray {

    public static int search(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x) return mid;
            //----LIKE NORMAL BINARY SEARCH----
            if(arr[mid]>=arr[low]){
                if(x>=arr[low] && x<arr[mid])  //x lies between low and mid
                    high=mid-1;
                else low = mid+1;
            }
            //----LEFT HALF IS SORTED-----
            else{
                if(x>arr[mid] && x<=arr[high])
                    low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,8,9};
        System.out.println(search(arr,80));
    }
}
