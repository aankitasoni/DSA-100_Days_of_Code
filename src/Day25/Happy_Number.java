package Day25;

public class Happy_Number {
    public static void main(String[] args) {
        int num = 7;
        while (num != 1 && num != 4){
            int sum =0;
            for (char c : String.valueOf(num).toCharArray()) {
                sum += Math.pow((int) (c - '0'), 2);
            }
            num = sum;
            }
        System.out.println(num == 1);
        }
}
