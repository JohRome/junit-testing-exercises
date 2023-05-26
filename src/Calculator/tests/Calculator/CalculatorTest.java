package Calculator;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculatorTest {

    Calculator sut;

    @BeforeEach
     void setCalc() {
        sut = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"1.5, 1.5, 3.0", "0.5, 1.44, 1.94", "-1, -1, -2"})
    void shouldReturnExpectedValueFromAddingTwoNumbers(double n1, double n2, double expected) {
        double result = sut.add(n1, n2);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource({"3, 2, 1", "13.37, 0.37, 13"})
    void shouldReturnExpectedValueFromSubtractingTwoPositiveNumbers(double n1, double n2, double expected) {
        double result = sut.subtract(n1, n2);
        assertEquals(result, expected);
    }

}