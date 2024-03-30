import java.math.BigInteger;

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(x);
        BigInteger power = BigInteger.valueOf(n);
        return result.pow(n);
    }

    public static void main(String[] args) {
        int x = 44564;
        int n = 123423;
        BigInteger result = pow(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
