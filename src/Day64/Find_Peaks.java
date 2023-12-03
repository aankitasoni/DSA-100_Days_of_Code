package Day64;

import java.util.ArrayList;

public class Find_Peaks {
    public static void main(String[] args) {
        int m[] = {1,4,3,8,5};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =1; i < m.length-1; i++){
            if (m[i-1] < m[i] && m[i]> m[i+1]){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}
