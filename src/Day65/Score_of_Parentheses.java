package Day65;

public class Score_of_Parentheses {
    public static void main(String[] args) {
        String s = "(())()(())";
        int res = 0, depth =0;
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == '('){
                depth ++;
            } else {
                depth --;
            }
            if (s.charAt(i) == ')' && s.charAt(i-1) == '(' ){
                res += Math.pow(2,depth);
            }
        }
        System.out.println(res);
    }
}
