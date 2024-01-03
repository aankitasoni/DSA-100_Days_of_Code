package Day96;

import java.util.HashMap;
import java.util.Map;

public class Find_element_occuring_once_when_all_other_are_present_thrice {
    public static void main(String[] args) {
        int arr[] = {1,10,1,1,2,10,10};
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i : arr){
            mp.put(i , mp.getOrDefault(i, 0)+1);
        }
        for (int i : arr){
            if (mp.get(i) == 1) System.out.println(i);;
        }
        System.out.println(-1);
    }
}
