package Forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmGoodsReturnNotePOP extends javax.swing.JFrame {

    public frmGoodsReturnNotePOP() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblBatchNO = new javax.swing.JLabel();
        txtBatchNO = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        lblDiscription = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        txtPurPrice = new javax.swing.JTextField();
        lblPurPrice = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        lblDiscount = new javax.swing.JLabel();
        lblManDate = new javax.swing.JLabel();
        txtManDate = new javax.swing.JTextField();
        lblPackedDate = new javax.swing.JLabel();
        txtPackedDate = new javax.swing.JTextField();
        txtRemarks = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();
        txtExpiaryDate = new javax.swing.JTextField();
        lblExpiaryDate = new javax.swing.JLabel();
        lblRTNPurpose = new javax.swing.JLabel();
        comboReturnPurpose = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GOODS RETURN NOTE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(26, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 500, 80));

        lblCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("CODE");
        jPanel1.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        txtCode.setBackground(new java.awt.Color(110, 122, 136));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 30));

        lblBatchNO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchNO.setText("BATCH NO");
        jPanel1.add(lblBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 30));

        txtBatchNO.setBackground(new java.awt.Color(110, 122, 136));
        txtBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 260, 30));

        txtDiscription.setBackground(new java.awt.Color(0, 0, 102));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiscription.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 260, 30));

        lblDiscription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscription.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscription.setText("DISCRIPTION");
        jPanel1.add(lblDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, 30));

        txtName.setBackground(new java.awt.Color(0, 0, 102));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NAME");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("QUANTITY");
        jPanel1.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        txtQuantity.setBackground(new java.awt.Color(110, 122, 136));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 30));

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setText("UNIT PRICE");
        jPanel1.add(lblUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, 30));

        txtUnitPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 260, 30));

        txtPurPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtPurPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurPrice.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPurPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 260, 30));

        lblPurPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPurPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPurPrice.setText("PURCHASE PRICE");
        jPanel1.add(lblPurPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, 30));

        txtDiscount.setBackground(new java.awt.Color(0, 0, 102));
        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, 30));

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount.setText("DISCOUNT");
        jPanel1.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        lblManDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblManDate.setForeground(new java.awt.Color(255, 255, 255));
        lblManDate.setText("MANUFACTUR DATE");
        jPanel1.add(lblManDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 30));

        txtManDate.setBackground(new java.awt.Color(0, 0, 102));
        txtManDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtManDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtManDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 250, 30));

        lblPackedDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPackedDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPackedDate.setText("PACKED DATE");
        jPanel1.add(lblPackedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 130, 30));

        txtPackedDate.setBackground(new java.awt.Color(0, 0, 102));
        txtPackedDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPackedDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPackedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 260, 30));

        txtRemarks.setBackground(new java.awt.Color(110, 122, 136));
        txtRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRemarks.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 250, 30));

        lblRemarks.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRemarks.setForeground(new java.awt.Color(255, 255, 255));
        lblRemarks.setText("REMARK");
        jPanel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 30));

        txtExpiaryDate.setBackground(new java.awt.Color(0, 0, 102));
        txtExpiaryDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtExpiaryDate.setForeground(new java.awt.Color(255, 255, 255));
        txtExpiaryDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExpiaryDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtExpiaryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 30));

        lblExpiaryDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblExpiaryDate.setForeground(new java.awt.Color(255, 255, 255));
        lblExpiaryDate.setText("EXPIARY DATE");
        jPanel1.add(lblExpiaryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 30));

        lblRTNPurpose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRTNPurpose.setForeground(new java.awt.Color(255, 255, 255));
        lblRTNPurpose.setText("RETURN PURPOSE");
        jPanel1.add(lblRTNPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 130, 30));

        comboReturnPurpose.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Return Purpose -" }));
        comboReturnPurpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReturnPurposeActionPerformed(evt);
            }
        });
        jPanel1.add(comboReturnPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 260, 30));

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Account", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtExpiaryDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpiaryDateKeyTyped

    }//GEN-LAST:event_txtExpiaryDateKeyTyped

    private void comboReturnPurposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReturnPurposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReturnPurposeActionPerformed

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
            java.util.logging.Logger.getLogger(frmGoodsReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGoodsReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGoodsReturnNotePOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboReturnPurpose;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBatchNO;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscription;
    private javax.swing.JLabel lblExpiaryDate;
    private javax.swing.JLabel lblManDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPackedDate;
    private javax.swing.JLabel lblPurPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRTNPurpose;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtExpiaryDate;
    private javax.swing.JTextField txtManDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPackedDate;
    private javax.swing.JTextField txtPurPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtBatchNO.setText(null);
        txtCode.setText(null);
        txtDiscount.setText(null);
        txtDiscription.setText(null);
        txtExpiaryDate.setText(null);
        txtManDate.setText(null);
        txtName.setText(null);
        txtPackedDate.setText(null);
        txtPurPrice.setText(null);
        txtQuantity.setText(null);
        txtRemarks.setText(null);
        txtUnitPrice.setText(null);

        comboReturnPurpose.setSelectedIndex(0);

        txtCode.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        txtExpiaryDate.setEditable(false);
        txtName.setEditable(false);
        txtDiscription.setEditable(false);
        txtUnitPrice.setEditable(false);
        txtDiscount.setEditable(false);
        txtPurPrice.setEditable(false);
        txtManDate.setEditable(false);
        txtPackedDate.setEditable(false);
        
        clearFields();

        this.setLocationRelativeTo(null);
    }
}
