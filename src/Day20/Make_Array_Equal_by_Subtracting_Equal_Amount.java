package Day20;

import java.util.HashSet;

public class Make_Array_Equal_by_Subtracting_Equal_Amount {
    public static void main(String[] args) {
        int nums[] = {1,3,0,4,5};
        HashSet<Integer> st = new HashSet<>();
        for (var i : nums){
            if (i != 0){
                st.add(i);
            }
        }

        System.out.println(st.size());
    }
}
