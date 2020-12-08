
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;

/**
 * This class is responsible to change password
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSubmitActionPerformed(java.awt.event.ActionEvent evt)
 * 3.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 4.txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt)
 * 
 * @author Adwait Dabhade
 * 
 * This class takes the username automatically and changes password for that particular user.
 */
public class ChangePassword extends javax.swing.JInternalFrame {

    
    public ChangePassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChngPwd = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        labNewPwd = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPwd = new javax.swing.JLabel();

        setTitle("Change Password");
        setPreferredSize(new java.awt.Dimension(450, 450));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        panelChngPwd.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102)));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/no.gif"))); // NOI18N
        btnClose.setText(" CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yes.gif"))); // NOI18N
        btnSubmit.setText(" SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtUserName.setEditable(false);
        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 255));
        lblUserName.setText("User Name                :");

        lblPwd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(0, 0, 255));
        lblPwd.setText("Password                 :");

        labNewPwd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labNewPwd.setForeground(new java.awt.Color(0, 0, 255));
        labNewPwd.setText("New Password         :");

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        lblConfirmPwd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblConfirmPwd.setForeground(new java.awt.Color(0, 0, 255));
        lblConfirmPwd.setText("Confirm Password   :");

        javax.swing.GroupLayout panelChngPwdLayout = new javax.swing.GroupLayout(panelChngPwd);
        panelChngPwd.setLayout(panelChngPwdLayout);
        panelChngPwdLayout.setHorizontalGroup(
            panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChngPwdLayout.createSequentialGroup()
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChngPwdLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChngPwdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName)
                    .addGroup(panelChngPwdLayout.createSequentialGroup()
                        .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelChngPwdLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelChngPwdLayout.setVerticalGroup(
            panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChngPwdLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPwd))
                .addGap(18, 18, 18)
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNewPwd)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPwd)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSubmit))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChngPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChngPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the ChangePassword page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        System.exit(1);
    }//GEN-LAST:event_btnCloseActionPerformed

    
     /**
     * This method is an action performed on the Submit button of the ChangePassword page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method is responsible to submit new password details and its validation
     */
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String stru = "";
        stru = txtUserName.getText();

        String strp = "";
        strp = txtPassword.getText();

        String strnp = "";
        strnp = txtNewPassword.getText();

        String strcp = "";
        strcp = txtConfirmPassword.getText();
        if (stru.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Enter User Name");
            return;
        }

        if (strp.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Enter Password");
            return;
        }

        if (strnp.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Enter New Password");
            return;
        }

        if (strcp.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Enter Confirm Password");
            return;
        }
        if (strcp.equals(strnp) == false) {
            JOptionPane.showMessageDialog(null, "Passwords are not match");
            return;
        }

        try {
            //get login type
            String strlogin = "";

            //get database connection details
            MainClass mc = new MainClass();

            //open connection
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            String str = "";
            str = "select * from user_master where  u_name =? and u_password =?";
            PreparedStatement pst = connection.prepareStatement(str);
            pst.setString(1, stru);
            pst.setString(2, strp);
            ResultSet rs;

            rs = pst.executeQuery();
            if (rs.next()) {

                String sql = "update user_master set u_password='" + strnp + "' where u_name ='" + stru + "'";
                PreparedStatement pst1 = connection.prepareStatement(sql);
                pst1.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Password has Changed.");
                
                mc.userLogInsertion("Password changed ", "");

            } else {
                JOptionPane.showMessageDialog(null, "Please enter correct User name or Password.");
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    // Form opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtUserName.setText(MainClass.strUser);
    }//GEN-LAST:event_formInternalFrameOpened

    
    // Confirm password textfield action performed
    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel labNewPwd;
    private javax.swing.JLabel lblConfirmPwd;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel panelChngPwd;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
