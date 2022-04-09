package baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    User user = new User();
    
    @Test
    @DisplayName("숫자 입력 받기")
    void splitUserNumber() {
        assertThat(user.splitUserNumber("123").contains(1)).isTrue();
    }
}