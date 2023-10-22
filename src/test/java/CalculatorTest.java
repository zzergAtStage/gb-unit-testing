import lesson01.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {

        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '+';
        assert (9 == Calculator.calculation(firstOperand,secondOperand,operator));

        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(3);
        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(3);

        assertThatThrownBy(() -> Calculator.calculation(1,0,'_'))
                .isInstanceOf(IllegalStateException.class);


    }
}
