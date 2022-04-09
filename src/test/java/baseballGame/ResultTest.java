package baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class ResultTest {
    Result result = new Result();

    @Test
    @DisplayName("결과 판단하기")
    void judge() {
       String judgment= result.judge(3,2);
        assertThat(judgment).isEqualTo("1볼 2스트라이크");
    }
}