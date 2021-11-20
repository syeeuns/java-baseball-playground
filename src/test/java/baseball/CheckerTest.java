package baseball;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckerTest {

  @ParameterizedTest
  @CsvSource(value = {"124:123", "432:321", "543:987"}, delimiter = ':')
  void invalidCheck(String input, String answer) {
    String[] parsedAnswer = answer.split("");
    Checker checker = new Checker(input);
    assertFalse(checker.check(parsedAnswer));
  }

  @ParameterizedTest
  @CsvSource(value = {"123:123", "321:321", "987:987"}, delimiter = ':')
  void validCheck(String input, String answer) {
    String[] parsedAnswer = answer.split("");
    Checker checker = new Checker(input);
    assertTrue(checker.check(parsedAnswer));
  }
}
