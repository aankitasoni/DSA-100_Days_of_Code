package Day68;

public class Removing_Stars_From_String {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == '*'){
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
