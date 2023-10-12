package Day13;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a1[] = {2,3,4,1,1,6};
        int a2[] = {1,1,3,5};
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : a1){
            s1.add(i);
        }
        for (int i : a2){
            s2.add(i);
        }
        s1.retainAll(s2);
        System.out.println(s1);
    }
}
