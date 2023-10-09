package Day9;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10}, target = 8;
        List<Integer> al = new ArrayList<>();
        for(int i : nums){
            al.add(i);
        }
        int p[] = new int[2];
        p[0] = al.indexOf(target);
        p[1] = al.lastIndexOf(target);
        System.out.print("The Array is: [");
        for (int i =0; i < p.length; i++){
            System.out.print( p[i] +" ");
        }
        System.out.print("]");
    }
}
