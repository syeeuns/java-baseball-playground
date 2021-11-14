package BaseBall;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class GameInitializerTest {

  @ParameterizedTest
  @ValueSource(strings = {"111", "112", "12", "000", "100", "120", "1234"})
  void checkNumber(String input) {
    assertFalse(GameInitializer.checkNumber(input));
  }
}
