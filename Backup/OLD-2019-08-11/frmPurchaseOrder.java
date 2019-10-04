package Forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPurchaseOrder extends javax.swing.JFrame {

    public frmPurchaseOrder() {
        initComponents();
        
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        panelPurchaseOrderItemHeader = new javax.swing.JPanel();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        txtPurchaseOrderNumber = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseOrderDate = new javax.swing.JLabel();
        dccPurchaseOrderDate = new com.toedter.calendar.JDateChooser();
        dccPurchaseOrderExpectedDeliveryDate = new com.toedter.calendar.JDateChooser();
        lblPurchaseOrderExpectedDiliveryDate = new javax.swing.JLabel();
        panelPurchaseOrderItemDetail = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchaseOrder = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PURCHASE ORDER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(45, 62, 80));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1015, -1));

        panelPurchaseOrderItemHeader.setBackground(new java.awt.Color(45, 62, 80));
        panelPurchaseOrderItemHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderNumber.setText("PURCHASE ORDER NUMBER");
        panelPurchaseOrderItemHeader.add(lblPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        txtPurchaseOrderNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPurchaseOrderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchaseOrderNumberActionPerformed(evt);
            }
        });
        txtPurchaseOrderNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchaseOrderNumberKeyTyped(evt);
            }
        });
        panelPurchaseOrderItemHeader.add(txtPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 13, 287, 30));

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        panelPurchaseOrderItemHeader.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, -1, -1));

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));
        panelPurchaseOrderItemHeader.add(comboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 63, 287, 30));

        lblPurchaseOrderDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderDate.setText("PURCHASE ORDER DATE");
        panelPurchaseOrderItemHeader.add(lblPurchaseOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));
        panelPurchaseOrderItemHeader.add(dccPurchaseOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 250, 30));
        panelPurchaseOrderItemHeader.add(dccPurchaseOrderExpectedDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 250, 30));

        lblPurchaseOrderExpectedDiliveryDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderExpectedDiliveryDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderExpectedDiliveryDate.setText("EXPECTED DELIVERY DATE");
        panelPurchaseOrderItemHeader.add(lblPurchaseOrderExpectedDiliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        tablePurchaseOrder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ITEM CODE", "ITEM NAME", "ITEM DISCRIPTION", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePurchaseOrder.setRowHeight(30);
        jScrollPane1.setViewportView(tablePurchaseOrder);

        javax.swing.GroupLayout panelPurchaseOrderItemDetailLayout = new javax.swing.GroupLayout(panelPurchaseOrderItemDetail);
        panelPurchaseOrderItemDetail.setLayout(panelPurchaseOrderItemDetailLayout);
        panelPurchaseOrderItemDetailLayout.setHorizontalGroup(
            panelPurchaseOrderItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPurchaseOrderItemDetailLayout.setVerticalGroup(
            panelPurchaseOrderItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPurchaseOrderItemHeader.add(panelPurchaseOrderItemDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1010, 310));

        panelButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelButtons.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 140, 60));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelButtons.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -10, 140, 60));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -10, 148, 60));

        btnPrint.setBackground(new java.awt.Color(53, 189, 252));
        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelButtons.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 140, 60));

        panelPurchaseOrderItemHeader.add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 460, 610, 80));

        getContentPane().add(panelPurchaseOrderItemHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPurchaseOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchaseOrderNumberActionPerformed

    private void txtPurchaseOrderNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberKeyTyped
        if (txtPurchaseOrderNumber.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseOrderNumberKeyTyped

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(this, "Print Successfully.", "Purchase Order", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Purchase Order", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dccPurchaseOrderDate;
    private com.toedter.calendar.JDateChooser dccPurchaseOrderExpectedDeliveryDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPurchaseOrderDate;
    private javax.swing.JLabel lblPurchaseOrderExpectedDiliveryDate;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelPurchaseOrderItemDetail;
    private javax.swing.JPanel panelPurchaseOrderItemHeader;
    private javax.swing.JTable tablePurchaseOrder;
    private javax.swing.JTextField txtPurchaseOrderNumber;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtPurchaseOrderNumber.setText(null);
        dccPurchaseOrderDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);
        dccPurchaseOrderExpectedDeliveryDate.setDate(null);
        
        txtPurchaseOrderNumber.requestFocus();
    }

    private void formFormat() {
        clearFields();
        
        this.setLocationRelativeTo(null);
    }
}
