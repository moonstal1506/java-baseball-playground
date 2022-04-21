package calculator;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void 더하기() {
        assertThat(Calculator.add(1)).isEqualTo(1);
    }

    @Test
    void 빼기() {
        assertThat(Calculator.subtract(1)).isEqualTo(-1);
    }

    @Test
    void 곱하기() {
        assertThat(Calculator.multiply(1)).isEqualTo(0);
    }

    @Test
    void 나누기() {
        assertThat(Calculator.divide(1)).isEqualTo(0);
    }

    @Test
    void 나누기예외() {
        assertThatThrownBy(() -> {
            Calculator.divide(0);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("0으로 나눌 수 없습니다.");
    }

    @Test
    void 부호에따라계산() {
        assertThat(Calculator.calculate(InputView.spiltBySpace(InputViewTest.NUMBER))).isEqualTo(10);
    }
}