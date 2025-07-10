import java.util.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static int remDup(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {10,10,20,30,30,30};
        System.out.println(remDup(arr));
        System.out.println(Arrays.toString(arr));
    }
}

//time: O(n)
//space: O(n) -- extra array used
