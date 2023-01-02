package Recursion;

public class Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {1,6,3,4,5};
        boolean ans = sorted(arr,0);
        System.out.println(ans);
    }

    private static boolean sorted(int[] arr, int index) {
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
