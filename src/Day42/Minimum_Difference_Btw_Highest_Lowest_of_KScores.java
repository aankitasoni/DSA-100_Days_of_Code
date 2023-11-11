package Day42;

import java.util.Arrays;

public class Minimum_Difference_Btw_Highest_Lowest_of_KScores {
    public static void main(String[] args) {
        int nums[] = {9,4,7,1};
        int k =2;
        if(k == 1) {
            System.out.println("0");
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i =0, j = k-1;
        while(j < nums.length){
            min = Math.min(min, nums[j] - nums[i]);
            i++;
            j++;
        }
        System.out.println(min);
    }
}
