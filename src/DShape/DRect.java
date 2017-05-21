package DShape;

import java.awt.Graphics;

import DShapeModel.DShapeModel;

public class DRect extends DShape {

    public DRect(DShapeModel dsm) {
        super(dsm);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(model.getColor());
        g.fillRect(model.getX(), model.getY(), model.getW(), model.getH());

        //do custom rectangle stuff here
    }
}
