package Janken02;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    System.out.println("じゃんけんを始めます！");
    do {
      player.setPlayerHand();
      computer.setComputerHand();

      System.out.println("あなた：" + player.stringHand());
      System.out.println("あいて：" + computer.stringHand());
    } while (Game.drow(player.getHand(), computer.getHand()));
    Game.result(player.getHand(), computer.getHand());
  }
}