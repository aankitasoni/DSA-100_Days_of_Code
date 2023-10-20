package Day17;

import java.util.Arrays;

public class Reducing_Dishes {
    public static void main(String[] args) {
        int num[] = {-1,-8,0,5,-9};
        Arrays.sort(num);
        int sum =0, max = 0;
        for (int i = num.length-1; i>=0; i--){
            sum += num[i];
            if (sum < 0) {
                break;
            }
            else {
                max += sum;
            }
        }
        System.out.println(max);
    }
}
