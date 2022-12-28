package Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        int n=123215;
        int digits=(int)(Math.log10(n)+1);
        int ans=reverse(n,digits);
        if(ans==n){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
    private static int reverse(int n, int digits) {
        if(n%10==n){
            return  n;
        }
        return (n%10)*(int)(Math.pow(10,digits-1))+reverse(n/10,digits-1);
    }
}
