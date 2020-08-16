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

  public static void result(int player, int computer) {
    if (
      (player == 1 && computer == 2) ||
      (player == 2 && computer == 3) ||
      (player == 3 && computer == 1)) {
        System.out.println("おめでとう！あなたの勝ちです！");
    } else {
      System.out.println("残念！あなたの負けです");
    }
  }
}