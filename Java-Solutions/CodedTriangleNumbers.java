/*
*Problem Statement can be found here:
*http://projecteuler.net/problem=42
*/

package projecteuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
* @author Psycho_Coder
*/
public class CodedTriangleNumbers {

    private static List<String> words = new ArrayList<>();
    
    private static int computeCodedTriangleNumbers() throws IOException {
        String wordsfromfile = "";
        try {
            FileReader fr = new FileReader("C:\\Users\\Animesh\\Desktop\\words.txt");
            BufferedReader br = new BufferedReader(fr);
            String currLine;
            while ((currLine = br.readLine()) != null) {
                wordsfromfile = wordsfromfile + currLine;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not present at given location"+e.getMessage());return 0;
        }
        words.addAll(Arrays.asList(wordsfromfile.replace("\"", "").split(",")));
        int finalsum = 0;
        for (int i = 0; i < words.size(); i++) {
            double wordsum = (Math.sqrt(1 + 8 * (getWordSum(words.get(i)))) - 1.0) / 2.0;
            if (wordsum == ((int) wordsum)) {
                finalsum++;
            }
        }
        return finalsum;
    }

    public static void main(String[] args)throws IOException{
        long t=System.currentTimeMillis();
        System.out.println(computeCodedTriangleNumbers());
        System.out.println("Total Time : "+(System.currentTimeMillis()-t)+" Milisec");
    }

    private static int getWordSum(String name) {
        int finalsum = 0;
        for (int i = 0; i < name.length(); i++) {
            finalsum += name.charAt(i) - 64;
        }
        return finalsum;
    }
}
