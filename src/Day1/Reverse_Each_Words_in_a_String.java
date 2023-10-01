package Day1;

public class Reverse_Each_Words_in_a_String {
    public static void main(String[] args) {
        String s = "Let's play football";
        String arr[] = s.split(" ");
        String rev  = "";
        for (String p : arr){
            StringBuilder sb = new StringBuilder(p);
            sb.reverse();
            rev += sb.toString()+" ";
        }
        System.out.println(rev.trim());
    }
}
