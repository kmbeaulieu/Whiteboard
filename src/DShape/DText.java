package DShape;

import DShapeModel.*;
import java.awt.Graphics;

public class DText extends DShape {

    public DText(DShapeModel dsm) {
        super(dsm);
       
    }

    @Override
	public void draw(Graphics g){
		super.draw(g);
                DTextModel dtm = (DTextModel)model;
                g.setFont(dtm.getFont());
                g.setColor(dtm.getColor());
                g.drawString(dtm.getText(), dtm.getX(), dtm.getY());
	}
        
        public void setText(String text){
            DTextModel dtm = (DTextModel) model;
            dtm.setText(text);
        }

    @Override
    public String toString() {
        DTextModel dtm = (DTextModel) model;
        return "DText{" + dtm.toString() +  '}';
    }
        
}
