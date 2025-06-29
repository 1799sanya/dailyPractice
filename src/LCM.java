public class LCM {

    public static int lcm(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args){
        int a = 24;
        int b = 18;
        int lcm = lcm(a,b);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}

//Time complexity: O(a*b)
