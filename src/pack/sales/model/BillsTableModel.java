
package pack.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class BillsTableModel extends AbstractTableModel{
        //private ArrayList<BillItem>billItems;
        private ArrayList<Bill>bills;

        private String[] columns = {"Number" , "Date" , "Client" , "Total"};

    public BillsTableModel(ArrayList<Bill> bills) {
        this.bills = bills;
    }        

    @Override
    public int getRowCount() {
        return bills.size();
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
        Bill bill = bills.get(rowIndex);
        
        switch(columnIndex){
        
            case 0:
                return bill.getNumber();
            case 1:
                return bill.getDate();
            case 2:
                return bill.getClient();
            case 3: 
                return bill.getBillTotal();
            default:
                return "Wrong Data!";


        }
        

    }

    
}
