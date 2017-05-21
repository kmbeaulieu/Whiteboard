package DShape;

import DShapeModel.DLineModel;
import java.awt.Graphics;
import DShapeModel.DShapeModel;
import DShapeModel.ModelListener;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

//abstract so you cannot instantiate a basic DShape, it must be a subclass.
public abstract class DShape implements ModelListener {

	DShapeModel model;
        Canvas c;
	
	public DShape(DShapeModel dsm){
		model = dsm;
	}

        public void setColor(Color c){
            model.setColor(c);
        }
        
	public abstract void draw(Graphics g);
        
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

        public Canvas getCanvas(){
            return c;
        }
        public void setCanvas(Canvas c){
            this.c=c;
        }
    public void addListener(ModelListener listener) {
        model.addListener(listener);
    }

    public void removeListener(ModelListener listener) {
        model.removeListener(listener);
    }

    @Override
    public void modelChanged(DShapeModel model) {
        //repaint
        c.repaint();
    }
        public DShapeModel getModel(){
            return model;
        }

    public void removeAllListeners() {
        model.removeAllListeners();
    }

 
}
