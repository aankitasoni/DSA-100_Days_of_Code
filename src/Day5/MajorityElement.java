package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {1,2};
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>();
        int count  =1;
        for (int i =1; i< n; i++){
            if (nums[i] == nums[i-1]){
                count++;
            } else {
                if (count > n/3){
                    al.add(nums[i-1]);
                }
                count = 1;
            }
        }
        if (count > n/3){
            al.add(nums[n-1]);
        }
        System.out.println(al);
    }
}
