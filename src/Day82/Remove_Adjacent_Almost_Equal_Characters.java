package Day82;

public class Remove_Adjacent_Almost_Equal_Characters {
    public static void main(String[] args) {
        String s = "zyxyxyz";
        int count = 0;
        for (int i =1; i < s.length(); i++){
            if (Math.abs(s.charAt(i-1) - s.charAt(i)) <= 1){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
