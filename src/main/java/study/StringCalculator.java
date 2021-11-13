package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

  public static final List<String> OPERATORS = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

  private List<String> operators = new ArrayList<>();

  private List<Integer> numbers = new ArrayList<>();

  public StringCalculator() {
  }

  public int process(String input) {
    String[] parsed = input.split(" ");
    for (String s : parsed) {
      separate(s);
    }
    System.out.println("operators = " + operators);
    System.out.println("numbers = " + numbers);

    return calculate(operators, numbers);
  }

  private void separate(String elem) {
    if (OPERATORS.contains(elem)) {
      operators.add(elem);
    } else {
     numbers.add(Integer.parseInt(elem));
    }
  }

  private int calculate(List<String> operators, List<Integer> numbers) {
    int operatiorsIndex = 0;
    int numbersIndex = 1;
    int result = numbers.get(0);

    while (numbersIndex < numbers.size()) {
      if (operators.get(operatiorsIndex).equals("+")) {
        result += numbers.get(numbersIndex);
      }
      if (operators.get(operatiorsIndex).equals("-")) {
        result -= numbers.get(numbersIndex);
      }
      if (operators.get(operatiorsIndex).equals("*")) {
        result *= numbers.get(numbersIndex);
      }
      if (operators.get(operatiorsIndex).equals("/")) {
        result /= numbers.get(numbersIndex);
      }
      operatiorsIndex++;
      numbersIndex++;
    }

    return result;
  }
}
