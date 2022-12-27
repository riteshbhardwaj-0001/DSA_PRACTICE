package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int digit=1342;
        int ans=digitSum(digit);
        System.out.println(ans);
    }
    private static int digitSum(int digit) {
        if(digit==0){
            return 0;
        }
        return (digit%10)+digitSum(digit/10);
    }
}
