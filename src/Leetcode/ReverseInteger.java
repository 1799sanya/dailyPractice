package Leetcode;

//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

class ReverseInteger {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        int ld;
        int rev = 0;
        int n = Math.abs(x);
        while(n>0){
            ld = n%10;
            if(rev > (Integer.MAX_VALUE - ld)/10){
                return 0;
            }
            rev = rev*10 + ld;
            n = n/10;
        }
        rev = rev*sign;
        return rev;
    }

    public static void main(String args[]){
        int x = -1234;
        ReverseInteger sol = new ReverseInteger();
        System.out.println(sol.reverse(x));
    }
}

/*NOTES:
When reversing a number like x = 1534236469, the reversed result is 9646324351 — which exceeds Integer.MAX_VALUE (2,147,483,647).
Since the environment doesn't allow 64-bit integers, you can't use long to store the reversed number.
If: rev * 10 + ld > Integer.MAX_VALUE (if we perform this check directly)
then overflow will happen, and we must return 0 before doing it.
But we can't write that check directly, because rev * 10 + ld might itself overflow while checking!
So instead, we rearrange the inequality to check before we multiply:
rev > (Integer.MAX_VALUE - ld) / 10
This ensures that rev * 10 + ld would be within bounds.
 */

