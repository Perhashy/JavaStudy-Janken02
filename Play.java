package Janken02;

public class Play {
  public static void game(Hand player, Hand computer) {
    do {
      player.setPlayerHand();
      computer.setComputerHand();

      System.out.println("あなた：" + player.stringHand());
      System.out.println("あいて：" + computer.stringHand());
    } while (Game.drow(player.getHand(), computer.getHand()));
    Game.result(player.getHand(), computer.getHand());
  }
}