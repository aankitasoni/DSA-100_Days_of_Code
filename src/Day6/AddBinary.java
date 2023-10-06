package Day6;

import java.math.*;


public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b,2);
        BigInteger z = x.add(y);
        System.out.println(z.toString(2));
    }
}
