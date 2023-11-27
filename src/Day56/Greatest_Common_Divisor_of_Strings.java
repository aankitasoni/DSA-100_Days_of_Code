package Day56;

public class Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String s1 = "ABABAB", s2 = "ABAB";
        int n1 = s1.length();
        int n2 = s2.length();
        String s = s1 + s2;
        if(!s.equals(s2+s1)){
            System.out.println("");
        } else{
            System.out.println(s1.substring(0, gcd(n1,n2)));
        }

    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
