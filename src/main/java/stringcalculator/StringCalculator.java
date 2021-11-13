package stringcalculator;

public class StringCalculator {

  public static final String[] OPERATORS = {"+", "-", "*", "/"};


  public int process(String input) {
    String[] parsed = input.split(" ");
    String operator = "";
    int result = Integer.parseInt(parsed[0]);
    for (String s : parsed) {
      if (isOperator(s)) {
        operator = s;
        continue;
      }
      result = calculate(operator, result, s);
    }
    return result;
  }

  private boolean isOperator(String operator) {
    for (String s : OPERATORS) {
      if (s.equals(operator)) {
        return true;
      }
    }
    return false;
  }

  private int calculate(String operator, int oldValue, String target) {
    int newValue = Integer.parseInt(target);

    if (operator.equals("+")) {
      return oldValue + newValue;
    }
    if (operator.equals("-")) {
      return oldValue - newValue;
    }
    if (operator.equals("*")) {
      return oldValue * newValue;
    }
    if (operator.equals("/")) {
      return oldValue / newValue;
    }
    return oldValue;
  }
}
