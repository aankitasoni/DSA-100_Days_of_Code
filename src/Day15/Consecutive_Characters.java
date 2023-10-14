package Day15;

public class Consecutive_Characters {
    public static void main(String[] args) {
        String s = "leetttcode";
        int count =0, max = 0;
        for (int i =0; i< s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        System.out.println(Math.max(count, max)+1);
    }
}
