package Teoria;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        long big1 = Long.MAX_VALUE;
        long big2 = Long.MAX_VALUE;
        long result = big1 * 10;
        BigInteger bigint = BigInteger.valueOf(big1);
        BigInteger resultbig = bigint.multiply(BigInteger.valueOf(10));

        System.out.println("result : " + result + ", resultbig : " + resultbig);
    }
}
