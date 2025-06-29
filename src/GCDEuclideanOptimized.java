public class GCDEuclideanOptimized {

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        int a = 100;
        int b = 180;
        int gcd = gcd(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
}

//Time complexity: O(log(min(a,b))
