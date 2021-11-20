package baseball;

import java.util.Objects;

public class Ball {


  private final int position;
  private final int no;

  public Ball(int position, int no) {
    this.position = position;
    this.no = no;
  }

  public BallStatus play(Ball userBall) {
    if (this.equals(userBall)) {
      return BallStatus.STRIIKE;
    }
    if (matchNo(userBall)) {
      return BallStatus.BALL;
    }
    return BallStatus.NOTHING;
  }

  private boolean matchNo(Ball userBall) {
    return userBall.no == no;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ball ball = (Ball) o;
    return position == ball.position && no == ball.no;
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, no);
  }
}
