
public class Paddle {
	int x;
	int y;
	int width;
	int height;
	public Paddle(startx,starty,width,height) {
		x = startx;
		y = starty;
		this.width = width;
		this.height = height;
	}
	
	public void move(int dir) {
		if(dir % 2 == 0) {
			x+=dir/2;
			if(x<0 || x>width) {
				x-=dir/2;
			}
		}else {
			y+=dir;
			if(y<0 || y>height) {
				y-=dir;
			}
		}
	}
}
