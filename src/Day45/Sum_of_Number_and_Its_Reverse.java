package Day45;

public class Sum_of_Number_and_Its_Reverse {
    public static void main(String[] args) {
        int num = 443;
        for (int i = 0; i<= num; i++){
            if(i + rev(i) == num){
                System.out.println(i);

            }
        }
        System.out.println(false);
    }
    public static int rev(int a){
        char c[] = String.valueOf(a).toCharArray();
        String reverse = "";
        for(int i = c.length-1; i >= 0; i--){
            reverse += c[i];
        }
        return Integer.parseInt(reverse);
    }
}
