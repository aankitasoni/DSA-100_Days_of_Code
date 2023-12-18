package Day79;

import java.util.Arrays;

public class Max_Product_Difference_Between_2_Pairs {
    public static void main(String[] args) {
        int nums[] = {4,2,5,9,7,4,8};
        Arrays.sort(nums);
        int max = nums[nums.length-1]*nums[nums.length-2];
        int min = nums[0]*nums[1];
        System.out.println(max-min);
    }
}
