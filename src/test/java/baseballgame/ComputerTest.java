package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void 컴퓨터숫자생성() {
        Computer computer = new Computer();
        assertThat(computer.createBalls().size()).isEqualTo(3);
    }
}