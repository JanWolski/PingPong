package test.finalTest;

public class Paddle {
	int x;
	int y;
	int width;
	int height;
	public Paddle(int startx,int starty,int width,int height) {
		x = startx;
		y = starty;
		this.width = width;
		this.height = height;
	}
	
	public void move(int dir) throws WrongMove {
		if(dir % 2 == 0) {
			x+=dir/2;
			if(x<0 || x>width) {
				x-=dir/2;
				throw WrongMove;
			}
		}else {
			y+=dir;
			if(y<0 || y>height) {
				y-=dir;
				throw WrongMove;
			}
		}
	}
}
