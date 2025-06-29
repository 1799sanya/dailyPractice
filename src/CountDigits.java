public class CountDigits {

    public static int countDigits(int number) {
        int result = 0;
        while(number>0){
            number = number/10;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 837267;
        int digitsCount = countDigits(number);
        System.out.println("Number of digits: " + digitsCount);
    }
}

//Time complexity: O(d) [d -- no of digits]
