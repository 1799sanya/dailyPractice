package Hashing;

import java.util.HashSet;

public class PairWithGivenSumUnsortedArray {

    public static boolean isPair(int[] arr,int sum){
        HashSet<Integer> h = new HashSet<>();
        for(int x:arr){
            //before inserting we check if it is forming pair with any of existing elements in hashset
            if(h.contains(sum-x))
                return true;
            else h.add(x);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {2,3,1,6,4,8};
        int sum=11;
        System.out.println(isPair(arr,sum));
    }
}

//time: O(n)
//Space: O(n)
