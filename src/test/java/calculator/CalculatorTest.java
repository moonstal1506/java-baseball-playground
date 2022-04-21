package calculator;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void 더하기() {
        assertThat(Calculator.add(2, 1)).isEqualTo(3);
    }

    @Test
    void 빼기() {
        assertThat(Calculator.subtract(2, 1)).isEqualTo(1);
    }

    @Test
    void 곱하기() {
        assertThat(Calculator.multiply(2, 1)).isEqualTo(2);
    }

    @Test
    void 나누기() {
        assertThat(Calculator.divide(2, 1)).isEqualTo(2);
    }

    @Test
    void 나누기예외() {
        assertThatThrownBy(() -> {
            Calculator.divide(2, 0);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("0으로 나눌 수 없습니다.");
    }
}