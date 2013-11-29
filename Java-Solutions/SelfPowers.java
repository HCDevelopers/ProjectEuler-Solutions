/*
*Problem Statement can be found here:
*http://projecteuler.net/problem=48
*/

package projecteuler;

import java.math.BigInteger;

public class SelfPowers {
    public static BigInteger calculateSelfPowers(){
        BigInteger modval = BigInteger.valueOf(10).pow(10);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++)
        sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modval)).mod(modval);
        return sum;
    }
    public static void main(String[] args){
        long t=System.currentTimeMillis();
        System.out.println(calculateSelfPowers()+"\nTime :- "+(System.currentTimeMillis()-t+" ms"));
    }

}
