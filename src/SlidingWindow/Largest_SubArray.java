package SlidingWindow;

public class Largest_SubArray {
    public static void main(String[] args) {
        int[] arr={-5,8,-14,2,4,12};
        int k=-5;
        int length=arr.length;
        int size=largestSubArray(arr,k,length);
        System.out.println(size);
    }
    private static int largestSubArray(int[] arr, int k, int length) {
        int sw=0;
        int ew=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(length>ew){
            sum+=arr[ew];
            if(sum<k){
                ew++;
            }
            else if(sum==k){
                int ws=ew-sw+1;
                max=Math.max(ws,max);
                ew++;
            }
            else{
                while(sum>k) {
                    sum -= arr[sw];
                }
                sw++;
                ew++;
            }
        }
        return max;
    }
}
//Variable Window Size
//This Approach Only Work For Positive Numbers