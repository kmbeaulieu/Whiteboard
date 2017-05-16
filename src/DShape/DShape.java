package DShape;

import java.awt.Graphics;

import DShapeModel.DShapeModel;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

public class DShape {

	DShapeModel model;
	
	public DShape(DShapeModel dsm){
		model = dsm;
                model.addListener(dsm);
	}

        public void setColor(Color c){
            model.setColor(c);
        }
        
	public void draw(Graphics g) {
            g.setColor(model.getColor());
	}
        
        public Rectangle getBounds(){
            return model.getBounds();
        }
        
        public Point getCenterOfBounds(){
            return model.getCenterOfBounds();
        }
}
