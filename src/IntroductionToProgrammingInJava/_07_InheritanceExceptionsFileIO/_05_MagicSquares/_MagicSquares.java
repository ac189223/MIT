package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._05_MagicSquares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class _MagicSquares {

    private static void checkFile(String file) throws IOException{

        FileReader fr = new FileReader("./src/" + file);
        BufferedReader br = new BufferedReader(fr);

// Reading file into ArrayList of Arrays
        ArrayList<String[]> merkuryLines = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            merkuryLines.add(line.split("\t"));
        }
        br.close();

// ArrayList for collecting sums of horizontal, vertical and diagonal lines sums
        ArrayList<Integer> sumsOfLines = new ArrayList<>();

// Writing vertical lines sums into ArrayList
        // Adding values from first row to the ArrayList on separate positions
        for (String firstLineValue : merkuryLines.get(0)) {
            sumsOfLines.add(Integer.valueOf(firstLineValue));
        }
        // Adding values from next rows to the ArrayList on the right positions
        for (int lineNumber = 1; lineNumber < merkuryLines.size(); lineNumber++) {
           for (int columnNumber = 0; columnNumber < merkuryLines.get(lineNumber).length; columnNumber++) {
               int oldvalue = sumsOfLines.get(columnNumber);
               // Adding value from same column from line that we are at the moment (converted to integer)
               int incresement = Integer.valueOf(merkuryLines.get(lineNumber)[columnNumber]);
               sumsOfLines.set(columnNumber, oldvalue + incresement);
           }
        }

// Writing horizontal lines sums into ArrayList
        for (String[] merkuryLine : merkuryLines) {
            int sumOfLine = 0;
            for (String value : merkuryLine) {
                sumOfLine += Integer.valueOf(value);
            }
            sumsOfLines.add(sumOfLine);
        }

// Writing diagonal lines sums into ArrayList
        int sumOfFirst = 0;
        int sumOfSecond = 0;
        for (int lineNumber = 0; lineNumber < merkuryLines.size(); lineNumber++) {
            // From every line we take a number from appropriate diagonal
            sumOfFirst += Integer.valueOf(merkuryLines.get(lineNumber)[lineNumber]);
            sumOfSecond += Integer.valueOf(merkuryLines.get(lineNumber)[merkuryLines.size()-lineNumber -1]);
        }
        sumsOfLines.add(sumOfFirst);
        sumsOfLines.add(sumOfSecond);

// Checking if all sums in ArrayList are the same
        boolean check = true;
        for (int sumOfLine : sumsOfLines) {
            if (sumOfLine != sumsOfLines.get(0)) {
                check = false;
                break;
            }
        }

        if (!check) {
            System.out.println("Square from file " + file + " is not magic.");
        } else {
            System.out.println("Square from file " + file + " is a Magical Square with sum of all lines equal " + sumsOfLines.get(0) + ".");
        }

    }

    public static void main(String[] args) throws IOException {
        checkFile("Mercury.txt");
        checkFile("Luna.txt");
    }
}
