package DShape;

import DShapeModel.DShapeModel;
import java.awt.Graphics;

public class DText extends DShape {

    public DText(DShapeModel dsm) {
        super(dsm);
    }

    @Override
	public void draw(Graphics g){
		super.draw(g);
		//do custom text stuff here
	}
}
