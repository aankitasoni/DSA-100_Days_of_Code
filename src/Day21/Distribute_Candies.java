package Day21;

import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {
    public static void main(String[] args) {
        int c[] = {1,1,2,2,3,3};
        int n = c.length/2;
        Set<Integer> st = new HashSet<>();
        for (int i : c){
            st.add(i);
        }
        System.out.println(Math.min(st.size(), n));
    }
}
