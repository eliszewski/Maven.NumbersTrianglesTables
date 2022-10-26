package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                evenNumbers += i;
                //evenNumbers.concat(Integer.toString(i)); failed
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 1){
                oddNumbers += i; //
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) { //note: readme did not indicate a step parameter
        String sqrNumbers ="";
        for(int i = start; i < stop; i+=step){
            int currentNumber = i;
            currentNumber = currentNumber * currentNumber;
            sqrNumbers += currentNumber;
        }
        return sqrNumbers;
    }

    public static String getRange(int stop) { // changed this parameter from start to stop
        String range = "";
        for(int i = 0; i < stop; i++){
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "" ;
        for(int i = start; i < stop; i++){
            range += i;
        }

        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "" ;
        for(int i = start; i < stop; i += step){
            range += i;
        }

        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exp = "";
        for(int i = start; i < stop; i+=step){
            int currentNumber = i;
            currentNumber = (int)Math.pow(currentNumber, exponent); //cast Math.pow from double to int
            exp += currentNumber;
        }
        return exp;
    }
}
