package projecteuler;

public class AmicableNumber {

    private static int checkForAmicable(int range) {
        int testnum, check, div, sum,sumf=0, num1, num2=0;
        for (testnum=0;testnum < range;testnum++) {
            sum = div = 0;
            while (++div <= testnum / 2) {
                if (testnum % div == 0) {
                    sum += div;
                }
            }
            check = sum;
            sum = div = 0;
            while (++div <= check / 2) {
                if (check % div == 0) {
                    sum += div;
                }
            }
            if (sum == testnum) {
                if (testnum == check) {
                    continue;
                }
                num1 = testnum;
                if (num1 == num2) {
                    continue;
                }
                num2 = check;
                sumf=sumf+num1+num2;                
            }
        }
        return sumf;
    }
    public static void main(String args[]){
        System.out.println(checkForAmicable(10000));
    }
}
