package Day92;


public class Largest_Substring_Between_Two_Equal_Characters {
    public static void main(String[] args) {
        String s = "abda";
        int max = -1;
        for (int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            max = Math.max(max, s.lastIndexOf(c) - s.indexOf(c)-1);
        }
        System.out.println(max);
    }
}
