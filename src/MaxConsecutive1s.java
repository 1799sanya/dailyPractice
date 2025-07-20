public class MaxConsecutive1s {

    public static int maxConsecutiveOnes(int[] arr){
        int n = arr.length;
        int res = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                res = Math.max(res,count);
            }else {
                count = 0;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1,1,0,1,0,1,1,1,0,0};
        System.out.println(maxConsecutiveOnes(arr));
    }
}

//Time: O(n)
//Space: O(1)
