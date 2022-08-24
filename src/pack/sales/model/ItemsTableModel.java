
package pack.sales.model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ItemsTableModel extends AbstractTableModel{
    
    private ArrayList<BillItem>billItems;
    private String[] columns = {"Number" , "Item" , "Price" , "Count" , "Total"};

    public ItemsTableModel(ArrayList<BillItem> billItems) {
        this.billItems = billItems;
    }

    @Override
    public int getRowCount() {
        return billItems.size();
    }

    @Override
    public int getColumnCount() {
         return columns.length;
    }

    @Override
    public String getColumnName(int colIndex) {
        return columns[colIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BillItem bill = billItems.get(rowIndex);
        switch(columnIndex){
            case 0: return bill.getBill().getNumber();
            case 1: return bill.getItem();
            case 2: return bill.getPrice();
            case 3: return bill.getCount();
            case 4: return bill.getItemTotal();
            default: return "Wrong Data!";
        
        }
    }

    public ArrayList<BillItem> getBillItems() {
        return billItems;
    }
    
    
    
}
