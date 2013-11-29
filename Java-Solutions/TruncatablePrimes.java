package projecteuler;

/**
 *
 * @author Psycho_Coder
 */
public class TruncatablePrimes {

    public static int checkForTruncatablePrimes() {
        int numberOfPrime = 0;
        int sum = 0;

        int i = 10;
        while (numberOfPrime < 11) {
            if (isTruncatablePrime(i)) {
                numberOfPrime++;
                sum += i;
            }
            i++;
        }
        return (sum);
    }

    private static boolean isTruncatablePrime(int x) {
        return isRightTruncatable(x) && isLeftTruncatable(x);
    }

    private static boolean isPrime(int a) {
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

    private static boolean isRightTruncatable(int a) {
        while (a != 0) {
            if (!isPrime(a)) {
                return false;
            }
            a /= 10;
        }
        return true;
    }

    private static boolean isLeftTruncatable(int a) {
        for (int i = (int) Math.pow(10, 4); i != 1; ) {
            if (!isPrime(a % i)) {
                return false;
            }
            i /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkForTruncatablePrimes());
    }
}
