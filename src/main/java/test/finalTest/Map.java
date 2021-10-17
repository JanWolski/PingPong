package test.finalTest;

public class Map {
	
	public int width, height;
	int grid[][];
	public Player players[] ;
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		
		grid = new int[width][height];
		
		players = new Player[2];
		players[0] = new Player(width/4, height/2, width, height);
		players[1] = new Player(width - width/4, height/2, width, height);
		setPos(0,players[0].x,players[0].y);
		setPos(1,players[1].x,players[1].y);
	}
	
	public int move(int id, String dir) {
		grid[players[id].x][players[id].y]=-1;
		players[id].move(dir);
		
		if(grid[players[id].x][players[id].y]<=-1) {
			if(id == 1) {
				System.out.println("Player 1 wins.");
				return 1;
			}
			if(id == 0) {
				System.out.println("Player 2 wins.");
				return 2;
			}
		}
		setPos(id,players[id].x,players[id].y);
		return -1;
	}
	
	public void setPos(int id, int x, int y) {
		grid[x][y]=id+1;
	}
	
	public void draw() {
		
		for(int y = 0;y<height;y++) {
			for(int x = 0;x<width;x++) {
				char pr = ' ';
				if(grid[x][y] == -1) {pr = '#';}
				if(grid[x][y] == 0) {pr = ' ';}
				if(grid[x][y] == 1) {pr = '1';}
				if(grid[x][y] == 2) {pr = '2';}

				System.out.print(pr);
			}
			System.out.println();
		}
	}
}
