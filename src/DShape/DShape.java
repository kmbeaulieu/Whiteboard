package DShape;

import DShapeModel.DLineModel;
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
        public Knob getKnobs(){
            int x = model.getX();
            int y = model.getY();
            int w = model.getW();
            int h = model.getH();
            if(model instanceof DLineModel){
                return new Knob(new Point(x,y),new Point(w,h));
            }else{
                return new Knob(new Point(x,y),new Point(x+w,y), new Point(x,y+h), new Point(x+w,y+h));
            }
        }
        public void setW(int w){
            model.setW(w);
        }
        public void setH(int h){
            model.setH(h);
        }
        public void setX(int x){
            model.setX(x);
        }
        public void setY(int y){
            model.setY(y);
        }
        public int getW(){
           return model.getW();
        }
        public int getH(){
           return model.getH();
        }
        public int getX(){
           return model.getX();
        }
        public int getY(){
           return model.getY();
        }
        public DShapeModel getModel(){
            return model;
        }
}
