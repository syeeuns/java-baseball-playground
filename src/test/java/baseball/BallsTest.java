package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallsTest {

  private Balls answers;

  @BeforeEach
  void setUp() {
    answers = new Balls(Arrays.asList(1, 2, 3));
  }

  @Test
  void strike() {
    Ball userBall = new Ball(1, 1);
    assertThat(answers.play(userBall)).isEqualTo(BallStatus.STRIIKE);
  }

  @Test
  void ball() {
    Ball userBall = new Ball(2, 1);
    assertThat(answers.play(userBall)).isEqualTo(BallStatus.BALL);
  }

  @Test
  void nothing() {
    Ball userBall = new Ball(1, 4);
    assertThat(answers.play(userBall)).isEqualTo(BallStatus.NOTHING);
  }
}