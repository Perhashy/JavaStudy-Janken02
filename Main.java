package Janken02;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();
    int count = 1;

    System.out.println("じゃんけんを始めます！");
    System.out.println("--------------------------------");
    do {
      Play.game(player, computer, count);
      Play.nextGame();
      count++;
    } while(Play.count());
    System.out.println("ゲームを終了します");
    System.out.println("また遊んでね！");
  }
}