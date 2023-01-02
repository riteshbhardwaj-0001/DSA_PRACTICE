package Practice_Programs;

import java.util.Arrays;

public class RearrageArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        rearrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

     static void rearrange(int[] arr, int length) {
        int temp[] = arr.clone();
        int small=0,large=length-1;
        boolean flag=true;
        for(int i=0;i<length;i++){//small=0;large=5  1,2,3,4,5,6
            if(flag){
                arr[i]=temp[large--];//6
            }
            else{
                arr[i]=temp[small++];
            }
            flag=!flag;
        }
    }
}