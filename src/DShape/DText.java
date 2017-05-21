package DShape;

import DShapeModel.*;
import java.awt.Font;
import java.awt.Graphics;

public class DText extends DShape {

    public DText(DShapeModel dsm) {
        super(dsm);

    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        DTextModel dtm = (DTextModel) model;
        g.setFont(dtm.getFont());
        g.setColor(dtm.getColor());
        g.drawString(dtm.getText(), dtm.getX(), dtm.getY());
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
    
    public String getFontName(){
        DTextModel dtm = (DTextModel) model;
        return dtm.getFont().getName();
    }

    @Override
    public String toString() {
        DTextModel dtm = (DTextModel) model;
        return "DText{" + dtm.toString() + '}';
    }

}
