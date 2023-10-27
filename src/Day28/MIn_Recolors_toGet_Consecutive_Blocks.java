package Day28;

public class MIn_Recolors_toGet_Consecutive_Blocks {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k =7;
        int count =0, total=0, i=0;
        for (; i < k; i++) {
            if (blocks.charAt(i) == 'B') {
                count++;
            }
        }
        total = count;
        for (; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B') {
                count++;
            }
            if (blocks.charAt(i - k) == 'B') {
                count--;
            }
            total = Math.max(total, count);
        }
        System.out.println(k-total);
    }
}
