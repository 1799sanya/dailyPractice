package GFG;

//Given a number n, return an array containing the first n Fibonacci numbers.
//Examples:
//Input: n = 5
//Output: [0, 1, 1, 2, 3]

import java.util.Arrays;

public class FirstnFibonacci {
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] result = new int[n];
        result[0] = 0;
        if(n==1){
            return result;
        }
        result[1] = 1;
        for(int i=2;i<n;i++){
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(Arrays.toString(fibonacciNumbers(n)));
    }
}
