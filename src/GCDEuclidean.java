public class GCDEuclidean {

    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String args[]){
        int a = 120;
        int b = 180;
        int gcd = gcd(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
}
