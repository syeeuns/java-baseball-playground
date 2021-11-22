package baseball;

public class Ball {


  private final int position;
  private final BallNumber no;

  public Ball(int position, int no) {
    this.position = position;
    this.no = new BallNumber(no);
  }

  public BallStatus play(Ball userBall) {
    if (checkStrike(userBall)) {
      return BallStatus.STRIIKE;
    }
    if (checkBall(userBall)) {
      return BallStatus.BALL;
    }
    return BallStatus.NOTHING;
  }

  private boolean checkBall(Ball userBall) {
    return no.equals(userBall.no);
  }

  private boolean checkStrike(Ball userBall) {
    return userBall.position == position && checkBall(userBall);
  }
}
