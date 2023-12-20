package Day82;

public class Teemo_Attacking {
    public static void main(String[] args) {
        int t[] = {1,2,4}, d = 2;
        int total = d;
        for (int i = 1; i < t.length; i++){
            total += Math.min(d, t[i] - t[i-1]);
        }
        System.out.println(total);
    }
}
