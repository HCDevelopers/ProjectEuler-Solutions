package projecteuler;

public class PermutedMultiples {

    /**
     * @author Psycho_Coder
     */
    private static boolean found = false;
    private static int res = 0;
    
    private static int getSmallestPermutedMultiples(){            
        for (int beg=1;!found;beg *= 10) {            
            for (int i = beg; i < beg * 10 / 6; i++) {
                found = true;
                for (int j = 2; j <= 6; j++) {
                    if (!checkForPermutation(i, i* j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }
    private static boolean checkForPermutation(int a, int b) {
        int[] arr = new int[10];
        int t = b;
        while (t > 0) {
            arr[t % 10]++;
            t /= 10;
        }
        t = a;
        while (t > 0) {
            arr[t % 10]--;
            t /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) return false;                
        }
        return true;
    }
    
    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        System.out.println(getSmallestPermutedMultiples()+"\nTime :- "+(System.currentTimeMillis()-t+" ms"));

    }
}
