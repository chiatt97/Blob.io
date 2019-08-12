
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.*;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class Menu - First state, essentially a start screen.
 */
public class Menu extends BasicGameState {
	
	public Menu(int state) {
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	/**
	 * @author Chandler Hiatt
	 * @param gc, sbg, g - The game Container, The state based game, and the graphics.
	 * Render method for Menu state.
	 */
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		Input input = gc.getInput();
		Image bg = new Image("startscreen.jpg");
		
		g.drawOval((gc.getWidth()/2) -50, (gc.getHeight()/2) - 50, 100, 100);
		
		if(input.isMouseButtonDown(0)){
			sbg.enterState(1);
		}
		g.drawImage(bg, 180, 140);
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	public int getID(){
		return 0;
	}
}
