package baseball.view;

import baseball.PlayResult;

public class ResultView {

  public void showResult(PlayResult result) {
    System.out.println(result.getBall() + "볼 " + result.getStrike() + "스트라이크");
  }

  public void showEndMsg() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }
}
