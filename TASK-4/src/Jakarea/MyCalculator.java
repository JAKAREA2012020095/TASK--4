package Jakarea;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {
    public MyCalculator() {
    }

    public int divisorSum(int n) {
        int total = 0;

        for(int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                total += i;
            }
        }

        return total;
    }

    public BigInteger findFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for(int i = 1; i <= n; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf((long)i));
        }

        return factorial;
    }
}
