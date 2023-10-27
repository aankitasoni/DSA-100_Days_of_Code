package Day25;

public class Count_Digit_with_Even_DIgit_Sum {
    public static void main(String[] args) {
        int num =30;
        int count = 0;
        for (int i =2; i <= num; i++){
            if (sumofdigit(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean sumofdigit(int n){
        int digit =0;
        while (n >0){
            digit += n %10;
            n /= 10;
        }
        return (digit % 2 == 0);
    }
}
