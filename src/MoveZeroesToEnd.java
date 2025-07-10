import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void moveZeroes(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        //swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {8,5,0,10,0,20};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//O(n^2)
