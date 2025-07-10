public class CheckIfAnArrIsSorted {
    //non decreasing order
    public static boolean isSorted(int[] arr){
        //in one traversal -- O(n)
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {2,2,2};
        System.out.println(isSorted(arr));
    }
}
