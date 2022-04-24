package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @Test
    void 낫싱() {
        Result result = new Result(0, 0);
        assertThat(result.report()).isEqualTo("낫싱");
    }

    @Test
    void 스트라이크3() {
        Result result = new Result(3, 3);
        assertThat(result.report()).isEqualTo("3스트라이크");
    }

    @Test
    void 볼3() {
        Result result = new Result(3, 0);
        assertThat(result.report()).isEqualTo("3볼");
    }

    @Test
    void 스트라이크1볼2() {
        Result result = new Result(3, 1);
        assertThat(result.report()).isEqualTo("1스트라이크 2볼");
    }

}