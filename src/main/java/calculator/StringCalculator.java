package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String integers) {
        if (integers == null) {
            throw new IllegalArgumentException("No input.");
        }

        int total = 0;
        String[] splittedStringOfInts = integers.split(",");

        if ( integers == ""){
           return 0;
        }

        for (String strInt : splittedStringOfInts) {
            total += Integer.parseInt(strInt);

        }

        return total;
    }
}

