package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class DigitFifthPower {
    
    private static long checkFifthPowers() {
        int sum = 0;
        for (int i = 2; i < 1000000; i++) {
            if (i == getSumOfFifthPowers(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getSumOfFifthPowers(int a) {
        int totalSum = 0;
        while (a != 0) {
            int b = a % 10;
            totalSum += b * b * b * b * b;
            a = a / 10;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        System.out.println(checkFifthPowers());
    }
}
