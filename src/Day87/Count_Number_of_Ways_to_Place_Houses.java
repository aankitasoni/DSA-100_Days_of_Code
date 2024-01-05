package Day87;

public class Count_Number_of_Ways_to_Place_Houses {
    public static void main(String[] args) {
        int n = 10000;
        int b =1, s =1, mod = (int)1e9+7;
        int res =2;
        for (int i =1; i <= n; i++){
            res = (b+s)%mod;
            b =s;
            s = res;
        }
        int ans = (int)(1L * s * s % mod);
        System.out.println(ans);
    }

}
