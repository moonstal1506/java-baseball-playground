package calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {

    public static final String NUMBER = "2 + 3 * 4 / 2";

    @ParameterizedTest
    @ValueSource(strings = {"2", "+", "3", "4", "/", "2"})
    void 공백기준문자분리(String input) {
        assertThat(InputView.spiltBySpace(NUMBER)).contains(input);
    }
}