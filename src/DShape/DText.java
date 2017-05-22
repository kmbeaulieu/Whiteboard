package DShape;

import DShapeModel.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

public class DText extends DShape {

    public DText(DShapeModel dsm) {
        super(dsm);

    }
     public DText(){
         super();
     }
    @Override
    public void draw(Graphics g) {
    	 g.setColor(model.getColor());
         DTextModel dtm = (DTextModel) model;
         Rectangle bounds = dtm.getBounds();
         Font font = dtm.getFont();
         font.deriveFont(1.0f);
         float size = 1;
         boolean isSmallerThanBounds = true;
         while (isSmallerThanBounds) {
             size = (size * 1.1f) + 1;
             Font increasingFont = font.deriveFont(size);
             FontMetrics fm = g.getFontMetrics(font);
             Rectangle fontBounds = fm.getStringBounds(dtm.getText(), g).getBounds();
             if ((fontBounds.getHeight() > bounds.getHeight()) || (fontBounds.getWidth()) > bounds.getWidth()) {
                 isSmallerThanBounds = false;
             }
             font = increasingFont;
         }
         g.setFont(font);

         Point pointAtBottom = new Point();
         pointAtBottom.y = pointAtBottom.y + getH();
         Point pos = new Point(pointAtBottom.x + dtm.getX(), pointAtBottom.y + dtm.getY());

         Shape clip = g.getClip();
         g.setClip(bounds);

         g.setColor(dtm.getColor());
         g.drawString(dtm.getText(), pos.x, pos.y);

         g.setClip(clip);
    }

    public void setText(String text) {
        DTextModel dtm = (DTextModel) model;
        dtm.setText(text);
    }

    public void setFont(Font f) {
        DTextModel dtm = (DTextModel) model;
        dtm.setFont(f);
    }

    public String getText() {
        DTextModel dtm = (DTextModel) model;
        return dtm.getText();
    }

    public Font getFont() {
        DTextModel dtm = (DTextModel) model;
        return dtm.getFont();
    }

    public String getFontName() {
        DTextModel dtm = (DTextModel) model;
        return dtm.getFont().getName();
    }

    @Override
    public String toString() {
        DTextModel dtm = (DTextModel) model;
        return "DText{" + dtm.toString() + '}';
    }

}
