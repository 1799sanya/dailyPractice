public class LeadersInAnArrayEff {

    public static void leaders(int[] arr){
        int n = arr.length;
        int curr_ldr = arr[n-1];
        System.out.print(curr_ldr + " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_ldr){
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {7,10,4,5,6,5,2};
        leaders(arr);
    }
}
