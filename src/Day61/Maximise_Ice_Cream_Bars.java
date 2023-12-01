package Day61;

import java.util.Arrays;

public class Maximise_Ice_Cream_Bars {
    public static void main(String[] args) {
        int costs[] = {1,6,3,1,2,5};
        int coins = 7;
        int sum =0;
        Arrays.sort(costs);
        for(int i =0; i< costs.length; i++){
            sum = sum + costs[i];
            if(sum > coins){
                System.out.println(i);;
            }
        }
        System.out.println(costs.length);
    }
}
