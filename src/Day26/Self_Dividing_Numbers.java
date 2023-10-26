package Day26;

import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> al = new ArrayList<>();
        for (int i = left; i<= right; i++){
            if (num(i)){
                al.add(i);
            }
        }
        System.out.println(al);
    }
    public static boolean num(int n){
        for(char c : String.valueOf(n).toCharArray()){
            if (c == '0' || n % (c-'0') >0){
                return false;
            }
        }
        return true;
    }
}
