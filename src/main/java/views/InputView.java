package views;

import BaseBall.GameInitializer;
import java.util.Scanner;

public class InputView {

  private Scanner sc;

  public InputView(Scanner sc) {
    this.sc = sc;
  }

  public String input() {
    System.out.print("숫자를 입력해 주세요 : ");
    String input = sc.next();

    if (!GameInitializer.checkNumber(input)) {
      throw new IllegalArgumentException("잘못된 입력입니다.");
    }
    return input;
  }
}
