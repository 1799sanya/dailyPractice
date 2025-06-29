public class TrailingZerosInFact {

    public static int trailingZeroes(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        int res = 0;
        while(fact%10==0){
            res++;
            fact = fact/10;
        }
        return res;
    }

    public static void main(String[] args){
        int n=10;
        int res = trailingZeroes(n);
        System.out.println("No of trailing zeros in factorial of " + n + " is " + res);
    }
}

//Time complexity: O(n)
//Problem w this approach: Overflow for even slightly higher values of n
//int datatype will not be able to fact of higher values of n