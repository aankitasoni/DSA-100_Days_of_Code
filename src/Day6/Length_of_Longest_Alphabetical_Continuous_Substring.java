package Day6;

public class Length_of_Longest_Alphabetical_Continuous_Substring {
    public static void main(String[] args) {
        String s = "abacaba";
        int count = 1, total =1;
        for (int i =0; i<s.length()-1; i++){
            if (s.charAt(i)-'0' +1 == s.charAt(i+1)-'0'){
                count++;
                total = Math.max(count, total);
            } else {
                count = 1;
            }
        }
        System.out.println(total);
    }
}
