package Leetcode;

import java.util.Arrays;

public class test {
    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int number=0;
        int temp=size;
        for(int i=0;i<size;i++){
            int x = (int) Math.pow(10,temp-1);
            //int y = digits[i]*x;
            number = number + (digits[i]*x);
            temp = temp-1;
        }
        int n = number + 1;
        int temp2 = n;
        int digit=0;
        //no of digits in new number
        while(temp2>0){
            temp2 = temp2/10;
            digit++;
        }
        int[] arr = new int[digit];
        for(int i=digit-1;i>=0;i--){
            arr[i]=n%10;
            n = n/10;
        }
        return arr;
    }

    public static void main(String args[]){
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    //You're thinking in the right direction, but the approach you've implemented won’t work for very large numbers, such as:
    //int[] digits = {9,8,7,6,5,4,3,2,1,0}; // i.e., 9876543210
    //❌ Why your approach fails:
    //You're trying to convert the array to an integer using:
    //
    //number = number + (digits[i] * Math.pow(10, temp-1));
    //This fails when:
    //
    //The number is too large to fit in a 32-bit (int) or even 64-bit (long) value.
    //
    //int can only hold values up to ~2.1 billion (2,147,483,647).
}
