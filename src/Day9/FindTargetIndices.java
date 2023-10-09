package Day9;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndices {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5,3,2}, target = 2;
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == target){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}
