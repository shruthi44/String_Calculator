package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(){
        throw new IllegalArgumentException("No input.");
    }
    public int add(String integers) {

        if ( integers.equals("")) {
            return 0;
        }

        if (integers.endsWith(",")){
            throw new IllegalArgumentException("Invalid input.");
        }

        if(integers.contains("/n")) {
            String noEmptyString = "";
            String[] stringsWithoutLineBreaks = integers.split("/n");
            for (String strInts : stringsWithoutLineBreaks) {
                System.out.println(strInts);
                if(strInts.length() > 0){
                    noEmptyString = noEmptyString + "," + strInts;
//                   System.out.println(noEmptyString);
                }
                String newOne = noEmptyString.substring(1);
                System.out.println(newOne);
            }
        }
        int total = 0;
        String[] splittedStringOfInts = integers.split(",");
        List negativeNumbers = new ArrayList<Integer>();
        for (String strInt : splittedStringOfInts) {
            try {
                int currentNum = Integer.parseInt(strInt);
//                System.out.println(currentNum);

                if (currentNum < 0){
                    negativeNumbers.add(currentNum);
                }

                total += currentNum;
            } catch(Exception NumberFormatException) {
                throw new IllegalArgumentException("Invalid input.");
            }
        }
        if (negativeNumbers.size() != 0){
            throw new IllegalArgumentException("Negative numbers are not allowed." + negativeNumbers);
        }
        return total;
    }
}

