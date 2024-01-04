package Day97;

public class Minimum_Cuts_to_Divide_Circle {
    public static void main(String[] args) {
        int n = 4;
        if (n == 1) System.out.println(0);
        if (n %2 == 0){
            System.out.println(n/2);
        } else {
            System.out.println(n);
        }

    }
}
