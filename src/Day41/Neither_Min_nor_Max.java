package Day41;

import java.util.Arrays;

public class Neither_Min_nor_Max {
    public static void main(String[] args) {
        int nums[] = {3,2,1};
        Arrays.sort(nums);
        if(nums.length > 2){
            System.out.println(nums[1]);
        }
        System.out.println("-1");
    }
}
