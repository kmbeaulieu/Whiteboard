
import DShape.*;
import DShapeModel.*;
import javax.swing.JPanel;

import DShapeModel.DShapeModel;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * JPanel should be 400x400. It contains the shapes
 * 
 */
public class Canvas extends JPanel {

    public ArrayList<DShape> list = new ArrayList();
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
            list.add(new DRect(dsm));
        } else if (dsm instanceof DOvalModel) {
            list.add(new DOval(dsm));
        } else if(dsm instanceof DLineModel){
            list.add(new DLine(dsm));
        }else if(dsm instanceof DTextModel){
            list.add(new DText(dsm));
        }
       
    
}

    public void clear(){
        list.clear();
        repaint();
    }
    
@Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates
        //draw all the shapes!
        list.forEach(shape -> shape.draw(g));
    }

}
