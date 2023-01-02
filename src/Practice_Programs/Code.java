package Practice_Programs;

import java.util.ArrayList;

public class Code {
    public static void main(String[] args) {
        int[] arr = {234, 446, 555, 9988};
        int size = arr.length;
        int sum=0;
        for (int i = 0; i < size; i++) {
            int ans = function(arr[i]);
            sum+=ans;
        }
        System.out.println(sum);
    }
    private static int function(int number) {//2345
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = number;
        while (number != 0) {//2345,234
            int rem = number % 10;//5,4
            number /= 10;//234,23
            max = Math.max(max, rem);//5
            min = Math.min(min, rem);//2
        }
        int mul = 1;
        while (n != 0) {//2345,234,23
            int rem = n % 10;//5,4,3
            n /= 10;//234,23,2
            if (rem != min && rem != max) {//true && false , true && true , true && true
                number = rem * mul + number;//4*1+0=4 , 34
                mul *= 10;//mul =10 , mul =100
            }
            //sum += number;//0,4,38
        }
        return number;
    }
}