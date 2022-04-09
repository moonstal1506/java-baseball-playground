package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("공백으로 문자열 분리")
    void split() {
        String[] values = calculator.split("2 + 3 * 4 / 2");
        assertThat(values[3]).isEqualTo("*");
    }

    @Test
    @DisplayName("문자열을 숫자로")
    void makeInt() {
        int value = calculator.makeInt("2");
        assertThat(value).isEqualTo(2);
    }

    @Test
    @DisplayName("더하기")
    void add() {
        int result = calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("빼기")
    void subtract() {
        int result = calculator.subtract(3, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("곱하기")
    void multiply() {
        int result = calculator.multiply(2, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("나누기")
    void divide() {
        int result = calculator.divide(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("나누기 예외")
    void divideException() {
        assertThatThrownBy(() -> {
            calculator.divide(4, 0);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("zero");
    }
}
