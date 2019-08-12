import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class Game
 */
public class Game extends StateBasedGame {
	
	public static final String gamename = "Blob.io";
	public static final int menu = 0;
	public static final int play = 1;
	public static final int end = 2;
	
	public Game(String gamename){
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		this.addState(new End(play));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(end).init(gc, this);
		this.enterState(menu);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(1000, 800, false);
			//DONT DO THIS appgc.setFullscreen(true);
			appgc.start();
			
		}catch(SlickException e){
			e.printStackTrace();
		}

	}

}
