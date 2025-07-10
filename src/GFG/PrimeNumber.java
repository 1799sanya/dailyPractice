package GFG;

//Given a number n, determine whether it is a prime number or not.
//Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
//Examples :
//Input: n = 7
//Output: true
//Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.

public class PrimeNumber {
    public static boolean isPrime(int n) {
        // code here
        if(n==1) return false;
        //if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args){
        int n=89;
        System.out.println(isPrime(n));
     }
}
