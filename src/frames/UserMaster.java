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
import javax.swing.table.DefaultTableModel;

public class UserMaster extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public UserMaster() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
        showRole();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUserMaster = new javax.swing.JPanel();
        panelSearchFields = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        lblUserRole = new javax.swing.JLabel();
        comboUserRole = new javax.swing.JComboBox();
        panelSearchButtons = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        panelMainTable = new javax.swing.JPanel();
        scrollPaneUserMaster = new javax.swing.JScrollPane();
        tableUserMaster = new javax.swing.JTable();
        panelMainButtons = new javax.swing.JPanel();
        btnAddNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        panelUserMaster.setBackground(new java.awt.Color(45, 62, 80));
        panelUserMaster.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSearchFields.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchFields.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchFields.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFullName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("FULL NAME");
        panelSearchFields.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtFullName.setBackground(new java.awt.Color(110, 122, 136));
        txtFullName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });
        panelSearchFields.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 600, 30));

        lblEmployeeID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("EMPLOYEE ID");
        panelSearchFields.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(110, 122, 136));
        txtEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        txtEmployeeID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmployeeIDFocusLost(evt);
            }
        });
        panelSearchFields.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 250, 30));

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("USER NAME");
        panelSearchFields.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtUserName.setBackground(new java.awt.Color(110, 122, 136));
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        panelSearchFields.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, 30));

        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("GENDER");
        panelSearchFields.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        comboGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboGenderFocusLost(evt);
            }
        });
        panelSearchFields.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 250, 30));

        lblUserRole.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUserRole.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRole.setText("USER ROLE");
        panelSearchFields.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        comboUserRole.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboUserRoleFocusLost(evt);
            }
        });
        panelSearchFields.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 250, 30));

        panelUserMaster.add(panelSearchFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 90));

        panelSearchButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelSearchButtons.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        btnSearch.setBackground(new java.awt.Color(53, 189, 252));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.setToolTipText("");
        btnSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSearchFocusLost(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelSearchButtons.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 70));

        panelUserMaster.add(panelSearchButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 310, 90));

        panelMainTable.setBackground(new java.awt.Color(45, 62, 80));
        panelMainTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainTable.setForeground(new java.awt.Color(255, 255, 255));
        panelMainTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUserMaster.setBackground(new java.awt.Color(110, 122, 136));
        tableUserMaster.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableUserMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE ID", "USER NAME", "FULL NAME", "USER ROLE", "NIC NO", "PASSPORT NO", "E-MAIL", "MOBILE NO", "RESIDENT NO", "GENDER", "ADDRESS", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUserMaster.setRowHeight(30);
        tableUserMaster.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableUserMasterFocusLost(evt);
            }
        });
        scrollPaneUserMaster.setViewportView(tableUserMaster);

        panelMainTable.add(scrollPaneUserMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1400, 410));

        panelUserMaster.add(panelMainTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1420, 430));

        panelMainButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelMainButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelMainButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddNew.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("ADD NEW");
        btnAddNew.setToolTipText("");
        btnAddNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddNewFocusLost(evt);
            }
        });
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, 70));

        btnEdit.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.setToolTipText("");
        btnEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnEditFocusLost(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 70));

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setToolTipText("");
        btnDelete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDeleteFocusLost(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, 70));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 70));

        panelUserMaster.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 620, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUserMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUserMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String msg = "EDIT" + tableUserMaster.getModel().getValueAt(tableUserMaster.getSelectedRow(), 1).toString();

            UserManager frmSub = new UserManager(msg);
            frmSub.setVisible(true);
            getParent().add(frmSub);
            frmSub.toFront();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "THERE IS NOW VALID ROW SELECTED TO 'EDIT'");
            tableUserMaster.requestFocus();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Deleted.", "User Master", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        UserManager frmSub = new UserManager();
        frmSub.setVisible(true);
        getParent().add(frmSub);
        frmSub.toFront();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
        clearTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        clearTable();
        showUser();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
        txtFullName.selectAll();
    }//GEN-LAST:event_txtFullNameFocusGained

    private void txtEmployeeIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeIDFocusGained
        txtEmployeeID.selectAll();
    }//GEN-LAST:event_txtEmployeeIDFocusGained

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        txtUserName.selectAll();
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtEmployeeIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeIDFocusLost
    }//GEN-LAST:event_txtEmployeeIDFocusLost

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
    }//GEN-LAST:event_txtUserNameFocusLost

    private void comboGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboGenderFocusLost
    }//GEN-LAST:event_comboGenderFocusLost

    private void comboUserRoleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboUserRoleFocusLost
    }//GEN-LAST:event_comboUserRoleFocusLost

    private void btnSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSearchFocusLost
    }//GEN-LAST:event_btnSearchFocusLost

    private void tableUserMasterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableUserMasterFocusLost
    }//GEN-LAST:event_tableUserMasterFocusLost

    private void btnAddNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddNewFocusLost
    }//GEN-LAST:event_btnAddNewFocusLost

    private void btnEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditFocusLost
    }//GEN-LAST:event_btnEditFocusLost

    private void btnDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteFocusLost
    }//GEN-LAST:event_btnDeleteFocusLost

    private void showRole() {
        try {
            String sSql = "SELECT * FROM role_master";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            comboUserRole.removeAllItems();

            comboUserRole.addItem("- Select User Role -");

            while (rs.next()) {
                comboUserRole.addItem(rs.getString("rm_role_name"));
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void showUser() {
        try {
            DefaultTableModel model = (DefaultTableModel) tableUserMaster.getModel();

            int[] rows = tableUserMaster.getSelectedRows();

            for (int i = 0; i < rows.length; i++) {
                model.removeRow(rows[i] - i);
            }

            String sSql = "SELECT * FROM user_master um "
                    + "JOIN role_master rm "
                    + "ON um.um_user_role_id = rm.rm_role_id "
                    + "WHERE (" + (!txtFullName.getText().trim().equals("") ? 1 : 0) + " = 0 OR um.um_user_full_name like '%" + txtFullName.getText() + "%') "
                    + "AND (" + (!txtEmployeeID.getText().trim().equals("") ? 1 : 0) + " = 0 OR um.um_user_epf_no = '" + txtEmployeeID.getText() + "') "
                    + "AND (" + (!txtUserName.getText().trim().equals("") ? 1 : 0) + " = 0 OR um.um_user_username like '%" + txtUserName.getText() + "%') "
                    + "AND ('" + (comboGender.getSelectedItem().toString().compareToIgnoreCase("") != 0 ? comboGender.getSelectedItem().toString() : "'- Select Gender -'") + "' = '- Select Gender -' OR um.um_user_gender = '" + comboGender.getSelectedItem().toString() + "') "
                    + "AND ('" + (comboUserRole.getSelectedItem().toString().compareToIgnoreCase("") != 0 ? comboUserRole.getSelectedItem().toString() : "'- Select User Role -'") + "' = '- Select User Role -' OR rm.rm_role_name = '" + comboUserRole.getSelectedItem().toString() + "')";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();

            while (rs.next()) {
                updateGrid(
                        rs.getString("um_user_epf_no"),
                        rs.getString("um_user_username"),
                        rs.getString("um_user_full_name"),
                        rs.getString("rm_role_name"),
                        rs.getString("um_user_nic_no"),
                        rs.getString("um_user_pp_no"),
                        rs.getString("um_user_email"),
                        rs.getString("um_user_mobile_no"),
                        rs.getString("um_user_resident_no"),
                        rs.getString("um_user_gender"),
                        rs.getString("um_user_address"),
                        rs.getString("um_user_status")
                );
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void updateGrid(String sEmployeeID, String sUserName,
            String sFullName, String sUserRole, String sNICNo,
            String sPassportNo, String sEmail, String sMobileNo,
            String sResidentNo, String sGender, String sAddress,
            String sStatus) {

        DefaultTableModel model = (DefaultTableModel) tableUserMaster.getModel();

        model.addRow(new Object[]{
            sEmployeeID, sUserName, sFullName, sUserRole, sNICNo, sPassportNo,
            sEmail, sMobileNo, sResidentNo, sGender, sAddress, sStatus
        });
    }

    private void formFormat() {
        setScreenSize();
        clearField();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void clearField() {
        txtFullName.setText(null);
        txtEmployeeID.setText(null);
        txtUserName.setText(null);
        comboGender.setSelectedIndex(0);
        comboUserRole.setSelectedIndex(0);

        txtFullName.requestFocus();
    }

    private void clearTable() {
        tableUserMaster.setModel(new DefaultTableModel(null, new String[]{"EMPLOYEE ID", "USER NAME", "FULL NAME", "USER ROLE",
            "NIC NO", "PASSPORT NO", "E-MAIL", "MOBILE NO",
            "RESIDENT NO", "GENDER", "ADDRESS", "STATUS"}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JComboBox comboUserRole;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelMainTable;
    private javax.swing.JPanel panelSearchButtons;
    private javax.swing.JPanel panelSearchFields;
    private javax.swing.JPanel panelUserMaster;
    private javax.swing.JScrollPane scrollPaneUserMaster;
    private javax.swing.JTable tableUserMaster;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
