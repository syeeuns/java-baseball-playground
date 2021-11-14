package views;

import BaseBall.Checker;

public class ResultView {

  public static void printResult(Checker checker, boolean result) {
    System.out.println(checker.getBall() + "볼 " + checker.getStrike() + "스트라이크");
    endGame(result);
  }

  private static void endGame(boolean result) {
    if (result) {
      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
      System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
    }
  }
}
