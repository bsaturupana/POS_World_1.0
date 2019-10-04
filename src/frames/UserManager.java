package frames;

import connection.MySqlConnection;
import forms.MDIMain;
import util.CommonFunctions;
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static util.CommonFunctions.validateEmail;

public class UserManager extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;

    PreparedStatement pst = null;
    PreparedStatement pstCityMaster = null;
    PreparedStatement pstUserMaster = null;
    PreparedStatement pstRoleMaster = null;
    PreparedStatement pstQuestionMaster1 = null;
    PreparedStatement pstQuestionMaster2 = null;

    ResultSet rs = null;
    ResultSet rsCityMaster = null;
    ResultSet rsUserMaster = null;
    ResultSet rsRoleMaster = null;
    ResultSet rsQuestionMaster1 = null;
    ResultSet rsQuestionMaster2 = null;

    int maxLengthFullName = 250;
    int maxLengthEmployeeID = 10;
    int maxLengthEmail = 50;
    int maxLengthNICNumber = 15;
    int maxLengthPassportNumber = 15;
    int maxLengthMobileNumber = 10;
    int maxLengthResidentNumber = 10;
    int maxLengthUsername = 50;
    int maxLengthPassword = 50;
    int maxLengthAddress = 250;
    int maxLengthSecurityAnswer1 = 250;
    int maxLengthSecurityAnswer2 = 250;

    String sImagePath = null;
    private Blob image;
    private File file;
    private BufferedImage img;

    public UserManager() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
    }

    public UserManager(String para) {
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
        tabbedUserManager = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNICNumber = new javax.swing.JLabel();
        txtNICNumber = new javax.swing.JTextField();
        lblPassportNumber = new javax.swing.JLabel();
        txtPassportNumber = new javax.swing.JTextField();
        lblMobileNumber = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        lblResidentNumber = new javax.swing.JLabel();
        txtResidentNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        lblNationality = new javax.swing.JLabel();
        comboNationality = new javax.swing.JComboBox();
        lblRace = new javax.swing.JLabel();
        comboRace = new javax.swing.JComboBox();
        lblReligion = new javax.swing.JLabel();
        comboReligion = new javax.swing.JComboBox();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorFullName = new javax.swing.JLabel();
        lblErrorEmployeeID = new javax.swing.JLabel();
        lblErrorNICNumber = new javax.swing.JLabel();
        lblErrorPassportNumber = new javax.swing.JLabel();
        lblErrorMobileNumber = new javax.swing.JLabel();
        lblErrorResidentNumber = new javax.swing.JLabel();
        lblErrorGender = new javax.swing.JLabel();
        lblErrorNationality = new javax.swing.JLabel();
        lblErrorRace = new javax.swing.JLabel();
        lblErrorReligion = new javax.swing.JLabel();
        panelDetails = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblSecurityQuestion1 = new javax.swing.JLabel();
        comboSecurityQuestion1 = new javax.swing.JComboBox();
        lblSecurityAnswer1 = new javax.swing.JLabel();
        txtSecurityAnswer1 = new javax.swing.JTextField();
        lblSecurityQuestion2 = new javax.swing.JLabel();
        comboSecurityQuestion2 = new javax.swing.JComboBox();
        lblSecurityAnswer2 = new javax.swing.JLabel();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        scrollPaneAddress = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorConfirmPassword = new javax.swing.JLabel();
        lblErrorSecurityQuestion1 = new javax.swing.JLabel();
        lblErrorSecurityAnswer1 = new javax.swing.JLabel();
        lblErrorSecurityQuestion2 = new javax.swing.JLabel();
        lblErrorSecurityAnswer2 = new javax.swing.JLabel();
        panelOther = new javax.swing.JPanel();
        panelSearchButtons = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDivision = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        comboLocation = new javax.swing.JComboBox();
        comboDivision = new javax.swing.JComboBox();
        comboDesignation = new javax.swing.JComboBox();
        lblUserRole = new javax.swing.JLabel();
        comboUserRole = new javax.swing.JComboBox();
        lblErrorUserRole = new javax.swing.JLabel();
        lblErrorCity = new javax.swing.JLabel();
        lblErrorLocation = new javax.swing.JLabel();
        lblErrorDivision = new javax.swing.JLabel();
        lblErrorDesignation = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        rdbStatusActive = new javax.swing.JRadioButton();
        rdbStatusInactive = new javax.swing.JRadioButton();
        panelUserImage = new javax.swing.JPanel();
        lblUserImageHedding = new javax.swing.JLabel();
        lblUserImage = new javax.swing.JLabel();
        btnBrows = new javax.swing.JButton();
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

        tabbedUserManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        panelGeneral.setBackground(new java.awt.Color(45, 62, 80));
        panelGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGeneral.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.setToolTipText("");
        panelGeneral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFullName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("FULL NAME");
        panelGeneral.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtFullName.setBackground(new java.awt.Color(110, 122, 136));
        txtFullName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFullNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFullNameKeyTyped(evt);
            }
        });
        panelGeneral.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 680, 30));

        lblEmployeeID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("EMPLOYEE ID");
        panelGeneral.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(110, 122, 136));
        txtEmployeeID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        txtEmployeeID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmployeeIDFocusLost(evt);
            }
        });
        txtEmployeeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmployeeIDKeyTyped(evt);
            }
        });
        panelGeneral.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 30));

        lblEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E - MAIL ");
        panelGeneral.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 95, -1, -1));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        panelGeneral.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 250, 30));

        lblNICNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblNICNumber.setText("NIC NUMBER");
        panelGeneral.add(lblNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, -1, -1));

        txtNICNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtNICNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtNICNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNICNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNICNumberFocusLost(evt);
            }
        });
        txtNICNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNICNumberKeyTyped(evt);
            }
        });
        panelGeneral.add(txtNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, 30));

        lblPassportNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPassportNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPassportNumber.setText("PASSPORT NO");
        panelGeneral.add(lblPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, -1, -1));

        txtPassportNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPassportNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtPassportNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPassportNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassportNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassportNumberFocusLost(evt);
            }
        });
        txtPassportNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassportNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassportNumberKeyTyped(evt);
            }
        });
        panelGeneral.add(txtPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 250, 30));

        lblMobileNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblMobileNumber.setText("MOBILE NO");
        panelGeneral.add(lblMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, -1, -1));

        txtMobileNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtMobileNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtMobileNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMobileNumberFocusGained(evt);
            }
        });
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyTyped(evt);
            }
        });
        panelGeneral.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, 30));

        lblResidentNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblResidentNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentNumber.setText("RESIDENT NO ");
        panelGeneral.add(lblResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, -1, -1));

        txtResidentNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtResidentNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtResidentNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtResidentNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtResidentNumberFocusGained(evt);
            }
        });
        txtResidentNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResidentNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResidentNumberKeyTyped(evt);
            }
        });
        panelGeneral.add(txtResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 250, 30));

        lblGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("GENDER");
        panelGeneral.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 305, -1, -1));

        comboGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        comboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGenderActionPerformed(evt);
            }
        });
        comboGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboGenderKeyReleased(evt);
            }
        });
        panelGeneral.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 250, 30));

        lblNationality.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNationality.setForeground(new java.awt.Color(255, 255, 255));
        lblNationality.setText("NATIONALITY");
        panelGeneral.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 305, -1, -1));

        comboNationality.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Nationality -", "Sri Lanken", "Other" }));
        comboNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNationalityActionPerformed(evt);
            }
        });
        panelGeneral.add(comboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 250, 30));

        lblRace.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRace.setForeground(new java.awt.Color(255, 255, 255));
        lblRace.setText("RACE");
        panelGeneral.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, -1, -1));

        comboRace.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboRace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Race -", "Sinhala", "Tamil", "Muslim", "Burgher", "Other" }));
        comboRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRaceActionPerformed(evt);
            }
        });
        panelGeneral.add(comboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 250, 30));

        lblReligion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblReligion.setForeground(new java.awt.Color(255, 255, 255));
        lblReligion.setText("RELIGION");
        panelGeneral.add(lblReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 375, -1, -1));

        comboReligion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Religion -", "Buddhism", "Christianity", "Hinduism", "Islam", "Other" }));
        comboReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReligionActionPerformed(evt);
            }
        });
        panelGeneral.add(comboReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 250, 30));

        lblErrorEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorEmail.setText("*");
        panelGeneral.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 250, -1));

        lblErrorFullName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorFullName.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorFullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorFullName.setText("*");
        panelGeneral.add(lblErrorFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 670, -1));

        lblErrorEmployeeID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorEmployeeID.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorEmployeeID.setText("*");
        panelGeneral.add(lblErrorEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 250, -1));

        lblErrorNICNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorNICNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorNICNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorNICNumber.setText("*");
        panelGeneral.add(lblErrorNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));

        lblErrorPassportNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorPassportNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorPassportNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPassportNumber.setText("*");
        panelGeneral.add(lblErrorPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 250, -1));

        lblErrorMobileNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorMobileNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorMobileNumber.setText("*");
        panelGeneral.add(lblErrorMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 250, -1));

        lblErrorResidentNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorResidentNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorResidentNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorResidentNumber.setText("*");
        panelGeneral.add(lblErrorResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 250, -1));

        lblErrorGender.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorGender.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorGender.setText("*");
        panelGeneral.add(lblErrorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 250, -1));

        lblErrorNationality.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorNationality.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorNationality.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorNationality.setText("*");
        panelGeneral.add(lblErrorNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 250, -1));

        lblErrorRace.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorRace.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorRace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorRace.setText("*");
        panelGeneral.add(lblErrorRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 250, -1));

        lblErrorReligion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorReligion.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorReligion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorReligion.setText("*");
        panelGeneral.add(lblErrorReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 250, -1));

        tabbedUserManager.addTab("GENERAL", panelGeneral);

        panelDetails.setBackground(new java.awt.Color(45, 62, 80));
        panelDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetails.setToolTipText("");
        panelDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");
        panelDetails.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtUsername.setBackground(new java.awt.Color(110, 122, 136));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        panelDetails.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 30));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");
        panelDetails.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        panelDetails.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusLost(evt);
            }
        });
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyTyped(evt);
            }
        });
        panelDetails.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 30));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        panelDetails.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion1.setText("SECURITY QUESTION - 1");
        panelDetails.add(lblSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        comboSecurityQuestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 1 -" }));
        comboSecurityQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecurityQuestion1ActionPerformed(evt);
            }
        });
        panelDetails.add(comboSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 610, 30));

        lblSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer1.setText("SECURITY ANSWER - 1");
        panelDetails.add(lblSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtSecurityAnswer1.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSecurityAnswer1FocusGained(evt);
            }
        });
        txtSecurityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer1ActionPerformed(evt);
            }
        });
        txtSecurityAnswer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer1KeyTyped(evt);
            }
        });
        panelDetails.add(txtSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 610, 30));

        lblSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion2.setText("SECURITY QUESTION - 2");
        panelDetails.add(lblSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        comboSecurityQuestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 2 -" }));
        comboSecurityQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecurityQuestion2ActionPerformed(evt);
            }
        });
        panelDetails.add(comboSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 610, 30));

        lblSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer2.setText("SECURITY ANSWER - 2");
        panelDetails.add(lblSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtSecurityAnswer2.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSecurityAnswer2FocusGained(evt);
            }
        });
        txtSecurityAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer2ActionPerformed(evt);
            }
        });
        txtSecurityAnswer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer2KeyTyped(evt);
            }
        });
        panelDetails.add(txtSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 610, 30));

        lblAddress.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("ADDRESS");
        panelDetails.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 25, -1, -1));

        txtAddress.setBackground(new java.awt.Color(110, 122, 136));
        txtAddress.setColumns(20);
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setRows(5);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
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
        scrollPaneAddress.setViewportView(txtAddress);

        panelDetails.add(scrollPaneAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 220, 150));

        lblErrorUsername.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorUsername.setText("*");
        panelDetails.add(lblErrorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 55, 220, -1));

        lblErrorPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPassword.setText("*");
        panelDetails.add(lblErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 115, 220, -1));

        lblErrorAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAddress.setText("*");
        panelDetails.add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 175, 220, -1));

        lblErrorConfirmPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorConfirmPassword.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorConfirmPassword.setText("*");
        panelDetails.add(lblErrorConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 220, -1));

        lblErrorSecurityQuestion1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityQuestion1.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityQuestion1.setText("*");
        panelDetails.add(lblErrorSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, 610, -1));

        lblErrorSecurityAnswer1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityAnswer1.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityAnswer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityAnswer1.setText("*");
        panelDetails.add(lblErrorSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 295, 610, -1));

        lblErrorSecurityQuestion2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityQuestion2.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityQuestion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityQuestion2.setText("*");
        panelDetails.add(lblErrorSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 355, 610, -1));

        lblErrorSecurityAnswer2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityAnswer2.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityAnswer2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityAnswer2.setText("*");
        panelDetails.add(lblErrorSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 415, 610, -1));

        tabbedUserManager.addTab("DETAILS", panelDetails);

        panelOther.setBackground(new java.awt.Color(45, 62, 80));
        panelOther.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOther.setToolTipText("");

        panelSearchButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("CITY");
        panelSearchButtons.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        lblLocation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("LOCATION");
        panelSearchButtons.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        lblDivision.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDivision.setForeground(new java.awt.Color(255, 255, 255));
        lblDivision.setText("DIVISION");
        panelSearchButtons.add(lblDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, -1, -1));

        lblDesignation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDesignation.setForeground(new java.awt.Color(255, 255, 255));
        lblDesignation.setText("DESIGNATION");
        panelSearchButtons.add(lblDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        comboCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select City -" }));
        comboCity.setToolTipText("");
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });
        panelSearchButtons.add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 420, 30));

        comboLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Location -", "Colombo", "Kandy" }));
        comboLocation.setToolTipText("");
        comboLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocationActionPerformed(evt);
            }
        });
        panelSearchButtons.add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 420, 30));

        comboDivision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Division -", "Billing", "Showroom", "Stores", "Accounts", "Management" }));
        comboDivision.setToolTipText("");
        comboDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisionActionPerformed(evt);
            }
        });
        panelSearchButtons.add(comboDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 420, 30));

        comboDesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Designation -", "Cashier", "Billing Officer", "Salesman", "Showroom Manager", "Accounts Assistant", "Accountant", "Storekeeper", "Purchase Manager", "Store Assistant" }));
        comboDesignation.setToolTipText("");
        comboDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDesignationActionPerformed(evt);
            }
        });
        panelSearchButtons.add(comboDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 420, 30));

        lblUserRole.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblUserRole.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRole.setText("USER ROLE");
        panelSearchButtons.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 265, -1, -1));

        comboUserRole.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        comboUserRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserRoleActionPerformed(evt);
            }
        });
        panelSearchButtons.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 420, 30));

        lblErrorUserRole.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorUserRole.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorUserRole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorUserRole.setText("*");
        panelSearchButtons.add(lblErrorUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 295, 420, -1));

        lblErrorCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorCity.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorCity.setText("*");
        panelSearchButtons.add(lblErrorCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 55, 420, -1));

        lblErrorLocation.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorLocation.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorLocation.setText("*");
        panelSearchButtons.add(lblErrorLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 115, 420, -1));

        lblErrorDivision.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorDivision.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorDivision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorDivision.setText("*");
        panelSearchButtons.add(lblErrorDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 175, 420, -1));

        lblErrorDesignation.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorDesignation.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorDesignation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorDesignation.setText("*");
        panelSearchButtons.add(lblErrorDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 235, 420, -1));

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS");
        panelSearchButtons.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        buttonGroupStatus.add(rdbStatusActive);
        rdbStatusActive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbStatusActive.setForeground(new java.awt.Color(255, 255, 255));
        rdbStatusActive.setText("ACTIVE");
        rdbStatusActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbStatusActiveActionPerformed(evt);
            }
        });
        panelSearchButtons.add(rdbStatusActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 30));

        buttonGroupStatus.add(rdbStatusInactive);
        rdbStatusInactive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbStatusInactive.setForeground(new java.awt.Color(255, 255, 255));
        rdbStatusInactive.setText("INACTIVE");
        panelSearchButtons.add(rdbStatusInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 30));

        panelUserImage.setBackground(new java.awt.Color(45, 62, 80));
        panelUserImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelUserImage.setForeground(new java.awt.Color(255, 255, 255));
        panelUserImage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserImageHedding.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUserImageHedding.setForeground(new java.awt.Color(255, 255, 255));
        lblUserImageHedding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserImageHedding.setText("USER IMAGE");
        panelUserImage.add(lblUserImageHedding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 35));

        lblUserImage.setBackground(new java.awt.Color(110, 122, 136));
        lblUserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblUserImage.setOpaque(true);
        panelUserImage.add(lblUserImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 260));

        btnBrows.setBackground(new java.awt.Color(53, 189, 252));
        btnBrows.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBrows.setText("BROWS");
        btnBrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsActionPerformed(evt);
            }
        });
        panelUserImage.add(btnBrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, -1));

        javax.swing.GroupLayout panelOtherLayout = new javax.swing.GroupLayout(panelOther);
        panelOther.setLayout(panelOtherLayout);
        panelOtherLayout.setHorizontalGroup(
            panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearchButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOtherLayout.setVerticalGroup(
            panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSearchButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tabbedUserManager.addTab("OTHER", panelOther);

        panelUserManagerMain.add(tabbedUserManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 470));

        panelUserManager.add(panelUserManagerMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 490));

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

        panelUserManager.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 460, 90));

        getContentPane().add(panelUserManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtFullName.getText() == null) {
            lblErrorFullName.setText("'FULL NAME' can not be blank.");
            txtFullName.requestFocus();
        } else if (txtFullName.getText().equals("")) {
            lblErrorFullName.setText("'FULL NAME' can not be blank.");
            txtFullName.requestFocus();
        } else if (verifyIsExistFullname(txtFullName.getText()) == true) {
            lblErrorFullName.setText("'FULLNAME' is currently used.");
            txtFullName.requestFocus();
        } else if (txtEmployeeID.getText() == null) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' can not be blank.");
            txtEmployeeID.requestFocus();
        } else if (txtEmployeeID.getText().equals("")) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' can not be blank.");
            txtEmployeeID.requestFocus();
//        } else if (comFunc.validateAlphanumericNumeric(txtEmployeeID.getText()) == false) {
//            lblErrorEmail.setText("'EMPLOYEE ID' is not in a correct format.");
        } else if (verifyIsExistEmployeeID(txtEmployeeID.getText()) == true) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' is currently used.");
            txtEmployeeID.requestFocus();
        } else if (txtEmail.getText() == null) {
            lblErrorEmail.setText("'E-MAIL' can not be blank.");
            txtEmail.requestFocus();
        } else if (txtEmail.getText().equals("")) {
            lblErrorEmail.setText("'E-MAIL' can not be blank.");
            txtEmail.requestFocus();
        } else if (validateEmail(txtEmail.getText()) == false) {
            lblErrorEmail.setText("'E-MAIL' is not in a correct format.");
            txtEmail.requestFocus();
        } else if (txtNICNumber.getText() == null) {
            lblErrorNICNumber.setText("'NIC Number' can not be blank.");
            txtNICNumber.requestFocus();
        } else if (txtNICNumber.getText().equals("")) {
            lblErrorNICNumber.setText("'NIC Number' can not be blank.");
            txtNICNumber.requestFocus();
//        } else if (comFunc.validateAlphanumericNumeric(txtNICNumber.getText()) == false) {
//            lblErrorNICNumber.setText("'NIC NUMBER' is not in a correct format.");
        } else if (txtPassportNumber.getText() == null) {
            lblErrorPassportNumber.setText("'PASSPORT Number' can not be blank");
            txtPassportNumber.requestFocus();
        } else if (txtPassportNumber.getText().equals("")) {
            lblErrorPassportNumber.setText("'PASSPORT Number' can not be blank");
            txtPassportNumber.requestFocus();
//        } else if (comFunc.validateAlphanumericNumeric(txtPassportNumber.getText()) == false) {
//            lblErrorPassportNumber.setText("'PASSPORT NUMBER' is not in a correct format.");
        } else if (txtMobileNumber.getText() == null) {
            lblErrorMobileNumber.setText("'MOBILE Number' can not be blank.");
            txtMobileNumber.requestFocus();
        } else if (txtMobileNumber.getText().equals("")) {
            lblErrorMobileNumber.setText("'MOBILE Number' can not be blank.");
            txtMobileNumber.requestFocus();
        } else if (txtResidentNumber.getText() == null) {
            lblErrorResidentNumber.setText("'RESIDENT Number' can not be blank.");
            txtResidentNumber.requestFocus();
        } else if (txtResidentNumber.getText().equals("")) {
            lblErrorResidentNumber.setText("'RESIDENT Number' can not be blank.");
            txtResidentNumber.requestFocus();
        } else if (comboGender.getSelectedItem().equals("")) {
            lblErrorGender.setText("'GENDER' should can not be blank.");
            comboGender.requestFocus();
        } else if ("- Select Gender -".equals(comboGender.getSelectedItem())) {
            lblErrorGender.setText("'GENDER' should be a valid value.");
            comboGender.requestFocus();
        } else if (comboNationality.getSelectedItem().equals("")) {
            lblErrorNationality.setText("'NATIONALITY' should can not be blank.");
            comboNationality.requestFocus();
        } else if ("- Select Nationality -".equals(comboNationality.getSelectedItem())) {
            lblErrorNationality.setText("'NATIONALITY' should be a valid value.");
            comboNationality.requestFocus();
        } else if (comboRace.getSelectedItem().equals("")) {
            lblErrorRace.setText("'RACE' should can not be blank.");
            comboRace.requestFocus();
        } else if ("- Select Race -".equals(comboRace.getSelectedItem())) {
            lblErrorRace.setText("'RACE' should be a valid value.");
            comboRace.requestFocus();
        } else if (comboReligion.getSelectedItem().equals("")) {
            lblErrorReligion.setText("'RELIGION' should can not be blank.");
            comboReligion.requestFocus();
        } else if ("- Select Religion -".equals(comboReligion.getSelectedItem())) {
            lblErrorReligion.setText("'RELIGION' should be a valid value.");
            comboReligion.requestFocus();
        } else if (txtUsername.getText() == null) {
            lblErrorUsername.setText("'USERNAME' can not be blank.");
            txtUsername.requestFocus();
        } else if (txtUsername.getText().equals("")) {
            lblErrorUsername.setText("'USERNAME' can not be blank.");
            txtUsername.requestFocus();
        } else if (verifyIsExistUsername(txtUsername.getText()) == true) {
            lblErrorUsername.setText("'USERNAME' is currently used.");
            txtUsername.requestFocus();
        } else if (txtPassword.getText() == null) {
            lblErrorPassword.setText("'PASSWORD' can not be blank.");
            txtPassword.requestFocus();
        } else if (txtPassword.getText().equals("")) {
            lblErrorPassword.setText("'PASSWORD' can not be blank.");
            txtPassword.requestFocus();
        } else if (txtConfirmPassword.getText() == null) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' can not be blank.");
            txtConfirmPassword.requestFocus();
        } else if (txtConfirmPassword.getText().equals("")) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' can not be blank.");
            txtConfirmPassword.requestFocus();
        } else if (!txtConfirmPassword.getText().equals(txtPassword.getText())) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' is diferent than the 'PASSWORD'.");
            txtConfirmPassword.requestFocus();
        } else if (txtAddress.getText() == null) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
            txtAddress.requestFocus();
        } else if (txtAddress.getText().equals("")) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
            txtAddress.requestFocus();
        } else if (comboSecurityQuestion1.getSelectedItem().equals("")) {
            lblErrorSecurityQuestion1.setText("'SECURITY QUESTION - 1' should can not be blank.");
            comboSecurityQuestion1.requestFocus();
        } else if ("- Select Security Question 1 -".equals(comboSecurityQuestion1.getSelectedItem())) {
            lblErrorSecurityQuestion1.setText("'SECURITY QUESTION - 1' should be a valid value.");
            comboSecurityQuestion1.requestFocus();
        } else if (txtSecurityAnswer1.getText() == null) {
            lblErrorSecurityAnswer1.setText("'SECURITY ANSWER - 1' can not be blank.");
            txtSecurityAnswer1.requestFocus();
        } else if (txtSecurityAnswer1.getText().equals("")) {
            lblErrorSecurityAnswer1.setText("'SECURITY ANSWER - 1' can not be blank.");
            txtSecurityAnswer1.requestFocus();
        } else if (comboSecurityQuestion2.getSelectedItem().equals("")) {
            lblErrorSecurityQuestion2.setText("'SECURITY QUESTION - 2' should can not be blank.");
            comboSecurityQuestion2.requestFocus();
        } else if ("- Select Security Question 2 -".equals(comboSecurityQuestion2.getSelectedItem())) {
            lblErrorSecurityQuestion2.setText("'SECURITY QUESTION - 2' should be a valid value.");
            comboSecurityQuestion2.requestFocus();
        } else if (txtSecurityAnswer2.getText() == null) {
            lblErrorSecurityAnswer2.setText("'SECURITY ANSWER - 2' can not be blank.");
            txtSecurityAnswer2.requestFocus();
        } else if (txtSecurityAnswer2.getText().equals("")) {
            lblErrorSecurityAnswer2.setText("'SECURITY ANSWER - 2' can not be blank.");
            txtSecurityAnswer2.requestFocus();
        } else if (comboCity.getSelectedItem().equals("")) {
            lblErrorCity.setText("'CITY' should can not be blank.");
            comboCity.requestFocus();
        } else if ("- Select City -".equals(comboCity.getSelectedItem())) {
            lblErrorCity.setText("'CITY' should be a valid value.");
            comboCity.requestFocus();
        } else if (comboLocation.getSelectedItem().equals("")) {
            lblErrorLocation.setText("'LOCATION' should can not be blank.");
            comboLocation.requestFocus();
        } else if ("- Select Location -".equals(comboLocation.getSelectedItem())) {
            lblErrorLocation.setText("'LOCATION' should be a valid value.");
            comboLocation.requestFocus();
        } else if (comboDivision.getSelectedItem().equals("")) {
            lblErrorDivision.setText("'DIVISION' should can not be blank.");
            comboDivision.requestFocus();
        } else if ("- Select Division -".equals(comboDivision.getSelectedItem())) {
            lblErrorDivision.setText("'DIVISION' should be a valid value.");
            comboDivision.requestFocus();
        } else if (comboDesignation.getSelectedItem().equals("")) {
            lblErrorDesignation.setText("'DESIGNATION' should can not be blank.");
            comboDesignation.requestFocus();
        } else if ("- Select Designation -".equals(comboDesignation.getSelectedItem())) {
            lblErrorDesignation.setText("'DESIGNATION' should be a valid value.");
            comboDesignation.requestFocus();
        } else if (comboUserRole.getSelectedItem().equals("")) {
            lblErrorUserRole.setText("'USER ROLE' should can not be blank.");
            comboUserRole.requestFocus();
        } else if ("- Select User Role -".equals(comboUserRole.getSelectedItem())) {
            lblErrorUserRole.setText("'USER ROLE' should be a valid value.");
            comboUserRole.requestFocus();
        } else {
            dataUpdate();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusLost
    }//GEN-LAST:event_btnSaveFocusLost

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

    private void txtSecurityAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2ActionPerformed
    }//GEN-LAST:event_txtSecurityAnswer2ActionPerformed

    private void btnBrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "jpeg", "png", "gif");
        file.addChoosableFileFilter(filter);

        int result = file.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblUserImage.setIcon(ResizeImage(path));
            sImagePath = path;
        }
    }//GEN-LAST:event_btnBrowsActionPerformed

    private void rdbStatusActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbStatusActiveActionPerformed
    }//GEN-LAST:event_rdbStatusActiveActionPerformed

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        int len = txtFullName.getText().length();

        if (len == 0) {
            lblErrorFullName.setText("'FULL NAME' can not be blank.");
        } else {
            lblErrorFullName.setText("");
        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtFullNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyTyped
        int len = txtFullName.getText().length();

        if (len >= 200) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtFullNameKeyTyped

    private void txtFullNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyPressed
    }//GEN-LAST:event_txtFullNameKeyPressed

    private void txtEmployeeIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIDKeyReleased
        int len = txtEmployeeID.getText().length();

        if (len == 0) {
            lblErrorEmployeeID.setText("'FMPLOYEE ID' can not be blank.");
        } else {
            lblErrorEmployeeID.setText("");
        }
    }//GEN-LAST:event_txtEmployeeIDKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        int len = txtEmail.getText().length();

        if (len == 0) {
            lblErrorEmail.setText("'EMAIL' can not be blank.");
        } else {
            lblErrorEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNICNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNumberKeyReleased
        int len = txtNICNumber.getText().length();

        if (len == 0) {
            lblErrorNICNumber.setText("'NIC NUMBER' can not be blank.");
        } else {
            lblErrorNICNumber.setText("");
        }
    }//GEN-LAST:event_txtNICNumberKeyReleased

    private void txtPassportNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassportNumberKeyReleased
        int len = txtPassportNumber.getText().length();

        if (len == 0) {
            lblErrorPassportNumber.setText("'PASSPORT NUMBER' can not be blank.");
        } else {
            lblErrorPassportNumber.setText("");
        }
    }//GEN-LAST:event_txtPassportNumberKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        int len = txtMobileNumber.getText().length();

        if (len == 0) {
            lblErrorMobileNumber.setText("'MOBILE NUMBER' can not be blank.");
        } else {
            lblErrorMobileNumber.setText("");
        }
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtResidentNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResidentNumberKeyReleased
        int len = txtResidentNumber.getText().length();

        if (len == 0) {
            lblErrorResidentNumber.setText("'RESIDENT NUMBER' can not be blank.");
        } else {
            lblErrorResidentNumber.setText("");
        }
    }//GEN-LAST:event_txtResidentNumberKeyReleased

    private void comboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboGenderKeyReleased
    }//GEN-LAST:event_comboGenderKeyReleased

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        int len = txtUsername.getText().length();

        if (len == 0) {
            lblErrorUsername.setText("'USERNAME' can not be blank.");
        } else {
            lblErrorUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        int len = txtPassword.getText().length();

        if (len == 0) {
            lblErrorPassword.setText("'PASSWORD' can not be blank.");
        } else {
            lblErrorPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        int len = txtConfirmPassword.getText().length();

        if (len == 0) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' can not be blank.");
        } else {
            lblErrorConfirmPassword.setText("");
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void txtSecurityAnswer1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1KeyReleased
        int len = txtSecurityAnswer1.getText().length();

        if (len == 0) {
            lblErrorSecurityAnswer1.setText("'SECURITY ANSWER 1' can not be blank.");
        } else {
            lblErrorSecurityAnswer1.setText("");
        }
    }//GEN-LAST:event_txtSecurityAnswer1KeyReleased

    private void txtSecurityAnswer2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2KeyReleased
        int len = txtSecurityAnswer2.getText().length();

        if (len == 0) {
            lblErrorSecurityAnswer2.setText("'SECURITY ANSWER 2' can not be blank.");
        } else {
            lblErrorSecurityAnswer2.setText("");
        }
    }//GEN-LAST:event_txtSecurityAnswer2KeyReleased

    private void comboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGenderActionPerformed
        if ("- Select Gender -".equals(comboGender.getSelectedItem())) {
            lblErrorGender.setText("'GENDER' should be a valid value.");
        } else {
            lblErrorGender.setText("");
        }
    }//GEN-LAST:event_comboGenderActionPerformed

    private void comboNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNationalityActionPerformed
        if ("- Select Nationality -".equals(comboNationality.getSelectedItem())) {
            lblErrorNationality.setText("'NATIONALITY' should be a valid value.");
        } else {
            lblErrorNationality.setText("");
        }
    }//GEN-LAST:event_comboNationalityActionPerformed

    private void comboRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRaceActionPerformed
        if ("- Select Race -".equals(comboRace.getSelectedItem())) {
            lblErrorRace.setText("'RACE' should be a valid value.");
        } else {
            lblErrorRace.setText("");
        }
    }//GEN-LAST:event_comboRaceActionPerformed

    private void comboReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReligionActionPerformed
        if ("- Select Religion -".equals(comboReligion.getSelectedItem())) {
            lblErrorReligion.setText("'RELIGION' should be a valid value.");
        } else {
            lblErrorReligion.setText("");
        }
    }//GEN-LAST:event_comboReligionActionPerformed

    private void comboSecurityQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecurityQuestion1ActionPerformed
        if ("- Select Security Question 1 -".equals(comboSecurityQuestion1.getSelectedItem())) {
            lblErrorSecurityQuestion1.setText("'SECURITY QUESTION - 1' should be a valid value.");
        } else {
            lblErrorSecurityQuestion1.setText("");
        }
    }//GEN-LAST:event_comboSecurityQuestion1ActionPerformed

    private void comboSecurityQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecurityQuestion2ActionPerformed
        if ("- Select Security Question 2 -".equals(comboSecurityQuestion2.getSelectedItem())) {
            lblErrorSecurityQuestion2.setText("'SECURITY QUESTION - 2' should be a valid value.");
        } else {
            lblErrorSecurityQuestion2.setText("");
        }
    }//GEN-LAST:event_comboSecurityQuestion2ActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        if ("- Select City -".equals(comboCity.getSelectedItem())) {
            lblErrorCity.setText("'CITY' should be a valid value.");
        } else {
            lblErrorCity.setText("");
        }
    }//GEN-LAST:event_comboCityActionPerformed

    private void comboLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocationActionPerformed
        if ("- Select Location -".equals(comboLocation.getSelectedItem())) {
            lblErrorLocation.setText("'LOCATION' should be a valid value.");
        } else {
            lblErrorLocation.setText("");
        }
    }//GEN-LAST:event_comboLocationActionPerformed

    private void comboDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisionActionPerformed
        if ("- Select Division -".equals(comboDivision.getSelectedItem())) {
            lblErrorDivision.setText("'DIVISION' should be a valid value.");
        } else {
            lblErrorDivision.setText("");
        }
    }//GEN-LAST:event_comboDivisionActionPerformed

    private void comboDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDesignationActionPerformed
        if ("- Select Designation -".equals(comboDesignation.getSelectedItem())) {
            lblErrorDesignation.setText("'DESIGNATION' should be a valid value.");
        } else {
            lblErrorDesignation.setText("");
        }
    }//GEN-LAST:event_comboDesignationActionPerformed

    private void comboUserRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserRoleActionPerformed
        if ("- Select User Role -".equals(comboUserRole.getSelectedItem())) {
            lblErrorUserRole.setText("'USER ROLE' should be a valid value.");
        } else {
            lblErrorUserRole.setText("");
        }
    }//GEN-LAST:event_comboUserRoleActionPerformed

    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
        txtFullName.selectAll();
    }//GEN-LAST:event_txtFullNameFocusGained

    private void txtEmployeeIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeIDFocusGained
        txtEmployeeID.selectAll();
    }//GEN-LAST:event_txtEmployeeIDFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.selectAll();
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtNICNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICNumberFocusGained
        txtNICNumber.selectAll();
    }//GEN-LAST:event_txtNICNumberFocusGained

    private void txtPassportNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassportNumberFocusGained
        txtPassportNumber.selectAll();
    }//GEN-LAST:event_txtPassportNumberFocusGained

    private void txtMobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileNumberFocusGained
        txtMobileNumber.selectAll();
    }//GEN-LAST:event_txtMobileNumberFocusGained

    private void txtResidentNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResidentNumberFocusGained
        txtResidentNumber.selectAll();
    }//GEN-LAST:event_txtResidentNumberFocusGained

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.selectAll();
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.selectAll();
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusGained
        txtConfirmPassword.selectAll();
    }//GEN-LAST:event_txtConfirmPasswordFocusGained

    private void txtSecurityAnswer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1FocusGained
        txtSecurityAnswer1.selectAll();
    }//GEN-LAST:event_txtSecurityAnswer1FocusGained

    private void txtSecurityAnswer2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2FocusGained
        txtSecurityAnswer2.selectAll();
    }//GEN-LAST:event_txtSecurityAnswer2FocusGained

    private void txtEmployeeIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIDKeyTyped
        int len = txtEmployeeID.getText().length();

        if (len >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEmployeeIDKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        int len = txtEmail.getText().length();

        if (len >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtNICNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNumberKeyTyped
        int len = txtNICNumber.getText().length();

        if (len >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNICNumberKeyTyped

    private void txtPassportNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassportNumberKeyTyped
        int len = txtPassportNumber.getText().length();

        if (len >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPassportNumberKeyTyped

    private void txtMobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyTyped
        int len = txtMobileNumber.getText().length();

        char vchar = evt.getKeyChar();

        if ((!Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

        if (len >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtMobileNumberKeyTyped

    private void txtResidentNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResidentNumberKeyTyped
        int len = txtResidentNumber.getText().length();

        char vchar = evt.getKeyChar();

        if ((!Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

        if (len >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtResidentNumberKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        int len = txtUsername.getText().length();

        if (len >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        int len = txtPassword.getText().length();

        if (len >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtConfirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyTyped
        int len = txtConfirmPassword.getText().length();

        if (len >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyTyped

    private void txtSecurityAnswer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1KeyTyped
        int len = txtSecurityAnswer1.getText().length();

        if (len >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtSecurityAnswer1KeyTyped

    private void txtSecurityAnswer2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2KeyTyped
        int len = txtSecurityAnswer2.getText().length();

        if (len >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtSecurityAnswer2KeyTyped

    private void txtConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusLost
        if (!txtConfirmPassword.getText().equals(txtPassword.getText())) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' is diferent than the 'PASSWORD'.");
        }
    }//GEN-LAST:event_txtConfirmPasswordFocusLost

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        int len = txtAddress.getText().length();

        if (len >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        int len = txtAddress.getText().length();

        if (len == 0) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
        } else {
            lblErrorAddress.setText("");
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        txtAddress.selectAll();
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (comFunc.validateEmail(txtEmail.getText()) == false) {
            lblErrorEmail.setText("'E-MAIL' is not in a correct format.");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmployeeIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeIDFocusLost
//        if (comFunc.validateAlphanumericNumeric(txtEmployeeID.getText()) == false) {
//            lblErrorEmployeeID.setText("'EMPLOYEE ID' is not in a correct format.");
//        }

        if (verifyIsExistEmployeeID(txtEmployeeID.getText()) == true) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' is currently used.");
        }
    }//GEN-LAST:event_txtEmployeeIDFocusLost

    private void txtNICNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICNumberFocusLost
//        if (comFunc.validateAlphanumericNumeric(txtNICNumber.getText()) == false) {
//            lblErrorNICNumber.setText("'NIC NUMBER' is not in a correct format.");
//        }
    }//GEN-LAST:event_txtNICNumberFocusLost

    private void txtPassportNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassportNumberFocusLost
//        if (comFunc.validateAlphanumericNumeric(txtPassportNumber.getText()) == false) {
//            lblErrorPassportNumber.setText("'PASSPORT NUMBER' is not in a correct format.");
//        }
    }//GEN-LAST:event_txtPassportNumberFocusLost

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
        if (verifyIsExistFullname(txtFullName.getText()) == true) {
            lblErrorFullName.setText("'FULLNAME' is currently used.");
        }
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (verifyIsExistUsername(txtUsername.getText()) == true) {
            lblErrorUsername.setText("'USERNAME' is currently used.");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void clearField() {
        txtFullName.setText(null);
        txtEmployeeID.setText(null);
        txtEmail.setText(null);
        txtNICNumber.setText(null);
        txtPassportNumber.setText(null);
        txtMobileNumber.setText("");
        txtResidentNumber.setText("");
        comboGender.setSelectedIndex(0);
        comboNationality.setSelectedIndex(0);
        comboRace.setSelectedIndex(0);
        comboReligion.setSelectedIndex(0);
        txtAddress.setText(null);
        comboUserRole.setSelectedIndex(0);

        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        comboSecurityQuestion1.setSelectedIndex(0);
        txtSecurityAnswer1.setText("");
        comboSecurityQuestion2.setSelectedIndex(0);
        txtSecurityAnswer2.setText("");

        comboCity.setSelectedIndex(0);
        comboLocation.setSelectedIndex(0);
        comboDivision.setSelectedIndex(0);
        comboDesignation.setSelectedIndex(0);

        txtFullName.requestFocus();
    }

    private void clearErrorLable() {
        lblErrorFullName.setText("");
        lblErrorEmployeeID.setText("");
        lblErrorEmail.setText("");
        lblErrorNICNumber.setText("");
        lblErrorPassportNumber.setText("");
        lblErrorMobileNumber.setText("");
        lblErrorResidentNumber.setText("");
        lblErrorGender.setText("");
        lblErrorNationality.setText("");
        lblErrorRace.setText("");
        lblErrorReligion.setText("");
        lblErrorUsername.setText("");
        lblErrorPassword.setText("");
        lblErrorConfirmPassword.setText("");
        lblErrorAddress.setText("");
        lblErrorSecurityQuestion1.setText("");
        lblErrorSecurityAnswer1.setText("");
        lblErrorSecurityQuestion2.setText("");
        lblErrorSecurityAnswer2.setText("");
        lblErrorCity.setText("");
        lblErrorLocation.setText("");
        lblErrorDivision.setText("");
        lblErrorDesignation.setText("");
        lblErrorUserRole.setText("");
    }

    private void formFormat() {
        setScreenSize();
        clearField();
        showCity();
        showRole();
        showSecurityQuestion1();
        showSecurityQuestion2();
        clearErrorLable();

        rdbStatusActive.setSelected(true);
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblUserImage.getWidth(), lblUserImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void showRole() {
        try {
            String sSql = "SELECT * FROM role_master";

            pstRoleMaster = conn.prepareStatement(sSql);
            rsRoleMaster = pstRoleMaster.executeQuery();

            comboUserRole.removeAllItems();

            comboUserRole.addItem("- Select User Role -");

            while (rsRoleMaster.next()) {
                comboUserRole.addItem(rsRoleMaster.getString("rm_role_name"));
            }

            rsRoleMaster.close();
            pstRoleMaster.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void showCity() {
        try {
            String sSql = "SELECT * FROM city_master";

            pstCityMaster = conn.prepareStatement(sSql);
            rsCityMaster = pstCityMaster.executeQuery();

            comboCity.removeAllItems();

            comboCity.addItem("- Select City -");

            while (rsCityMaster.next()) {
                comboCity.addItem(rsCityMaster.getString("cm_city_name"));
            }

            rsCityMaster.close();
            pstCityMaster.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void showSecurityQuestion1() {
        try {
            String sSql = "SELECT * FROM question_master WHERE qm_question_type = 'USER_QS1'";

            pstQuestionMaster1 = conn.prepareStatement(sSql);
            rsQuestionMaster1 = pstQuestionMaster1.executeQuery();

            comboSecurityQuestion1.removeAllItems();

            comboSecurityQuestion1.addItem("- Select Security Question 1 -");

            while (rsQuestionMaster1.next()) {
                comboSecurityQuestion1.addItem(rsQuestionMaster1.getString("qm_question_name"));
            }

            rsQuestionMaster1.close();
            pstQuestionMaster1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void showSecurityQuestion2() {
        try {
            String sSql = "SELECT * FROM question_master WHERE qm_question_type = 'USER_QS2'";

            pstQuestionMaster2 = conn.prepareStatement(sSql);
            rsQuestionMaster2 = pstQuestionMaster2.executeQuery();

            comboSecurityQuestion2.removeAllItems();

            comboSecurityQuestion2.addItem("- Select Security Question 2 -");

            while (rsQuestionMaster2.next()) {
                comboSecurityQuestion2.addItem(rsQuestionMaster2.getString("qm_question_name"));
            }

            rsQuestionMaster2.close();
            pstQuestionMaster2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void dataRetrieval() {
        try {
            String sSql = "SELECT * FROM user_master WHERE um_user_username = '"
                    + comFunc.sCurrentButtonAction + "'";

            pst = conn.prepareStatement(sSql);

            rs = pst.executeQuery();

            while (rs.next()) {
                txtFullName.setText(rs.getString("um_user_full_name"));
                txtEmployeeID.setText(rs.getString("um_user_epf_no"));
                txtEmail.setText(rs.getString("um_user_email"));
                txtNICNumber.setText(rs.getString("um_user_nic_no"));
                txtPassportNumber.setText(rs.getString("um_user_pp_no"));
                txtMobileNumber.setText(rs.getString("um_user_mobile_no"));
                txtResidentNumber.setText(rs.getString("um_user_resident_no"));
                comboGender.setSelectedItem(rs.getString("um_user_gender"));
                comboReligion.setSelectedItem(rs.getString("um_user_religion"));
                txtUsername.setText(rs.getString("um_user_username"));
                txtPassword.setText(rs.getString("um_user_password"));
                txtConfirmPassword.setText(rs.getString("um_user_password"));
                txtAddress.setText(rs.getString("um_user_address"));
                txtSecurityAnswer1.setText(rs.getString("um_user_security_answer_1"));
                txtSecurityAnswer2.setText(rs.getString("um_user_security_answer_2"));
                comboRace.setSelectedItem(rs.getString("um_user_race"));
                comboNationality.setSelectedItem(rs.getString("um_user_nationality"));
                comboLocation.setSelectedItem(rs.getString("um_user_location"));
                comboDivision.setSelectedItem(rs.getString("um_user_division"));
                comboDesignation.setSelectedItem(rs.getString("um_user_designation"));

                if (rs.getString("um_user_status").equals("Active")) {
                    rdbStatusActive.setSelected(true);
                } else if (rs.getString("um_user_status").equals("Inactive")) {
                    rdbStatusInactive.setSelected(true);
                }

                byte[] imageData = rs.getBytes("um_user_image");
                imageFormat = new ImageIcon(imageData);
                lblUserImage.setIcon(imageFormat);

//                Blob filenameBlob = rs.getBlob("um_user_image");
//
//                byte[] content = filenameBlob.getBytes(1L, (int) filenameBlob.length());
//                System.out.println(content);
//
//                Icon ico = new ImageIcon(content);
//                lblUserImage.setIcon(ico);
//
//                panelUserImage.add(lblUserImageHedding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 35));
//
//                System.out.println(lblUserImage.isShowing());
//                
//                //lblUserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_Icon.jpg")));
//                //lblUserImage.setBackground(Color.WHITE);
//                //lblUserImage.setOpaque(false);
//
////              Icon ik = new ImageIcon(content);
////              Image img = ik.getImage();
////              Icon icon = new ImageIcon(img);
////              lblUserImage.setIcon(ik);
////              
//                System.out.println(lblUserImage.getIcon());
                String sSql_RoleMaster = "SELECT rm_role_name FROM role_master WHERE rm_role_id = " + rs.getString("um_user_role_id");

                pstRoleMaster = conn.prepareStatement(sSql_RoleMaster);
                rsRoleMaster = pstRoleMaster.executeQuery();
                if (rsRoleMaster.next()) {
                    comboUserRole.setSelectedItem(rsRoleMaster.getString("rm_role_name"));
                }
                rsRoleMaster.close();
                pstRoleMaster.close();;

                String sSql_QuestionMaster_1 = "SELECT qm_question_name FROM question_master WHERE qm_question_id = '" + rs.getString("um_user_security_question_1_id") + "'";

                pstQuestionMaster1 = conn.prepareStatement(sSql_QuestionMaster_1);
                rsQuestionMaster1 = pstQuestionMaster1.executeQuery();
                if (rsQuestionMaster1.next()) {
                    comboSecurityQuestion1.setSelectedItem(rsQuestionMaster1.getString("qm_question_name"));
                }
                rsQuestionMaster1.close();
                pstQuestionMaster1.close();;

                String sSql_QuestionMaster_2 = "SELECT qm_question_name FROM question_master WHERE qm_question_id = '" + rs.getString("um_user_security_question_2_id") + "'";

                pstQuestionMaster2 = conn.prepareStatement(sSql_QuestionMaster_2);
                rsQuestionMaster2 = pstQuestionMaster2.executeQuery();
                if (rsQuestionMaster2.next()) {
                    comboSecurityQuestion2.setSelectedItem(rsQuestionMaster2.getString("qm_question_name"));
                }
                rsQuestionMaster2.close();
                pstQuestionMaster2.close();;

                String sSql_CityMaster = "SELECT cm_city_name FROM city_master WHERE cm_city_id = " + rs.getInt("um_user_city_id");

                pstCityMaster = conn.prepareStatement(sSql_CityMaster);
                rsCityMaster = pstCityMaster.executeQuery();

                if (rsCityMaster.next()) {
                    comboCity.setSelectedItem(rsCityMaster.getString("cm_city_name"));
                }

                rsCityMaster.close();
                pstCityMaster.close();;
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
        String sUserStatus = "";
        int maxUserID = 0;
        int userCityID = 0;
        int userRoleID = 0;
        int userSecurityQuestionID_1 = 0;
        int userSecurityQuestionID_2 = 0;

        try {
            conn = MySqlConnection.ConnectDB();

            String sSql_UserMaster = "SELECT MAX(um_user_id) AS 'MaxID' FROM user_master";

            pstUserMaster = conn.prepareStatement(sSql_UserMaster);
            rsUserMaster = pstUserMaster.executeQuery();

            if (rsUserMaster.next()) {
                maxUserID = rsUserMaster.getInt("MaxID") + 1;
            }

            rsUserMaster.close();
            pstUserMaster.close();

            String sSql_RoleMaster = "SELECT rm_role_id FROM role_master WHERE rm_role_name = '" + comboUserRole.getSelectedItem().toString() + "'";

            pstRoleMaster = conn.prepareStatement(sSql_RoleMaster);
            rsRoleMaster = pstRoleMaster.executeQuery();

            if (rsRoleMaster.next()) {
                userRoleID = rsRoleMaster.getInt("rm_role_id");
            }

            rsRoleMaster.close();
            pstRoleMaster.close();;

            String sSql_QuestionMaster_1 = "SELECT qm_question_id FROM question_master WHERE qm_question_name = '" + comboSecurityQuestion1.getSelectedItem().toString() + "'";

            pstQuestionMaster1 = conn.prepareStatement(sSql_QuestionMaster_1);
            rsQuestionMaster1 = pstQuestionMaster1.executeQuery();

            if (rsQuestionMaster1.next()) {
                userSecurityQuestionID_1 = rsQuestionMaster1.getInt("qm_question_id");
            }

            rsQuestionMaster1.close();
            pstQuestionMaster1.close();;

            String sSql_QuestionMaster_2 = "SELECT qm_question_id FROM question_master WHERE qm_question_name = '" + comboSecurityQuestion2.getSelectedItem().toString() + "'";

            pstQuestionMaster2 = conn.prepareStatement(sSql_QuestionMaster_2);
            rsQuestionMaster2 = pstQuestionMaster2.executeQuery();

            if (rsQuestionMaster2.next()) {
                userSecurityQuestionID_2 = rsQuestionMaster2.getInt("qm_question_id");
            }

            rsQuestionMaster2.close();
            pstQuestionMaster2.close();;

            String sSql_CityMaster = "SELECT cm_city_id FROM city_master WHERE cm_city_name = '" + comboCity.getSelectedItem().toString() + "'";

            pstCityMaster = conn.prepareStatement(sSql_CityMaster);
            rsCityMaster = pstCityMaster.executeQuery();

            if (rsCityMaster.next()) {
                userCityID = rsCityMaster.getInt("cm_city_id");
            }

            rsCityMaster.close();
            pstCityMaster.close();;

            String sFullName = txtFullName.getText().trim();
            String sEmployeeID = txtEmployeeID.getText().trim();
            String sEmail = txtEmail.getText().trim();
            String stxtNICNumber = txtNICNumber.getText().trim();
            String sPassportNumber = txtPassportNumber.getText().trim();
            String sMobileNumber = txtMobileNumber.getText().trim();
            String sResidentNumber = txtResidentNumber.getText().trim();
            String SGender = comboGender.getSelectedItem().toString();
            String sReligion = comboReligion.getSelectedItem().toString();
            String sUsername = txtUsername.getText().trim();
            String sPassword = txtPassword.getText().trim();
            String sAddress = txtAddress.getText().trim();
            String sSecurityAnswer1 = txtSecurityAnswer1.getText().trim();
            String sSecurityAnswer2 = txtSecurityAnswer2.getText().trim();
            String sRace = comboRace.getSelectedItem().toString();
            String sNationality = comboNationality.getSelectedItem().toString();
            String sLocation = comboLocation.getSelectedItem().toString();
            String sDivision = comboDivision.getSelectedItem().toString();
            String sDesignation = comboDesignation.getSelectedItem().toString();

            if (rdbStatusActive.isSelected()) {
                sUserStatus = "Active";
            } else if (rdbStatusInactive.isSelected()) {
                sUserStatus = "Inactive";
            }

            InputStream isUserImage = new FileInputStream(new File(sImagePath));

            String sSql = "INSERT INTO user_master ("
                    + "um_user_id, "
                    + "um_user_full_name, "
                    + "um_user_epf_no, "
                    + "um_user_email, "
                    + "um_user_nic_no, "
                    + "um_user_pp_no, "
                    + "um_user_mobile_no, "
                    + "um_user_resident_no, "
                    + "um_user_gender, "
                    + "um_user_religion, "
                    + "um_user_username, "
                    + "um_user_password, "
                    + "um_user_address, "
                    + "um_user_security_answer_1, "
                    + "um_user_security_answer_2, "
                    + "um_user_race, "
                    + "um_user_nationality, "
                    + "um_user_location, "
                    + "um_user_division, "
                    + "um_user_designation, "
                    + "um_user_status, "
                    + "um_user_update_date_time, "
                    + "um_user_image, "
                    + "um_user_role_id, "
                    + "um_user_security_question_1_id, "
                    + "um_user_security_question_2_id, "
                    + "um_user_city_id"
                    + ")"
                    + " VALUES ("
                    + maxUserID + ", '"
                    + sFullName + "', '"
                    + sEmployeeID + "', '"
                    + sEmail + "', '"
                    + stxtNICNumber + "', '"
                    + sPassportNumber + "', '"
                    + sMobileNumber + "', '"
                    + sResidentNumber + "', '"
                    + SGender + "', '"
                    + sReligion + "', '"
                    + sUsername + "', '"
                    + sPassword + "', '"
                    + sAddress + "', '"
                    + sSecurityAnswer1 + "', '"
                    + sSecurityAnswer2 + "', '"
                    + sRace + "', '"
                    + sNationality + "', '"
                    + sLocation + "', '"
                    + sDivision + "', '"
                    + sDesignation + "', '"
                    + sUserStatus + "', '"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "', '"
                    + isUserImage + "', '"
                    + userRoleID + "', '"
                    + userSecurityQuestionID_1 + "', '"
                    + userSecurityQuestionID_2 + "', "
                    + userCityID
                    + ")";

            pst = conn.prepareStatement(sSql);

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "RECORD SAVED.");

            clearField();
            showCity();
            showRole();
            showSecurityQuestion1();
            showSecurityQuestion2();
            clearErrorLable();

            rdbStatusActive.setSelected(true);
            tabbedUserManager.setSelectedIndex(0);
            txtFullName.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    private boolean verifyIsExistFullname(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT um_user_full_name FROM user_master "
                    + "WHERE um_user_full_name = '"
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

    private boolean verifyIsExistEmployeeID(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT um_user_epf_no FROM user_master "
                    + "WHERE um_user_epf_no = '"
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

    private boolean verifyIsExistUsername(String inputData) {
        boolean outputResult = false;

        try {
            String sSql = "SELECT um_user_username FROM user_master "
                    + "WHERE um_user_username = '"
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
    private javax.swing.JButton btnBrows;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboDesignation;
    private javax.swing.JComboBox comboDivision;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JComboBox comboLocation;
    private javax.swing.JComboBox comboNationality;
    private javax.swing.JComboBox comboRace;
    private javax.swing.JComboBox comboReligion;
    private javax.swing.JComboBox comboSecurityQuestion1;
    private javax.swing.JComboBox comboSecurityQuestion2;
    private javax.swing.JComboBox comboUserRole;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorCity;
    private javax.swing.JLabel lblErrorConfirmPassword;
    private javax.swing.JLabel lblErrorDesignation;
    private javax.swing.JLabel lblErrorDivision;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorEmployeeID;
    private javax.swing.JLabel lblErrorFullName;
    private javax.swing.JLabel lblErrorGender;
    private javax.swing.JLabel lblErrorLocation;
    private javax.swing.JLabel lblErrorMobileNumber;
    private javax.swing.JLabel lblErrorNICNumber;
    private javax.swing.JLabel lblErrorNationality;
    private javax.swing.JLabel lblErrorPassportNumber;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRace;
    private javax.swing.JLabel lblErrorReligion;
    private javax.swing.JLabel lblErrorResidentNumber;
    private javax.swing.JLabel lblErrorSecurityAnswer1;
    private javax.swing.JLabel lblErrorSecurityAnswer2;
    private javax.swing.JLabel lblErrorSecurityQuestion1;
    private javax.swing.JLabel lblErrorSecurityQuestion2;
    private javax.swing.JLabel lblErrorUserRole;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblNICNumber;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblReligion;
    private javax.swing.JLabel lblResidentNumber;
    private javax.swing.JLabel lblSecurityAnswer1;
    private javax.swing.JLabel lblSecurityAnswer2;
    private javax.swing.JLabel lblSecurityQuestion1;
    private javax.swing.JLabel lblSecurityQuestion2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserImage;
    private javax.swing.JLabel lblUserImageHedding;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelOther;
    private javax.swing.JPanel panelSearchButtons;
    private javax.swing.JPanel panelUserImage;
    private javax.swing.JPanel panelUserManager;
    private javax.swing.JPanel panelUserManagerMain;
    private javax.swing.JRadioButton rdbStatusActive;
    private javax.swing.JRadioButton rdbStatusInactive;
    private javax.swing.JScrollPane scrollPaneAddress;
    private javax.swing.JTabbedPane tabbedUserManager;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtNICNumber;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtResidentNumber;
    private javax.swing.JTextField txtSecurityAnswer1;
    private javax.swing.JTextField txtSecurityAnswer2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private ImageIcon imageFormat = null;
}
