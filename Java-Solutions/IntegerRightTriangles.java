package projecteuler;

/**
*
* @author Psycho_Coder
*/
public class IntegerRightTriangles {

    public static int checkForMaxPerimeter() {
        int perimax = 0, postriangle;
        int numberOfTriangles = 0;
        for (int p = 1; p <= 1000; p++) {
            postriangle = getAllSolutions(p);
            if (postriangle > numberOfTriangles) {
                numberOfTriangles = postriangle;
                perimax = p;
            }
        }
        return perimax;
    }

    //a, b, and c are the sides or right angled triangle where a is the hypotenuse
    private static int getAllSolutions(int p) {
        int counter = 0;
        for (int b = 1; b <= p; b++) {
            for (int c = b; c <= p; c++) {
                int a = p - b - c;
                if (c <= a && c * c + b * b == a * a) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(checkForMaxPerimeter());
    }
}
