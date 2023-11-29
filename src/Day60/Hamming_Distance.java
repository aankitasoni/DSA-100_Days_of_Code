package Day60;

public class Hamming_Distance {
    public static void main(String[] args) {
        int x = 1, y =4;
        int count = Integer.bitCount(x^y);
        System.out.println(count);
    }
}
