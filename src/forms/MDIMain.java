package forms;

import frames.AccountMaster;
import frames.JavaTreeWithDB;
import frames.Login;
import frames.ProductMaster;
import frames.UserMaster;
import javax.swing.JFrame;

public class MDIMain extends javax.swing.JFrame {

//    Login login = new Login();
    public MDIMain() {
        initComponents();
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFile_Login = new javax.swing.JMenuItem();
        mnuFile_Logout = new javax.swing.JMenuItem();
        mnuFile_Separator1 = new javax.swing.JPopupMenu.Separator();
        mnuFile_Exit = new javax.swing.JMenuItem();
        mnuSetup = new javax.swing.JMenu();
        mnuSetup_UserMaster = new javax.swing.JMenuItem();
        mnuSetup_AccountMaster = new javax.swing.JMenuItem();
        mnuSetup_ProductMaster = new javax.swing.JMenuItem();
        mnuTransaction = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuTreeView = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        mnuFile.setText("File");

        mnuFile_Login.setText("Log In");
        mnuFile_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_LoginActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Login);

        mnuFile_Logout.setText("Log Out");
        mnuFile_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_LogoutActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Logout);
        mnuFile.add(mnuFile_Separator1);

        mnuFile_Exit.setText("Exit");
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Exit);

        menuBar.add(mnuFile);

        mnuSetup.setText("Setup");

        mnuSetup_UserMaster.setText("User Master");
        mnuSetup_UserMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSetup_UserMasterActionPerformed(evt);
            }
        });
        mnuSetup.add(mnuSetup_UserMaster);

        mnuSetup_AccountMaster.setText("Account Master");
        mnuSetup_AccountMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSetup_AccountMasterActionPerformed(evt);
            }
        });
        mnuSetup.add(mnuSetup_AccountMaster);

        mnuSetup_ProductMaster.setText("Product Master");
        mnuSetup_ProductMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSetup_ProductMasterActionPerformed(evt);
            }
        });
        mnuSetup.add(mnuSetup_ProductMaster);

        menuBar.add(mnuSetup);

        mnuTransaction.setText("Transaction");

        jMenu1.setText("jMenu1");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        mnuTransaction.add(jMenu1);

        mnuTreeView.setText("Accounts Tree");
        mnuTreeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTreeViewActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTreeView);

        menuBar.add(mnuTransaction);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void mnuFile_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_LoginActionPerformed
//        String x = Login.x;
//        try {
//            if (x == null) {
        Login frm = new Login();
        Desktop.add(frm);
        frm.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(rootPane, "Login form already open.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_mnuFile_LoginActionPerformed

    private void mnuFile_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_LogoutActionPerformed
        assignMenu("Logout");
    }//GEN-LAST:event_mnuFile_LogoutActionPerformed

    private void mnuSetup_UserMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSetup_UserMasterActionPerformed
        UserMaster frm = new UserMaster();
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuSetup_UserMasterActionPerformed

    private void mnuSetup_AccountMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSetup_AccountMasterActionPerformed
        AccountMaster frm = new AccountMaster();
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuSetup_AccountMasterActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnuTreeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreeViewActionPerformed
        JavaTreeWithDB frm = new JavaTreeWithDB();
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuTreeViewActionPerformed

    private void mnuSetup_ProductMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSetup_ProductMasterActionPerformed
        ProductMaster frm = new ProductMaster();
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuSetup_ProductMasterActionPerformed

    public void assignMenu(String sMenuAction) {
        switch (sMenuAction) {
            case "Start":
                mnuFile_Login.setEnabled(true);
                mnuFile_Logout.setEnabled(false);
                mnuFile_Exit.setEnabled(true);
                break;

            case "Login":
                mnuFile_Login.setEnabled(false);
                mnuFile_Logout.setEnabled(true);
                mnuFile_Exit.setEnabled(false);
                break;

            case "Logout":
                mnuFile_Login.setEnabled(true);
                mnuFile_Logout.setEnabled(false);
                mnuFile_Exit.setEnabled(true);
                break;
        }
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        assignMenu("Start");
    }

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
            java.util.logging.Logger.getLogger(MDIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JMenuItem mnuFile_Login;
    private javax.swing.JMenuItem mnuFile_Logout;
    private javax.swing.JPopupMenu.Separator mnuFile_Separator1;
    private javax.swing.JMenu mnuSetup;
    private javax.swing.JMenuItem mnuSetup_AccountMaster;
    private javax.swing.JMenuItem mnuSetup_ProductMaster;
    private javax.swing.JMenuItem mnuSetup_UserMaster;
    private javax.swing.JMenu mnuTransaction;
    private javax.swing.JMenuItem mnuTreeView;
    // End of variables declaration//GEN-END:variables
}
