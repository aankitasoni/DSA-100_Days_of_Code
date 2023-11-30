package Day47;

public class First_Unique_Character_in_String {
    public static void main(String[] args) {
        String s = "loveleetcode";
        for (int i = 0; i <s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
