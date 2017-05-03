package DShapeModel;

import javafx.scene.paint.Color;

public class DShapeModel {
	int x;
	int y;
	int w;
	int h;
	Color color;
	
	/**
	 * Default shape model constructor.
	 */
	DShapeModel(){
		x = 0;
		y = 0;
		w = 0;
		h = 0;
		color = Color.BLACK;
	}
	
	/**
	 * Completely custom shape model constructor.
	 * @param x x position to start drawing
	 * @param y y position to start drawing
	 * @param w width of the shape
	 * @param h height of the shape
	 * @param c color of the shape
	 */
	DShapeModel(int x, int y, int w, int h, Color c){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = c;
	}

}
