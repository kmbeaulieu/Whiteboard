
import DShapeModel.DShapeModel;
import javax.swing.table.AbstractTableModel;

public class ShapeTableModel extends AbstractTableModel {

    private Canvas c;
    private final String[] columnNames = {"X", "Y", "WIDTH", "HEIGHT"};
    private Object[][] data = null;

    public ShapeTableModel() {
        c=null;
    }

    @Override
    public int getRowCount() {
        if (data != null) {
            return data.length;
        } else {
            return 0;
        }
    }
    @Override
    public String getColumnName(int col) {
      return columnNames[col];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DShapeModel model = c.list.get(rowIndex).getModel();
        
        return model;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    
}
