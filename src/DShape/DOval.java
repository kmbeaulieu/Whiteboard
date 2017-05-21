package DShape;

import DShapeModel.DShapeModel;
import java.awt.Graphics;

public class DOval extends DShape {

    public DOval(DShapeModel dsm) {
        super(dsm);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(model.getColor());
        g.fillOval(model.getX(), model.getY(), model.getW(), model.getH());
    }
}
