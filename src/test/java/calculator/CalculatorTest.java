package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator =new Calculator();

    @Test
    @DisplayName("공백으로 문자열 분리")
    void split() {
        String[] values=calculator.split("2 + 3 * 4 / 2");
        assertThat(values[3]).isEqualTo("*");
    }

    @Test
    void 문자열을_숫자로() {
        int value=calculator.makeInt("2");
        assertThat(value).isEqualTo(2);
    }
}