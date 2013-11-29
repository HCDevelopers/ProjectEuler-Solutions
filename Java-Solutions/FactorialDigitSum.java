package projecteuler;

import java.math.BigInteger;

public class FactorialDigitSum {

    public static void main(String[] args) throws Exception {
              
            BigInteger n = BigInteger.ONE;
            for (int i = 1; i <= 100; i++) {
                n = n.multiply(BigInteger.valueOf(i));
            }
            System.out.println("100!=" + n);
            BigInteger t=n,a;
            int sum=0;
            while(n!=BigInteger.ZERO){
                a= n.mod(BigInteger.valueOf(10));
                sum+=a.intValue();
                n=n.divide(BigInteger.valueOf(10));
            }
            System.out.println("The sum of digits of 100! is = " +sum);
    }
}
