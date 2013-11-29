package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class PrimeDigitReplacement {

    private static int MAXPRIME = 1000000;

    private static boolean[] sieve(int max) {
        boolean[] primes = new boolean[max];
        for (int i = 2; i < 1000000; i++) {
            if (!primes[i]) {
                for (int j = 2; j < MAXPRIME / i; j++) {
                    primes[i * j] = true;
                }
            }
        }
        return primes;
    }

    private static int calculate() {
        int i = 100001;
        boolean foundPrime = false;
        boolean[] isPrime = sieve(MAXPRIME + 1);
        do {
            if (!isPrime[i]) {
                String str = String.valueOf(i);
                for (int j = 0; j <= 2 && !foundPrime; j++) {
                    String m = String.valueOf(j);
                    if (str.indexOf(m) != str.lastIndexOf(m)) {
                        int count = 0;
                        for (int k = j; k < 10; k++) {
                            String n = str.replace(m, String.valueOf(k));
                            if (!isPrime[Integer.parseInt(n)]) {
                                count++;
                            }
                        }
                        if(count == 8){
                            foundPrime=true;
                        }
                    }
                }
            }
            i += 1;
        } while (!foundPrime);
        return (i-1);
    }

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println(calculate() + "\nTime :- " + (System.currentTimeMillis() - t + " ms"));
    }
}
