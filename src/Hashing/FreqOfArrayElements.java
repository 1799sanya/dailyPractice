package Hashing;

import java.util.HashMap;

public class FreqOfArrayElements {

    public static void countFreq(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            h.put(x,h.getOrDefault(x,0) + 1);
        }

        for(HashMap.Entry<Integer,Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args){
        int[] arr = {10,12,10,15,10,20,12,12};
        countFreq(arr);
    }
}
