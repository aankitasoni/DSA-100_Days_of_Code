package Day34;

import java.util.ArrayList;

public class Sum_of_Values_at_KBits_Indices {
    public static void main(String[] args) {
        int nums[] = {5,10,1,5,2};
        int k = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums){
            al.add(i);
        }
        System.out.println(al);
        int sum = 0;
        for (int i =0; i < al.size(); i++){
            if(Integer.bitCount(i) == 1){
                sum += al.get(i);
            }
        }
        System.out.println(sum);
    }
}
