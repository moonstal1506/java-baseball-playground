package baseballgame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @ParameterizedTest
    @CsvSource(value = {"123:3", "124:2", "145:1", "456:0"}, delimiter = ':')
    void 스트라이크개수(String input, int expected) {
        Result result = new Result();
        UserBalls userBalls = new UserBalls("123");
        UserBalls userBalls2 = new UserBalls(input);

        int strike=result.countStrike(userBalls.getBalls(),userBalls2.getBalls());
        assertThat(strike).isEqualTo(expected);
    }
}