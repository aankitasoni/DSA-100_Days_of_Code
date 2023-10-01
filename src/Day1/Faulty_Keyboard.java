package Day1;

public class Faulty_Keyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(String.valueOf(sb));
    }
}
