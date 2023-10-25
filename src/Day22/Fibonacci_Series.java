package Day22;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n =6;
        if (n<=1){
            System.out.println(n);
        }
        int a =0, b =1, ans = 0;
        for (int i =2; i<= n; i++){
            ans = a+b;
            a=b;
            b =ans;
        }
        System.out.println(ans);
    }
}
