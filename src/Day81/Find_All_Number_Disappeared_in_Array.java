package Day81;

import java.util.ArrayList;

public class Find_All_Number_Disappeared_in_Array {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int temp = Math.abs(nums[i]) -1;
            if (nums[temp] > 0){
                nums[temp] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if  (nums[i] > 0){
                al.add(i+1);
            }
        }
        System.out.println(al);
    }
}
