package stringcalculator;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operator {
  PLUS("+", Integer::sum),
  MINUS("-", (a, b) -> a - b),
  MULTIPLY("*", (a, b) -> a * b),
  DIVIDE("/", (a, b) -> {
    if (b == 0) {
      throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
    }
    return a / b;
  });

  private final String sign;
  private final IntBinaryOperator binaryOperator;

  Operator(String sign, IntBinaryOperator binaryOperator) {
    this.sign = sign;
    this.binaryOperator = binaryOperator;
  }

  public int apply(int left, int right) {
    return binaryOperator.applyAsInt(left, right);
  }

  public static Operator of(String input) {
    return Arrays.stream(values())
        .filter(o -> o.sign.equals(input))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
