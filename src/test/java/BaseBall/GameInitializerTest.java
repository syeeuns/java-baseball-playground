package BaseBall;

import org.junit.jupiter.api.Test;

class GameInitializerTest {
  @Test
  void makeCandidates() {
    GameInitializer gameInitializer = new GameInitializer();
    System.out.println("gameInitializer.getAnswer() = " + gameInitializer.getAnswer()[0]);
    System.out.println("gameInitializer.getAnswer() = " + gameInitializer.getAnswer()[1]);
    System.out.println("gameInitializer.getAnswer() = " + gameInitializer.getAnswer()[2]);
  }
}
