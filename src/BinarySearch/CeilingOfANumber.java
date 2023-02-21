package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=14;
        /*System.out.println("Ceiling Of A Number");
        System.out.println(ceiling(arr,target));*/
        System.out.println("Floor Of A Number");
        System.out.println(floor(arr,target));
    }

    private static int floor(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return arr[e];
    }

    private static int ceiling(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
//Ceiling : Ceiling Of A Number Is "A Smallest Number Greater Than Or Equal To Target" .
//Fllor : Floor Of A Number Is "A Greateat Number Smaller Than Or Equal To Target".