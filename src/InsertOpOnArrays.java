public class InsertOpOnArrays {

    public static int insert(int[] arr, int n,int x,int pos,int cap){
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1] = arr[i];
        }
        arr[idx]=x;
        return n+1;
    }

    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=6;
        arr[3]=7;
        System.out.println(arr.length);//cap
        System.out.println(insert(arr,4,9,2,5));
    }
}
