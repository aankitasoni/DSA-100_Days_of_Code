package Day10;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n =4;
        if (n <= 2){
            System.out.println(n);
        }
        int x =1, y =2;
        for (int i = 2; i<n; i++){
            int steps = x;
            x =y;
            y+= steps;
        }
        System.out.println(y);
    }
}
