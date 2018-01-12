package fr.example;

import java.util.Arrays;

public class StringCalculator {
    private static final String SEPARATOR = ",";
    public int Add(String numbers) throws IllegalArgumentException{
        if(numbers.isEmpty()){
            return 0;
        }
        return Arrays.stream(numbers.split(SEPARATOR)).mapToInt(Integer::valueOf).sum();
    }
}
