package study;

import java.util.Scanner;

public class StringCalculatorApplication {

  public static void main(String[] args) {
    StringCalculator stringCalculator = new StringCalculator();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    int result = stringCalculator.process(input);
    System.out.println("result = " + result);
  }
}
