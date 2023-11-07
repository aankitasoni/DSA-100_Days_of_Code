package Day37;

public class Sum_of_Digits_in_Base_K {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        int sum =0;
        while(n >0){
            sum += n%k;
            n /= k;
        }
        System.out.println(sum);
    }
}
