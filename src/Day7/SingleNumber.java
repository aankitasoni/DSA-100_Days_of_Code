package Day7;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,3,2,3,2};
        int res = 0;
        for (int i =0; i<nums.length; i++){
            res^= nums[i];
        }
        System.out.println(res);
    }
}
