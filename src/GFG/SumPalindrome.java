package GFG;

//Given a number, reverse it and add it to itself unless it becomes a palindrome or return -1 if the number of iterations becomes more than 5.
//Return that palindrome number if it becomes a palindrome else, it returns -1.
//Input: n = 73
//Output: 121
//Explanation: reverse(73) = 37, then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome.

public class SumPalindrome {
    static int isSumPalindrome(int n) {
        // code here
        int sum=n;
        int temp=n;
        for(int i=0;i<5;i++){
            if(pal(temp)) return temp;
            int rev = reverse(temp);
            sum = sum+rev;
            temp=sum;
            if(pal(sum)){
                return sum;
            }
        }
        return -1;
    }

    public static int reverse(int n){
        int ld;
        int rev=0;
        int temp=n;
        while(temp>0){
            ld = temp%10;
            rev = rev*10 + ld;
            temp=temp/10;
        }
        return rev;
    }

    public static boolean pal(int n){
        int ld;
        int rev=0;
        int temp=n;
        while(temp>0){
            ld = temp%10;
            rev = rev*10 + ld;
            temp=temp/10;
        }
        return rev==n;
    }

    public static void main(String args[]){
        int n = 73;
        System.out.println(isSumPalindrome(n));
    }
}
