package Forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPurchaseOrderMaster extends javax.swing.JFrame {

    public frmPurchaseOrderMaster() {
        initComponents();
        
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPurchaseItems = new javax.swing.JPanel();
        scrollPanePurchaseItems = new javax.swing.JScrollPane();
        tablePurchaseItems = new javax.swing.JTable();
        panelPurchaseSearchSection = new javax.swing.JPanel();
        lblPurchaseOrderNO = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();
        txtPurchaseOrderNO = new javax.swing.JTextField();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseOrderDate = new javax.swing.JLabel();
        dccPurchaseOrderDate = new com.toedter.calendar.JDateChooser();
        comboPaymentType = new javax.swing.JComboBox();
        lblPaymentType = new javax.swing.JLabel();
        panelButtonsSearch = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        panelButtonsMain = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PURCHASE ORDER MASTER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        panelPurchaseItems.setBackground(new java.awt.Color(45, 62, 80));
        panelPurchaseItems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePurchaseItems.setBackground(new java.awt.Color(110, 122, 136));
        tablePurchaseItems.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PURCHASE ORDER NO", "PURCHASE ORDER DATE", "EXPECTED DELIVERY DATE", "SUPPLIER NAME", "ITEM CODE", "ITEM NAME", "ITEM DESCRIPTION", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePurchaseItems.setRowHeight(30);
        scrollPanePurchaseItems.setViewportView(tablePurchaseItems);

        panelPurchaseItems.add(scrollPanePurchaseItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1210, 330));

        panelPurchaseSearchSection.setBackground(new java.awt.Color(45, 62, 80));
        panelPurchaseSearchSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurchaseOrderNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderNO.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderNO.setText("PURCHASE ORDER NO");
        panelPurchaseSearchSection.add(lblPurchaseOrderNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        panelPurchaseSearchSection.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, -1, -1));

        txtPurchaseOrderNO.setBackground(new java.awt.Color(110, 122, 136));
        txtPurchaseOrderNO.setForeground(new java.awt.Color(255, 255, 255));
        txtPurchaseOrderNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchaseOrderNOKeyTyped(evt);
            }
        });
        panelPurchaseSearchSection.add(txtPurchaseOrderNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 13, 220, 30));

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));
        panelPurchaseSearchSection.add(comboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 63, 220, 30));

        lblPurchaseOrderDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderDate.setText("PURCHASE ORDER DATE");
        panelPurchaseSearchSection.add(lblPurchaseOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 23, -1, -1));

        dccPurchaseOrderDate.setBackground(new java.awt.Color(255, 255, 150));
        dccPurchaseOrderDate.setForeground(new java.awt.Color(255, 255, 255));
        panelPurchaseSearchSection.add(dccPurchaseOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 13, 253, 30));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -" }));
        comboPaymentType.setToolTipText("");
        panelPurchaseSearchSection.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 63, 253, 30));

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("PAYMENT TYPE");
        panelPurchaseSearchSection.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 73, -1, -1));

        panelButtonsSearch.setBackground(new java.awt.Color(45, 62, 80));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(53, 189, 252));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsSearchLayout = new javax.swing.GroupLayout(panelButtonsSearch);
        panelButtonsSearch.setLayout(panelButtonsSearchLayout);
        panelButtonsSearchLayout.setHorizontalGroup(
            panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsSearchLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelButtonsSearchLayout.setVerticalGroup(
            panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelPurchaseSearchSection.add(panelButtonsSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        panelPurchaseItems.add(panelPurchaseSearchSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        panelButtonsMain.setBackground(new java.awt.Color(45, 62, 80));

        btnEdit.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnAddNew.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("ADD NEW");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(53, 189, 252));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsMainLayout = new javax.swing.GroupLayout(panelButtonsMain);
        panelButtonsMain.setLayout(panelButtonsMainLayout);
        panelButtonsMainLayout.setHorizontalGroup(
            panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsMainLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnAddNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonsMainLayout.setVerticalGroup(
            panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPurchaseItems.add(panelButtonsMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Deleted.", "Product Master", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        new frmPurchaseOrder().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        new frmPurchaseOrder().setVisible(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtPurchaseOrderNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNOKeyTyped
        if (txtPurchaseOrderNO.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseOrderNOKeyTyped

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseOrderMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboPaymentType;
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dccPurchaseOrderDate;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPurchaseOrderDate;
    private javax.swing.JLabel lblPurchaseOrderNO;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtonsMain;
    private javax.swing.JPanel panelButtonsSearch;
    private javax.swing.JPanel panelPurchaseItems;
    private javax.swing.JPanel panelPurchaseSearchSection;
    private javax.swing.JScrollPane scrollPanePurchaseItems;
    private javax.swing.JTable tablePurchaseItems;
    private javax.swing.JTextField txtPurchaseOrderNO;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPurchaseOrderNO.setText(null);
        dccPurchaseOrderDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);
        comboPaymentType.setSelectedIndex(0);
        
        txtPurchaseOrderNO.requestFocus();
    }

    private void formFormat() {
        clearfields();
        
        this.setLocationRelativeTo(null);
    }
}
