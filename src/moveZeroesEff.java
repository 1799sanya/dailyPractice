import java.util.Arrays;

public class moveZeroesEff {

    public static void moveZeroes(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                //swap it with first 0 element = count of non zero elements
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {8,5,0,10,0,20,0,43};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//O(n)
