package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int ans=fibo(n);
        System.out.println(ans);
    }
    private static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
//Linear Recursion