import java.util.Arrays;

public class median {

    public static int median(int[] arr) {

        // code here
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(n%2!=0){
            int idx = n/2 + 1;
            return arr[idx];
        } else{
            int idx1 = n/2 - 1;
            int idx2 = n/2;
            return ((arr[idx1] + arr[idx2])/2);
        }
    }

    public static void main(String[] args){
        int[] arr = {2,8,3,4};
        System.out.println(median(arr));
    }
}
