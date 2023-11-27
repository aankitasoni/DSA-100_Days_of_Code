package Day57;

import java.util.Arrays;

public class Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {
        int nums[] = {5,6,9,10};
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i< nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(gcd(max, min));
    }
    public static int gcd(int a, int b){
        // a = max, b = min
        if(a ==0 || b==0){
            return a^b;
        }
        if (b > a){
            return gcd(b,a);
        }
        return gcd(a%b, b);
    }
}
