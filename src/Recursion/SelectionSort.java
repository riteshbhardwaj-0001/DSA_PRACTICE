package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int length, int index,int maxIndex) {
        if(length==0){
            return;
        }
        if(length>index){
            if(arr[index]>arr[maxIndex]){
                selectionSort(arr,length,index+1,index);
            }
            else{
                selectionSort(arr,length,index+1,maxIndex);
            }
        }
        else{
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[length-1];
            arr[length-1]=temp;
            selectionSort(arr,length-1,0,0);
        }
    }
}
