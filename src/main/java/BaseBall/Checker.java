package BaseBall;

public class Checker {

  private String[] input;

  private int ball;
  private int strike;


  public int getBall() {
    return ball;
  }

  public int getStrike() {
    return strike;
  }

  public Checker(String input) {
    this.input = input.split("");
  }

  public boolean check(String[] answer) {
    checkStrike(answer);
    checkBall(answer);
    return strike == 3;
  }

  public void checkBall(String[] answer) {
    String answerString = String.join("", answer);
    for (int i = 0; i < 3; i++) {
      checkOneBall(answerString, input[i]);
    }
    ball -= strike;
  }

  public void checkStrike(String[] answer) {
    for (int i = 0; i < 3; i++) {
      checkOneStrike(answer[i], input[i]);
    }
  }

  public void checkOneStrike(String answerElem, String inputElem) {
    if (answerElem.equals(inputElem)) {
      strike++;
    }
  }

  public void checkOneBall(String answer, String inputElem) {
    if (answer.contains(inputElem)) {
      ball++;
    }
  }
}
