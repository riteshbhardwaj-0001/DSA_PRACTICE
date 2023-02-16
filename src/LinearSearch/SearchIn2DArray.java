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
        
    }
}
