package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {

    @Test
    void 컴퓨터숫자생성() {
        ComputerBalls computer = new ComputerBalls();
        assertThat(computer.createBalls().size()).isEqualTo(3);
    }
}