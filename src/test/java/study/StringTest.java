package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] numbers="1,2".split(",");
        assertThat(numbers).contains("1","2");
    }

    @Test
    void splitOne(){
        String[] numbers="1".split(",");
        assertThat(numbers).containsExactly("1");
    }

    @Test
    void 괄호제거(){
        String string= "(1,2)";
        string= "(1,2)".substring(1,string.length()-1);
        assertThat(string).isEqualTo("1,2");
    }

    @Test
    void 특정문자가져오기(){
        assertThat("abc".charAt(0)).isEqualTo('a');
    }

    @Test
    void 특정문자위치값예외(){
        "abc".charAt(0);
        assertThatThrownBy(() -> {
            "abc".charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }

    @Test
    public void 특정문자위치값예외2() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt(5);
                }).withMessageMatching("String index out of range: 5");
    }
}
