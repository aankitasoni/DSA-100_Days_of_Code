package Day39;

public class Largest_3Same_DIgit_in_String {
    public static void main(String[] args) {
        String s = "679";
        int val = -1;
        String ans = " ";
        for(int i=0; i<s.length()-2; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                val = Math.max(val, s.charAt(i)-'0');
            }
        }
        String p = String.valueOf(val);

        if(val != -1){
            ans = p+p+p;
        }
        System.out.println(ans);
    }
}
