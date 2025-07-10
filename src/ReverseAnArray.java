import java.util.Arrays;

public class ReverseAnArray {
    public static void reverse(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,1,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
