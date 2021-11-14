package stringcalculator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class StringCalculator {

  private final Queue<String> values = new LinkedList<>();

  public StringCalculator(String input) {
    if (Objects.isNull(input)) {
      throw new IllegalArgumentException("잘못된 입력입니다.");
    }

    Collections.addAll(values, input.split(" "));
  }


  public int process() {
    int result = Integer.parseInt(Objects.requireNonNull(values.poll()));

    while (!values.isEmpty()) {
      Operator operator = Operator.of(values.poll());
      int number = Integer.parseInt(Objects.requireNonNull(values.poll()));

      result = operator.apply(result, number);
    }

    return result;
  }
}
