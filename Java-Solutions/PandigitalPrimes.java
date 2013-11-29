/*
*Problem Statement can be found here:
*http://projecteuler.net/problem=41
*/


package projecteuler;

import java.util.Arrays;

/**
*
* @author Psycho_Coder
*/
public class PandigitalPrimes {

    @SuppressWarnings("empty-statement")
    private static long getMaxPandigitalPrime() {
        long i;
        for(i=7654321;!(isPrime(i) && isPandigital(String.valueOf(i)));i-=2);
        return i;
    }

    private static boolean isPandigital(String m) {
        char[] chr = m.toCharArray();
        Arrays.sort(chr);
        return (new String(chr).equals("1234567"));
    }

    private static boolean isPrime(long a) {
        if (a == 0 || a == 1) {
            return false;
        } else if (a == 2) {
            return true;
        } else {
            if (a % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(a); i += 2) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        System.out.println(getMaxPandigitalPrime());
        System.out.println("Total Time : "+(System.currentTimeMillis()-t)+" Milisec");
    }
}
