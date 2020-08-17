package Janken02;

// import java.util.Scanner;
// import java.util.InputMismatchException;

public class Play {
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
}