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

public class ProductManager extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;

    PreparedStatement pst = null;
    PreparedStatement pstProductMaster = null;

    ResultSet rs = null;
    ResultSet rsProductMaster = null;

    int maxLengthProductCode = 10;
    int maxLengthProductName = 150;
    int maxLengthProductDescription = 250;

    public ProductManager() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
    }

    public ProductManager(String para) {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();

        String res = para.substring(0, 4);

        comFunc.sCurrentButtonAction = para.substring(4);

        if (res.equals("EDIT")) {
            dataRetrieval();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        panelProductManager = new javax.swing.JPanel();
        panelProductManagerMain = new javax.swing.JPanel();
        tabbedProductManager = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        lblProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductDescription = new javax.swing.JLabel();
        txtProductDescription = new javax.swing.JTextField();
        lblProductStatus = new javax.swing.JLabel();
        comboProductStatus = new javax.swing.JComboBox();
        lblErrorProductCode = new javax.swing.JLabel();
        lblErrorProductName = new javax.swing.JLabel();
        lblErrorProductDescription = new javax.swing.JLabel();
        lblErrorProductStatus = new javax.swing.JLabel();
        panelMainButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductManager.setBackground(new java.awt.Color(45, 62, 80));
        panelProductManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductManagerMain.setBackground(new java.awt.Color(45, 62, 80));
        panelProductManagerMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelProductManagerMain.setForeground(new java.awt.Color(255, 255, 255));
        panelProductManagerMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedProductManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        panelGeneral.setBackground(new java.awt.Color(45, 62, 80));
        panelGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGeneral.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.setToolTipText("");
        panelGeneral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductCode.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProductCode.setForeground(new java.awt.Color(255, 255, 255));
        lblProductCode.setText("PRODUCT CODE");
        panelGeneral.add(lblProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtProductCode.setBackground(new java.awt.Color(110, 122, 136));
        txtProductCode.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtProductCode.setForeground(new java.awt.Color(255, 255, 255));
        txtProductCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductCodeFocusLost(evt);
            }
        });
        txtProductCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductCodeKeyTyped(evt);
            }
        });
        panelGeneral.add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 250, 30));

        lblProductName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("PRODUCT NAME");
        panelGeneral.add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, -1, -1));

        txtProductName.setBackground(new java.awt.Color(110, 122, 136));
        txtProductName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(255, 255, 255));
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNameFocusLost(evt);
            }
        });
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductNameKeyTyped(evt);
            }
        });
        panelGeneral.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 680, 30));

        lblProductDescription.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProductDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblProductDescription.setText("DISCRIPTION");
        panelGeneral.add(lblProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, -1, -1));

        txtProductDescription.setBackground(new java.awt.Color(110, 122, 136));
        txtProductDescription.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtProductDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtProductDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductDescriptionFocusLost(evt);
            }
        });
        txtProductDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductDescriptionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductDescriptionKeyTyped(evt);
            }
        });
        panelGeneral.add(txtProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 680, 30));

        lblProductStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProductStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblProductStatus.setText("STATUS");
        panelGeneral.add(lblProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        comboProductStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboProductStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Status -", "ACTIVE", "INACTIVE" }));
        comboProductStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductStatusActionPerformed(evt);
            }
        });
        panelGeneral.add(comboProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 250, 30));

        lblErrorProductCode.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorProductCode.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorProductCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorProductCode.setText("*");
        panelGeneral.add(lblErrorProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, -1));

        lblErrorProductName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorProductName.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorProductName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorProductName.setText("*");
        panelGeneral.add(lblErrorProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 680, -1));

        lblErrorProductDescription.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorProductDescription.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorProductDescription.setText("*");
        panelGeneral.add(lblErrorProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 680, -1));

        lblErrorProductStatus.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorProductStatus.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorProductStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorProductStatus.setText("*");
        panelGeneral.add(lblErrorProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 250, -1));

        tabbedProductManager.addTab("GENERAL", panelGeneral);

        panelProductManagerMain.add(tabbedProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 470));

        panelProductManager.add(panelProductManagerMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 490));

        panelMainButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelMainButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelMainButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setToolTipText("");
        btnSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSaveFocusLost(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 70));

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
        panelMainButtons.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 70));

        panelProductManager.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 460, 90));

        getContentPane().add(panelProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtProductCode.getText() == null) {
            lblErrorProductCode.setText("'PRODUCT CODE' can not be blank.");
            txtProductCode.requestFocus();
        } else if (txtProductCode.getText().equals("")) {
            lblErrorProductCode.setText("'PRODUCT CODE' can not be blank.");
            txtProductCode.requestFocus();
        } else if (verifyIsExistProductCode(txtProductCode.getText()) == true) {
            lblErrorProductCode.setText("'PRODUCT CODE' is currently used.");
            txtProductCode.requestFocus();
        } else if (comboProductStatus.getSelectedItem().equals("")) {
            lblErrorProductStatus.setText("'PRODUCT STATUS' should can not be blank.");
            comboProductStatus.requestFocus();
        } else if ("- Select Status -".equals(comboProductStatus.getSelectedItem())) {
            lblErrorProductStatus.setText("'PRODUCT STATUS' should be a valid value.");
            comboProductStatus.requestFocus();
        } else if (txtProductName.getText() == null) {
            lblErrorProductName.setText("'PRODUCT NAME' can not be blank.");
            txtProductName.requestFocus();
        } else if (txtProductName.getText().equals("")) {
            lblErrorProductName.setText("'PRODUCT NAME' can not be blank.");
            txtProductName.requestFocus();
        } else if (verifyIsExistProductName(txtProductName.getText()) == true) {
            lblErrorProductName.setText("'PRODUCT NAME' is currently used.");
            txtProductName.requestFocus();
        } else if (txtProductDescription.getText() == null) {
            lblErrorProductDescription.setText("'PRODUCT DISCRIPTION' can not be blank.");
            txtProductDescription.requestFocus();
        } else if (txtProductDescription.getText().equals("")) {
            lblErrorProductDescription.setText("'PRODUCT DISCRIPTIONr' can not be blank.");
            txtProductDescription.requestFocus();
        } else if (verifyIsExistProductDescription(txtProductDescription.getText()) == true) {
            lblErrorProductDescription.setText("'PRODUCT DISCRIPTIONr' is currently used.");
            txtProductDescription.requestFocus();
        } else {
            dataUpdate();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusLost
    }//GEN-LAST:event_btnSaveFocusLost

    private void txtProductCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductCodeKeyReleased
        int len = txtProductCode.getText().length();

        if (len == 0) {
            lblErrorProductCode.setText("'PRODUCT CODE' can not be blank.");
        } else {
            lblErrorProductCode.setText("");
        }
    }//GEN-LAST:event_txtProductCodeKeyReleased

    private void txtProductCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductCodeKeyTyped
        int len = txtProductCode.getText().length();

        if (len >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtProductCodeKeyTyped

    private void txtProductCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductCodeKeyPressed
    }//GEN-LAST:event_txtProductCodeKeyPressed

    private void txtProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyReleased
        int len = txtProductName.getText().length();

        if (len == 0) {
            lblErrorProductName.setText("'PRODUCT NAME' can not be blank.");
        } else {
            lblErrorProductName.setText("");
        }
    }//GEN-LAST:event_txtProductNameKeyReleased

    private void txtProductDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductDescriptionKeyReleased
        int len = txtProductDescription.getText().length();

        if (len == 0) {
            lblErrorProductDescription.setText("'PRODUCT DISCRIPTION' can not be blank.");
        } else {
            lblErrorProductDescription.setText("");
        }
    }//GEN-LAST:event_txtProductDescriptionKeyReleased

    private void comboProductStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductStatusActionPerformed
        if ("- Select Status -".equals(comboProductStatus.getSelectedItem())) {
            lblErrorProductStatus.setText("'PRODUCT STATUS' should be a valid value.");
        } else {
            lblErrorProductStatus.setText("");
        }
    }//GEN-LAST:event_comboProductStatusActionPerformed

    private void txtProductCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductCodeFocusGained
        txtProductCode.selectAll();
    }//GEN-LAST:event_txtProductCodeFocusGained

    private void txtProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusGained
        txtProductName.selectAll();
    }//GEN-LAST:event_txtProductNameFocusGained

    private void txtProductDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductDescriptionFocusGained
        txtProductDescription.selectAll();
    }//GEN-LAST:event_txtProductDescriptionFocusGained

    private void txtProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyTyped
        int len = txtProductName.getText().length();

        if (len >= 150) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtProductNameKeyTyped

    private void txtProductDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductDescriptionKeyTyped
        int len = txtProductDescription.getText().length();

        if (len >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtProductDescriptionKeyTyped

    private void txtProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusLost
        if (verifyIsExistProductName(txtProductName.getText()) == true) {
            lblErrorProductName.setText("'PRODUCT NAME' is currently used.");
        }
    }//GEN-LAST:event_txtProductNameFocusLost

    private void txtProductDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductDescriptionFocusLost
        if (verifyIsExistProductDescription(txtProductDescription.getText()) == true) {
            lblErrorProductDescription.setText("'PRODUCT DISCRIPTION' is currently used.");
        }
    }//GEN-LAST:event_txtProductDescriptionFocusLost

    private void txtProductCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductCodeFocusLost
        if (verifyIsExistProductCode(txtProductCode.getText()) == true) {
            lblErrorProductCode.setText("'PRODUCT CODE' is currently used.");
        }
    }//GEN-LAST:event_txtProductCodeFocusLost

    private void clearField() {
        txtProductCode.setText(null);
        txtProductName.setText(null);
        txtProductDescription.setText(null);
        comboProductStatus.setSelectedIndex(0);

        txtProductCode.requestFocus();
    }

    private void clearErrorLable() {
        lblErrorProductCode.setText("");
        lblErrorProductName.setText("");
        lblErrorProductDescription.setText("");
        lblErrorProductStatus.setText("");
    }

    private void formFormat() {
        setScreenSize();
        clearField();
        clearErrorLable();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void dataRetrieval() {
        try {
            String sSql = "SELECT * FROM product_master WHERE product_master = '"
                    + comFunc.sCurrentButtonAction + "'";

            pst = conn.prepareStatement(sSql);

            rs = pst.executeQuery();

            while (rs.next()) {
                txtProductCode.setText(rs.getString("pm_product_code"));
                txtProductName.setText(rs.getString("pm_product_name"));
                txtProductDescription.setText(rs.getString("pm_product_description"));
                comboProductStatus.setSelectedItem(rs.getString("pm_product_status"));
            }

            rs.close();
            pst.close();

            JOptionPane.showMessageDialog(null, "RECORD RETRIEVAL SUCCESSFUL.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    private void dataUpdate() {
        int maxProductID = 0;

        try {
            conn = MySqlConnection.ConnectDB();

            String sSql_ProductMaster = "SELECT MAX(pm_product_id) AS 'MaxID' FROM product_master";

            pstProductMaster = conn.prepareStatement(sSql_ProductMaster);
            rsProductMaster = pstProductMaster.executeQuery();

            if (rsProductMaster.next()) {
                maxProductID = rsProductMaster.getInt("MaxID") + 1;
            }

            rsProductMaster.close();
            pstProductMaster.close();

            String sProductCode = txtProductCode.getText().trim();
            String sProductStatus = comboProductStatus.getSelectedItem().toString();
            String sProductName = txtProductName.getText().trim();
            String sProductDescription = txtProductDescription.getText().trim();

            String sSql = "INSERT INTO product_master ("
                    + "pm_product_id, "
                    + "pm_product_code, "
                    + "pm_product_name, "
                    + "pm_product_description, "
                    + "pm_product_status"
                    + ")"
                    + " VALUES ("
                    + maxProductID + ", '"
                    + sProductCode + "', '"
                    + sProductName + "', '"
                    + sProductDescription + "', '"
                    + sProductStatus + "'"
                    + ")";

            pst = conn.prepareStatement(sSql);

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "RECORD SAVED.");

            clearField();
            clearErrorLable();

            tabbedProductManager.setSelectedIndex(0);
            txtProductCode.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    private boolean verifyIsExistProductCode(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT pm_product_code FROM product_master "
                    + "WHERE pm_product_code = '"
                    + inputData + "'";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            if (rs.next()) {
                outputResult = true;
            } else {
                outputResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputResult;
    }

    private boolean verifyIsExistProductName(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT pm_product_name FROM product_master "
                    + "WHERE pm_product_name = '"
                    + inputData + "'";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            if (rs.next()) {
                outputResult = true;
            } else {
                outputResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputResult;
    }

    private boolean verifyIsExistProductDescription(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT pm_product_description FROM product_master "
                    + "WHERE pm_product_description = '"
                    + inputData + "'";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            if (rs.next()) {
                outputResult = true;
            } else {
                outputResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputResult;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JComboBox comboProductStatus;
    private javax.swing.JLabel lblErrorProductCode;
    private javax.swing.JLabel lblErrorProductDescription;
    private javax.swing.JLabel lblErrorProductName;
    private javax.swing.JLabel lblErrorProductStatus;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductStatus;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelProductManager;
    private javax.swing.JPanel panelProductManagerMain;
    private javax.swing.JTabbedPane tabbedProductManager;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductDescription;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
