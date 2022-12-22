public class MaxSubArraySumSlidingWindow {
    public static void main(String[] args) {
        int size=6;
        int [] arr = {1,2,3,4,5,6};
        int window_size=3;
        maxSubArraySumSlidingWindow(arr,size,window_size);
    }
    private static void maxSubArraySumSlidingWindow(int[] arr, int size, int window_size) {
        int start_window=0;
        int end_window=0;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        while(end_window<size){//0<6,1<6,2<6,3<6
            sum+=arr[end_window];//1.s=1,2.s=3,3.s=6,4.s=9
            if(end_window-start_window+1<window_size){//1<3 true,2<3 true,3<3 false
                end_window++;//1,2
            }
            else if(end_window-start_window+1==window_size){//3==3 true
                max_sum=Math.max(max_sum,sum);//6
                sum=sum-arr[start_window];//s=5
                start_window++;//1
                end_window++;//3
            }
        }
        System.out.println(max_sum);
    }
}
