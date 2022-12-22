public class SubArraySumSlidingWindow {
    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5,6};
        int target=18;
        subArraySumSlidingWindow(arr,target);
    }
    private static void subArraySumSlidingWindow(int[] arr, int target) {
        int start=0;
        int current_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            while(current_sum>target){
                current_sum=current_sum-arr[start];
                start++;
            }
            if(current_sum==target){
                int p=i-1;
                System.out.println(start+","+p);
                return;
            }
            current_sum+=arr[i];
        }
    }
}
