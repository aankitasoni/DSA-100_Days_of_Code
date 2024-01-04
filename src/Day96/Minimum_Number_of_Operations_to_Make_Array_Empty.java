package Day96;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {
    public static void main(String[] args) {
        int nums[] = {2,3,3,2,2,4,2,3,4};
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums){
            mp.put(i, mp.getOrDefault(i, 0) +1);
        }
        for (int i : mp.values()){
            if (i < 2) System.out.println(-1);
            count += i /3;
            if (i %3 > 0) count++;
        }
        System.out.println(count);
    }
}
