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

public class AccountManager extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;

    PreparedStatement pst = null;
    PreparedStatement pstAccountMaster = null;
    PreparedStatement pstAccountMasterParent = null;
    PreparedStatement pstUserMaster = null;

    ResultSet rs = null;
    ResultSet rsAccountMaster = null;
    ResultSet rsAccountMasterParent = null;
    ResultSet rsUserMaster = null;

    int maxLengthAccountName = 150;
    int maxLengthOpeningBalance = 10;
    int maxLengthAccountNumber = 50;
    int maxLengthContactPerson = 50;
    int maxLengthBank = 50;
    int maxLengthPhoneNumber = 50;
    int maxLengthBranch = 50;
    int maxLengthEmail = 50;
    int maxLengthAddress = 250;
    int maxLengthRemarks = 250;

    public AccountManager() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
    }

    public AccountManager(String para) {
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
        panelUserManager = new javax.swing.JPanel();
        panelUserManagerMain = new javax.swing.JPanel();
        tabbedAccountManager = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        panelAccountGeneral = new javax.swing.JPanel();
        lblAccountName = new javax.swing.JLabel();
        txtAccountName = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        lblParent = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox();
        comboParent = new javax.swing.JComboBox();
        lblErrorParent = new javax.swing.JLabel();
        lblErrorAccountName = new javax.swing.JLabel();
        lblErrorCategory = new javax.swing.JLabel();
        lblErrorGroup = new javax.swing.JLabel();
        lblErrorAccountType = new javax.swing.JLabel();
        lblErrorSign = new javax.swing.JLabel();
        lblErrorOpeningBalance = new javax.swing.JLabel();
        rbParent = new javax.swing.JRadioButton();
        rbChild = new javax.swing.JRadioButton();
        lblGroup = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        comboAccountType = new javax.swing.JComboBox();
        lblSign = new javax.swing.JLabel();
        comboSign = new javax.swing.JComboBox();
        lblOpeningBalance = new javax.swing.JLabel();
        txtOpeningBalance = new javax.swing.JTextField();
        panelDetails = new javax.swing.JPanel();
        panelAccountDetailsCustomerSupplier = new javax.swing.JPanel();
        txtContactPerson = new javax.swing.JTextField();
        lblErrorContactPerson = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblErrorPhoneNumber = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        panelAccountDetailsBank = new javax.swing.JPanel();
        txtAccountNumber = new javax.swing.JTextField();
        lblErrorAccountNumber = new javax.swing.JLabel();
        comboBranch = new javax.swing.JComboBox();
        lblErrorBranch = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        comboBank = new javax.swing.JComboBox();
        lblErrorBank = new javax.swing.JLabel();
        txtRemarksBank = new javax.swing.JTextField();
        lblRemarksBank = new javax.swing.JLabel();
        lblErrorRemarksBank = new javax.swing.JLabel();
        panelAccountDetailsCash = new javax.swing.JPanel();
        lblContactPerson = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        panelMainButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUserManager.setBackground(new java.awt.Color(45, 62, 80));
        panelUserManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUserManagerMain.setBackground(new java.awt.Color(45, 62, 80));
        panelUserManagerMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelUserManagerMain.setForeground(new java.awt.Color(255, 255, 255));
        panelUserManagerMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedAccountManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        panelGeneral.setBackground(new java.awt.Color(45, 62, 80));
        panelGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGeneral.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.setToolTipText("");
        panelGeneral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAccountGeneral.setBackground(new java.awt.Color(45, 62, 80));
        panelAccountGeneral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelAccountGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccountName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAccountName.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountName.setText("ACCOUNT NAME");
        panelAccountGeneral.add(lblAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtAccountName.setBackground(new java.awt.Color(110, 122, 136));
        txtAccountName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtAccountName.setForeground(new java.awt.Color(255, 255, 255));
        txtAccountName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccountNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccountNameFocusLost(evt);
            }
        });
        txtAccountName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAccountNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountNameKeyTyped(evt);
            }
        });
        panelAccountGeneral.add(txtAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 660, 30));

        lblCategory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("CATEGORY");
        panelAccountGeneral.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblParent.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblParent.setForeground(new java.awt.Color(255, 255, 255));
        lblParent.setText("PARENT");
        panelAccountGeneral.add(lblParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        comboCategory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Category -", "Asset", "Liability", "Income", "Expenses" }));
        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });
        comboCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboCategoryKeyReleased(evt);
            }
        });
        panelAccountGeneral.add(comboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 30));

        comboParent.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboParent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Parent Name -" }));
        comboParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParentActionPerformed(evt);
            }
        });
        panelAccountGeneral.add(comboParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 230, 30));

        lblErrorParent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorParent.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorParent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorParent.setText("*");
        panelAccountGeneral.add(lblErrorParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, -1));

        lblErrorAccountName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAccountName.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAccountName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAccountName.setText("*");
        panelAccountGeneral.add(lblErrorAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 660, -1));

        lblErrorCategory.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorCategory.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorCategory.setText("*");
        panelAccountGeneral.add(lblErrorCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 230, -1));

        lblErrorGroup.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorGroup.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorGroup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorGroup.setText("*");
        panelAccountGeneral.add(lblErrorGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 230, -1));

        lblErrorAccountType.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAccountType.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAccountType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAccountType.setText("*");
        panelAccountGeneral.add(lblErrorAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 230, -1));

        lblErrorSign.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSign.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSign.setText("*");
        panelAccountGeneral.add(lblErrorSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, -1));

        lblErrorOpeningBalance.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorOpeningBalance.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorOpeningBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorOpeningBalance.setText("*");
        panelAccountGeneral.add(lblErrorOpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 230, -1));

        rbParent.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbParent.setForeground(new java.awt.Color(255, 255, 255));
        rbParent.setSelected(true);
        rbParent.setText("PARENT");
        rbParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParentActionPerformed(evt);
            }
        });
        panelAccountGeneral.add(rbParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        rbChild.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbChild.setForeground(new java.awt.Color(255, 255, 255));
        rbChild.setText("CHILD");
        rbChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChildActionPerformed(evt);
            }
        });
        panelAccountGeneral.add(rbChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        lblGroup.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGroup.setForeground(new java.awt.Color(255, 255, 255));
        lblGroup.setText("GROUP");
        panelAccountGeneral.add(lblGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblAccountType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountType.setText("ACCOUNT TYPE");
        panelAccountGeneral.add(lblAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        comboAccountType.setBackground(new java.awt.Color(110, 122, 136));
        comboAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Account Type -", "Bank", "Cash", "Customer", "Customer Supplier", "Supplier" }));
        comboAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAccountTypeActionPerformed(evt);
            }
        });
        panelAccountGeneral.add(comboAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 230, 30));

        lblSign.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSign.setForeground(new java.awt.Color(255, 255, 255));
        lblSign.setText("SIGN");
        panelAccountGeneral.add(lblSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        comboSign.setBackground(new java.awt.Color(110, 122, 136));
        comboSign.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sign -", "Credit", "Debit" }));
        panelAccountGeneral.add(comboSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 230, 30));

        lblOpeningBalance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblOpeningBalance.setForeground(new java.awt.Color(255, 255, 255));
        lblOpeningBalance.setText("OPENING BALANCE");
        panelAccountGeneral.add(lblOpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        txtOpeningBalance.setBackground(new java.awt.Color(110, 122, 136));
        txtOpeningBalance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtOpeningBalance.setForeground(new java.awt.Color(255, 255, 255));
        txtOpeningBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOpeningBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOpeningBalanceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOpeningBalanceFocusLost(evt);
            }
        });
        txtOpeningBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpeningBalanceKeyTyped(evt);
            }
        });
        panelAccountGeneral.add(txtOpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 230, 30));

        panelGeneral.add(panelAccountGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 815, 300));

        tabbedAccountManager.addTab("GENERAL", panelGeneral);

        panelDetails.setBackground(new java.awt.Color(45, 62, 80));
        panelDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetails.setToolTipText("");
        panelDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAccountDetailsCustomerSupplier.setBackground(new java.awt.Color(45, 62, 80));
        panelAccountDetailsCustomerSupplier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelAccountDetailsCustomerSupplier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContactPerson.setBackground(new java.awt.Color(110, 122, 136));
        txtContactPerson.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtContactPerson.setForeground(new java.awt.Color(255, 255, 255));
        txtContactPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactPersonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactPersonFocusLost(evt);
            }
        });
        txtContactPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactPersonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactPersonKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactPersonKeyTyped(evt);
            }
        });
        panelAccountDetailsCustomerSupplier.add(txtContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, 30));

        lblErrorContactPerson.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorContactPerson.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorContactPerson.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorContactPerson.setText("*");
        panelAccountDetailsCustomerSupplier.add(lblErrorContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 230, -1));

        lblEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("EMAIL");
        panelAccountDetailsCustomerSupplier.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("PHONE NUMBER");
        panelAccountDetailsCustomerSupplier.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        lblErrorPhoneNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorPhoneNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPhoneNumber.setText("*");
        panelAccountDetailsCustomerSupplier.add(lblErrorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 230, -1));

        txtAddress.setBackground(new java.awt.Color(110, 122, 136));
        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        panelAccountDetailsCustomerSupplier.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 230, 30));

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("ADDRESS");
        panelAccountDetailsCustomerSupplier.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lblErrorAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAddress.setText("*");
        panelAccountDetailsCustomerSupplier.add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, -1));

        lblErrorEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorEmail.setText("*");
        panelAccountDetailsCustomerSupplier.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, -1));

        txtEmail.setBackground(new java.awt.Color(110, 122, 136));
        txtEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        panelAccountDetailsCustomerSupplier.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 30));

        txtPhoneNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPhoneNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNumberFocusLost(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });
        panelAccountDetailsCustomerSupplier.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 230, 30));

        panelAccountDetailsBank.setBackground(new java.awt.Color(45, 62, 80));
        panelAccountDetailsBank.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelAccountDetailsBank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAccountNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtAccountNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtAccountNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtAccountNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccountNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccountNumberFocusLost(evt);
            }
        });
        txtAccountNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAccountNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountNumberKeyTyped(evt);
            }
        });
        panelAccountDetailsBank.add(txtAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, 30));

        lblErrorAccountNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAccountNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAccountNumber.setText("*");
        panelAccountDetailsBank.add(lblErrorAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 230, -1));

        comboBranch.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Branch Name -" }));
        comboBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBranchActionPerformed(evt);
            }
        });
        comboBranch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboBranchKeyReleased(evt);
            }
        });
        panelAccountDetailsBank.add(comboBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 30));

        lblErrorBranch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorBranch.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorBranch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorBranch.setText("*");
        panelAccountDetailsBank.add(lblErrorBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, -1));

        lblBranch.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblBranch.setForeground(new java.awt.Color(255, 255, 255));
        lblBranch.setText("BRANCH");
        panelAccountDetailsBank.add(lblBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblBank.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblBank.setForeground(new java.awt.Color(255, 255, 255));
        lblBank.setText("BANK");
        panelAccountDetailsBank.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        comboBank.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboBank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Bank Name -" }));
        comboBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBankActionPerformed(evt);
            }
        });
        panelAccountDetailsBank.add(comboBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 230, 30));

        lblErrorBank.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorBank.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorBank.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorBank.setText("*");
        panelAccountDetailsBank.add(lblErrorBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 230, -1));

        txtRemarksBank.setBackground(new java.awt.Color(110, 122, 136));
        txtRemarksBank.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRemarksBank.setForeground(new java.awt.Color(255, 255, 255));
        txtRemarksBank.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRemarksBankFocusGained(evt);
            }
        });
        txtRemarksBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksBankActionPerformed(evt);
            }
        });
        txtRemarksBank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRemarksBankKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarksBankKeyTyped(evt);
            }
        });
        panelAccountDetailsBank.add(txtRemarksBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 230, 30));

        lblRemarksBank.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRemarksBank.setForeground(new java.awt.Color(255, 255, 255));
        lblRemarksBank.setText("REMARKS");
        panelAccountDetailsBank.add(lblRemarksBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lblErrorRemarksBank.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorRemarksBank.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorRemarksBank.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorRemarksBank.setText("*");
        panelAccountDetailsBank.add(lblErrorRemarksBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, -1));

        panelAccountDetailsCash.setBackground(new java.awt.Color(45, 62, 80));
        panelAccountDetailsCash.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelAccountDetailsCash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContactPerson.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblContactPerson.setForeground(new java.awt.Color(255, 255, 255));
        lblContactPerson.setText("CONTACT PERSON");
        panelAccountDetailsCash.add(lblContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblAccountNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAccountNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountNumber.setText("ACCOUNT NUMBER");
        panelAccountDetailsCash.add(lblAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        panelAccountDetailsBank.add(panelAccountDetailsCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 815, 160));

        panelAccountDetailsCustomerSupplier.add(panelAccountDetailsBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 815, 160));

        panelDetails.add(panelAccountDetailsCustomerSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 815, 160));

        tabbedAccountManager.addTab("DETAILS", panelDetails);

        panelUserManagerMain.add(tabbedAccountManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 350));

        panelUserManager.add(panelUserManagerMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 370));

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

        panelUserManager.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 460, 90));

        getContentPane().add(panelUserManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtAccountName.getText() == null) {
            lblErrorAccountName.setText("'ACCOUNT NAME' can not be blank.");
            txtAccountName.requestFocus();
        } else if (txtAccountName.getText().equals("")) {
            lblErrorAccountName.setText("'ACCOUNT NAME' can not be blank.");
            txtAccountName.requestFocus();
        } else if (verifyIsExistAccountName(txtAccountName.getText()) == true) {
            lblErrorAccountName.setText("'ACCOUNT NAME' is currently used.");
            txtAccountName.requestFocus();
        } else if (comboCategory.getSelectedItem().equals("")) {
            lblErrorCategory.setText("'CATEGORY' should can not be blank.");
            comboCategory.requestFocus();
        } else if ("- Select Category -".equals(comboCategory.getSelectedItem())) {
            lblErrorCategory.setText("'CATEGORY' should be a valid value.");
            comboCategory.requestFocus();
        } else if (comboParent.getSelectedItem().equals("")) {
            lblErrorParent.setText("'PARENT' should can not be blank.");
            comboParent.requestFocus();
        } else if ("- Select Parent -".equals(comboParent.getSelectedItem())) {
            lblErrorParent.setText("'PARENT' should be a valid value.");
            comboParent.requestFocus();
        } else if (comboAccountType.getSelectedItem().equals("")) {
            lblErrorAccountType.setText("'ACCOUNT TYPE' should can not be blank.");
            comboAccountType.requestFocus();
        } else if ("- Select Account Type -".equals(comboAccountType.getSelectedItem())) {
            lblErrorAccountType.setText("'ACCOUNT TYPE' should be a valid value.");
            comboAccountType.requestFocus();
        } else if (comboSign.getSelectedItem().equals("")) {
            lblErrorSign.setText("'SIGN' should can not be blank.");
            comboSign.requestFocus();
        } else if ("- Select Sign -".equals(comboSign.getSelectedItem())) {
            lblErrorSign.setText("'SIGN' should be a valid value.");
            comboSign.requestFocus();
        } else if (txtOpeningBalance.getText() == null) {
            lblErrorOpeningBalance.setText("'OPENING BALANCE' can not be blank.");
            txtOpeningBalance.requestFocus();
        } else if (txtOpeningBalance.getText().equals("")) {
            lblErrorOpeningBalance.setText("'OPENING BALANCE' can not be blank.");
            txtOpeningBalance.requestFocus();
        } else if (verifyIsExistAccountName(txtOpeningBalance.getText()) == true) {
            lblErrorOpeningBalance.setText("'OPENING BALANCE' is currently used.");
            txtOpeningBalance.requestFocus();
        } else if (txtContactPerson.getText() == null) {
            lblErrorContactPerson.setText("'CONTACT PERSON' can not be blank.");
            txtContactPerson.requestFocus();
        } else if (txtContactPerson.getText().equals("")) {
            lblErrorContactPerson.setText("'CONTACT PERSON' can not be blank.");
            txtContactPerson.requestFocus();
        } else if (verifyIsExistAccountName(txtContactPerson.getText()) == true) {
            lblErrorContactPerson.setText("'CONTACT PERSON' is currently used.");
            txtContactPerson.requestFocus();
        } else if (txtPhoneNumber.getText() == null) {
            lblErrorPhoneNumber.setText("'PHONE NUMBER' can not be blank.");
            txtPhoneNumber.requestFocus();
        } else if (txtPhoneNumber.getText().equals("")) {
            lblErrorPhoneNumber.setText("'PHONE NUMBER' can not be blank.");
            txtPhoneNumber.requestFocus();
        } else if (verifyIsExistAccountName(txtPhoneNumber.getText()) == true) {
            lblErrorPhoneNumber.setText("'PHONE NUMBER' is currently used.");
            txtPhoneNumber.requestFocus();
        } else if (txtEmail.getText() == null) {
            lblErrorEmail.setText("'EMAIL' can not be blank.");
            txtEmail.requestFocus();
        } else if (txtEmail.getText().equals("")) {
            lblErrorEmail.setText("'EMAIL' can not be blank.");
            txtEmail.requestFocus();
        } else if (verifyIsExistAccountName(txtEmail.getText()) == true) {
            lblErrorEmail.setText("'EMAIL' is currently used.");
            txtEmail.requestFocus();
        } else if (txtAddress.getText() == null) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
            txtAddress.requestFocus();
        } else if (txtAddress.getText().equals("")) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
            txtAddress.requestFocus();
        } else if (verifyIsExistAccountName(txtAddress.getText()) == true) {
            lblErrorAddress.setText("'ADDRESS' is currently used.");
            txtAddress.requestFocus();
        } else if (txtAccountNumber.getText() == null) {
            lblErrorAccountNumber.setText("'ACCOUNT NUMBER' can not be blank.");
            txtAccountNumber.requestFocus();
        } else if (txtAccountNumber.getText().equals("")) {
            lblErrorAccountNumber.setText("'ACCOUNT NUMBER' can not be blank.");
            txtAccountNumber.requestFocus();
        } else if (verifyIsExistAccountName(txtAccountNumber.getText()) == true) {
            lblErrorAccountNumber.setText("'ACCOUNT NUMBER' is currently used.");
            txtAccountNumber.requestFocus();
        } else if (comboBank.getSelectedItem().equals("")) {
            lblErrorBank.setText("'BANK' should can not be blank.");
            comboBank.requestFocus();
        } else if ("- Select Bank -".equals(comboBank.getSelectedItem())) {
            lblErrorBank.setText("'BANK' should be a valid value.");
            comboBank.requestFocus();
        } else if (comboBranch.getSelectedItem().equals("")) {
            lblErrorBranch.setText("'BRANCH' should can not be blank.");
            comboBranch.requestFocus();
        } else if ("- Select Branch -".equals(comboBranch.getSelectedItem())) {
            lblErrorBranch.setText("'BRANCH' should be a valid value.");
            comboBranch.requestFocus();
        } else if (txtRemarksBank.getText() == null) {
            lblErrorRemarksBank.setText("'REMARKS' can not be blank.");
            txtRemarksBank.requestFocus();
        } else if (txtRemarksBank.getText().equals("")) {
            lblErrorRemarksBank.setText("'REMARKS' can not be blank.");
            txtRemarksBank.requestFocus();
        } else if (verifyIsExistAccountName(txtRemarksBank.getText()) == true) {
            lblErrorRemarksBank.setText("'REMARKS' is currently used.");
            txtRemarksBank.requestFocus();
        } else {
            dataUpdate();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusLost
    }//GEN-LAST:event_btnSaveFocusLost

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAccountNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNameKeyReleased
        int len = txtAccountName.getText().length();

        if (len == 0) {
            lblErrorAccountName.setText("'ACCOUNT NAME' can not be blank.");
        } else {
            lblErrorAccountName.setText("");
        }
    }//GEN-LAST:event_txtAccountNameKeyReleased

    private void txtAccountNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNameKeyTyped
        int len = txtAccountName.getText().length();

        if (len >= 200) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAccountNameKeyTyped

    private void txtAccountNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNameKeyPressed
    }//GEN-LAST:event_txtAccountNameKeyPressed

    private void comboCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoryKeyReleased
    }//GEN-LAST:event_comboCategoryKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        int len = txtAddress.getText().length();

        if (len == 0) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
        } else {
            lblErrorAddress.setText("");
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed
        if ("- Select Category -".equals(comboCategory.getSelectedItem())) {
            lblErrorCategory.setText("'CATEGORY' should be a valid value.");
        } else {
            lblErrorCategory.setText("");
        }
    }//GEN-LAST:event_comboCategoryActionPerformed

    private void comboParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParentActionPerformed
        if ("- Select Parent -".equals(comboParent.getSelectedItem())) {
            lblErrorParent.setText("'PARENT' should be a valid value.");
        } else {
            lblErrorParent.setText("");
        }
    }//GEN-LAST:event_comboParentActionPerformed

    private void txtAccountNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountNameFocusGained
        txtAccountName.selectAll();
    }//GEN-LAST:event_txtAccountNameFocusGained

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        txtAddress.selectAll();
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        int len = txtAddress.getText().length();

        if (len >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtAccountNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountNameFocusLost
        if (verifyIsExistAccountName(txtAccountName.getText()) == true) {
            lblErrorAccountName.setText("'ACCOUNT NAME' is currently used.");
        }
    }//GEN-LAST:event_txtAccountNameFocusLost

    private void rbParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParentActionPerformed
    }//GEN-LAST:event_rbParentActionPerformed

    private void rbChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChildActionPerformed
    }//GEN-LAST:event_rbChildActionPerformed

    private void comboAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAccountTypeActionPerformed
    }//GEN-LAST:event_comboAccountTypeActionPerformed

    private void txtOpeningBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeningBalanceFocusGained
        if (String.valueOf(comFunc.convertCurrency(0)).equals(txtOpeningBalance.getText())) {
            txtOpeningBalance.setText("");
        }
    }//GEN-LAST:event_txtOpeningBalanceFocusGained

    private void txtOpeningBalanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeningBalanceFocusLost
        if (txtOpeningBalance.getText().equals("")) {
            txtOpeningBalance.setText(String.valueOf(comFunc.convertCurrency(0)));
        } else if (txtOpeningBalance.getText().equals("0")) {
            txtOpeningBalance.setText(String.valueOf(comFunc.convertCurrency(0)));
        }
    }//GEN-LAST:event_txtOpeningBalanceFocusLost

    private void txtOpeningBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpeningBalanceKeyTyped
        if (txtOpeningBalance.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtOpeningBalanceKeyTyped

    private void txtContactPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactPersonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPersonFocusGained

    private void txtContactPersonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactPersonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPersonFocusLost

    private void txtContactPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactPersonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPersonKeyPressed

    private void txtContactPersonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactPersonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPersonKeyReleased

    private void txtContactPersonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactPersonKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPersonKeyTyped

    private void txtAccountNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountNumberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberFocusGained

    private void txtAccountNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountNumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberFocusLost

    private void txtAccountNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberKeyPressed

    private void txtAccountNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNumberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberKeyReleased

    private void txtAccountNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNumberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberKeyTyped

    private void comboBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBranchActionPerformed

    private void comboBranchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBranchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBranchKeyReleased

    private void comboBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBankActionPerformed

    private void txtRemarksBankFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRemarksBankFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksBankFocusGained

    private void txtRemarksBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksBankActionPerformed

    private void txtRemarksBankKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksBankKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksBankKeyReleased

    private void txtRemarksBankKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksBankKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksBankKeyTyped

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberFocusGained

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void txtPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberKeyPressed

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void clearField() {
        txtAccountName.setText(null);
        comboCategory.setSelectedIndex(0);
        comboParent.setSelectedIndex(0);
        comboAccountType.setSelectedIndex(0);
        comboSign.setSelectedIndex(0);
        txtOpeningBalance.setText("0");

        txtContactPerson.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        txtAddress.setText(null);

        comboBank.setSelectedIndex(0);
        txtAccountNumber.setText("");
        comboBranch.setSelectedIndex(0);
        txtRemarksBank.setText("");

        txtAccountName.requestFocus();
    }

    private void clearErrorLable() {
        lblErrorAccountName.setText("");
        lblErrorCategory.setText("");
        lblErrorParent.setText("");
        lblErrorGroup.setText("");
        lblErrorAccountType.setText("");
        lblErrorSign.setText("");
        lblErrorOpeningBalance.setText("");
        lblErrorContactPerson.setText("");
        lblErrorPhoneNumber.setText("");
        lblErrorEmail.setText("");
        lblErrorAddress.setText("");
        lblErrorBank.setText("");
        lblErrorAccountNumber.setText("");
        lblErrorBranch.setText("");
        lblErrorRemarksBank.setText("");
    }

    private void formFormat() {
        setScreenSize();
        clearField();
        showParent();
        clearErrorLable();

        rbParent.setSelected(true);
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void showParent() {
        try {
            String sSql = "SELECT am_acc_name FROM account_master WHERE am_acc_parent_name = 'PARENT'";

            pstAccountMaster = conn.prepareStatement(sSql);
            rsAccountMaster = pstAccountMaster.executeQuery();

            comboParent.removeAllItems();

            comboParent.addItem("- Select Account -");

            while (rsAccountMaster.next()) {
                comboParent.addItem(rsAccountMaster.getString("am_acc_name"));
            }

            rsAccountMaster.close();
            pstAccountMaster.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void dataRetrieval() {
        try {
            String sSql = "SELECT * FROM account_master WHERE am_acc_name = '"
                    + comFunc.sCurrentButtonAction + "'";

            pst = conn.prepareStatement(sSql);

            rs = pst.executeQuery();

            while (rs.next()) {
                txtAccountName.setText(rs.getString("am_acc_name"));
                comboCategory.setSelectedItem(rs.getString("am_acc_category"));
                comboParent.setSelectedItem(rs.getString("am_acc_parent_name"));

                if (rs.getString("am_acc_group").equals("PARENT")) {
                    rbParent.setSelected(true);
                } else if (rs.getString("am_acc_group").equals("CHILD")) {
                    rbChild.setSelected(true);
                }

                comboAccountType.setSelectedItem(rs.getString("am_acc_type"));
                comboSign.setSelectedItem(rs.getString("am_acc_sign"));

                txtOpeningBalance.setText(rs.getString("am_acc_opening_balance"));

                txtContactPerson.setText(rs.getString("am_acc_contact_person"));
                txtPhoneNumber.setText(rs.getString("am_acc_phone_number"));
                txtEmail.setText(rs.getString("am_acc_email"));
                txtAddress.setText(rs.getString("am_acc_address"));

                comboBank.setSelectedItem(rs.getString("am_acc_bank"));
                txtAccountNumber.setText(rs.getString("am_acc_number"));
                comboBranch.setSelectedItem(rs.getString("am_acc_branch"));
                txtRemarksBank.setText(rs.getString("am_acc_remarks"));
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
        String sGroup = "";
        int maxAccountID = 0;
        String accountParent = "";

        try {
            conn = MySqlConnection.ConnectDB();

            String sSql_AccountMaster = "SELECT MAX(am_acc_id) AS 'MaxID' FROM account_master";

            pstAccountMaster = conn.prepareStatement(sSql_AccountMaster);
            rsAccountMaster = pstAccountMaster.executeQuery();

            if (rsAccountMaster.next()) {
                maxAccountID = rsAccountMaster.getInt("MaxID") + 1;
            }

            rsAccountMaster.close();
            pstAccountMaster.close();

            String sSql_AccountMasterParent = "SELECT am_acc_name FROM account_master WHERE am_acc_group = 'PARENT'";

            pstAccountMasterParent = conn.prepareStatement(sSql_AccountMasterParent);
            rsAccountMasterParent = pstAccountMasterParent.executeQuery();

            if (rsAccountMasterParent.next()) {
                accountParent = rsAccountMasterParent.getString("am_acc_name");
            }

            rsAccountMasterParent.close();
            pstAccountMasterParent.close();;

            String sAccountName = txtAccountName.getText().trim();
            String sCategory = comboCategory.getSelectedItem().toString();
            String sParent = comboParent.getSelectedItem().toString();

            if (rbParent.isSelected()) {
                sGroup = "PARENT";
            } else if (rbChild.isSelected()) {
                sGroup = "CHILD";
            }

            String sAccountType = comboAccountType.getSelectedItem().toString();
            String sSign = comboSign.getSelectedItem().toString();
            double dOpeningBalance = Double.valueOf(comFunc.convertCurrency(
                    Double.valueOf(comboSign.getSelectedItem().toString())));
            String sContactPerson = txtContactPerson.getText().trim();
            String sPhoneNumber = txtPhoneNumber.getText().trim();
            String sAccountNumber = txtAccountNumber.getText().trim();
            String sBank = comboBank.getSelectedItem().toString();
            String sBranch = comboBranch.getSelectedItem().toString();
            String sEmail = txtEmail.getText().trim();
            String sAddress = txtAddress.getText().trim();
            String sRemarksBank = txtRemarksBank.getText().trim();

            String sSql = "INSERT INTO account_master ("
                    + "am_acc_id, "
                    + "am_acc_name, "
                    + "am_acc_category, "
                    + "am_acc_parent_name, "
                    + "am_acc_group, "
                    + "am_acc_type, "
                    + "am_acc_sign, "
                    + "am_acc_opening_balance, "
                    + "am_acc_number, "
                    + "am_acc_bank, "
                    + "am_acc_branch, "
                    + "am_acc_contact_person, "
                    + "am_acc_phone_number, "
                    + "am_acc_email, "
                    + "am_acc_address, "
                    + "am_acc_remarks, "
                    + ")"
                    + " VALUES ("
                    + maxAccountID + ", '"
                    + sAccountName + ", '"
                    + sCategory + ", '"
                    + sParent + ", '"
                    + sGroup + ", '"
                    + sAccountType + ", '"
                    + sSign + ", '"
                    + dOpeningBalance + ", '"
                    + sAccountNumber + ", '"
                    + sBank + ", '"
                    + sBranch + ", '"
                    + sContactPerson + ", '"
                    + sPhoneNumber + ", '"
                    + sEmail + ", '"
                    + sAddress + ", '"
                    + sRemarksBank
                    + ")";

            pst = conn.prepareStatement(sSql);

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "RECORD SAVED.");

            clearField();
            showParent();
            clearErrorLable();

            rbParent.setSelected(true);
            tabbedAccountManager.setSelectedIndex(0);
            txtAccountName.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    private boolean verifyIsExistAccountName(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT am_acc_name FROM account_master "
                    + "WHERE am_acc_name = '"
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
    private javax.swing.JComboBox comboAccountType;
    private javax.swing.JComboBox comboBank;
    private javax.swing.JComboBox comboBranch;
    private javax.swing.JComboBox comboCategory;
    private javax.swing.JComboBox comboParent;
    private javax.swing.JComboBox comboSign;
    private javax.swing.JLabel lblAccountName;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblContactPerson;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorAccountName;
    private javax.swing.JLabel lblErrorAccountNumber;
    private javax.swing.JLabel lblErrorAccountType;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorBank;
    private javax.swing.JLabel lblErrorBranch;
    private javax.swing.JLabel lblErrorCategory;
    private javax.swing.JLabel lblErrorContactPerson;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorGroup;
    private javax.swing.JLabel lblErrorOpeningBalance;
    private javax.swing.JLabel lblErrorParent;
    private javax.swing.JLabel lblErrorPhoneNumber;
    private javax.swing.JLabel lblErrorRemarksBank;
    private javax.swing.JLabel lblErrorSign;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblOpeningBalance;
    private javax.swing.JLabel lblParent;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRemarksBank;
    private javax.swing.JLabel lblSign;
    private javax.swing.JPanel panelAccountDetailsBank;
    private javax.swing.JPanel panelAccountDetailsCash;
    private javax.swing.JPanel panelAccountDetailsCustomerSupplier;
    private javax.swing.JPanel panelAccountGeneral;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelUserManager;
    private javax.swing.JPanel panelUserManagerMain;
    private javax.swing.JRadioButton rbChild;
    private javax.swing.JRadioButton rbParent;
    private javax.swing.JTabbedPane tabbedAccountManager;
    private javax.swing.JTextField txtAccountName;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactPerson;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtOpeningBalance;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRemarksBank;
    // End of variables declaration//GEN-END:variables
}
