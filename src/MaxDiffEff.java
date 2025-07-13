public class MaxDiffEff {

    public static int maxDiff(int[] arr){
        int n = arr.length;
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        for(int j=1;j<n;j++){
            res = Math.max(res,arr[j]-minVal);
            minVal = Math.min(minVal,arr[j]);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2,3,10,6,4,8,18};
        System.out.print(maxDiff(arr));
    }
}

//time - O(n)
