import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class Play - The second state, where all the magic happens. The main state.
 */
public class Play extends BasicGameState {
	private ArrayList<Blob> bits;
	private int randomX, randomY, size, playerX, playerY, count, score;
	private Random randX, randY;
	private Player player;

	public Play(int state) {
		
	}
	/**
	 * @author Chandler Hiatt
	 * @param gc, sbg - Game Container, State based Game
	 * Initialize the variables for the Play class.
	 */
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		size = 50;
		playerX = 500 - (size/2);
		playerY = 400 - (size/2);
		
		count = 1500;
		score = 0;
		
		player = new Player(playerX, playerY);
		bits = new ArrayList<Blob>(1000);
		randX = new Random();
		randY = new Random();
		
		for(int i = 0; i < 1000; i++){
			randomX = randX.nextInt(10000);
			randomY = randY.nextInt(10000);
			Blob temp = new Blob(randomX, randomY, 10);
			bits.add(i,temp);
		}
		System.out.println(bits.size());
		
	}
	/**
	 * @author Chandler Hiatt
	 * @param gc, sbg, g
	 * Render Method for the Play state.
	 */
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		for(int i = 0; i < bits.size(); i++){
		    
			bits.get(i).draw(g);
			
			Circle bitCir = new Circle(bits.get(i).getX(), bits.get(i).getY(), 5);
			Circle playerCir = new Circle(gc.getWidth()/2, gc.getHeight()/2, player.getHeight()/2);
			
			if(bitCir.intersects(playerCir)){
				bits.remove(i);
				score++;
				count+=100;
			}
		}

		player.draw(g);
		g.setColor(Color.white);
		
		if(count > 0){
			count-=3;
		}
		else {
			count = 0;
			sbg.enterState(2);
		}
		g.drawString("Time: " + count, 600, 10);
		g.drawString("Score: " + score , 300, 10);
	}
	/**
	 * @author Chandler Hiatt
	 * @param gc, sbg, delta - Game Container, State based Game
	 * Take user input to move the player.
	 */
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
	      //control octogon
	      //up
	      if(input.isKeyDown(Input.KEY_UP)){

	         for(int i = 0; i < bits.size(); i++){
	 			bits.get(i).setY(bits.get(i).getY() + 5);
	 		 }
	         randomY+=5;
	      }
	      //down
	      if(input.isKeyDown(Input.KEY_DOWN)){
	         for(int i = 0; i < bits.size(); i++){
	 		 bits.get(i).setY(bits.get(i).getY() - 5);
	         }
	         randomY-=5;
	      }
	      //left
	      if(input.isKeyDown(Input.KEY_LEFT)){
	         for(int i = 0; i < bits.size(); i++){
		 			bits.get(i).setX(bits.get(i).getX() + 5); 

		 		 }
	         randomX+=5;
	      }
	      //right
	      if(input.isKeyDown(Input.KEY_RIGHT)){
	         for(int i = 0; i < bits.size(); i++){
		 			bits.get(i).setX(bits.get(i).getX() - 5); 
		 		 }
	         randomX -= 5 ;
	      }
	      
	}
	public int getID(){
		return 1;
	}
}