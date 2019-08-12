import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
/**@author Chandler Hiatt
 * @version last updated 11-27-16
 * @class Blob - Used to make the blobs that are eaten by the player.
 */
public class Blob {
	int x, y, size;
	Color randomColor;
	Random rand;
	/**
	 * @author Chandler Hiatt
	 * @param x, y, size - Coordinates and the desired size.
	 * Constructor for the blob class.
	 */
	public Blob(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		rand = new Random();
		float ar = rand.nextFloat();
	    float ge = rand.nextFloat();
	    float be = rand.nextFloat();
	    randomColor = new Color(ar, ge, be);
	    
	}
	/**
	 * @author Chandler Hiatt
	 * @param g - Graphics
	 * Draw method to use less code.
	 */
	public void draw(Graphics g){
		g.setColor(randomColor);
		g.fillOval(x, y, 10, 10);
	}
	/**
	 * @author Chandler Hiatt
	 * Getters and setters for the x coords.
	 */
	public int getX(){
		return this.x;
	}
	public void setX(int x){
		this.x = x;
	}
	/**
	 * @author Chandler Hiatt
	 * Getters and setters for the y coords.
	 */
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y = y;
	}
	/**
	 * @author Chandler Hiatt
	 * Gets the size of the Blob.
	 */
	public int getSize(){
		return this.size;
	}
}
