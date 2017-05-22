
import DShape.*;
import DShapeModel.*;
import javax.swing.JPanel;

import DShapeModel.DShapeModel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;

/*
 * JPanel should be 400x400. It contains the shapes
 * 
 */
public class Canvas extends JPanel {

    //first in line is the furthest in back. Uses painter's alogrithm - draw further back first (index 0)
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
     * @param stm to update the table in the whiteboard
     */
    public void addShape(DShapeModel dsm, ShapeTableModel stm) {
        // this might return something in the future?
        DShape toAdd = null;
        if (dsm instanceof DRectModel) {
            toAdd = new DRect();

        } else if (dsm instanceof DOvalModel) {
            toAdd = new DOval(dsm);

        } else if (dsm instanceof DLineModel) {
            toAdd = new DLine(dsm);

        } else if (dsm instanceof DTextModel) {
            toAdd = new DText(dsm);

        } else {
            return;
        }
        toAdd.setModel(dsm);
        selectedShape = toAdd;
        list.add(toAdd);
        stm.addRow(toAdd.getModel());
        toAdd.addListener(stm);
    }

    public DShape getSelectedShape() {
        return selectedShape;
    }

    /**
     * Remove the currently selected shape. If nothing is selected, do nothing.
     *
     * @param stm table model to update its listener
     */
    public void remove(ShapeTableModel stm) {
        if (selectedShape != null) {
            stm.removeRow(selectedShape.getModel());
            list.remove(selectedShape);
            selectedShape = null;
            repaint();
        }
    }

    public void clear(ShapeTableModel stm) {
        list.clear();
        selectedShape = null;
        repaint();
        stm.clearRows();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw all the shapes!
        list.forEach(shape -> {
            if (shape == selectedShape) {
                shape.draw(g);
                Point p = shape.getCenterOfBounds();
                shape.getKnobs().paintComponent(g);
            } else {
                shape.draw(g);
            }
        });
    }

    void loadFromFile(File f, ShapeTableModel stm) throws FileNotFoundException {
        XMLDecoder in;
        in = new XMLDecoder(new BufferedInputStream(new FileInputStream(f)));
        DShapeModel[] models = (DShapeModel[]) in.readObject();
        clear(stm);
        for (DShapeModel m : models) {
            addShape(m, stm);
        }
        repaint();
        selectedShape = null;
        in.close();

    }

    void saveCurrentCanvas(File f) throws FileNotFoundException {
        selectedShape = null;
        //no knobs please
        XMLEncoder out;
        out = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(f)));
        DShapeModel[] models = new DShapeModel[list.size()];
        for (int i = 0; i < models.length; i++) {
            models[i] = list.get(i).getModel();
        }
        out.writeObject(models);
        //clear and close up the mess
        out.flush();
        out.close();
    }

    void saveCurrentCanvasToImage(File f) throws IOException {
        selectedShape = null;
        repaint();
        //dont save any knobs
        //saving as what is currently the size of the canvas, if you want it bigger, resize the window before saving
        BufferedImage img = new BufferedImage(this.getBounds().width, this.getBounds().height, BufferedImage.TYPE_INT_ARGB);
        //needed so it is not just a black save file
        paint(img.getGraphics());
        ImageIO.write(img, "PNG", f);
    }

    public void clearSelectedShape() {
        selectedShape = null;
    }

    void moveFront() {
        if (selectedShape != null) {
            int shapeCount = list.size();
            for (int i = 0; i < shapeCount; i++) {
                if (selectedShape == list.get(i)) {
                    if (i + 1 > shapeCount - 1) {
                        return;
                    } else {
                        Collections.swap(list, i, i + 1);
                        repaint();
                        return;
                    }
                }
            }
        }
    }

    void moveBack() {
        if (selectedShape != null) {
            int shapeCount = list.size();
            for (int i = 0; i < shapeCount; i++) {
                if (selectedShape == list.get(i)) {
                    if (i == 0) {
                        return;
                    } else {
                        Collections.swap(list, i, i - 1);
                        repaint();
                    }
                }
            }
        }
    }

    void updateShape(DShapeModel model, ShapeTableModel shapeTableModel) {
        //TODO add this from the button presses in whiteboard
    }

}
