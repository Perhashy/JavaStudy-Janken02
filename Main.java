package Janken02;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    player.setPlayerHand();
    computer.setHand(2);

    System.out.println(player.getHand());
    System.out.println(computer.getHand());
  }
}