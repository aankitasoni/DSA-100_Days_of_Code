package Day27;

import java.util.Arrays;

public class Differnce_btw_Element_and_Digit_Sum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int sum1 = 0, sum2 =0;
        for (int i:nums){
            sum1 += i;
        }
        System.out.println("sum 1: "+ sum1);
        String numStr = "";
        for (int num : nums) {
             numStr += String.valueOf(num);
        }
        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum2 += digit;
        }
        System.out.println("sum 2: " + sum2);
        System.out.println(Math.abs(sum1 - sum2));
    }
}
