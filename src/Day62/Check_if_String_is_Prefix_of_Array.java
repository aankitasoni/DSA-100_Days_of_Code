package Day62;

public class Check_if_String_is_Prefix_of_Array {
    public static void main(String[] args) {
        String s = "a";
        String words[] = {"aa","aaa"};
        String p = "";
        for (String i : words){
            p += i;
            if (!s.startsWith(p) || s.equals(p)){
                break;
            }
        }
        System.out.println(s.equals(p));
    }
}
