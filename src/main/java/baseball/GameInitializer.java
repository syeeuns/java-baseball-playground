package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameInitializer {

  private static final List<String> CANDIDATES = new ArrayList<>(makeCandidates());

  private final String[] answer;

  public GameInitializer() {
    Collections.shuffle(CANDIDATES);
    this.answer = CANDIDATES.get(0).split("");
  }

  public String[] getAnswer() {
    return answer;
  }

  public static boolean checkNumber(String num) {
    return !num.contains("0")
        && num.length() == 3
        && num.charAt(0) != num.charAt(1)
        && num.charAt(1) != num.charAt(2)
        && num.charAt(0) != num.charAt(2);
  }

  private static List<String> makeCandidates() {
    List<Integer> intList = IntStream.range(123, 988)
        .boxed()
        .collect(Collectors.toList());

    return intList.stream()
        .map(num -> Integer.toString(num))
        .filter(GameInitializer::checkNumber)
        .collect(Collectors.toList());
  }

}
