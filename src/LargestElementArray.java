public class LargestElementArray {
    public static int largest(int[] arr){
        int n = arr.length;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return arr[largest];
    }

    public static void main(String[] args){
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }
}
