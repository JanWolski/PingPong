package test.finalTest;


public class Ping 
{
	
	Paddle leftPaddle;
	Paddle rightPaddle;

	public static void main( String[] args )
    {
		int width = 10;
		int height = 10;
		Paddle leftPaddle = new Paddle(0,height/2,width,height);
		Paddle rightPaddle = new Paddle(width,height/2,width,height);
		Ball ball = new Ball(width, height);
		ball.addPaddle(leftPaddle);
		ball.addPaddle(rightPaddle);
		ball.start();
		loop();
    }
	
	class Drawer{
	    public void draw() {
	    	drawBorder();
	    	
	    	drawBorder();
	    	
	    	
	    	
	    }
	    
	    public void drawBorder() {
	    	for(int i=0;i<width+1;i++) {
	    		System.out.print("#");
	    	}
	    }
		
	}
    

    
    public static void loop() {
    	while(1) {
    		ball.move();
    	}
    }
}
