package Day58;

public class Three_Divisors {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 3){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
