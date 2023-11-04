package Day35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums){
            al.add(i);
        }
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al.get(k-1));
    }


}
