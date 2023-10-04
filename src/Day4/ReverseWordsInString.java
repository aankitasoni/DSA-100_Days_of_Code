package Day4;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the     sky is blue";
        String ss[] = s.trim().split(" +");
        String rev = "";
        for (int i = ss.length-1; i>=0; i--){
            rev += ss[i] + " ";
        }
        System.out.println(rev.trim());
    }
}
