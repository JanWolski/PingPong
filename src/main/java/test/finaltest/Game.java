package test.finaltest;

import java.util.Scanner;

/** Main static class.*/
public class Game {
  /** Entry point.*/
  public static void main(String[] args) {
    int width = 12;
    int height = 12;

    Map map = new Map(width, height);
    loop(map);
  }
  
  /** Main loop of the game.*/
  public static void loop(Map map) {

    Scanner input = new Scanner(System.in);
    int winner = -1;
    while (winner < 0) {
      for (int i = 0; i < map.players.length; i++) {
        map.draw();
        System.out.println("Player " + (i + 1) + " moves (u,d,l,r):");
        String dir = input.nextLine();
        try {
          winner = map.move(i, dir);
          if (winner >= 0) {
            break;
          }
        } catch (WrongMove wrong) {
          i -= 1;
        }
      }
    }
    input.close();
  }
}
