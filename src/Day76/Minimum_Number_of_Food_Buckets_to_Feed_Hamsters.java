package Day76;

public class Minimum_Number_of_Food_Buckets_to_Feed_Hamsters {
    public static void main(String[] args) {
        String s = ".H.H.";
        if (s.equals("H") || s.startsWith("HH") || s.endsWith("HH") || s.contains("HHH")) {
            System.out.println(-1);
        } else {
            System.out.println(s.replace("H.H", "  ").length()- s.replace("H", "").length());
        }
    }
}