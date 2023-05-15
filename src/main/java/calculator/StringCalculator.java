package calculator;

import java.util.ArrayList;
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

//        if (integers.endsWith(",")){
//            throw new IllegalArgumentException("Invalid input.");
//        }

        int total = 0;
        String[] splittedStringOfInts = integers.split(",");

        for (String strInt : splittedStringOfInts) {
            total += Integer.parseInt(strInt);

        }

        return total;
    }
}

