package test.finaltest;

/**Player class.*/
public class Player {
  int px;
  int py;
  int width;
  int height;

  /**Player constructor.*/
  public Player(int startx, int starty, int width, int height) {
    px = startx;
    py = starty;
    this.width = width;
    this.height = height;
  }
  
  /**Moves player.

   * @throws WrongMove
   *  */
  public void move(String dirStr) throws WrongMove {
    char dirSym = dirStr.charAt(0);
    int dir;
    switch (dirSym) {
      case 'u':
        dir = -1;
        break;
      case 'd':
        dir = 1;
        break;
      case 'l':
        dir = -2;
        break;
      case 'r':
        dir = 2;
        break;
      default:
        System.out.println("Wrong direction");
        throw new WrongMove();
    }

    if (dir % 2 == 0) {
      px += dir / 2;
      if (px > width) {
        px -= width;
      } else if (px < 0) {
        px += width;
      }
    } else {
      py += dir;
      if (py > height) {
        py -= height;
      } else if (py < 0) {
        py += height;
      }
    }
  }
}
