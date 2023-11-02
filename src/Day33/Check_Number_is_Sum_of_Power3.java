package Day33;
public class Check_Number_is_Sum_of_Power3 {
    public static void main(String[] args) {
        int n =95;
        while (n > 0){
            if (n % 3 == 2) {
                System.out.println(false);
                break;
            }
            else n /= 3;
        }
        System.out.println(true);
    }
}
