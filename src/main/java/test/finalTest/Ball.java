package test.finalTest;

import java.util.List;

public class Ball {
	
	public int x,y;
	public int velx, vely;
	List<Paddle> paddles;
	public Ball(int width, int height){
		
	}
	public void addPaddle(Paddle paddle) {
		paddles.add(paddle);
	}
	
	public boolean move() {
		boolean hit = false;
		for(Paddle pad : paddles) {
			if(x+velx == pad.x && (y + vely <= pad.y+1 || y + vely >= pad.y-1) )
			if() {
				velx = -1*velx ;
			}
			if(y+vely == pad.y) {
				vely = -1*vely ;
			}
		}
		return false;
	}
}
