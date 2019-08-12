import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class Player - Makes the players blob.
 */
public class Player {
	private int x, y, sizeX, sizeY;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		this.sizeX = 50;
		this.sizeY = 50;
	}
	/**
	 * @author Chandler Hiatt
	 * @param g - Graphics
	 * Draw method to use less code.
	 */
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillOval(x, y, sizeX, sizeY);
	}
	/**
	 * @author Chandler Hiatt
	 * @param size
	 * Set the size of the player.
	 */
	public void setSize(int size){
		this.sizeX = size;
		this.sizeY = size;
	}
	/**
	 * @author Chandler Hiatt
	 * 
	 * Get width and height.
	 */
	public int getWidth(){
		return this.sizeX;
	}

	public int getHeight(){
		return this.sizeY;
	}
	/**
	 * @author Chandler Hiatt
	 * Get X and Y.
	 */
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	/**
	 * @author Chandler Hiatt
	 * Set X and Y.
	 */
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}
