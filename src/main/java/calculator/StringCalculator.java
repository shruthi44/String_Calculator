package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String[] integers) {
            if (integers.length == 0) {
                throw new IllegalArgumentException("No input.");
            }

            for (String nums : integers) {
                if (nums == ""){
                    return 0;
                }
//                Pattern pattern = Pattern.compile(nums);
//                System.out.println(pattern);
//                Matcher matcher = pattern.matcher("([0-9]*,)");
//                System.out.println(matcher);
            }

            String[] splitString = integers.split(",");

            return 100;
        }
    }

