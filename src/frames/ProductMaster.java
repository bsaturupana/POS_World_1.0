package frames;

import connection.MySqlConnection;
import forms.MDIMain;
import util.CommonFunctions;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductMaster extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ProductMaster() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
        showSupplier();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductMaster = new javax.swing.JPanel();
        panelSearchFields = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        lblProductBatchNO = new javax.swing.JLabel();
        txtProductBatchNO = new javax.swing.JTextField();
        lblProductStatus = new javax.swing.JLabel();
        comboProductStatus = new javax.swing.JComboBox();
        lblSupplierName = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox();
        panelSearchButtons = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        panelMainTable = new javax.swing.JPanel();
        scrollPaneProductMaster = new javax.swing.JScrollPane();
        tableProductMaster = new javax.swing.JTable();
        panelMainButtons = new javax.swing.JPanel();
        btnAddNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        panelProductMaster.setBackground(new java.awt.Color(45, 62, 80));
        panelProductMaster.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSearchFields.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchFields.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchFields.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("NAME ");
        panelSearchFields.add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtProductName.setBackground(new java.awt.Color(110, 122, 136));
        txtProductName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(255, 255, 255));
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNameFocusLost(evt);
            }
        });
        panelSearchFields.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 600, 30));

        lblProductCode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProductCode.setForeground(new java.awt.Color(255, 255, 255));
        lblProductCode.setText("CODE");
        panelSearchFields.add(lblProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        txtProductCode.setBackground(new java.awt.Color(110, 122, 136));
        txtProductCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtProductCode.setForeground(new java.awt.Color(255, 255, 255));
        txtProductCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductCodeFocusLost(evt);
            }
        });
        panelSearchFields.add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 250, 30));

        lblProductBatchNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProductBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        lblProductBatchNO.setText("BATCH NO ");
        panelSearchFields.add(lblProductBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtProductBatchNO.setBackground(new java.awt.Color(110, 122, 136));
        txtProductBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        txtProductBatchNO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductBatchNOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductBatchNOFocusLost(evt);
            }
        });
        panelSearchFields.add(txtProductBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, 30));

        lblProductStatus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProductStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblProductStatus.setText("STATUS");
        panelSearchFields.add(lblProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        comboProductStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Status -", "ACTIVE", "INACTIVE" }));
        comboProductStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboProductStatusFocusLost(evt);
            }
        });
        panelSearchFields.add(comboProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 250, 30));

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        panelSearchFields.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));
        comboSupplierName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboSupplierNameFocusLost(evt);
            }
        });
        panelSearchFields.add(comboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 250, 30));

        panelProductMaster.add(panelSearchFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 90));

        panelSearchButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setToolTipText("");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelSearchButtons.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        btnSearch.setBackground(new java.awt.Color(53, 189, 252));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.setToolTipText("");
        btnSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSearchFocusLost(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelSearchButtons.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 70));

        panelProductMaster.add(panelSearchButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 310, 90));

        panelMainTable.setBackground(new java.awt.Color(45, 62, 80));
        panelMainTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainTable.setForeground(new java.awt.Color(255, 255, 255));
        panelMainTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableProductMaster.setBackground(new java.awt.Color(110, 122, 136));
        tableProductMaster.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableProductMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "BATCH NO", "NAME", "DISCRIPTION", "SUPPLIER", "STATUS", "RUNNING STOCK", "REORDER LEVEL", "EXPIRY DATE", "PURCHACE PRICE", "SALE PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductMaster.setRowHeight(30);
        tableProductMaster.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableProductMasterFocusLost(evt);
            }
        });
        scrollPaneProductMaster.setViewportView(tableProductMaster);

        panelMainTable.add(scrollPaneProductMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1400, 410));

        panelProductMaster.add(panelMainTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1420, 430));

        panelMainButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelMainButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelMainButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddNew.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("ADD NEW");
        btnAddNew.setToolTipText("");
        btnAddNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddNewFocusLost(evt);
            }
        });
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, 70));

        btnEdit.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.setToolTipText("");
        btnEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnEditFocusLost(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 70));

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setToolTipText("");
        btnDelete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDeleteFocusLost(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, 70));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 70));

        panelProductMaster.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 620, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProductMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelProductMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String msg = "EDIT" + tableProductMaster.getModel().getValueAt(tableProductMaster.getSelectedRow(), 1).toString();

            ProductManager frmSub = new ProductManager(msg);
            frmSub.setVisible(true);
            getParent().add(frmSub);
            frmSub.toFront();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "THERE IS NOW VALID ROW SELECTED TO 'EDIT'");
            tableProductMaster.requestFocus();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Deleted.", "Product Master", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        ProductManager frmSub = new ProductManager();
        frmSub.setVisible(true);
        getParent().add(frmSub);
        frmSub.toFront();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
        clearTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        clearTable();
        showProduct();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusGained
        txtProductName.selectAll();
    }//GEN-LAST:event_txtProductNameFocusGained

    private void txtProductCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductCodeFocusGained
        txtProductCode.selectAll();
    }//GEN-LAST:event_txtProductCodeFocusGained

    private void txtProductBatchNOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductBatchNOFocusGained
        txtProductBatchNO.selectAll();
    }//GEN-LAST:event_txtProductBatchNOFocusGained

    private void txtProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusLost
    }//GEN-LAST:event_txtProductNameFocusLost

    private void txtProductCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductCodeFocusLost
    }//GEN-LAST:event_txtProductCodeFocusLost

    private void txtProductBatchNOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductBatchNOFocusLost
    }//GEN-LAST:event_txtProductBatchNOFocusLost

    private void comboProductStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboProductStatusFocusLost
    }//GEN-LAST:event_comboProductStatusFocusLost

    private void comboSupplierNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboSupplierNameFocusLost
    }//GEN-LAST:event_comboSupplierNameFocusLost

    private void btnSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSearchFocusLost
    }//GEN-LAST:event_btnSearchFocusLost

    private void tableProductMasterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableProductMasterFocusLost
    }//GEN-LAST:event_tableProductMasterFocusLost

    private void btnAddNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddNewFocusLost
    }//GEN-LAST:event_btnAddNewFocusLost

    private void btnEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditFocusLost
    }//GEN-LAST:event_btnEditFocusLost

    private void btnDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteFocusLost
    }//GEN-LAST:event_btnDeleteFocusLost

    private void showSupplier() {
        try {
            String sSql = "SELECT am_acc_name FROM account_master WHERE (am_acc_type = 'Supplier' OR am_acc_type = 'Customer-Supplier')";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            comboSupplierName.removeAllItems();

            comboSupplierName.addItem("- Select Supplier Name -");

            while (rs.next()) {
                comboSupplierName.addItem(rs.getString("am_acc_name"));
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void showProduct() {
        try {
            DefaultTableModel model = (DefaultTableModel) tableProductMaster.getModel();

            int[] rows = tableProductMaster.getSelectedRows();

            for (int i = 0; i < rows.length; i++) {
                model.removeRow(rows[i] - i);
            }

            String sSql = "SELECT * FROM product_master pm "
                    + "JOIN account_master am "
                    + "ON pm.pm_product_supplier_id = am.am_acc_id "
                    + "WHERE (" + (!txtProductName.getText().trim().equals("") ? 1 : 0) + " = 0 OR pm.pm_product_name like '%" + txtProductName.getText() + "%') "
                    + "AND (" + (!txtProductCode.getText().trim().equals("") ? 1 : 0) + " = 0 OR pm.pm_product_code = '" + txtProductCode.getText() + "') "
                    + "AND (" + (!txtProductBatchNO.getText().trim().equals("") ? 1 : 0) + " = 0 OR pm.pm_product_batch_no like '%" + txtProductBatchNO.getText() + "%') "
                    + "AND ('" + (comboProductStatus.getSelectedItem().toString().compareToIgnoreCase("") != 0 ? comboProductStatus.getSelectedItem().toString() : "'- Select Status -'") + "' = '- Select Status -' OR pm.pm_product_status = '" + comboProductStatus.getSelectedItem().toString() + "') "
                    + "AND ('" + (comboSupplierName.getSelectedItem().toString().compareToIgnoreCase("") != 0 ? comboSupplierName.getSelectedItem().toString() : "'- Select Supplier Name -'") + "' = '- Select Supplier Name -' OR am.am_acc_name = '" + comboSupplierName.getSelectedItem().toString() + "')";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            while (rs.next()) {
                updateGrid(
                        rs.getString("pm_product_code"),
                        rs.getString("pm_product_batch_no"),
                        rs.getString("pm_product_name"),
                        rs.getString("pm_product_description"),
                        rs.getString("am_acc_name"),
                        rs.getString("pm_product_status"),
                        rs.getString("pm_product_running_stock"),
                        rs.getString("pm_product_reorder_level"),
                        rs.getString("pm_product_expiry_date"),
                        rs.getString("pm_product_purchace_price"),
                        rs.getString("pm_product_sale_price")
                );
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void updateGrid(String sProductCode, String sProductBatchNo,
            String sProductName, String sProductDescription,
            String sSupplierName, String sProductStatus,
            String sProductRunningStock, String sProductReorderLevel,
            String sProductExpiryDate, String sProductPurchacePrice,
            String sProductSalePrice) {

        DefaultTableModel model = (DefaultTableModel) tableProductMaster.getModel();

        model.addRow(new Object[]{
            sProductCode, sProductBatchNo, sProductName, sProductDescription,
            sSupplierName, sProductStatus, sProductRunningStock,
            sProductReorderLevel, sProductExpiryDate, sProductPurchacePrice,
            sProductSalePrice
        });
    }

    private void formFormat() {
        setScreenSize();
        clearField();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void clearField() {
        txtProductName.setText(null);
        txtProductCode.setText(null);
        txtProductBatchNO.setText(null);
        comboProductStatus.setSelectedIndex(0);
        comboSupplierName.setSelectedIndex(0);

        txtProductName.requestFocus();
    }

    private void clearTable() {
        tableProductMaster.setModel(new DefaultTableModel(null, new String[]{"CODE", "BATCH NO", "NAME", "DESCRIPTION", "SUPPLIER", "STATUS",
            "RUNNING STOCK", "REORDER LEVEL", "EXPIRY DATE", "PURCHACE PRICE",
            "SALE PRICE"}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboProductStatus;
    private javax.swing.JComboBox comboSupplierName;
    private javax.swing.JLabel lblProductBatchNO;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductStatus;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelMainTable;
    private javax.swing.JPanel panelProductMaster;
    private javax.swing.JPanel panelSearchButtons;
    private javax.swing.JPanel panelSearchFields;
    private javax.swing.JScrollPane scrollPaneProductMaster;
    private javax.swing.JTable tableProductMaster;
    private javax.swing.JTextField txtProductBatchNO;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
