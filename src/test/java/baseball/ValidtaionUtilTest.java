package baseball;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidtaionUtilTest {

  @Test
  void validNo() {
    assertTrue(ValidationUtil.validNo(1));
    assertTrue(ValidationUtil.validNo(9));
    assertFalse(ValidationUtil.validNo(10));
    assertFalse(ValidationUtil.validNo(0));
  }
}
