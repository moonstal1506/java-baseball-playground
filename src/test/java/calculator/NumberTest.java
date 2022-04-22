package calculator;

import org.junit.jupiter.api.Test;

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
}