package test.finalTest;

import java.util.Scanner;

public class Game 
{
	public static void main( String[] args )
    {
		int width = 12;
		int height = 12;
		
		Map map = new Map(width, height);
		loop(map);
    }

    public static void loop(Map map) {
    	
    	Scanner input = new Scanner(System.in);
    	int winner = -1;
    	while(winner<0) {
    		for(int i = 0; i<map.players.length;i++) {
    			map.draw();
    			System.out.println("Player " + (i+1) + " moves (u,d,l,r):");
    			String dir = input.nextLine();
    			winner = map.move(i,dir);
    			if(winner>=0) {
    				break;
    			}
    		}
    	}
    	input.close();
    }
}
