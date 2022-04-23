package baseballgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    private Result result;
    private UserBalls userBalls;

    @BeforeEach
    void setUp() {
        result = new Result();
        userBalls = new UserBalls("123");
    }

    @ParameterizedTest
    @CsvSource(value = {"123:3", "124:2", "145:1", "456:0"}, delimiter = ':')
    void 스트라이크개수(String input, int expected) {

        UserBalls userBalls2 = new UserBalls(input);

        int strike = result.countStrike(userBalls.getBalls(), userBalls2.getBalls());
        assertThat(strike).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"123:3", "234:2", "345:1", "456:0"}, delimiter = ':')
    void 볼개수(String input, int expected) {
        UserBalls userBalls2 = new UserBalls(input);

        int ball = result.countBall(userBalls.getBalls(), userBalls2.getBalls());
        assertThat(ball).isEqualTo(expected);
    }
}