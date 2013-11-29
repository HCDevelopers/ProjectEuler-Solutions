package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class ChampernownesConstant {

    private static StringBuilder sb = new StringBuilder();

    private static int findSumFromSeries() {
        for (int i = 1; i < 1000000; i++) {
            sb.append(i);
        }
        int finalProd = getDigitAtPos(1) * getDigitAtPos(10) * getDigitAtPos(100) * getDigitAtPos(1000) * getDigitAtPos(10000) * getDigitAtPos(100000) * getDigitAtPos(1000000);
        return finalProd;
    }

    private static int getDigitAtPos(int i) {
        return Integer.parseInt((Character.toString(sb.charAt(i - 1))));
    }

    public static void main(String[] args) {
        System.out.println(findSumFromSeries());
    }
}
