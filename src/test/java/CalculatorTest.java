import lesson01.Calculator;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    public static void main(String[] args) {

        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '+';
        assert (9 == Calculator.calculation(firstOperand,secondOperand,operator));

        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(3);
        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(9);

//        firstOperand = 8;
//        secondOperand = 0;
//        operator = '_';
//
//        try {
//            Calculator.calculation(firstOperand,secondOperand,operator);
//        } catch (IllegalStateException e){
//            if (!e.getMessage().equals("Unsupported operator!")) {
//                throw new AssertionError("Test not passed!");
//            }
//        }

    }
}
