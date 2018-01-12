package fr.example;

public class StringCalculator {
    private static final String SEPARATOR = ",";
    public int Add(String numbers) throws IllegalArgumentException{
        if(!numbers.isEmpty()){
            String[]  numbersSplit = numbers.split(SEPARATOR);
            if(numbersSplit.length == 1){
                return Integer.valueOf(numbersSplit[0]);
            }else if(numbersSplit.length == 2){
                return Integer.valueOf(numbersSplit[0]) + Integer.valueOf(numbersSplit[1]);
            }else{
                throw new IllegalArgumentException("there are more than two numbers in parameter");
            }
        }
        return 0;

    }
}
