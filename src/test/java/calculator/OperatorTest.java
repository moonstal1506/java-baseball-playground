package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperatorTest {
    @Test
    void 더하기() {
        assertThat(Operator.add(2, 1)).isEqualTo(3);
    }

    @Test
    void 빼기() {
        assertThat(Operator.subtract(2, 1)).isEqualTo(1);
    }

    @Test
    void 곱하기() {
        assertThat(Operator.multiply(2, 1)).isEqualTo(2);
    }

    @Test
    void 나누기() {
        assertThat(Operator.divide(2, 1)).isEqualTo(2);
    }

    @Test
    void 나누기예외() {
        assertThatThrownBy(() -> {
            Operator.divide(2, 0);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("0으로 나눌 수 없습니다.");
    }
}