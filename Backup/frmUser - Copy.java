package Forms;

public class frmUser extends javax.swing.JFrame {

    public frmUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblUserRole = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblNICNumber = new javax.swing.JLabel();
        lblPassportNO = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblRelegon = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtRemarks = new javax.swing.JTextField();
        comboUserRole = new javax.swing.JComboBox();
        comboGender = new javax.swing.JComboBox();
        comboRelegon = new javax.swing.JComboBox();
        txtNICNumber = new javax.swing.JTextField();
        lblMobileNO = new javax.swing.JLabel();
        lblResidentNO = new javax.swing.JLabel();
        txtResidentNO = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        radioInactive = new javax.swing.JRadioButton();
        radioActive = new javax.swing.JRadioButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        comboRace = new javax.swing.JComboBox();
        lblRace = new javax.swing.JLabel();
        txtMobileNO = new javax.swing.JTextField();
        txtPassportNO = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        comboNationality = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(255, 255, 150));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 250, 30));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblUsername.setText("USERNAME");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPassword.setText("PASSWORD");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        lblStatus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblStatus.setText("STATUS");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        jPanel1.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 150));
        txtEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 30));

        lblUserRole.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblUserRole.setText("USER ROLE");
        jPanel1.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAddress.setText("ADDRESS");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        lblEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmployeeID.setText("EMPLOYEE ID");
        jPanel1.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblNICNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNICNumber.setText("NIC NUMBER");
        jPanel1.add(lblNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblPassportNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPassportNO.setText("PASSPORT NO");
        jPanel1.add(lblPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarks.setText("REMARKS");
        jPanel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblGender.setText("GENDER");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        lblRelegon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRelegon.setText("RELEGON");
        jPanel1.add(lblRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        lblNationality.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNationality.setText("NATIONALITY");
        jPanel1.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        txtAddress.setBackground(new java.awt.Color(255, 255, 150));
        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 250, 90));

        txtRemarks.setBackground(new java.awt.Color(255, 255, 150));
        txtRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 250, 90));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        jPanel1.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 250, 30));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 250, 30));

        comboRelegon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Relegon -", "Budhist", "Catholic", "Hindu", "Islam", "Other" }));
        jPanel1.add(comboRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 250, 30));

        txtNICNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtNICNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        lblMobileNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblMobileNO.setText("MOBILE NO");
        jPanel1.add(lblMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblResidentNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblResidentNO.setText("RESIDENTS NO ");
        jPanel1.add(lblResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        txtResidentNO.setBackground(new java.awt.Color(255, 255, 150));
        txtResidentNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 250, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmail.setText("E - MAIL ");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 150));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 250, 30));

        buttonGroup1.add(radioInactive);
        radioInactive.setText("INACTIVE");
        jPanel1.add(radioInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        buttonGroup1.add(radioActive);
        radioActive.setText("ACTIVE");
        radioActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActiveActionPerformed(evt);
            }
        });
        jPanel1.add(radioActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 80, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 255, 150));
        jPanel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 250, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 150));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, 30));

        comboRace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Race -", "Sinhala", "Tamil", "Muslim", "Burgher", "Other" }));
        jPanel1.add(comboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 250, 30));

        lblRace.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRace.setText("RACE");
        jPanel1.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtMobileNO.setBackground(new java.awt.Color(255, 255, 150));
        txtMobileNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 250, 30));

        txtPassportNO.setBackground(new java.awt.Color(255, 255, 150));
        txtPassportNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 250, 30));

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 140, 160));

        comboNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Nationality-", "Srilanken", "Other" }));
        jPanel1.add(comboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 250, 30));

        btnUpdate.setBackground(new java.awt.Color(155, 194, 230));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(155, 194, 230));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(155, 194, 230));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActiveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        clearfield();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfield();
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JComboBox comboNationality;
    private javax.swing.JComboBox comboRace;
    private javax.swing.JComboBox comboRelegon;
    private javax.swing.JComboBox comboUserRole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMobileNO;
    private javax.swing.JLabel lblNICNumber;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportNO;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblRelegon;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblResidentNO;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radioActive;
    private javax.swing.JRadioButton radioInactive;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtMobileNO;
    private javax.swing.JTextField txtNICNumber;
    private javax.swing.JTextField txtPassportNO;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtResidentNO;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void clearfield() {
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtConfirmPassword.setText(null);
        txtEmployeeID.setText(null);
        txtEmail.setText(null);
        txtNICNumber.setText(null);
        txtPassportNO.setText(null);
        txtMobileNO.setText(null);
        txtResidentNO.setText(null);
        txtAddress.setText(null);
        txtRemarks.setText(null);
        
        comboUserRole.setSelectedIndex(0);
        comboGender.setSelectedIndex(0);
        comboNationality.setSelectedIndex(0);
        comboRace.setSelectedIndex(0);
        comboRelegon.setSelectedIndex(0);
        
        radioActive.setSelected(true);
        radioInactive.setSelected(false);
    }
}
