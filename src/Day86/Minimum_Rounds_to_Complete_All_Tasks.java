package Day86;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Rounds_to_Complete_All_Tasks {
    public static void main(String[] args) {
        int t[] = {2,2,3};
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : t){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int count = 0;
        for (int i : mp.values()){
            if (i < 2) System.out.println(-1);
            count += i /3;
            if (i %3 > 0) count++;
        }
        System.out.println(count);
    }
}
