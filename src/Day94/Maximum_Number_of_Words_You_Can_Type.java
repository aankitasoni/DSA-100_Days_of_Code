package Day94;

public class Maximum_Number_of_Words_You_Can_Type {
    public static void main(String[] args) {
        String t = "leet code";
        String b = "lt";
        String s[] = t.split(" ");
        int count = 0;
        for (int i =0; i < s.length; i++){
            if (cantype(s[i], b)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean cantype(String p, String x){
        for (int i = 0; i < x.length(); i++){
            char c = x.charAt(i);
            if (p.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}
