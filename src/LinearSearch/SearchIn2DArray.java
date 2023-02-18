package LinearSearch;

import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values In 2D Array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value you want to search:");
        int value=sc.nextInt();
        if(search(arr,value)){
            System.out.println("Value Found");
        }else{
            System.out.println("Not Found");
        }

        int max=(max(arr));
        System.out.println(max);
    }

    private static int max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

    private static boolean search(int[][] arr, int value) {
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==value){
                    return true;
                }
            }
        }
        return false;
    }
}
