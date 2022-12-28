package Recursion;

public class ReduceANumberToZero {
    public static void main(String[] args) {
        int n=14;
        int ans=numberOfsteps(n);
        System.out.println(ans);
    }

    private static int numberOfsteps(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int i) {
        if(n==0){
            return i;
        }
        if(n%2==0){
            return helper(n/2,i+1);
        }
        return helper(n-1,i+1);
    }
}
