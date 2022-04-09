package baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {


    @Test
    @DisplayName("컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택")
    void createNumbers() {
        Computer computer=new Computer();
        List<Integer> computerNumbers = computer.createNumbers();
        assertThat(computerNumbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("중복 숫자 확인")
    void isDuplicated() {
        Computer computer=new Computer();
        computer.computerNumbers = Arrays.asList(1, 2, 3);
        assertThat(computer.isDuplicated(1)).isEqualTo(true);
    }

}