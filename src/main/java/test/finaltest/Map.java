package test.finaltest;

/**Manages game board.*/
public class Map {

  public int width; 
  public int height;
  int[][] grid;
  public Player[] players;

  /**Constructor of map.*/
  public Map(int width, int height) {
    this.width = width;
    this.height = height;

    grid = new int[width][height];

    players = new Player[2];
    players[0] = new Player(width / 4, height / 2, width, height);
    players[1] = new Player(width - width / 4, height / 2, width, height);
    setElement(1, players[0]);
    setElement(2, players[1]);
  }
  
  /**Evaluates move.

   * @throws WrongMove 
   * */
  public int move(int id, String dir) throws WrongMove {
    try {
      setElement(-1, players[id]);
      players[id].move(dir);
    } catch (WrongMove wrong) {
      setElement(id + 1, players[id]);
      throw wrong;
    }

    if (grid[players[id].px][players[id].py] <= -1) {
      if (id == 1) {
        System.out.println("Player 1 wins.");
        return 1;
      }
      if (id == 0) {
        System.out.println("Player 2 wins.");
        return 2;
      }
    }
    setElement(id + 1, players[id]);
    return -1;
  }

  public void setElement(int what, Player pl) {
    grid[pl.px][pl.py] = what;
  }

  /**Prints out game board.*/
  public void draw() {

    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        char pr = ' ';
        if (grid[x][y] == -1) {
          pr = '#';
        }
        if (grid[x][y] == 0) {
          pr = ' ';
        }
        if (grid[x][y] == 1) {
          pr = '1';
        }
        if (grid[x][y] == 2) {
          pr = '2';
        }

        System.out.print(pr);
      }
      System.out.println();
    }
  }
}
