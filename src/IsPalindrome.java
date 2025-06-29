public class IsPalindrome {

    public static boolean isPalindrome(int number){
        int temp = number;
        int reverse = 0;
        while (temp>0){
            int ld = temp%10;
            reverse = reverse*10 + ld;
            temp = temp/10;
        }
        return (number == reverse);
    }

    public static void main(String[] args) {
        int number = 99099;
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }
}

// Time complexity: O(d) -- d is digits of number