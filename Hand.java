package Janken02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hand {
  private int hand;

  public void setHand(int hand) {
    this.hand = hand;
  }
  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);
    try {
      int playerHand = sc.nextInt();
      if (playerHand > 0 && playerHand <= 3) {
        this.hand = playerHand;
      } else {
        System.exit(0);
      }
    } catch (InputMismatchException e) {
      System.out.println("数値以外が入力されました");
      System.exit(0);
    }
  }

  public int getHand() {
    return this.hand;
  }
}