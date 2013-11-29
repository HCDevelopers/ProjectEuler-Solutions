/*
*Problem Statement Can be found here:
*http://projecteuler.net/problem=38
*/

package projecteuler;

import java.util.Arrays;

/**
* @author Psycho_Coder
*/
public class PandigitalMultiples {

    private static long calculateProducts() {
        int max = 0;
        String appendedProd = null;
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j < Math.pow(10, (9 / i)); j++) {
                for (int k = 1; k <= i; k++) {
                    appendedProd += j * k;
                }
                if (isPandigital(appendedProd)) {
                    max = Math.max(Integer.parseInt(appendedProd), max);
                }
                appendedProd = "";
            }
        }
        return max;
    }

    private static boolean isPandigital(String m) {
        char[] chr = m.toCharArray();
        Arrays.sort(chr);
        return (new String(chr).equals("123456789"));
    }

    public static void main(String[] args) {
        System.out.println(calculateProducts());
    }
}
