public class PrefixSum {

    //O(1) -- answer the queries efficiently
    public static int getSum(int[] arr,int[] pSum,int l,int r){
        if(l==0){
            return pSum[r];
        }
        return pSum[r]-pSum[l-1];
    }

    public static void main(String[] args){
        int[] arr = {2,8,3,9,6,5,4};
        //precompute prefix sum
        int n = arr.length;
        int[] pSum = new int[n];
        pSum[0] = arr[0];
        for(int i=1;i<n;i++){
            pSum[i] = pSum[i-1] + arr[i];
        }
        System.out.println(getSum(arr,pSum,0,2));
        System.out.println(getSum(arr,pSum,1,3));
        System.out.println(getSum(arr,pSum,2,6));
    }
}
