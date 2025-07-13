import java.util.Arrays;

public class LeftRotateArrayBydM3efff {

    public static void leftRotate(int[] arr,int d){
        int n = arr.length;
        //first reverse the first d elements
        reverse(arr,0,d-1);
        //then reverse the remaining n-d elements
        reverse(arr,d,n-1);
        //then reverse the entire array
        reverse(arr,0,n-1);
    }

    public static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        leftRotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
