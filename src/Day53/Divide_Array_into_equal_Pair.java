package Day53;

import java.util.HashMap;
import java.util.Map;

public class Divide_Array_into_equal_Pair {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3,2,2};
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        System.out.println(mp);
        for(int i : mp.keySet()){
            if(mp.get(i) %2 != 0){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
