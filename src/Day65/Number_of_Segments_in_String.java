package Day65;

public class Number_of_Segments_in_String {
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        System.out.println(s.split("\\s+").length);
    }
}
