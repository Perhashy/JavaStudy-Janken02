package Janken02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Play {
  static int next;
  static int winCount = 0;
  static int loseCount = 0;
  static int drawCount = 0;

  public static void game(Hand player, Hand computer, int count) {
    System.out.println(count + "回目のゲーム！");
    do {
      player.setPlayerHand();
      computer.setComputerHand();

      System.out.println("あなた：" + player.stringHand());
      System.out.println("あいて：" + computer.stringHand());
    } while (Game.draw(player.getHand(), computer.getHand()));
    Game.result(player.getHand(), computer.getHand());
    printCount();
  }

  public static void nextGame() {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("--------------------------------");
      System.out.println("もう一度遊びますか？");
      System.out.print("(1：はい、2：いいえ)：");
      next = sc.nextInt();
      System.out.println("================================");
    } catch (InputMismatchException e) {
      System.out.println("--------------------------------");
      System.out.println("ゲームを終了します");
      System.out.println("また遊んでね！");
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

  public static void printCount() {
    System.out.println("--------------戦績--------------");
    System.out.println("勝ち：" + Play.winCount + "回");
    System.out.println("負け：" + Play.loseCount + "回");
    System.out.println("引き分け：" + Play.drawCount + "回");
  }
}