import java.util.Arrays;

public class LeftRotateAnArrBy1 {

    public static void lRotateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args){
        int[] arr = {4,2,8,10};
        lRotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
