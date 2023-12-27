package Day88;

public class Minimum_Time_to_Make_Rope_Colorful {
    public static void main(String[] args) {
        String s = "abaac";
        int t[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 1;i < s.length(); i++){
            if (s.charAt(i-1) == s.charAt(i)){
                sum += Math.min(t[i-1], t[i]);
                t[i] = Math.max(t[i-1], t[i]);
            }
        }
        System.out.println(sum);
    }
}
