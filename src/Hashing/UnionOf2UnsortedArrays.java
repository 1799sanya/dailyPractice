package Hashing;

import java.util.HashSet;

public class UnionOf2UnsortedArrays {

    public static int countUnion(int[] a,int[] b){
        HashSet<Integer> s = new HashSet<>();
        for(int x:a){
            s.add(x);
        }
        for(int x:b){
            s.add(x);
        }
        return s.size();
    }

    public static void main(String[] args){
        int[] a = {10,45,20,5,15,10,20};
        int[] b = {30,46,10,45,20};
        System.out.println(countUnion(a,b));
    }
}
