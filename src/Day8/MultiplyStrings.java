package Day8;

import java.math.*;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "2", num2 = "3";
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        System.out.println(c.toString(10));
    }
}
