package Forms;

import javax.swing.JOptionPane;

public class frmGoodsReturnNote extends javax.swing.JFrame {

    public frmGoodsReturnNote() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblGENNumber = new javax.swing.JLabel();
        lblGrnDate = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();
        txtGENNumber = new javax.swing.JTextField();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGRN = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        dccGRNDate = new com.toedter.calendar.JDateChooser();
        txtSupplierName = new javax.swing.JTextField();
        txtPurchaseOrderNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GOODS RETURN NOTE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGENNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGENNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblGENNumber.setText("GRN NUMBER");
        jPanel1.add(lblGENNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        lblGrnDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGrnDate.setForeground(new java.awt.Color(255, 255, 255));
        lblGrnDate.setText("GRN DATE");
        jPanel1.add(lblGrnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, -1));

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        jPanel1.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 100, -1));

        txtGENNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtGENNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGENNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtGENNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, 30));

        lblPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderNumber.setText("PURCHASE ORDER  NUMBER");
        jPanel1.add(lblPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 170, -1));

        tableGRN.setBackground(new java.awt.Color(110, 122, 136));
        tableGRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableGRN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE", "BATCH NO.", "NAME", "DISCRIPTION", "QUANTITY", "UNIT PRICE", "DISCOUNT", "PUR. PRICE", "MAN.DATE", "PACKED DATE", "EXPIARY DATE", "RTN PURPOSE", "REMARKS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGRN.setRowHeight(30);
        jScrollPane1.setViewportView(tableGRN);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1440, 350));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 400, 570, 80));

        dccGRNDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dccGRNDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 270, 30));

        txtSupplierName.setBackground(new java.awt.Color(110, 122, 136));
        txtSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 350, 30));

        txtPurchaseOrderNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Goods Return Note", JOptionPane.INFORMATION_MESSAGE);

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
            java.util.logging.Logger.getLogger(frmGoodsReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGoodsReturnNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dccGRNDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGENNumber;
    private javax.swing.JLabel lblGrnDate;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JTable tableGRN;
    private javax.swing.JTextField txtGENNumber;
    private javax.swing.JTextField txtPurchaseOrderNumber;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtGENNumber.setText(null);
        txtPurchaseOrderNumber.setText(null);
        txtSupplierName.setText(null);

        dccGRNDate.setDate(null);

        txtGENNumber.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
