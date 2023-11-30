package Day46;

public class Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static void main(String[] args) {
        int left = 6, right = 10;
        int count = 0;
        for (int i = left; i<= right; i++){
            String s = Integer.toBinaryString(i);
            if(prime(s)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean prime(String x){
        int p =0;
        for(int i =0; i< x.length(); i++){
            if (x.charAt(i) == '1'){
                p++;
            }
        }
        if(p == 0 || p ==1) return false;
        for(int i =2; i<=Math.sqrt(p); i++){
            if(p % i == 0){
                return false;
            }
        }
        return true;
    }
}
