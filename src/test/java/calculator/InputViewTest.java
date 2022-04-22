package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputViewTest {

    public static final String NUMBER = "2 + 3 * 4 / 2";

    @ParameterizedTest
    @ValueSource(strings = {"2", "+", "3", "4", "/", "2"})
    void 공백기준문자분리(String input) {
        assertThat(InputView.spiltBySpace(NUMBER)).contains(input);
    }

    @Test
    void null체크() {
        assertThatThrownBy(() -> {
            InputView.checkValidation(null);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("값을 입력해야합니다.");
    }

    @Test
    void 빈값체크() {
        assertThatThrownBy(() -> {
            InputView.checkValidation("");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("값을 입력해야합니다.");
    }
}