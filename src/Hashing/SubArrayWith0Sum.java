package Hashing;

import java.util.HashSet;

public class SubArrayWith0Sum {

    public static boolean is0SubArray(int[] arr){
        int n = arr.length;
        HashSet<Integer> h = new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<n;i++){
            pre_sum = pre_sum + arr[i];
            if(h.contains(pre_sum))
                return true;
            if(pre_sum==0)
                return true;
            h.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {3,4,10,-5,7};
        System.out.println(is0SubArray(arr));
    }
}
//TIME: O(n)
//HASHING + PREFIX SUM
