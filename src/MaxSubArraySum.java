public class MaxSubArraySum {
    public static void main(String[] args) {
        int size=6;
        int [] arr = {1,2,3,4,5,6};
        int window_size=3;
        maxSubArraySum(arr,size,window_size);
    }
    private static void maxSubArraySum(int[] arr, int size, int window_size) {
        int w_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<size-window_size+1;i++){
            for(int j=i;j<window_size+i;j++){
                w_sum+=arr[j];
            }
            max_sum=Math.max(w_sum,max_sum);
            w_sum=0;
        }
        System.out.println(max_sum);
    }
}
//Brute Force Approach
