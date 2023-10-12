package Day12;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 7};
        int b[] = {1, 2, 4, 6, 7};
        List<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                }
                i++;
            } else {
                if (al.size() == 0 || al.get(al.size() - 1) != b[j]) {
                    al.add(b[j]);
                }
                j++;
            }
        }
        while (i < a.length){
            if (al.get(al.size()-1) != a[i]){
                al.add(a[i]);
            }
            i++;
        }
        while (j < b.length){
            if (al.get(al.size()-1) != b[j]){
                al.add(b[j]);
            }
            j++;
        }
        System.out.println(al);
    }
}
