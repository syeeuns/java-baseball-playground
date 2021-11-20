package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {

  private Ball answer;

  @BeforeEach
  void setUp() {
    answer = new Ball(1, 1);
  }

  @Test
  void strike() {
    Ball userBall = new Ball(1, 1);
    assertThat(answer.play(userBall)).isEqualTo(BallStatus.STRIIKE);
  }

  @Test
  void ball() {
    Ball userBall = new Ball(2, 1);
    assertThat(answer.play(userBall)).isEqualTo(BallStatus.BALL);
  }

  @Test
  void nothing() {
    Ball userBall = new Ball(1, 4);
    assertThat(answer.play(userBall)).isEqualTo(BallStatus.NOTHING);
  }
}
