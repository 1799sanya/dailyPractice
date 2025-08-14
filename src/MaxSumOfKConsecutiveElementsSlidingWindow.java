public class MaxSumOfKConsecutiveElementsSlidingWindow {

    public static int maxKSum(int[] arr,int k){
        int n = arr.length;
        int curr = 0;
        //calculated sum of the first window of size k
        for(int i=0;i<k;i++){
            curr = curr + arr[i];
        }
        int res = curr;
        //considering i as the ending point of curr window
        for(int i=k;i<n;i++){
            //sum of curr window=sum of prev window+last element of curr window-first element of prev window
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println(maxKSum(arr,k));
    }
}
