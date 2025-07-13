import java.util.Arrays;

public class LeftRotateArrBydM1 {

    public static void leftRotateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void leftRotate(int[] arr, int d){
        //call left rotate by 1 d times
        for(int i=0;i<d;i++){
            leftRotateByOne(arr);
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        leftRotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}

//time - O(nd)
//space - O(1)
