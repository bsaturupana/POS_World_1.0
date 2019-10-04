package frames;

import connection.MySqlConnection;
import forms.MDIMain;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import util.CommonFunctions;

public class AccountMaster extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AccountMaster() {
        conn = MySqlConnection.ConnectDB();

        initComponents();
        formFormat();
        showAcc();
//        showAccounts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUserMaster = new javax.swing.JPanel();
        panelMainAccountsTree = new javax.swing.JPanel();
        spAccountsTree = new javax.swing.JScrollPane();
        tvAccountsTree = new javax.swing.JTree();
        panelMainButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jtf = new javax.swing.JTextField();

        panelUserMaster.setBackground(new java.awt.Color(45, 62, 80));
        panelUserMaster.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMainAccountsTree.setBackground(new java.awt.Color(45, 62, 80));
        panelMainAccountsTree.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainAccountsTree.setForeground(new java.awt.Color(255, 255, 255));
        panelMainAccountsTree.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tvAccountsTree.setBackground(new java.awt.Color(110, 122, 136));
        tvAccountsTree.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tvAccountsTree.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Accounts Tree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Asset");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fixed Asset");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Current Asset");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bank");
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Sampath Bank");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Bank Of Ceylon");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Cash");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Cash In Hand");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Petty Cash");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Customers");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Cust 1");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Cust 2");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Cust 3");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Liability");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Suppliers");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sup 1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sup 2");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sup 3");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Income");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Expenses");
        treeNode1.add(treeNode2);
        tvAccountsTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        spAccountsTree.setViewportView(tvAccountsTree);

        panelMainAccountsTree.add(spAccountsTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 470, 500));

        panelUserMaster.add(panelMainAccountsTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1420, 530));

        panelMainButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelMainButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelMainButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(53, 189, 252));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD NEW");
        btnAdd.setToolTipText("");
        btnAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddFocusLost(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, 70));

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
        panelMainButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 140, 70));

        btnRefresh.setBackground(new java.awt.Color(53, 189, 252));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.setToolTipText("");
        btnRefresh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRefreshFocusLost(evt);
            }
        });
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 70));

        panelUserMaster.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 770, 90));
        panelUserMaster.add(jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 350, -1));

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
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
//        try {
//            String msg = "EDIT" + tableUserMaster.getModel().getValueAt(tableUserMaster.getSelectedRow(), 1).toString();
//
//            UserManager frmSub = new UserManager(msg);
//            frmSub.setVisible(true);
//            getParent().add(frmSub);
//            frmSub.toFront();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "THERE IS NOW VALID ROW SELECTED TO 'EDIT'");
//            tableUserMaster.requestFocus();
//        }
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        UserManager frmSub = new UserManager();
        frmSub.setVisible(true);
        getParent().add(frmSub);
        frmSub.toFront();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showAccounts();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRefreshFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRefreshFocusLost
    }//GEN-LAST:event_btnRefreshFocusLost

    private void btnAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusLost
    }//GEN-LAST:event_btnAddFocusLost

    private void btnEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditFocusLost
    }//GEN-LAST:event_btnEditFocusLost

    private void btnDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteFocusLost
    }//GEN-LAST:event_btnDeleteFocusLost

    private void showAccounts() {
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new BorderLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("ACCOUNTS");

        DefaultMutableTreeNode asset = new DefaultMutableTreeNode("ASSET");
        top.add(asset);

        DefaultMutableTreeNode liability = new DefaultMutableTreeNode("LIABILITY");
        top.add(liability);

        DefaultMutableTreeNode income = new DefaultMutableTreeNode("INCOME");
        top.add(income);

        DefaultMutableTreeNode expenses = new DefaultMutableTreeNode("EXPENSES");
        top.add(expenses);

        //  Database Connection
//        try {
//            String sSql = "SELECT * FROM account_master";
//
//            pst = conn.prepareStatement(sSql);
//            rs = pst.executeQuery();
//            
//            while (rs.next()) {                
//                DefaultMutableTreeNode a = new DefaultMutableTreeNode(rs.getString("am_acc_name"));
//                top.add(asset);
//
//                DefaultMutableTreeNode b = new DefaultMutableTreeNode(rs.getString("am_acc_name"));
//                top.add(liability);
//
//                DefaultMutableTreeNode c = new DefaultMutableTreeNode(rs.getString("am_acc_name"));
//                top.add(income);
//
//                DefaultMutableTreeNode d = new DefaultMutableTreeNode(rs.getString("am_acc_name"));
//                top.add(expenses);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        tvAccountsTree = new JTree(top);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane tvAccountsTree = new JScrollPane(spAccountsTree, v, h);

//        contentPane.add(spAT, BorderLayout.CENTER);
//        contentPane.add(jtf, BorderLayout.SOUTH);
//        panelMainAccountsTree.add(spAT, BorderLayout.CENTER);
//        panelMainAccountsTree.add(jtf, BorderLayout.SOUTH);
//        tvAccountsTree.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent me) {
//                doMouseClicked(me);
//            }
//
//            private void doMouseClicked(MouseEvent me) {
//                TreePath tp = tvAccountsTree.getPathForLocation(me.getX(), me.getY());
//
//                if (tp != null) {
//                    jtf.setText(tp.toString());
//                } else {
//                    jtf.setText("  ");
//                }
//            }
//        });
    }

//    private void updateGrid(String sEmployeeID, String sUserName,
//            String sFullName, String sUserRole, String sNICNo,
//            String sPassportNo, String sEmail, String sMobileNo,
//            String sResidentNo, String sGender, String sAddress,
//            String sStatus) {
//
//        DefaultTableModel model = (DefaultTableModel) tableUserMaster.getModel();
//
//        model.addRow(new Object[]{
//            sEmployeeID, sUserName, sFullName, sUserRole, sNICNo, sPassportNo,
//            sEmail, sMobileNo, sResidentNo, sGender, sAddress, sStatus
//        });
//    }
    private void formFormat() {
        setScreenSize();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField jtf;
    private javax.swing.JPanel panelMainAccountsTree;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelUserMaster;
    private javax.swing.JScrollPane spAccountsTree;
    private javax.swing.JTree tvAccountsTree;
    // End of variables declaration//GEN-END:variables

    private void showAcc() {
        System.out.println("1");

        ArrayList list = new ArrayList();
        list.add("Student Name & Marks");

        System.out.println("2");

        try {
            System.out.println("3");
            String sSql = "SELECT am_acc_name, am_acc_parent_name FROM account_master";
//            String sql = "Select * from Student_Marks";

            pst = conn.prepareStatement(sSql);
//            st = con.createStatement();
            rs = pst.executeQuery();
//            rs = st.executeQuery(sql);
            System.out.println(sSql);

            while (rs.next()) {
                System.out.println("5");

                Object value[] = {rs.getString(1), rs.getString(2)};
                list.add(value);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("6");

//        rs.close();
//        pst.close();
//        conn.close();
        Object hierarchy[] = list.toArray();
        System.out.println("7");

        Container content = getContentPane();

        DefaultMutableTreeNode root = processHierarchy(hierarchy);
        JTree tvAccountsTree = new JTree(root);
        content.add(new JScrollPane(tvAccountsTree), BorderLayout.CENTER);
//        setSize(275, 300);
//        setLocation(300, 100);
        setVisible(true);
    }

    private DefaultMutableTreeNode processHierarchy(Object[] hierarchy) {
        System.out.println("A1");

        DefaultMutableTreeNode node = new DefaultMutableTreeNode(hierarchy[0]);
        DefaultMutableTreeNode child;

        System.out.println(hierarchy.length);

        for (int i = 1; i < hierarchy.length; i++) {
            System.out.println("A3");
            Object nodeSpecifier = hierarchy[i];
            if (nodeSpecifier instanceof Object[]) // Ie node with children
            {
                System.out.println("A4");
                child = processHierarchy((Object[]) nodeSpecifier);
            } else {
                System.out.println("A5");
                child = new DefaultMutableTreeNode(nodeSpecifier); // Ie Leaf
            }
            System.out.println("A6");
            node.add(child);
        }
        return (node);
    }
}
