package calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalcultorTest {

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:3", "2 - 1:1", "1 * 2:2", "2 / 2:1"}, delimiter = ':')
    void 문자열계산(String input, int expected) {
        //given
        Number number = new Number(input);
        Calcultor calcultor = new Calcultor();
        //when
        int result = calcultor.calculate(number.getNumbers());
        //then
        assertThat(result).isEqualTo(expected);
    }
}