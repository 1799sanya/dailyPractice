public class TrailingZeroesInFactEff {

    public static int trailingZeroes(int n){
        int res = 0;
        while(n>0){
            res = res + n/5;
            n = n/5;
        }
        return res;
    }

    public static void main(String[] args){
        int n=251;
        int res = trailingZeroes(n);
        System.out.println("No of trailing zeros in factorial of " + n + " is " + res);
    }
}

//Time complexity: O(logn)
