package GFG;

//Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key.  If the key is not present in the array, return -1.
//Examples :
//Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
//Output: 8
//Explanation: 3 is found at index 8.

public class SearchInRotatedSortedArray {

    public static int search(int[] arr, int key) {
        // code here
        //use binary search
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key) return mid;
            //till here like normal binary search
            if(arr[low]<=arr[mid]){
                //left array is sorted
                //check if x exists between low and mid
                if(key>=arr[low] && key<arr[mid]){
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            } else{
                //right array is sorted
                if(key>arr[mid] && key<=arr[high]){
                    low=mid+1;
                } else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,8,9};
        System.out.println(search(arr,8));
    }
}
