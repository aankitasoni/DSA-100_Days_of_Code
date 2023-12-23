package Day84;

public class Strong_Password_Checker_II {
    public static void main(String[] args) {
        String s = "Me+You--IsMyDream";
        if (s.length() < 8){
            System.out.println(false);
        }
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i-1) == s.charAt(i)) {
                System.out.println(false);
            }
        }
        boolean l = s.matches(".*[a-z].*");
        boolean u = s.matches(".*[A-Z].*");
        boolean d = s.matches(".*[\\d].*");
        boolean c = s.matches(".*[-!@#$%^&*()+].*");
         System.out.println(l && u && d && c);
    }
}
