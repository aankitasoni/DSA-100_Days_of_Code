package Day74;

public class Check_if_Strings_Can_Made_Equal_With_Operations_I {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "dacb";
        for (int i = 0; i < 4; i++){
            if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != s2.charAt((i+2)%4)){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
