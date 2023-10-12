package Day13;

import java.util.*;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {

        int a1[] = {1,1,3,3,4,6,8};
        int a2[] = {3,3,4,7,8};
        ArrayList<Integer> al = new ArrayList<>();
        int i =0, j =0;
        while(i < a1.length && j < a2.length){
            if (a1[i] < a2[j]){
                i++;
            } else if (a1[i] > a2[j]){
                j++;
            } else {
                al.add(a1[i]);
                    i++;
                    j++;
                }
            }
        System.out.println(al);
        }

    }

