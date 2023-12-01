package Day33;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "({[]})";
        while (s.length() != 0){
            String p = s.replace("()", "").replace("[]", "").replace("{}","");
            if (s.equals(p)){
                System.out.println(false);
            }
            s = p;
        }
        System.out.println(true);
    }
}
