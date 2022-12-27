package SlidingWindow;

import java.util.ArrayList;

public class FirstNegative {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = 8;
        int [] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        list=firstNegativeInArray(arr,size,k);
        System.out.println(list);
    }
    private static ArrayList<Integer> firstNegativeInArray(int[] arr, int size, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<size-k+1;i++){
            boolean flag=false;
            for(int j=i;j<k+i;j++){
                if(arr[j]<0) {
                    l.add(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                l.add(0);
            }
        }
        return l;
    }
}
//Brute Force Approach
