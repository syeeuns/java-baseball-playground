package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTwo() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).contains("2");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    void splitOne() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        String substringResult = "(1,2)".substring(1, 4);
        String[] actual = substringResult.split(",");
        assertThat(actual).containsExactly("1", "2");
    }

    @DisplayName("charAt StringIndexOutOfBoundsException 테스트")
    @Test
    void charAt() {
        char one = "123".charAt(0);
        char two = "123".charAt(1);
        char three = "123".charAt(2);

        assertThat(one).isEqualTo('1');
        assertThat(two).isEqualTo('2');
        assertThat(three).isEqualTo('3');
        assertThatThrownBy(() -> "123".charAt(4))
            .isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
