package Day92;

import java.util.HashSet;
import java.util.Set;

public class Find_Subarrays_With_Equal_Sum {
    public static void main(String[] args) {
        int nums[] ={1,3,6,7};
        Set<Integer> st = new HashSet<>();
        for (int i = 1; i <nums.length; i++){
            int n = nums[i-1]+nums[i];
            if(!st.add(n)){
                System.out.println(true);
            }
        }
        System.out.println(false
        );
    }
}
