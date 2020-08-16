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
    this.hand = playerHand;
  }

  public int getHand() {
    return this.hand;
  }
}