package fr.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
    private static final Pattern SPLIT_PATTERN = Pattern.compile(",|\\n|;|/") ;
    private static final Pattern NOT_VALID_PATTERN = Pattern.compile("[0-9],\n") ;

    public int Add(String numbers) throws IllegalArgumentException{
        if(numbers.isEmpty()){
            return 0;
        }
        if(NOT_VALID_PATTERN.matcher(numbers).matches()) {
            throw  new IllegalArgumentException("Invalid parameter");

        }
        return Arrays.stream(SPLIT_PATTERN.split(numbers)).filter(n -> !n.isEmpty()).mapToInt(Integer::valueOf).sum();
    }

}
