package Day19;

public class Pivot_Integer {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0, left = 0;
        for (int i =1; i <=n; i++){
            sum += i;
        }
        for (int i =1; i<=n; left += i++){
            if (2*left == sum - i){
                System.out.println(i);
            }
        }
        System.out.println("-1");
    }
}
