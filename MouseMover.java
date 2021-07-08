import java.awt.Robot;
import java.util.Random;

public class MouseMover {
    public static final int SLEEP_TIME = 180000;  //5000 = Five Sec
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400; 	
	
	public static void main(String args[]) throws Exception {
	     Robot robot = new Robot();
		 Random random = new Random();
		 while(true){
			 robot.mouseMove(random.nextInt(MAX_X),random.nextInt(MAX_Y));
			 Thread.sleep(SLEEP_TIME);
		 }
			 
	}
	
   
}	