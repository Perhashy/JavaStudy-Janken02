package Janken02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Play {
  static int next;
  public static void game(Hand player, Hand computer, int count) {
    System.out.println(count + "回目のゲーム！");
    do {
      player.setPlayerHand();
      computer.setComputerHand();

      System.out.println("あなた：" + player.stringHand());
      System.out.println("あいて：" + computer.stringHand());
    } while (Game.drow(player.getHand(), computer.getHand()));
    Game.result(player.getHand(), computer.getHand());
  }

  public static void nextGame() {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("もう一度遊びますか？");
      System.out.print("(1：はい、2：いいえ)：");
      next = sc.nextInt();
      System.out.println("=================================");
      if (next != 1) {
        System.out.println("ゲームを終了します");
        System.exit(0);
      }
    } catch (InputMismatchException e) {
      System.out.println("---------------------------------");
      System.out.println("ゲームを終了します");
      System.exit(0);
    }
  }

  public static boolean count() {
    if (next == 1) {
      return true;
    } else {
      return false;
    }
  }
}