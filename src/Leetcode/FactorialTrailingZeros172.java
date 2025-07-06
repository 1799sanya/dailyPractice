package Leetcode;

//Given an integer n, return the number of trailing zeroes in n!.

public class FactorialTrailingZeros172 {
    public static int trailingZeroes(int n) {
        int result = 0;
        for(int i=5;i<=n;i=i*5){
            result = result + n/i;
        }
        return result;
    }

    public static void main(String[] args){
        int n=200;
        System.out.println(trailingZeroes(n));
    }
}

//count the number of 10s in factorial -- equal to no of 5s in factorial
//in 25!, 2 5s in 25, hence result = n/5 + n/25; hence i=i*5
