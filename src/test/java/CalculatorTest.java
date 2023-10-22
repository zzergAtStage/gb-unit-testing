import lesson01.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '+';
        if (3 != Calculator.calculation(firstOperand,secondOperand,operator)){
            throw new AssertionError("Test not passed!");
        }
        firstOperand = 8;
        secondOperand = 0;
        operator = '_';

        try {
            Calculator.calculation(firstOperand,secondOperand,operator);
        } catch (IllegalStateException e){
            if (!e.getMessage().equals("Unsupported operator!")) {
                throw new AssertionError("Test not passed!");
            }
        }

    }
}
