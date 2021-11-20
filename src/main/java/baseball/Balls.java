package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

  private final List<Ball> answers;

  public Balls(List<Integer> answers) {
    this.answers = mapBalls(answers);
  }

  private List<Ball> mapBalls(List<Integer> answers) {
    List<Ball> answerBalls = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      answerBalls.add(new Ball(i + 1, answers.get(i)));
    }
    return answerBalls;
  }

  public BallStatus play(Ball userBall) {
    return answers.stream()
        .map(answer -> answer.play(userBall))
        .filter(status -> status != BallStatus.NOTHING)
        .findFirst()
        .orElse(BallStatus.NOTHING);
  }
}
