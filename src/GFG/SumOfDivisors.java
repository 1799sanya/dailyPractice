package GFG;

//Given a natural number n, calculate sum of all its proper divisors. A proper divisor of a natural number is the divisor that is strictly less than the number.
//Input: n = 10
//Output: 8
//Explanation: Proper divisors 1 + 2 + 5 = 8.

public class SumOfDivisors {
    static long divSum(long n) {
        // code here
        long sum = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                sum = sum + i;
                if(i!=n/i){
                    sum = sum + n/i;
                }
            }
        }
        sum = sum - n;
        return sum;
    }

    public static void main(String args[]){
        long n = 10;
        System.out.println(divSum(n));
    }
}
