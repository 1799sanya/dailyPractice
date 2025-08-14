public class SubArrayWithGivenSum {

    public static boolean isSubSum(int[] arr,int sum){
        int n = arr.length;
        int s = 0;
        int curr = 0;
        for(int e=0;e<n;e++){
            curr = curr + arr[e];
            while(sum<curr){
                curr = curr - arr[s];
                s++;
            }
            if(sum==curr){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,4,20,3,10,5};
        int sum=34;
        System.out.println(isSubSum(arr,sum));
    }
}
