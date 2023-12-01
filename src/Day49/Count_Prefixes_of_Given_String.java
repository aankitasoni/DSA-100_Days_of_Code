package Day49;

public class Count_Prefixes_of_Given_String {
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int count =0;
        for (String p : words){
            if (s.startsWith(p)){
                count++;
            }
        }
        System.out.println(count);
    }
}
