package baseball.view;

import java.util.Scanner;

public class InputView {

  private final Scanner sc;

  public InputView(Scanner sc) {
    this.sc = sc;
  }

  public String showInputMsg() {
    System.out.println("숫자를 입력해 주세요 : ");
    return sc.next();
  }
}
