/*
*Problem Statement can be found here:
*http://projecteuler.net/problem=43
*/

package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class SubstringDivisibility {

    private static final int[] primeDivisors = {2, 3, 5, 7, 11, 13, 17};
    private static final int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static long computeSum() {
        
        long totsum = 0;        
        ext:
        do {
            for (int i = 0; i < primeDivisors.length; i++) {
                if (changeToNumber(number, i + 1, 3) % primeDivisors[i] != 0) {
                    continue ext;
                }
            }
            totsum += changeToNumber(number, 0, number.length);
        } while (getNextPermutation(number));
        return totsum;
    }

    private static long changeToNumber(int[] arr, int pos, int len) {
        long res = 0;
        for (int i = pos; i < pos + len; i++) {
            res = res * 10 + arr[i];
        }
        return res;
    }

    private static boolean getNextPermutation(int[] checkIfPermutableNumber) {
        int l = checkIfPermutableNumber.length - 2;
        while (l >= 0 && checkIfPermutableNumber[l] >= checkIfPermutableNumber[l + 1]) {
            l--;
        }
        if (l == -1) {
            return false;
        }
        int b = checkIfPermutableNumber.length - 1;
        while (checkIfPermutableNumber[b] <= checkIfPermutableNumber[l]) {
            b--;
        }
        int t = checkIfPermutableNumber[l];
        checkIfPermutableNumber[l] = checkIfPermutableNumber[b];
        checkIfPermutableNumber[b] = t;
        for (int i = l + 1, j = checkIfPermutableNumber.length - 1; i < j; i++, j--) {
            t = checkIfPermutableNumber[i];
            checkIfPermutableNumber[i] = checkIfPermutableNumber[j];
            checkIfPermutableNumber[j] = t;
        }
        return true;
    }

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println(computeSum());
        System.out.println("Total Time : " + (System.currentTimeMillis() - t) + " Milisec");
    }
}
