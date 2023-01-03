package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sorting(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorting(int[] arr, int length, int index) {
        if(length==0){
            return;
        }
        if(length>index){
            if(arr[index]>arr[index+1]){
                int temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            sorting(arr,length,index+1);
        }
        else{
            sorting(arr,length-1,0);
        }
    }
}
