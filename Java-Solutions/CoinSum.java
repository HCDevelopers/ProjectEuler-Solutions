package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class CoinSum {

    private static int getDifferentWays() {
        int size = 200;
        int[] availableCoins = { 1, 2, 5, 10, 20, 50, 100, 200 };
            int[] diffWays = new int[size+1];
            diffWays[0] = 1;
            for (int i = 0; i < availableCoins.length; i++) {
                for (int j = availableCoins[i]; j <= size; j++) {
                    diffWays[j] += diffWays[j - availableCoins[i]];
                }              
            }
        return (diffWays[diffWays.length-1]);
    }

    public static void main(String[] args) {
        System.out.println(getDifferentWays());
    }
}
