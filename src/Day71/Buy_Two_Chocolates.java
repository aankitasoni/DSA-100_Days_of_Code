package Day71;

import java.util.Arrays;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        int prices[] = {1,2,3};
        int money = 3;
        Arrays.sort(prices);
        int sum = prices[0]+prices[1];
        if (sum <= money){
            System.out.println(money - sum);
        } else {
            System.out.println(money);
        }
    }
}
