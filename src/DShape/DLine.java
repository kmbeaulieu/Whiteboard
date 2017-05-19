package DShape;

import DShapeModel.DShapeModel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class DLine extends DShape {

    public DLine(DShapeModel dsm) {
        super(dsm);
    }
    @Override
    public void draw(Graphics g){
            super.draw(g);
            g.drawLine(model.getX(), model.getY(), model.getW(), model.getH());
            //do custom line stuff here
    }
    @Override
    public Rectangle getBounds(){
        return new Rectangle(model.getX(), model.getY(), model.getW() - model.getX(), model.getH() - model.getY());        
    }
    @Override
    public Point getCenterOfBounds(){
        return new Point((model.getX() + model.getW()) / 2, (model.getY() + model.getH()) / 2);   
    }
}
