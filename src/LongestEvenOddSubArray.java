public class LongestEvenOddSubArray {

    public static int maxEvenOdd(int[] arr){
        int n = arr.length;
        int res = 1;
        int count = 1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) ||
            arr[i]%2!=0 && arr[i-1]%2==0){
                count++;
                res = Math.max(res,count);
            } else {
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2,5,4,6,7,8,1,12,3};
        System.out.println(maxEvenOdd(arr));
    }
}

//KADANE'S ALGO
//Time: O(n)
//Space: O(1)
