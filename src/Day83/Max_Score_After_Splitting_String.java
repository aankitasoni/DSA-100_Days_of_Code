package Day83;

public class Max_Score_After_Splitting_String {
    public static void main(String[] args) {
        String s = "1111";
        int zero = 0, one = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0') zero++;
            else one++;
            if (i != s.length()-1) {
                max = Math.max(max, zero-one);
            }
        }
        System.out.println(max + one);
    }
}
