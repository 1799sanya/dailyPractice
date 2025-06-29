public class GCDApproach1 {

    public static int gcd(int a,int b){
        int res = Math.min(a,b);
        while(res >=1){
            if(a%res == 0 && b%res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args){
        int a = 12;
        int b = 18;
        int gcd = gcd(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
}

//Time complexity: O(min(a,b))
