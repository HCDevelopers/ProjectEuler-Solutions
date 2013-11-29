package projecteuler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
*
* @author Psycho_Coder
*/
public class PandigitalProducts {

    private static int calculate() {

        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i < 100; i++) {
            int beg=(i>9)?123:1234;
            int end=10000/i+1;            
            for (int j = beg; j < end; j++) {
                int prod = i * j;
                String pannumber = "" + i + j + prod;
                if (isPandigital(pannumber)) {
                    set.add(prod);
                }
            }
        }
        Iterator<Integer> itr =set.iterator();
        while(itr.hasNext()){
            answer +=itr.next();
        }
        return answer;
    }

    private static boolean isPandigital(String m) {
        char[] chr = m.toCharArray();
        Arrays.sort(chr);
        return (new String(chr).equals("123456789"));
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
