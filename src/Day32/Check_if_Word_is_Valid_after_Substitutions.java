package Day32;

public class Check_if_Word_is_Valid_after_Substitutions {
    public static void main(String[] args) {
        String s = "aabcbc";
        while (s.length() != 0){
            String p = s.replace("abc", "");
            if (p.equals(s)){
                System.out.println(false);
            }
            s = p;
        }
        System.out.println(true);
    }
}
