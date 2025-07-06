package GFG;

public class Print1toNWithoutLoop {
    public static void printNos(int n) {
        // Code here
        if(n==0) return;
        printNos(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args){
        int n=7;
        printNos(n);
    }
}
