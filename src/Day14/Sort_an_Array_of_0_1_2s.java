package Day14;

import java.util.*;
import java.util.Collections;

public class Sort_an_Array_of_0_1_2s {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(1);
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(0);
        System.out.println(al);
        int l = 0, mid =0, h=al.size()-1;
        while (mid <= h ){
           if (al.get(mid) == 0){
               Collections.swap(al, mid, l);
               mid++;
               l++;
           } else if (al.get(mid) == 1){
               mid++;
           } else {
               Collections.swap(al, mid, h);
               h--;
           }
        }
        System.out.println(al);
    }
}
