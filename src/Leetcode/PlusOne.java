package Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        //out of loop, means all the digits were 9
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;

        //My approach(test file):
        // int size = digits.length;
        // int number=0;
        // int temp=size;
        // for(int i=0;i<size;i++){
        //     int x = (int) Math.pow(10,temp-1);
        //     number = number + (digits[i]*x);
        //     temp = temp-1;
        // }
        // int n = number + 1;
        // int temp2 = n;
        // int digit=0;
        // //no of digits in new number
        // while(temp2>0){
        //     temp2 = temp2/10;
        //     digit++;
        // }
        // int[] arr = new int[digit];
        // for(int i=digit-1;i>=0;i--){
        //     arr[i]=n%10;
        //     n = n/10;
        // }
        // return arr;
    }

    public static void main(String args[]){
        int[] digits = {9,8,7,6,5,4,3,2,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
