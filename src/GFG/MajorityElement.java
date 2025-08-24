package GFG;

//Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
//Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.
//Examples:
//Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
//Output: 1
//Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.

public class MajorityElement {
    public static int majorityElement(int arr[]) {
        // code here
        //Moore's voting algorithm
        //phase1: find a potential candidate
        int n=arr.length;
        int ans=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==ans) count++;
            else count--;
            if(count==0){
                ans=arr[i];
                count=1;
            }
        }
        //phase2:check if candidate found is actually a majority
        count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ans) count++;
        }
        if(count>n/2) return ans;
        else return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,8,3,8,8,8,9,6,8};
        System.out.println(majorityElement(arr));
    }
}
