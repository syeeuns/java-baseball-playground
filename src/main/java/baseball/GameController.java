package baseball;

import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameController {

  public static void main(String[] args) {
    PlayResult result = new PlayResult();
    InputView inputView = new InputView(new Scanner(System.in));
    ResultView resultView = new ResultView();
    Balls answers = new Balls(makeAnswers());

    while (!result.isGameEnd()) {
      result = answers.play(parseInput(inputView.showInputMsg()));
      resultView.showResult(result);
    }

    resultView.showEndMsg();
  }

  public static List<Integer> makeAnswers() {
    List<Integer> answers = IntStream.range(1, 10)
        .boxed()
        .collect(Collectors.toList());
    Collections.shuffle(answers);
    return answers.subList(0, 3);
  }

  public static List<Integer> parseInput(String input) {
    if (input.length() != 3) {
      throw new IllegalArgumentException("올바르지 않은 입력입니다.");
    }

    return Arrays.stream(input.split(""))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
  }
}
