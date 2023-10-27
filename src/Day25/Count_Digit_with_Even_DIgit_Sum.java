package Day25;

public class Count_Digit_with_Even_DIgit_Sum {
    public static void main(String[] args) {
        int num =4;
        int count = 0;
        for (int i =2; i <= num; i++){
            if (sumofdigit(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean sumofdigit(int n){
        String s = String.valueOf(n);
        int digit = 0;
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            digit += Character.getNumericValue(c);
        }
        return (digit % 2 == 0);
    }
}
