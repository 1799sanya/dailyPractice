package GFG;

//Expected Complexities
//Time Complexity: O(n)
//Auxiliary Space: O(1) --- cant use recursion here, we have to use iterative approach

public class NthFibNumber {
    public int nthFibonacci(int n) {
        // code here
        int prev1 = 0;
        int prev2 = 1;
        int curr = 0;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }

    public static void main(String args[]){
        int n=8;
        NthFibNumber sol = new NthFibNumber();
        System.out.println(sol.nthFibonacci(n));
    }
}
