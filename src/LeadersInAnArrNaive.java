public class LeadersInAnArrNaive {

    public static void leaders(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {7,10,4,5,6,5,2};
        leaders(arr);
    }
}
