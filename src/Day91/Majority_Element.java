package Day91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Majority_Element {
    public static void main(String[] args) {
        int  nums[] = {2,2,1,3,1,1,3,1,1};
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>();
        int count = 1;
        for (int i =1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                count++;
            } else {
                if(count > nums.length/3){
                    al.add(nums[i-1]);
                }
                count = 1;
            }
        }
        if(count > nums.length/3){
            al.add(nums[nums.length-1]);
        }
        System.out.println(al);
    }
}
