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
        Point p1 = new Point(model.getX(), model.getY());
        Point p2 = new Point(model.getW(), model.getH());
        Rectangle r = new Rectangle(p1);
        r.add(p2);
        int minWH = 20;
        int x = r.x;
        int y = r.y;
        int w = r.width;
        int h = r.height;
        return new Rectangle(x, y, Math.max(w, minWH), Math.max(h, minWH));      
    }
    @Override
    public Point getCenterOfBounds(){
        return new Point((model.getX() + model.getW()) / 2, (model.getY() + model.getH()) / 2);   
    }
}
