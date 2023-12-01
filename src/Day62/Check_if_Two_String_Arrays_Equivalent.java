package Day62;

public class Check_if_Two_String_Arrays_Equivalent {
    public static void main(String[] args) {
        String w1[] = {"ab", "c"};
        String w2[] = {"a", "bc"};
        String s1 = "", s2 = "";
        for (int i =0; i<w1.length; i++){
            s1 += w1[i];
        }
        for (int i =0; i<w2.length; i++){
            s2 += w2[i];
        }
        System.out.println(s1.equals(s2));
    }
}
