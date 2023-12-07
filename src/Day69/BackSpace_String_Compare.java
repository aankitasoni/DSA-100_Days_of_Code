package Day69;

public class BackSpace_String_Compare {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(compare(s).equals(compare(t)));
    }

    public static String compare(String str) {
        StringBuilder sb = new StringBuilder();
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch[i]);
                }
            }
        }
        return sb.toString();
    }
}
