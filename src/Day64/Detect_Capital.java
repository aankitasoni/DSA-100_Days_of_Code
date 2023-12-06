package Day64;

public class Detect_Capital {
    public static void main(String[] args) {
        String s = "FlaG";
        System.out.println(s.equals(s.toUpperCase()) || s.substring(1).equals(s.substring(1).toLowerCase()));
    }
}
