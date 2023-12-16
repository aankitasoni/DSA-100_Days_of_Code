package Day77;

import java.util.ArrayList;

public class Find_Resultant_Array_After_Removing_Anagrams {
    public static void main(String[] args) {
        String words[] = {"a","b","c","d","e"};
        ArrayList<String> al = new ArrayList<>();
        al.add(words[0]);
        for (int i = 1; i < words.length; i++){
            if (!anagram(words[i-1], words[i])){
                al.add(words[i]);
            }
        }
        System.out.println(al);
    }
    public static boolean anagram(String s, String t){
        int ch[] = new int[26];
        for (int i =0; i< s.length(); i++){
            ch[s.charAt(i) - 'a']++;
        }
        for (int i =0; i< t.length(); i++){
            ch[t.charAt(i) - 'a']++;
        }
        for (int i : ch){
            if (i != 0) return false;
        }
        return true;
    }
}
