package LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr={12,123,14,5};
        int ans=findNumbers(arr);
        System.out.println(ans);

        System.out.println("Number Of Digits With Different Method:");
        System.out.println(numberOfDigit(1234));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(evenDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean evenDigit(int num){
        int digitCount=0;
        while(num!=0){
            digitCount++;
            num=num/10;
        }
        if(digitCount%2==0){
            return true;
        }
        return false;
    }

    public static int numberOfDigit(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
}
