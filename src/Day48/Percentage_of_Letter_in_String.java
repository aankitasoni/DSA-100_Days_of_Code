package Day48;

public class Percentage_of_Letter_in_String {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int count = 0;
        int n = s.length();
        for (int i =0; i < n; i++){
            if (s.charAt(i) == letter){
                count++;
            }
        }
        System.out.println((count * 100)/n);
    }
}
