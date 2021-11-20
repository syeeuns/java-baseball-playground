package baseball;

public class PlayResult {

  private int ball = 0;
  private int strike = 0;

  public int getBall() {
    return ball;
  }

  public int getStrike() {
    return strike;
  }

  public void report(BallStatus status) {
    if (status == BallStatus.STRIIKE) {
      strike++;
    }
    if (status == BallStatus.BALL) {
      ball++;
    }
  }

  public boolean isGameEnd() {
    return strike == 3;
  }
}
