package stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

 @Test
  void process() {
   StringCalculator calculator = new StringCalculator("2 + 3 * 4 / 2");
   assertThat(calculator.process()).isEqualTo(10);
 }

 @Test
 void plus() {
  StringCalculator calculator = new StringCalculator("100 + 200");
  assertThat(calculator.process()).isEqualTo(300);
 }

 @Test
 void minus() {
  StringCalculator calculator = new StringCalculator("200 - 100");
  assertThat(calculator.process()).isEqualTo(100);
 }

 @Test
 void multiply() {
  StringCalculator calculator = new StringCalculator("2 * 5");
  assertThat(calculator.process()).isEqualTo(10);
 }

 @Test
 void divide() {
  StringCalculator calculator = new StringCalculator("10 / 2");
  assertThat(calculator.process()).isEqualTo(5);
 }

 @Test
 void zeroDivide() {
  StringCalculator calculator = new StringCalculator("10 / 0");
  assertThatThrownBy(calculator::process)
      .isInstanceOf(IllegalArgumentException.class);
 }
}
