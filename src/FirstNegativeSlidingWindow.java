import java.util.ArrayList;

public class FirstNegativeSlidingWindow {
    public static void main(String[] args) {
        int size = 8;
        int [] arr  = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        firstNegativeInArraySlidingWindow(arr,size,k);
    }
    private static void firstNegativeInArraySlidingWindow(int[] arr, int size, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        int start=0,end=0;
        while(end<size) {
            if (arr[end] < 0) {
                l.add(arr[end]);
            }
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                if(l.isEmpty()){
                    System.out.print(" "+0+" ");
                    end++;
                }
                else{
                System.out.print(" "+l.get(0)+" ");
                if(arr[start]==l.get(0)){
                    l.remove(0);
                }
                start++;
                end++;
                }
            }
        }
    }
}
