package forms;

import frames.Login;
import java.awt.Color;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
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
        jLabel1 = new javax.swing.JLabel();
        lblMsgWelcome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVersion.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVersion.setText("Version: 1.0");
        lblVersion.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 660, 20));

        lblPercentage.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblPercentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPercentage.setText("0 %");
        lblPercentage.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 680, 20));

        pbProgressBar.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(pbProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 390, 40));

        lblMsgWelcome.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblMsgWelcome.setForeground(new java.awt.Color(255, 255, 102));
        lblMsgWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgWelcome.setText("POS WORLD GROUP OF COMPANY");
        lblMsgWelcome.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblMsgWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 680, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Point of sale system.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 340, 230));

        lblMsgWelcome1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblMsgWelcome1.setForeground(new java.awt.Color(255, 255, 255));
        lblMsgWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgWelcome1.setText("Point of Sale System");
        lblMsgWelcome1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblMsgWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 190, 40));

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sc = new SplashScreen();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }
        });

        MDIMain n = new MDIMain();

//        Login l = new Login();
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(1);
//                Thread.sleep(40);
                sc.pbProgressBar.setValue(i);

                if (i <= 35) {
                    sc.lblPercentage.setForeground(Color.RED);
                } else if (i <= 70) {
                    sc.lblPercentage.setForeground(Color.GREEN);
                } else if (i <= 100) {
                    sc.lblPercentage.setForeground(Color.YELLOW);
                }
                sc.lblPercentage.setText(Integer.toString(i) + "%");
            }
        } catch (Exception e) {
        }

        new SplashScreen().setVisible(false);
        n.setVisible(true);
//        l.setVisible(true);
        sc.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMsgWelcome;
    private javax.swing.JLabel lblMsgWelcome1;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JProgressBar pbProgressBar;
    // End of variables declaration//GEN-END:variables
}
