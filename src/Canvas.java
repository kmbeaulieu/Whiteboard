
import DShape.*;
import DShapeModel.*;
import javax.swing.JPanel;

import DShapeModel.DShapeModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/*
 * JPanel should be 400x400. It contains the shapes
 * 
 */
public class Canvas extends JPanel {

    public ArrayList<DShape> list = new ArrayList();
    public DShape selectedShape = null;
    /**
     * So it doesnt get mad
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Add a shape to the canvas
     *
     * @param dsm the dshapemodel to add to the canvas
     */
    public void addShape(DShapeModel dsm) {
        // this might return something in the future?
        if (dsm instanceof DRectModel) {
            DRect r = new DRect(dsm);
            list.add(r);
            selectedShape = r;
        } else if (dsm instanceof DOvalModel) {
            DOval o = new DOval(dsm);
            list.add(o);
            selectedShape = o;
        } else if (dsm instanceof DLineModel) {
            DLine l = new DLine(dsm);
            list.add(l);
            selectedShape = l;
        } else if (dsm instanceof DTextModel) {
            DText t = new DText(dsm);
            list.add(t);
            selectedShape = t;
        }

    }

    public DShape getSelectedShape() {
        return selectedShape;
    }

    /**
     * Remove the currently selected shape. If nothing is selected, do nothing.
     */
    public void remove() {
        if (selectedShape != null) {
            list.remove(selectedShape);
            selectedShape = null;
            repaint();
        }
    }

    public void clear() {
        list.clear();
        selectedShape=null;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw all the shapes!
        list.forEach(shape -> {
            if (shape == selectedShape) {
                shape.draw(g);
                Point p = shape.getCenterOfBounds();
                g.setColor(Color.RED);
                g.drawString("x", p.x, p.y);
            } else {
                shape.draw(g);
            }
        });
    }

}
