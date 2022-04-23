package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {

    @Test
    void 결과판단() {
        Judgement judgement = new Judgement(3,3);
        assertThat(judgement.judge()).isEqualTo("3스트라이크");
    }

}