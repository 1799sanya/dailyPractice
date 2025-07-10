import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrEff {
    public static int remDup(int[] arr){
        int n = arr.length;
        int res = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
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
//space: O(1)
