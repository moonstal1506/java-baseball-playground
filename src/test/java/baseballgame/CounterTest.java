package baseballgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    private Counter counter;
    private UserBalls userBalls;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        userBalls = new UserBalls("123");
    }

    @ParameterizedTest
    @CsvSource(value = {"123:3", "124:2", "145:1", "456:0"}, delimiter = ':')
    void 같은수같은자리개수(String input, int expected) {

        UserBalls userBalls2 = new UserBalls(input);

        int strike = counter.countEqualSpace(userBalls.getBalls(), userBalls2.getBalls());
        assertThat(strike).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"123:3", "234:2", "345:1", "456:0"}, delimiter = ':')
    void 같은수개수(String input, int expected) {
        UserBalls userBalls2 = new UserBalls(input);

        int ball = counter.countEqualNumber(userBalls.getBalls(), userBalls2.getBalls());
        assertThat(ball).isEqualTo(expected);
    }
}