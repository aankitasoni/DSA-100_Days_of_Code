package Day23;

public class Count_Digits_that_Divides_Number {
    public static void main(String[] args) {
        int num = 121;
        int count =0;
        for (char c : String.valueOf(num).toCharArray()){
            if (c ==0 || num % (c- '0')>0){
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
