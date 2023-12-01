package Day59;

public class Counting_Words_with_Given_Prefix {
    public static void main(String[] args) {
        String words[] = {"pay","attention","practice","attend"};
        String pref = "at";
        int count = 0;
        for (int i =0; i <words.length; i++){
            String p = words[i];
            if (p.startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}
