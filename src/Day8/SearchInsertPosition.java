package Day8;

import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
        List<Integer> al = new LinkedList<>();
        for(int i : nums){
            al.add(i);
        }

        if (al.contains(target)){
            System.out.println(al.indexOf(target));
        } else {
            al.add(target);
            Collections.sort(al);
            System.out.println(al.indexOf(target));
        }
    }
}
