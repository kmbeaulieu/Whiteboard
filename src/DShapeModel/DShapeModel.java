package DShapeModel;

import java.awt.Color;


public class DShapeModel {
	private int x;
	private int y;
	private int w;
	private int h;
	private Color color;
	
	/**
	 * Default shape model constructor.
	 */
	DShapeModel(){
		x = 0;
		y = 0;
		w = 0;
		h = 0;
		color = Color.GRAY;
	}
	
	/**
	 * Completely custom shape model constructor.
	 * @param x x position to start drawing
	 * @param y y position to start drawing
	 * @param w width of the shape
	 * @param h height of the shape
	 * @param c color of the shape
	 */
	public DShapeModel(int x, int y, int w, int h, Color c){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color c) {
		this.color = c;
	}
	
	

}
