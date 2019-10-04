package frames;

import connection.MySqlConnection;
import forms.MDIMain;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;


import util.CommonFunctions;

public class JavaTreeWithDB extends javax.swing.JPanel {

    MDIMain mdiMain = new MDIMain();

    CommonFunctions comFunc = new CommonFunctions();

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JTree tree;
    JTextField jtf;

    public JavaTreeWithDB() {
        conn = MySqlConnection.ConnectDB();
        initComponents();
        showAccounts();
    }

    private void showAccounts() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

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
        tree = new JTree(top);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane jsp = new JScrollPane(tree, v, h);
        contentPane.add(jsp, BorderLayout.CENTER);

        jtf = new JTextField(" ", 20);
        contentPane.add(jtf, BorderLayout.SOUTH);

//        panelMainAccountsTree.add(jsp, BorderLayout.CENTER);
//        panelMainAccountsTree.add(jtf, BorderLayout.SOUTH);
        tree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                doMouseClicked(me);
            }

            private void doMouseClicked(MouseEvent me) {
                TreePath tp = tree.getPathForLocation(me.getX(), me.getY());

                if (tp != null) {
                    jtf.setText(tp.toString());
                } else {
                    jtf.setText("  ");
                }
            }
        });
    }

    public static void main(String args[]) {
        JavaTreeWithDB obj = new JavaTreeWithDB();
        obj.setVisible(true);
        obj.setSize(300, 400);
        obj.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
