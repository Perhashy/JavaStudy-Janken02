package Janken02;

import java.util.Scanner;

public class Hand {
  private int hand;

  public void setHand(int hand) {
    this.hand = hand;
  }
  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);
    int playerHand = sc.nextInt();
    if (playerHand > 0 && playerHand <= 3) {
      this.hand = playerHand;
    } else {
      System.exit(0);
    }
  }

  public int getHand() {
    return this.hand;
  }
}