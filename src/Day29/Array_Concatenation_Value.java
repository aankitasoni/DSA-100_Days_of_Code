package Day29;

public class Array_Concatenation_Value {
    public static void main(String[] args) {
        int nums[] = {5,14,13,8,12};
        String s = "";
        long ans = 0;
        int n = nums.length-1, i =0;
        while(i <= n) {
            String s1 = Long.toString(nums[i]);
            String s2 = Long.toString(nums[n]);
            s1 += s2;
            if (i == n){
                ans += nums[i];
            } else {
                ans += Long.parseLong(s1);
            }
            i++;
            n--;
        }
        System.out.println(ans);
    }
}
