package Day88;

public class Find_Maximum_Number_of_String_Pairs {
    public static void main(String[] args) {
        String words[] = {"ab", "ba", "cc"};
        int res = 0;
        for (int i =0; i < words.length; i++){
            for (int j = i+1; j < words.length; j++){
                if (words[i].equals(words[j].charAt(1) + "" + words[j].charAt(0))){
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
