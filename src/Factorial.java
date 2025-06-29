public class Factorial {

    public static int factorial(int number){
        int result = 1;
        for(int i=2;i<=number;i++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        int number = 3;
        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

//Time complexity: O(n)
//Auxiliary space:  O(1) -- constant space
//Recursive solution: time complexity: O(n), auxiliary space: O(n) -- not efficient
