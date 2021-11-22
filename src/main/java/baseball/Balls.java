package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

  private final List<Ball> answers;

  public Balls(List<Integer> answers) {
    this.answers = mapBalls(answers);
  }

  public List<Ball> getAnswers() {
    return answers;
  }

  private List<Ball> mapBalls(List<Integer> answers) {
    List<Ball> answerBalls = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      answerBalls.add(new Ball(i + 1, answers.get(i)));
    }
    return answerBalls;
  }

  public PlayResult play(List<Integer> userNums) {
    Balls userBalls = new Balls(userNums);
    PlayResult result = new PlayResult();
    for (Ball answer : answers) {
      BallStatus status = userBalls.play(answer);
      result.report(status);
    }
    return result;
  }

  public BallStatus play(Ball userBall) {
    return answers.stream()
        .map(answer -> answer.play(userBall))
        .filter(status -> status != BallStatus.NOTHING)
        .findFirst()
        .orElse(BallStatus.NOTHING);
  }
}
