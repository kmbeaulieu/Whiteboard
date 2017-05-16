package DShapeModel;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class DShapeModel implements ModelListener {

    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;
    private List<ModelListener> listeners = new ArrayList<>();

    /**
     * Add a listener to the model
     *
     * @param l listener to add
     */
    public void addListener(ModelListener l) {
        listeners.add(l);
    }

    /**
     * Default shape model constructor.
     */
    DShapeModel() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
        color = Color.GRAY;
    }

    /**
     * Completely custom shape model constructor.
     *
     * @param x x position to start drawing
     * @param y y position to start drawing
     * @param w width of the shape
     * @param h height of the shape
     * @param c color of the shape
     */
    public DShapeModel(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = c;
    }

    public int getX() {
        return x;
    }

    /**
     * set the new x and let the listeners know the shape changed
     * @param x new x position
     */
    public void setX(int x) {
        this.x = x;
        listeners.forEach(l -> l.modelChanged(this));
    }

    public int getY() {
        return y;
    }

    /**
     * set the new y position and let the listeners know the shape changed
     * @param y new y position
     */
    public void setY(int y) {
        this.y = y;
        listeners.forEach(l -> l.modelChanged(this));
    }

    public int getW() {
        return w;
    }

    /**
     * set the new width and let the listeners know the shape changed
     * @param w new width
     */
    public void setW(int w) {
        this.w = w;
        listeners.forEach(l -> l.modelChanged(this));
    }

    public int getH() {
        return h;
    }

    /**
     * set the new height and let the listeners know the shape changed
     * @param h new height
     */
    public void setH(int h) {
        this.h = h;
        listeners.forEach(l -> l.modelChanged(this));
    }

    public Color getColor() {
        return color;
    }

    /**
     * set the color for the shape and let the listeners know the shape changed
     * @param c new color 
     */
    public void setColor(Color c) {
        this.color = c;
        listeners.forEach(l -> l.modelChanged(this));
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, w, h);
    }

    public Point getCenterOfBounds() {
        Rectangle bounds = getBounds();
        return new Point((int) bounds.getCenterX(), (int) bounds.getCenterY());
    }

    @Override
    public void modelChanged(DShapeModel model) {
        System.out.println("Model changed");
    }

    @Override
    public void addListener(DShapeModel model) {
        listeners.add(model);
    }

    @Override
    public void removeListener(DShapeModel model) {
        listeners.remove(model);
    }

}
