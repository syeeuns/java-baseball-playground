package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  private StringCalculator stringCalculator;

  @BeforeEach
  void setUp() {
    stringCalculator = new StringCalculator();
  }

  @Test
  void calculate() {
    String input =  "2 + 3 * 4 / 2";
    assertThat(stringCalculator.process(input)).isEqualTo(10);
  }
}
