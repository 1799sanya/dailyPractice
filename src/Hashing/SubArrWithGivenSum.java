package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrWithGivenSum {

    public static boolean isSubArrSum(int[] arr,int sum){
        int n = arr.length;
        Set<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i=0;i<n;i++){
            pre_sum = pre_sum+arr[i];
            if(pre_sum==sum)
                return true;
            if(h.contains(pre_sum-sum))
                return true;
            h.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {5,8,6,13,3,-1};
        int sum=22;
        System.out.println(isSubArrSum(arr,sum));
    }
}
