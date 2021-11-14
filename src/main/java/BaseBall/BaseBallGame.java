package BaseBall;

import java.util.Scanner;
import views.InputView;
import views.ResultView;

public class BaseBallGame {

  public static void main(String[] args) {
    String reGame = "";
    Scanner sc = new Scanner(System.in);
    while (!reGame.equals("2")) {
      BaseBallGame.play();
      reGame = sc.next();
    }
  }

  public static void play() {
    GameInitializer gameInitializer = new GameInitializer();
    Scanner sc = new Scanner(System.in);
    InputView inputView = new InputView(sc);
    boolean isAnswer = false;

    while (!isAnswer) {
      String input = inputView.input();
      Checker checker = new Checker(input);
      isAnswer = checker.check(gameInitializer.getAnswer());
      ResultView.printResult(checker, isAnswer);
    }
  }
}
