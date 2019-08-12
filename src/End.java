
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.*;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class End - The final state.
 */
public class End extends BasicGameState {
	
	public End(int state) {
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		Input input = gc.getInput();
		Image es = new Image("endscreen.jpg");
		g.drawOval((gc.getWidth()/2) -50, (gc.getHeight()/2) - 50, 10, 10);
		if(input.isMouseButtonDown(0)){
			gc.exit();
		}		
		g.drawImage(es, 180, 140);
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	public int getID(){
		return 2;
	}
}
