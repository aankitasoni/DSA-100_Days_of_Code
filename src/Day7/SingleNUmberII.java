package Day7;

import java.util.Arrays;

public class SingleNUmberII {
    public static void main(String[] args) {
        int nums[] = {2,3,2,3,1,3,2}; // 1 222 333
        int one = 0, two =0;
        for (int i : nums){
            one = (one^i) & (~two);
            two = (two^i) & (~one);
        }
        System.out.println(one);
    }
}
