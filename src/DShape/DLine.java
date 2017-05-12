package DShape;

import DShapeModel.DShapeModel;
import java.awt.Graphics;

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
}
