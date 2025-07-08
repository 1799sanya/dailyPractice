package GFG;

//Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.
//Examples:
//Input: arr[] = [12, 35, 1, 10, 34, 1]
//Output: 34
//Explanation: The largest element of the array is 35 and the second largest element is 34.

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = getLargest(arr);
        int res = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res = i;
                }
                else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        if(res==-1){
            return res;
        } else{
            return arr[res];
        }
    }

    public static int getLargest(int[] arr){
        int n = arr.length;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {10,10,4};
        System.out.println(getSecondLargest(arr));
    }
}
