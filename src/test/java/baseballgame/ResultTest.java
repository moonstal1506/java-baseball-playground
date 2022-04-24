package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @Test
    void 결과판단() {
        Result result = new Result(3, 3);
        assertThat(result.report()).isEqualTo("3스트라이크");
    }

}