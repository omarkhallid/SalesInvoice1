/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.sales.view;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import pack.sales.controller.Controller;
import pack.sales.model.Bill;
import pack.sales.model.BillsTableModel;

/**
 *
 * @author Compu Academy
 */
public class BillFrame extends javax.swing.JFrame {

    /**
     * Creates new form billFrame
     */
    public BillFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        billTable.getSelectionModel().addListSelectionListener(controller);
        createInvoice_Button = new javax.swing.JButton();
        createInvoice_Button.addActionListener(controller);
        deleteInvoice_Button = new javax.swing.JButton();
        deleteInvoice_Button.addActionListener(controller);
        invoiceNumberButton = new javax.swing.JLabel();
        invoiceDateButton = new javax.swing.JLabel();
        customerNameButton = new javax.swing.JLabel();
        invoiceTotalButton = new javax.swing.JLabel();
        invoiceNumber_Label = new javax.swing.JLabel();
        invoiceDate_Label = new javax.swing.JLabel();
        customerName_Label = new javax.swing.JLabel();
        invoiceTotal_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill_ItemsTable = new javax.swing.JTable();
        createItem_Button = new javax.swing.JButton();
        createItem_Button.addActionListener(controller);
        deleteItem_Button = new javax.swing.JButton();
        deleteItem_Button.addActionListener(controller);
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        loadfile_Menuitem = new javax.swing.JMenuItem();
        loadfile_Menuitem.addActionListener(controller);
        savefile_Menuitem = new javax.swing.JMenuItem();
        savefile_Menuitem.addActionListener(controller);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(billTable);

        createInvoice_Button.setText("Create New Invoice");
        createInvoice_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoice_ButtonActionPerformed(evt);
            }
        });

        deleteInvoice_Button.setText("Delete Invoice");
        deleteInvoice_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoice_ButtonActionPerformed(evt);
            }
        });

        invoiceNumberButton.setText("Invoice Number");

        invoiceDateButton.setText("Invoice Date");

        customerNameButton.setText("Customer Name");

        invoiceTotalButton.setText("Invoice Total");

        bill_ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(bill_ItemsTable);

        createItem_Button.setText("Create Item");
        createItem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createItem_ButtonActionPerformed(evt);
            }
        });

        deleteItem_Button.setText("Delete Item");
        deleteItem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItem_ButtonActionPerformed(evt);
            }
        });

        jMenu3.setText("File");

        loadfile_Menuitem.setText("Load File");
        loadfile_Menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfile_MenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(loadfile_Menuitem);

        savefile_Menuitem.setText("Save File");
        savefile_Menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefile_MenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(savefile_Menuitem);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(createInvoice_Button)
                        .addGap(123, 123, 123)
                        .addComponent(deleteInvoice_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invoiceNumber_Label))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(invoiceTotalButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceTotal_Label))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(customerName_Label))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(invoiceNumberButton)
                                        .addGap(0, 164, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(invoiceDateButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceDate_Label)))))
                        .addContainerGap(284, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(createItem_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(deleteItem_Button)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoiceNumber_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invoiceNumberButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceDateButton)
                            .addComponent(invoiceDate_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerName_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceTotalButton)
                            .addComponent(invoiceTotal_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createInvoice_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteInvoice_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createItem_Button)
                        .addComponent(deleteItem_Button)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createInvoice_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoice_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoice_ButtonActionPerformed

    private void deleteInvoice_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoice_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoice_ButtonActionPerformed

    private void loadfile_MenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfile_MenuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadfile_MenuitemActionPerformed

    private void createItem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createItem_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createItem_ButtonActionPerformed

    private void deleteItem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItem_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItem_ButtonActionPerformed

    private void savefile_MenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefile_MenuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savefile_MenuitemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private javax.swing.JTable bill_ItemsTable;
    private javax.swing.JButton createInvoice_Button;
    private javax.swing.JButton createItem_Button;
    private javax.swing.JLabel customerNameButton;
    private javax.swing.JLabel customerName_Label;
    private javax.swing.JButton deleteInvoice_Button;
    private javax.swing.JButton deleteItem_Button;
    private javax.swing.JLabel invoiceDateButton;
    private javax.swing.JLabel invoiceDate_Label;
    private javax.swing.JLabel invoiceNumberButton;
    private javax.swing.JLabel invoiceNumber_Label;
    private javax.swing.JLabel invoiceTotalButton;
    private javax.swing.JLabel invoiceTotal_Label;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadfile_Menuitem;
    private javax.swing.JMenuItem savefile_Menuitem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Bill>bills;
    private Controller controller = new Controller(this);
    private BillsTableModel billsTableModel;
    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public BillsTableModel getBillsTableModel() {
        return billsTableModel;
    }

    public void setBillsTableModel(BillsTableModel billsTableModel) {
        this.billsTableModel = billsTableModel;
    }

    public JTable getBillTable() {
        return billTable;
    }

    public JTable getBill_ItemsTable() {
        return bill_ItemsTable;
    }

    public JLabel getCustomerName_Label() {
        return customerName_Label;
    }

    public JLabel getInvoiceDate_Label() {
        return invoiceDate_Label;
    }

    public JLabel getInvoiceNumber_Label() {
        return invoiceNumber_Label;
    }

    public JLabel getInvoiceTotal_Label() {
        return invoiceTotal_Label;
    }

    public Controller getController() {
        return controller;
    }

    public int getMaxBillNum(){
        int num = 0;
        for(Bill bill : bills){
            if(bill.getNumber()> num)
                num = bill.getNumber();
        }
        return num;
    }
 
    
    
}
