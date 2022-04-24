package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalcultorTest {

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:3", "2 - 1:1", "1 * 2:2", "2 / 2:1"}, delimiter = ':')
    void 문자열계산(String input, int expected) {
        //given
        Number number = new Number(input);
        Calculator calculator = new Calculator();
        //when
        int result = calculator.calculate(number.getNumbers());
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 연산기호아닐경우() {
        Number number = new Number("1 @ 3 $ 3");
        Calculator calculator = new Calculator();

        assertThatThrownBy(() -> {
            calculator.calculate(number.getNumbers());
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("연산기호가 아닙니다.");
    }
}