/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pack.model.Bill;
import pack.model.BillItem;
import pack.model.BillsTableModel;
import pack.model.ItemsTableModel;
import pack.view.BillDialogue;
import pack.view.BillItemDialogue;
import pack.view.BillFrame;

/**
 *
 *
 * /**
 *
 * @author Compu Academy
 */
public class Controller implements ActionListener, ListSelectionListener {

    private BillFrame frame;
    private BillDialogue billDialogue;
    private BillItemDialogue billItemDialogue;

    public Controller(BillFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionComm = e.getActionCommand();

        switch (actionComm) {
            case "Load File":
                loadFile();
                break;
            case "Save File":
                saveFile();
                break;
            case "Create New Invoice":
                crNewInv();
                break;
            case "Delete Invoice":
                delInv();
                break;
            case "Create Item":
                crItem();
                break;
            case "Delete Item":
                delItem();
                break;
            case "confirmBill":
                confirmBill();
                break;

            case "cancelBill":
                cancelBill();
                break;

            case "confirmItem":
                confirmItem();
                break;

            case "cancelItem":
                cancelItem();
                break;

            default:
                return;

        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selIndex = frame.getBillTable().getSelectedRow();
        if (selIndex != -1) {
            System.out.println("You have selected Row : " + selIndex);
            Bill currBill = frame.getBills().get(selIndex);
            frame.getInvoiceNumber_Label().setText("" + currBill.getNumber());
            frame.getInvoiceDate_Label().setText(currBill.getDate());
            frame.getCustomerName_Label().setText(currBill.getClient());
            frame.getInvoiceTotal_Label().setText("" + currBill.getBillTotal());
            ItemsTableModel itemsTableModel = new ItemsTableModel(currBill.getBillItems());
            frame.getBill_ItemsTable().setModel(itemsTableModel);
            itemsTableModel.fireTableDataChanged();
        }
    }

    private void loadFile() {
        JFileChooser fc = new JFileChooser();
        try {
            int res = fc.showOpenDialog(frame);
            if (res == JFileChooser.APPROVE_OPTION) {
                File hF = fc.getSelectedFile();
                Path hP = Paths.get(hF.getAbsolutePath());
                List<String> hlines = Files.readAllLines(hP);
                ArrayList<Bill> billsArray = new ArrayList<>();
                for (String hl : hlines) {
                    String[] hparts = hl.split(",");
                    int invNum = Integer.parseInt(hparts[0]);
                    String invDate = hparts[1];
                    String cName = hparts[2];
                    Bill bill = new Bill(invNum, invDate, cName);
                    billsArray.add(bill);
                }
                System.out.println("Check Point");
                res = fc.showOpenDialog(frame);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File iF = fc.getSelectedFile();
                    Path iP = Paths.get(iF.getAbsolutePath());
                    List<String> iLines = Files.readAllLines(iP);
                    System.out.println("Items have been read");

                    for (String iLine : iLines) {
                        String[] iparts = iLine.split(",");
                        int invNum = Integer.parseInt(iparts[0]);
                        String item = iparts[1];
                        float iprice = Float.parseFloat(iparts[2]);
                        int icount = Integer.parseInt(iparts[3]);
                        Bill bill = null;
                        for (Bill b : billsArray) {
                            if (b.getNumber() == invNum) {
                                bill = b;
                                break;
                            }
                        }

                        BillItem bi = new BillItem(item, iprice, icount, bill);
                        bill.getBillItems().add(bi);

                    }
                    System.out.println("Check Point 2");

                }
                frame.setBills(billsArray);
                BillsTableModel billsTableModel = new BillsTableModel(billsArray);
                frame.setBillsTableModel(billsTableModel);
                frame.getBillTable().setModel(billsTableModel);
                frame.getBillsTableModel().fireTableDataChanged();
            }
        } catch (IOException exc) {
            exc.printStackTrace();

        }

    }

    private void saveFile() {
        ArrayList <Bill> bills = frame.getBills();
        String billss = "";
        String itemss = "";
        for(Bill bill : bills){
            String billCsv = bill.getCsv();
            billss += (billCsv+"\n");
            //billss += "\n";
            for(BillItem item : bill.getBillItems()){
                itemss += (item + "\n");
            
            }
        
        }
        System.out.println("hehehhe");
       try{
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showSaveDialog(frame);
        if(res == JFileChooser.APPROVE_OPTION){
            File billFile = fileChooser.getSelectedFile();
            FileWriter billFW = new FileWriter(billFile);
            billFW.write(billss);
            billFW.flush();
            billFW.close();
            res = fileChooser.showSaveDialog(frame);
            if (res == JFileChooser.APPROVE_OPTION) {
                File itemFile = fileChooser.getSelectedFile();
                FileWriter itemFW = new FileWriter(itemFile);
                itemFW.write(itemss);
                itemFW.flush();
                itemFW.close();

            }
        }
    }catch (Exception ex){}
    }

    private void crNewInv() {
        billDialogue = new BillDialogue(frame);
        billDialogue.setVisible(true);

    }

    private void delInv() {
        int selRow = frame.getBillTable().getSelectedRow();
        if (selRow != -1) {
            frame.getBills().remove(selRow);
            frame.getBillsTableModel().fireTableDataChanged();
        }

    }

    private void crItem() {
        billItemDialogue = new BillItemDialogue(frame);
        billItemDialogue.setVisible(true);

    }

    private void delItem() {
        int selInv = frame.getBillTable().getSelectedRow();
        int selRow = frame.getBill_ItemsTable().getSelectedRow();
        if (selInv != -1 && selRow != -1) {
            Bill bill = frame.getBills().get(selInv);
            bill.getBillItems().remove(selRow);
            ItemsTableModel itemsTableModel = new ItemsTableModel(bill.getBillItems());
            frame.getBill_ItemsTable().setModel(itemsTableModel);
            itemsTableModel.fireTableDataChanged();
            frame.getBillsTableModel().fireTableDataChanged();
        }

    }

    private void confirmBill() {
        String date = billDialogue.getInvDateField().getText();
        String client = billDialogue.getCustNameField().getText();
        int num = frame.getMaxBillNum();

        Bill bill = new Bill(num, date, client);
        frame.getBills().add(bill);
        frame.getBillsTableModel().fireTableDataChanged();
        billDialogue.setVisible(false);
        billDialogue.dispose();
        billDialogue = null;
    }

    private void cancelBill() {
        billDialogue.setVisible(false);
        billDialogue.dispose();
        billDialogue = null;
    }

    private void confirmItem() {
        String item = billItemDialogue.getItemNameField().getText();
        String countStr = billItemDialogue.getItemCountField().getText();
        String priceStr = billItemDialogue.getItemPriceField().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selBill = frame.getBillTable().getSelectedRow();
        if (selBill != -1) {
            Bill bill = frame.getBills().get(selBill);
            BillItem billItem = new BillItem(item, price, count, bill);
            bill.getBillItems().add(billItem);
            ItemsTableModel itemsTableModel = (ItemsTableModel) frame.getBill_ItemsTable().getModel();
            itemsTableModel.fireTableDataChanged();
            frame.getBillsTableModel().fireTableDataChanged();

        }
        billItemDialogue.setVisible(false);
        billItemDialogue.dispose();
        billItemDialogue = null;
    }

    private void cancelItem() {
        billItemDialogue.setVisible(false);
        billItemDialogue.dispose();
        billItemDialogue = null;
    }

}
