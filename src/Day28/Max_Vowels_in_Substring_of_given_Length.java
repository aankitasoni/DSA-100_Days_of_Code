package Day28;

public class Max_Vowels_in_Substring_of_given_Length {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k =7;
        int i =0;
        int count =0, total=0;
        for (; i <k; i++){
            if (vowel(s.charAt(i))){
                count++;
            }
        }
        total = count;
        for (; i<s.length(); i++){
            if (vowel(s.charAt(i)))  count++;
            if(vowel(s.charAt(i-k))) count--;
            total = Math.max(count, total);
        }
        System.out.println(total);
    }
    public static boolean vowel(char c){
        if (c == 'a' || c=='e' || c == 'i' || c== 'o' || c =='u'){
            return true;
        }
        return false;
    }
}
