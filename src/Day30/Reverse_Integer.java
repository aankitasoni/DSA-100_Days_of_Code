package Day30;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x = 1534236469;
        long r = 0;
        while(x!=0){
            r = r*10 + x%10;
            x /= 10;
        }
        if (r > Integer.MAX_VALUE || r< Integer.MIN_VALUE){
            System.out.println("0");
        }
        System.out.println(r);
    }
}
