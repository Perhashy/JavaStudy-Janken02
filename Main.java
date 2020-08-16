package Janken02;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    player.setPlayerHand();
    computer.setComputerHand();

    System.out.println(player.stringHand());
    System.out.println(computer.stringHand());
  }
}