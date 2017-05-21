package DShapeModel;

import java.awt.Color;
import java.awt.Font;

public class DTextModel extends DShapeModel {

    private String text;
    private Font font;

    public DTextModel() {
        super();
    }

    public DTextModel(int x, int y, int w, int h, Color c, String text, String fontName) {
        super(x, y, w, h, c);
        this.text = text;
        //WHAT I WANTED TO DO
        // Font f = Font.getFont(fontName, Font.getFont(Font.DIALOG));
        //THEN JUST STORE f AS THE ATTRIBUTE but nooooo, the above code returns null.

//        default is dialog so this isnt needed //try the font for the given name, else use the dialog font as default
//        Font f = Font.decode(fontName);
//        if (f == null) {
//            f = Font.decode("Dialog");
//        }
        //default font
        this.font = Font.decode("Dialog");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Font getFont() {
        return font;
    }
    public void setFont(Font f) {
        //this doesnt work, change to this if it can get working so that the whiteboard/canvas doesnt have to handle if it is a font or not
//        Font f = Font.getFont(fontName, Font.getFont(Font.DIALOG));
        this.font = f;
    }
    

    @Override
    public String toString() {
        return "DTextModel{" + "x= " + getX() + ", y= " + getY() + ", w= " + getW() + ", h= " + getH() + ", color = " + getColor() + ", text=" + text + ", font=" + font + '}';
    }

}
