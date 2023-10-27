package Day24;

public class Three_Consecutive_Number_EqualTo_Number {
    public static void main(String[] args) {
        long num = 4;
        long arr[] = new long[3];
        long f1 = num/3, f2 = f1-1, f3 = f1+1;
        if (f1+f2+f3 == num){
            arr[0] = f2;
            arr[1] = f1;
            arr[2] = f3;
            for (int i =0; i<3; i++){
                System.out.println(arr[i]);
            }
        }
        long p[] = new long[0];
        System.out.println(p);
    }
}
