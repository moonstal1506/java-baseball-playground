package baseballgame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserBallsTest {

    @Test
    void 유저볼생성() {
        UserBalls userBalls = new UserBalls("123");
        assertThat(userBalls.getBalls()).isEqualTo(Arrays.asList(1, 2, 3));
    }

    @Test
    void 숫자예외() {
        assertThatThrownBy(() -> {
            new UserBalls("000");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1~9까지 입력해주세요");
    }

    @Test
    void 볼개수예외() {
        assertThatThrownBy(() -> {
            new UserBalls("1234");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자 3개를 입력해주세요");
    }

    @Test
    void 중복숫자예외() {
        assertThatThrownBy(() -> {
            new UserBalls("111");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복된 숫자입니다.");
    }

    @Test
    void 숫자아닐경우예외() {
        assertThatThrownBy(() -> {
            new UserBalls("asd");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자를 입력해야합니다.");
    }
}