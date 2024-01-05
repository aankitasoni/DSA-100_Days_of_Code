package Day97;

public class Count_possible_ways_to_construct_buildings {
    public static void main(String[] args) {
        int n = 1;
        int b = 1, s =1;
        int res =0;
        int mod = 1000000007;
        for (int i =1; i <= n; i++){
            res = (b%mod + s%mod)%mod;
            b = s%mod;
            s = res%mod;
        }
        System.out.println((int)((long)res*res) %mod);
    }
}
