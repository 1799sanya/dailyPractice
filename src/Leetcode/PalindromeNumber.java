package Leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int sign = x < 0 ? -1 : 1;
        if(sign == -1){
            return false;
        }
        int ld;
        int rev = 0;
        int temp = Math.abs(x);
        while(temp!=0){
            ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }
        //int ans = rev*sign;
        return rev == x;
    }

    public static void main(String args[]){
        int x = -4554;
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println(sol.isPalindrome(x));
    }
}


//Given an integer x, return true if x is a palindrome, and false otherwise.
//palindrome of -22 is 22-, so false.
