package Day26;

public class Check_if_Number_has_Equal_Digit_Count_and_Value {
    public static void main(String[] args) {
        String s = "030";
        char ch[] = new char[10];
        for (char c : s.toCharArray()){
            ch[c - '0']++;
        }
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i)-'0' != ch[i]){
                System.out.println("false");
            } else{
                System.out.println("true");
            }
        }
    }
}
