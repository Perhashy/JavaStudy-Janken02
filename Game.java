package Janken02;

public class Game {
  public static boolean drow(int player, int computer) {
    if (player == computer) {
      System.out.println("あいこです");
      return true;
    } else {
      return false;
    }
  }
}