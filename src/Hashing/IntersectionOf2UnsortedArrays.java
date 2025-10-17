package Hashing;

import java.util.HashSet;

public class IntersectionOf2UnsortedArrays {

    public static void intersection(int[] a,int[] b){
        HashSet<Integer> s = new HashSet<>();
        for(int x:b){
            s.add(x);
        }
        for(int i=0;i<a.length;i++){
            if(s.contains(a[i])){
                System.out.println(a[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] a = {10,20,15,70,30,40};
        int[] b = {70,28,49,10,15};
        intersection(a,b);
    }
}
