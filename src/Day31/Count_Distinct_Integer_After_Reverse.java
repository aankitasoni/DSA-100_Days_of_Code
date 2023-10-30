package Day31;

import java.util.HashSet;
import java.util.Set;

public class Count_Distinct_Integer_After_Reverse {
    public static void main(String[] args) {
        int nums[] = {1,13,10,12,31};
        Set<Integer> st = new HashSet<>();
        for (int i =0; i<nums.length; i++){
            st.add(nums[i]);
            int r =0;
            while(nums[i] !=0){
                r = r*10 + nums[i]%10;
                nums[i] /= 10;
            }
            if (r >Integer.MAX_VALUE || r <Integer.MIN_VALUE) {
                System.out.println("0");
            }
            st.add(r);
        }
        System.out.println(st);
        System.out.println(st.size());
    }
}
