public class CheckPrimeM1 {

    public static boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int n = 71;
        boolean isPrime = isPrime(n);
        System.out.println(n + " is prime: " + isPrime);
    }
}

//Time complexity: O(n)
