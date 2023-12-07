package Day68;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character {
    public static void main(String[] args) {
        String s[] = {"abc","bcd","aaaa","cbc"};
        Character x = 'a';
        List<Integer> al = new ArrayList<>();
        for (int i =0; i<s.length; i++){
            if (s[i].contains(String.valueOf(x))){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}
