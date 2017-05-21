
import DShapeModel.DShapeModel;
import DShapeModel.ModelListener;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ShapeTableModel extends AbstractTableModel implements ModelListener {

    private Canvas c;
    private final String[] columnNames = {"X", "Y", "WIDTH", "HEIGHT"};
    private ArrayList<DShapeModel> rows = new ArrayList();

    public ShapeTableModel() {
        c = null;
    }

    public ShapeTableModel(Canvas c) {
        this.c = c;
    }

    public void setCanvas(Canvas c) {
        this.c = c;
    }

    @Override
    public int getRowCount() {
        if (!rows.isEmpty()) {
            return rows.size();
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
        switch (getColumnName(columnIndex)) {
            case "X":
                return model.getX();
            case "Y":
                return model.getY();
            case "WIDTH":
                return model.getW();
            case "HEIGHT":
                return model.getH();
            default:
                break;
        }

        return null;
    }

    @Override
    public void modelChanged(DShapeModel model) {
        for (int i = 0; i < c.list.size(); i++) {
            if (model == c.list.get(i).getModel()) {
                fireTableRowsUpdated(i, i);

            }
        }
    }

    public void addRow(DShapeModel m) {
        rows.add(m);
        fireTableRowsInserted(rows.size(), rows.size());
    }

    public void removeRow(DShapeModel m) {
        
        for(DShapeModel dsm: rows){
            if(dsm == m){
                dsm.removeListener(this);
                rows.remove(dsm);
                break;
            }
        }
        fireTableDataChanged();

    }

    public void clearRows() {
        rows.clear();
        fireTableDataChanged();
    }

}
