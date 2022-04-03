package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    @DisplayName("문자바꾸기")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName(",로 쪼개기")
    void split() {
        String[] num = "1,2".split(",");
        assertThat(num).contains("1");
    }

    @Test
    @DisplayName("1을 ,로 쪼개면 1이다")
    void split2() {
        String[] num = "1".split(",");
        assertThat(num).containsExactly("1");
    }

    @Test
    @DisplayName("()제거하기")
    void substring() {
        String num = "(1,2)".substring(1,4);
        assertThat(num).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정위치 문자 가져오기")
    void charAt() {
        char a = "abc".charAt(0);
        assertThat(a).isEqualTo('a');
    }

    @Test
    @DisplayName("특정위치 문자 가져오기 예외 has")
    public void testException() {
        assertThatThrownBy(() -> {
            "abc".charAt(10);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("10");
    }

    @Test
    @DisplayName("특정위치 문자 가져오기 예외 with")
    public void testException2() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt(10);
                }).withMessageContaining("10");
    }
}
