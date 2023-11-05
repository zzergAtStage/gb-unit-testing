package seminars.second.hw;

import java.util.ArrayList;
import java.util.List;

public class OptionalQuizzes {

    /**
     * This method checks the value for palindrome condition,
     * using the rest of dividing
     * @param value integer value, that will be checked
     * @return result of checking
     * @throws IllegalArgumentException operation generate the exception, when the argument
     * is inappropriate
     */
    public boolean palindromeChecker(int value) throws IllegalArgumentException{
        if (value < 0) throw new IllegalArgumentException("The value is above zero");
        int tmp_value = value;
        int curr_value = 0;
        while (tmp_value > 0) {
            curr_value = (curr_value * 10 + tmp_value % 10);
            ;
            tmp_value /= 10;
        }

        return (curr_value == value);
    }

    /**
     * This method gets integer number and defines its prime multipliers
     * @param value - checked value
     * @return primeMultipliers List of integers, that are prime multipliers for this number
     *
     */
    public List<Integer> getPrimeMultipliersNatural(int value){
        List<Integer> primeMultipliers = new ArrayList<>();
        int primeNumber = 1;
        primeMultipliers.add(primeNumber);
        int restOfNumber = value;
        int divider = 2;
        while (restOfNumber > 1) {
            while (restOfNumber % divider == 0) {
                primeMultipliers.add(divider);
                restOfNumber /= divider;
            }
            divider++;
        }
        return primeMultipliers;
    }

}

