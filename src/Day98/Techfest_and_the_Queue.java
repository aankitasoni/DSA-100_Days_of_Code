package Day98;

public class Techfest_and_the_Queue {
    public static void main(String[] args) {
        int a = 24, b =27;
        int sum = 0;
        for (int i = a; i <= b; i++){
            sum += primepowersum(i);
        }
        System.out.println(sum);
    }
    public static int primepowersum(int x){
        int sum =0;
        for (int i =2; i*i <= x; i++){
            while(x%i ==0){
                sum++;
                x = x/i;
            }

        }
        if (x != 1){
            sum++;
        }

        return sum;
    }
}
