package frames;

import connection.MySqlConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import forms.MDIMain;

public class Login extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

//    public static String x;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        formFormat();
    }

    public static void main(String[] args) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        panelLoginCredentials = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        panelLoginButtons = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        panelLoginForgotPassword = new javax.swing.JPanel();
        lblForgotPassword = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LOGIN FORM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(45, 62, 80));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLoginCredentials.setBackground(new java.awt.Color(45, 62, 80));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");

        txtUsername.setBackground(new java.awt.Color(110, 122, 136));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("sheshan");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");

        txtPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("123");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelLoginCredentialsLayout = new javax.swing.GroupLayout(panelLoginCredentials);
        panelLoginCredentials.setLayout(panelLoginCredentialsLayout);
        panelLoginCredentialsLayout.setHorizontalGroup(
            panelLoginCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(34, 34, 34)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(31, 31, 31)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginCredentialsLayout.setVerticalGroup(
            panelLoginCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUsername))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelLoginCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginCredentialsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPassword))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLogin.add(panelLoginCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelLoginButtons.setBackground(new java.awt.Color(45, 62, 80));

        btnLogin.setBackground(new java.awt.Color(53, 189, 252));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 56, 29));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginButtonsLayout = new javax.swing.GroupLayout(panelLoginButtons);
        panelLoginButtons.setLayout(panelLoginButtonsLayout);
        panelLoginButtonsLayout.setHorizontalGroup(
            panelLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginButtonsLayout.setVerticalGroup(
            panelLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLogin.add(panelLoginButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        panelLoginForgotPassword.setBackground(new java.awt.Color(45, 62, 80));

        lblForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblForgotPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblForgotPassword.setForeground(new java.awt.Color(0, 255, 255));
        lblForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForgotPassword.setText("Forgot Password");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginForgotPasswordLayout = new javax.swing.GroupLayout(panelLoginForgotPassword);
        panelLoginForgotPassword.setLayout(panelLoginForgotPasswordLayout);
        panelLoginForgotPasswordLayout.setHorizontalGroup(
            panelLoginForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginForgotPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginForgotPasswordLayout.setVerticalGroup(
            panelLoginForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblForgotPassword, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panelLogin.add(panelLoginForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 147));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        int len = txtUsername.getText().length();

        if (txtUsername.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        int len = txtPassword.getText().length();

        if (txtPassword.getText().length() >= 12) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "USERNAME can not be blank.", "Login", JOptionPane.ERROR_MESSAGE);
            txtUsername.requestFocus();
        } else if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "PASSWORD can not be blank.", "Login", JOptionPane.ERROR_MESSAGE);
            txtPassword.requestFocus();
        } else if (txtUsername.getText().equals(txtPassword.getText())) {
            JOptionPane.showMessageDialog(this, "USERNAME and PASSWORD can not be equal.", "Login", JOptionPane.ERROR_MESSAGE);
            txtUsername.requestFocus();
        } else {
            conn = MySqlConnection.ConnectDB();
            String sql = "SELECT * FROM user_master WHERE um_user_username = ? AND um_user_password = ?";

            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtUsername.getText());
                pst.setString(2, txtPassword.getText());
                rs = pst.executeQuery();

                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "Welcome User");
                    MDIMain.getWindows().getClass();
                    this.setVisible(false);
                    mdiMain.assignMenu("Login");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
                    txtUsername.requestFocus(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        //        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
//        new frmPasswordReset().setVisible(true);
    }//GEN-LAST:event_lblForgotPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLoginButtons;
    private javax.swing.JPanel panelLoginCredentials;
    private javax.swing.JPanel panelLoginForgotPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void formFormat() {
//        panelLogin.setLocationRelativeTo(null);

        setScreenSize();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
}
