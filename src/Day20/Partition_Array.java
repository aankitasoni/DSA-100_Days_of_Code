package Day20;
import java.util.*;
public class Partition_Array {
    public static void main(String[] args) {
        int nums[] = {9,12,5,10,14,3,10};
                int pivot = 10;
        List<Integer> al = new ArrayList<>();
        for (int i =0; i< nums.length; i++){
            if (nums[i] < pivot){
                al.add(nums[i]);
            }
        }
        for (int i =0; i< nums.length; i++){
            if (nums[i] == pivot){
                al.add(nums[i]);
            }
        }
        for (int i =0; i< nums.length; i++){
            if (nums[i] > pivot){
                al.add(nums[i]);
            }
        }
        System.out.println(al);
    }
}
