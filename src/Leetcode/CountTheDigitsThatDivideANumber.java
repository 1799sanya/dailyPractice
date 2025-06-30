package Leetcode;

//Given an integer num, return the number of digits in num that divide num.
//Example:
//
//Input: num = 1248
//Output: 4
//Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(temp>0){
            int ld = temp%10;
            if(num%ld == 0){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }

    public static void main(String args[]){
        CountTheDigitsThatDivideANumber sol = new CountTheDigitsThatDivideANumber();
        int n = 1248;
        System.out.println(sol.countDigits(n));
    }
}
