package GFG;

//Given a number N, find the product of all the divisors of N (including N).
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function divisorProduct() which takes integer N as input parameter and returns the product. Since the products may be very large, compute the answer modulo (109+ 7).

public class DivisorProduct {
    static Long divisorProduct(Long N) {
        // code here
        long MOD = 1000000007;
        long product = 1;
        for(long i=1;i*i<=N;i++){
            if(N%i==0){
                product = (product*i) % MOD;
                if(i!=(N/i)){
                    product = (product * (N/i)) % MOD;
                }
            }
        }
        return product;
    }

    public static void main(String args[]){
        long n = 36;
        System.out.println(divisorProduct(n));
    }
}
