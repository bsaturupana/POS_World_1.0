package Forms;

import java.awt.Color;

public class frmSplashScreen extends javax.swing.JFrame {

    public frmSplashScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblVersion = new javax.swing.JLabel();
        lblPercentage = new javax.swing.JLabel();
        pbProgressBar = new javax.swing.JProgressBar();
        lblMsgWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 244, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVersion.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVersion.setText("Version: 1.0");
        lblVersion.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 660, 20));

        lblPercentage.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblPercentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPercentage.setText("0 %");
        lblPercentage.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 680, 20));

        pbProgressBar.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(pbProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 250, 390, 40));

        lblMsgWelcome.setFont(new java.awt.Font("Trebuchet MS", 0, 80)); // NOI18N
        lblMsgWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgWelcome.setText("POS WORLD");
        lblMsgWelcome.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblMsgWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 680, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(681, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        frmSplashScreen sc = new frmSplashScreen();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }
        });

        frmMainForm n = new frmMainForm();

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                sc.pbProgressBar.setValue(i);

                if (i <= 35) {
                    sc.lblPercentage.setForeground(Color.RED);
                } else if (i <= 70){
                    sc.lblPercentage.setForeground(Color.GREEN);
                } else if (i <= 100){
                    sc.lblPercentage.setForeground(Color.YELLOW);
                }
                sc.lblPercentage.setText(Integer.toString(i) + "%");
            }
        } catch (Exception e) {
        }

        new frmSplashScreen().setVisible(false);
        n.setVisible(true);
        sc.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMsgWelcome;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JProgressBar pbProgressBar;
    // End of variables declaration//GEN-END:variables
}
