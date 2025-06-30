package Leetcode;

//Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

public class ThreeDivisors {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(i*i!=n){
                    count++;
                }
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        ThreeDivisors sol = new ThreeDivisors();
        int n=2;
        System.out.println(sol.isThree(n));
    }
}
