package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add() {
        throw new IllegalArgumentException("No input.");
    }

    public String removeLineBreaks(String stringWithLineBreaks) {
        String noEmptyString = "";
        String[] stringsWithoutLineBreaks = stringWithLineBreaks.split("/n");
        for (String strInts : stringsWithoutLineBreaks) {
            if (strInts.length() > 0) {
                noEmptyString = noEmptyString + "," + strInts;
            }
        }
        System.out.println(noEmptyString.substring(1));
        return noEmptyString.substring(1);
    }

    public int add(String stringOfIntegers) {

        if (stringOfIntegers.contains("/n")) {
            stringOfIntegers = removeLineBreaks(stringOfIntegers);
        }
        if (stringOfIntegers.equals("")) {
            return 0;
        }
        if (stringOfIntegers.endsWith(",")) {
            throw new IllegalArgumentException("Invalid input.");
        }

        int total = 0;
        String[] splitStringOfInts = stringOfIntegers.split(",");
        List negativeNumbers = new ArrayList<Integer>();
        for (String strInt : splitStringOfInts) {
            try {
                int currentNum = Integer.parseInt(strInt);
                if (currentNum < 0) {
                    negativeNumbers.add(currentNum);
                }
                if (currentNum > 1000) {
                    currentNum = currentNum % 1000;
                }
                total += currentNum;
            } catch (Exception NumberFormatException) {
                throw new IllegalArgumentException("Invalid input.");
            }
        }
        if (negativeNumbers.size() != 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed." + negativeNumbers);
        }
        return total;
    }
}

