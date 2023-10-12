package Day13;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArraysII {
    public static void main(String[] args) {
        int nums1[] = {4,9,5}, nums2[] = {9,4,9,8,4};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<>();
        int i =0, j =0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]){
                j++;
            } else {
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(al);
    }
}
