public class MajorityElement {

    //returns index of the majority element
    public static int findMajority(int[] arr){
        int n = arr.length;
        //Phase 1: finding a candidate for majority
        int res = 0;  //initializing first element as majority
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            } else {
                count--;
            }
            if(count==0){
                res = i;
                count = 1;
            }
        }

        //Phase 2: checking if candidate found(res) is actually a majority
        count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[res]){
                count++;
            }
        }
        if(count<=n/2){
            res = -1;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2,8,3,8,8,8,9,6,8};
        System.out.println(findMajority(arr));
    }
}
