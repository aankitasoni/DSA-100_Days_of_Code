package Day83;

public class Min_Changes_To_Make_Alternating_Binary_String {
    public static void main(String[] args) {
        String s = "1111";
        int counto = 0, counte = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)-'0' == i % 2) counte++;
            else counto++;
        }
        System.out.println(Math.min(counte, counto));
    }
}
