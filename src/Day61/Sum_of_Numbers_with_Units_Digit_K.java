package Day61;

public class Sum_of_Numbers_with_Units_Digit_K {
    public static void main(String[] args) {
        int num = 58, k = 9;
        if(num == 0){
            System.out.println(0);
        }
        for(int i = 1; i <=10 && i *k <= num; i++){
            if((i*k) % 10 == num % 10){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
