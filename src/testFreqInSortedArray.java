public class testFreqInSortedArray {

    /*public static void printFreq(int[] arr){
        int n = arr.length;
        int freq = 1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                freq++;
            }
            System.out.println(arr[i] + " " + freq);
            freq = 1;

        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1] + " " + freq);
        }
    }*/ // WRONG IMPLEMENTATION

    public static void printFreq(int[] arr){
        int n = arr.length;
        int freq = 1;
        int i = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            freq = 1;
            i++;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1] + " 1");
        }
    }

    public static void main(String[] args){
        int[] arr = {10,10,10,20,30,40,40,50};
        printFreq(arr);
    }
}
