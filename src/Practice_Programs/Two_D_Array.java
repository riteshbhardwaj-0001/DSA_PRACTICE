package Practice_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=in.nextInt();
        System.out.println("Enter no of cols:");
        int col=in.nextInt();
        System.out.println("Enter values:");
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Array is:");

        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        /*for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }*/
    }
}
