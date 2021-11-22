package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameControllerTest {

  private List<Integer> answers;

  @BeforeEach
  void setUp() {
    answers = GameController.makeAnswers();
  }

  @Test
  void makeAnswers() {
    assertThat(answers.size()).isEqualTo(3);
    assertThat(answers.get(0)).isNotEqualTo(answers.get(1));
    assertThat(answers.get(0)).isNotEqualTo(answers.get(2));
    assertThat(answers.get(1)).isNotEqualTo(answers.get(2));
  }

  @Test
  void parseInput() {
    String input = "123";
    List<Integer> parsedInput = GameController.parseInput(input);
    assertThat(parsedInput.size()).isEqualTo(3);
  }
}
