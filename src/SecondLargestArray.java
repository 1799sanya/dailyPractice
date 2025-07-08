public class SecondLargestArray {
    public static int getSecondLargest(int[] arr){
        int largest = getLargest(arr);
        int res = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res=i;
                }
                if(arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        if(res==-1) return -1;
        return arr[res];
    }

    public static int getLargest(int[] arr){
        int n = arr.length;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {10,10,10,2,3};
        System.out.println(getSecondLargest(arr));
    }
}
