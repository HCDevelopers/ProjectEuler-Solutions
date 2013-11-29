package projecteuler;

public class CombinatoricSelections {

    /**
     * @Psycho_Coder
     */
    private static int MAXLIMIT = 1000000;
    private static int NLIMIT = 100;
    private static int[][] pascalTri = new int[NLIMIT+1][NLIMIT+1];

    private static int getDistinctValue() {
        int res=0;
        for (int n = 0; n <= NLIMIT; n++) {
            pascalTri[n][0] = 1;
        }
        for (int n = 1; n <= NLIMIT; n++) {
            for (int r = 1; r <= n; r++) {
                pascalTri[n][r] = pascalTri[n - 1][r] + pascalTri[n - 1][r - 1];
                if (pascalTri[n][r] > MAXLIMIT) {
                    pascalTri[n][r] = MAXLIMIT;
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println(getDistinctValue() + "\nTime :- "+(System.currentTimeMillis() - t + " ms"));
    }

}
