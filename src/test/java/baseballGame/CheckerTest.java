package baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class CheckerTest {

    Checker checker = new Checker();

    @Test
    @DisplayName("같은 수의 개수 판단")
    void countEqualNumber() {
        int count=checker.countEqualNumber(Arrays.asList(1,3,6),Arrays.asList(1,2,3));
        assertThat(count).isEqualTo(2);
    }

    @Test
    @DisplayName("같은 자리 같은 수의 개수 판단")
    void countEqualSpace() {
        int count=checker.countEqualSpace(Arrays.asList(1,3,6),Arrays.asList(1,2,3));
        assertThat(count).isEqualTo(1);
    }
}