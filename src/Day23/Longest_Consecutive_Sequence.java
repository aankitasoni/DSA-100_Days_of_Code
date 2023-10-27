package Day23;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int nums[] = {1,2,1,0};
        Arrays.sort(nums);
        if (nums.length == 0){
            System.out.println(0);
        }
        int count =1, total =1;
        for (int i =1; i <nums.length; i++){
            if (nums[i] == nums[i-1]) continue;
            if (nums[i] - nums[i-1] == 1){
                count++;
                total = Math.max(count, total);
            } else {
                count = 1;
            }
        }
        System.out.println(total);
    }
}
