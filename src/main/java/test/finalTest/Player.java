package test.finalTest;

public class Player {
	int x;
	int y;
	int width;
	int height;
	public Player(int startx,int starty,int width,int height) {
		x = startx;
		y = starty;
		this.width = width;
		this.height = height;
	}
	
	public boolean move(String dirStr){
		char dirSym = dirStr.charAt(0);
		int dir;
		switch(dirSym) {
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
			return false;
		}
		
		
		if(dir % 2 == 0) {
			x+=dir/2;
			if(x>width) {
				x-=width;
			}else if(x<0) {
				x+=width;
			}
		}else {
			y+=dir;
			if(y>height) {
				x-=height;
			}else if(y<0) {
				y+=height;
			}
		}
		return true;
	}
}
