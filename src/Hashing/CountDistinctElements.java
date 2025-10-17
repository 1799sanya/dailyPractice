package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {

    public static int countDistinct(Integer[] arr){
        int n=arr.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        return s.size();
    }

    public static int countDistinctEff(Integer[] arr){
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        return s.size();
    }

    public static void main(String[] args){
        Integer[] arr = {10,20,10,10,30,50,67};
        System.out.println(countDistinct(arr));
        System.out.println(countDistinctEff(arr));
    }
}
