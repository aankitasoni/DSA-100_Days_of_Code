package Day16;

public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        String s = "345371524";
        for (int i = s.length()-1; i >=0; i--){
            if (s.charAt(i) %2 != 0){
                System.out.println(s.substring(0, (i+1)));
            }
        }
        System.out.println(" ");
    }
}
