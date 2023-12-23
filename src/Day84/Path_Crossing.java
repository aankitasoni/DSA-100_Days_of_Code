package Day84;

import java.util.HashSet;

public class Path_Crossing {
    public static void main(String[] args) {
        String s = "NEWWW";
        HashSet<String> st = new HashSet<>();
        st.add(0 + "," + 0);

        int x = 0, y = 0;
        for (int i =0; i < s.length();i++){
            char c = s.charAt(i);
            if (c == 'E') x++;
            else if (c == 'W') x--;
            else if (c == 'N') y++;
            else y--;

            if (!st.add(x + "," + y)){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
