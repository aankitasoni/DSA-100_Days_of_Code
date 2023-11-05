package Day36;

import java.util.Arrays;
import java.util.HashSet;

public class Third_Max_Number {
    public static void main(String[] args) {
        int nums[] = {2,3,1};
        Arrays.sort(nums);
        HashSet<Integer> st = new HashSet<>();
        for (int i = nums.length-1; i>=0; i--){
            st.add(nums[i]);
            if (st.size() == 3){
                System.out.println(nums[i]);
            }
        }
        System.out.println(nums[nums.length-1]);
    }
}
