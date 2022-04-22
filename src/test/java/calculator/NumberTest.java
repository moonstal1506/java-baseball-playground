package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {

    @Test
    void null체크() {
        assertThatThrownBy(() -> {
            new Number(null);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("값을 입력해야합니다.");
    }

    @Test
    void 빈값체크() {
        assertThatThrownBy(() -> {
            new Number("");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("값을 입력해야합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "+", "2"})
    void 문자열_공백으로_나누기(String input) {
        Number number = new Number("1 + 2");
        assertThat(number.getNumbers()).contains(input);
    }
}