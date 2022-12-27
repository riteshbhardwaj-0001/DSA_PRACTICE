package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        int n=5;
        nToOnne(n);
    }
    private static void nToOnne(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        nToOnne(n-1);
    }
}
