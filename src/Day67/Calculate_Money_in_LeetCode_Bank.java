package Day67;

public class Calculate_Money_in_LeetCode_Bank {
    public static void main(String[] args) {
        int n = 20;
        int ans = 0;
        for (int i = 0; i<n; i++){
            int week = i/7;
            int day = i % 7;

            ans += week + day +1;
        }
        System.out.println(ans);
    }
}
