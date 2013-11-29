package projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
*
* @author Psycho_Coder
*/
public class DistinctPowers {

    private static int calculatePowers() {
        Set<BigInteger> elements = new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                elements.add(BigInteger.valueOf(a).pow(b));
            }
        }
        return elements.size();
    }

    public static void main(String[] args) {
        System.out.println(calculatePowers());
    }
}
