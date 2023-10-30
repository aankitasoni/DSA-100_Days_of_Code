package Day29;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int c = 28;
        String s = "";
        while (c-- >0){
            s = (char) (c %26+'A') + s;
            c /= 26;
        }
        System.out.println(s);
    }
}
