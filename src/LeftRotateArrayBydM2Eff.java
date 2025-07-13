import java.util.Arrays;

public class LeftRotateArrayBydM2Eff {

    public static void leftRotate(int[] arr,int d){
        int n = arr.length;
        int[] temp = new int[d];
        //first copy the first d elements in temp array
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        //then shift rem elements of arr d spaces to left
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        //then copy the elements in temp back to arr
        for(int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        leftRotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}

//time - O(n)
//space - O(d)