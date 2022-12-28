package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n=3020;
        int ans=countZero(n,0);
        System.out.println(ans);
    }

    private static int countZero(int n, int i) {
        if(n==0){
            return i;
        }
        if(n%10==0){
            return countZero(n/10,i+1);
        }
        return countZero(n/10,i);
    }
}
