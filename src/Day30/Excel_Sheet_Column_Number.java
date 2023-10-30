package Day30;

public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        String s = "AB";
        int ans =0;
        for (int i =0; i<s.length(); i++){
            ans = ans*26 + s.charAt(i)-'A' +1;
        }
        System.out.println(ans);
    }
}
