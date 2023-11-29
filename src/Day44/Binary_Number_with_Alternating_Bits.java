package Day44;

public class Binary_Number_with_Alternating_Bits {
    public static void main(String[] args) {
        int n = 7;
        String s = Integer.toBinaryString(n);
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
