package Day77;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "rat", t = "tar";
        int ch[] = new int[26];
        for (int i = 0; i < s.length(); i++){
            ch[s.charAt(i) - 'a']++;
        }
        for (int i =0; i < t.length(); i++){
            ch[t.charAt(i) - 'a']--;
        }
        for (int i : ch){
            if (i != 0 ){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
