package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int size=arr.length;
        int element=4;
        int result=binarySearch(arr,0,size-1,element);
        if(result==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element found at index : "+result);
        }
    }
    private static int binarySearch(int[] arr, int start, int end, int element) {
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==element){
            return mid;
        }
        if(arr[mid]<element){
            return binarySearch(arr,mid+1,end,element);
        }
        return binarySearch(arr,start,mid-1,element);
    }
}
//Divide and Conquer Recursion
