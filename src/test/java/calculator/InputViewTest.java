package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    public static final String NUMBER = "2 + 3 * 4 / 2";

    @ParameterizedTest
    @ValueSource(strings = {"2", "+", "3", "4", "/", "2"})
    @DisplayName("공백을 기준으로 문자들을 분리")
    void spiltBySpace(String input) {
        assertThat(InputView.spiltBySpace(NUMBER)).contains(input);
    }
}