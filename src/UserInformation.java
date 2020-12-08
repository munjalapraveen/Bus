

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;


/**
 * This class is responsible to enter user details for Bus Management System
 * This class contains following methods :
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 4.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 5.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 6.txtEmailIDActionPerformed(java.awt.event.ActionEvent evt)
 * 7.tableUserInfoMouseClicked(java.awt.event.MouseEvent evt)
 * 8.txtMobileNoActionPerformed(java.awt.event.ActionEvent evt)
 * 9.txtUserLoginNameActionPerformed(java.awt.event.ActionEvent evt)
 * 10.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 11.txtUserDisplayNameActionPerformed(java.awt.event.ActionEvent evt)
 * 12.txtUserPasswordActionPerformed(java.awt.event.ActionEvent evt)
 * 13.ClearText()
 * 14.Display(String StrIn)
 * 15.FillGrid()
 * 
 * @author Abhinandan Reddy
 */
public class UserInformation extends JInternalFrame {
    // UserInformation constructor
    public UserInformation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        lablUserId = new javax.swing.JLabel();
        lblDisplayName = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUserInfo = new javax.swing.JTable();
        lblMobileNum = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblLoginPwd = new javax.swing.JLabel();
        lblUserLoginName = new javax.swing.JLabel();
        txtUserLoginName = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();
        txtUserDisplayName = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CmbUserType = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setTitle("User Information Details");
        setPreferredSize(new java.awt.Dimension(1050, 900));
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

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cl.gif"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad.gif"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ed.gif"))); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/de.gif"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/re.gif"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lablUserId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lablUserId.setForeground(new java.awt.Color(51, 0, 255));
        lablUserId.setText("User ID :");

        lblDisplayName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDisplayName.setForeground(new java.awt.Color(51, 0, 255));
        lblDisplayName.setText("Display Name :");

        txtUserId.setEditable(false);
        txtUserId.setBackground(new java.awt.Color(255, 255, 255));

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        lblEmailId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(51, 0, 255));
        lblEmailId.setText("Email ID :");

        tableUserInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "UserName", "UserType", "EmailId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUserInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUserInfo);

        lblMobileNum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMobileNum.setForeground(new java.awt.Color(51, 0, 255));
        lblMobileNum.setText("Mobile No :");

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });

        lblLoginPwd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLoginPwd.setForeground(new java.awt.Color(51, 0, 255));
        lblLoginPwd.setText("Login Password :");

        lblUserLoginName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserLoginName.setForeground(new java.awt.Color(51, 0, 255));
        lblUserLoginName.setText("User Login Name :");

        txtUserLoginName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserLoginNameActionPerformed(evt);
            }
        });

        chkActive.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        chkActive.setForeground(new java.awt.Color(0, 0, 255));
        chkActive.setText("Active User");

        txtUserDisplayName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserDisplayNameActionPerformed(evt);
            }
        });

        txtUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPasswordActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Admin/User");

        CmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lablUserId)
                    .addComponent(lblDisplayName)
                    .addComponent(lblEmailId))
                .addGap(31, 31, 31)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUserDisplayName, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(txtEmailID)
                        .addComponent(txtUserId))
                    .addComponent(chkActive, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserLoginName)
                    .addComponent(lblLoginPwd)
                    .addComponent(lblMobileNum)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserLoginName)
                    .addComponent(txtUserPassword)
                    .addComponent(CmbUserType, 0, 157, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lablUserId)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDisplayName))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserLoginName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoginPwd)
                            .addComponent(txtUserDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMobileNum)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkActive)
                    .addComponent(jLabel7)
                    .addComponent(CmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1007, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * This method is an action performed on the Close button of the UserInformation page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Save button of the UserInformation page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method saves User information as Login name, display name, password, email id, mobile number and type (admin/user)
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtUserLoginName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User Login Name can not be empty. Please enter User Login Name");
                txtUserLoginName.requestFocus();
                return;
            }

            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from user_master where u_name ='" + txtUserLoginName.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "This User Login Name is already exist. Please give other User Login Name");
                txtUserLoginName.requestFocus();
                return;
            }

            if (txtUserDisplayName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User display name can not be empty. Please enter User Display Name.");
                txtUserDisplayName.requestFocus();
                return;
            }
            if (txtUserPassword.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Password can not be empty. Please enter Password");
                txtUserPassword.requestFocus();
                return;
            }

            if (txtEmailID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "EmailId can not be empty. Please enter EmailId");
                txtEmailID.requestFocus();
                return;
            }

            if (mc.emailValidation(txtEmailID.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Please enter valid email address");
                txtEmailID.requestFocus();
                return;

            }

            if (txtMobileNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Mobile Number can not be empty. Please enter Mobile Number");
                txtMobileNo.requestFocus();
                return;
            }
            
            
            if (mc.numValidation(txtMobileNo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Mobile no should have only numbers");
                txtMobileNo.requestFocus();
                return;

            }
            
            if (mc.mobileNumberValidation(txtMobileNo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Mobile number is invalid. Please enter valid 10 digit mobile number");
                txtMobileNo.requestFocus();
                return;

            }

            String sql = "insert into user_master (u_name, u_password, u_type, u_display_name, u_emailid, u_mobile_no, u_active, u_create_date, u_modify_date, u_create_by, u_modify_by) values ('"
                    + txtUserLoginName.getText() + "','" + txtUserPassword.getText() + "','" + CmbUserType.getSelectedItem().toString()
                    + "','" + txtUserDisplayName.getText() + "','" + txtEmailID.getText() + "','" + txtMobileNo.getText() + "',1,sysdate(),null," + MainClass.strID + ",null)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Current record added to database.");

            mc.userLogInsertion("User added ", "User name : " + txtUserLoginName.getText()  );

             
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtUserId.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

     /**
     * This method is an action performed on the Modify button of the UserInformation page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method modifies User information as Login name, display name, password, email id, mobile number and type (admin/user)
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        //modify record
        try {
            if (txtUserId.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please select User from the below table");
                txtUserId.requestFocus();
                return;
            }
            if (txtUserLoginName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User Login Name can not be empty. Please enter User Login Name");
                txtUserLoginName.requestFocus();
                return;
            }

            if (txtUserDisplayName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User Display Name can not be empty. Please enter User Display Name");
                txtUserDisplayName.requestFocus();
                return;
            }
            if (txtUserPassword.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User Password can not be empty. Please enter Password");
                txtUserPassword.requestFocus();
                return;
            }
            if (txtEmailID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "EmailId can not be empty. Please enter EmailId");
                txtEmailID.requestFocus();
                return;
            }
            if (txtMobileNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Mobile Number can not be empty. Please enter Mobile number");
                txtMobileNo.requestFocus();
                return;
            }

            //update record
            MainClass mc = new MainClass();

            if (mc.emailValidation(txtEmailID.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Email is is invalid");
                txtEmailID.requestFocus();
                return;

            }
            if (mc.numValidation(txtMobileNo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Mobile no should have only numbers");
                txtMobileNo.requestFocus();
                return;

            }

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //dupliate user login name
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from user_master where u_name ='" + txtUserLoginName.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 1) {
                JOptionPane.showMessageDialog(null, "Duplicate user login name are not allowed");
                txtUserLoginName.requestFocus();
                return;
            }

            String uActive = "1";
            if (chkActive.isSelected() == true) {
                uActive = "1";
            } else {
                uActive = "0";
            }

            String sql = "update user_master set u_name='" + txtUserLoginName.getText() + "', u_password ='" + txtUserPassword.getText() + "',u_type='" + CmbUserType.getSelectedItem().toString()
                    + "',u_display_name='" + txtUserDisplayName.getText() + "', u_emailid='" + txtEmailID.getText() + "',u_mobile_no='" + txtMobileNo.getText() + "', u_active =" + uActive + ", u_modify_date= sysdate(), u_modify_by=" + MainClass.strID
                    + " where u_id =" + txtUserId.getText();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record updated.");

             mc.userLogInsertion("User edited ", "User name : " + txtUserLoginName.getText() );
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtUserId.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    /**
     * This method is an action performed on the Delete button of the UserInformation page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method deletes User information as Login name, display name, password, email id, mobile number and type (admin/user)
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtUserId.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "No record found for delete.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this record ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from user_master where u_id =" + txtUserId.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");
                mc.userLogInsertion("User deleted ", "User name : " + txtUserLoginName.getText() );
                ClearText();
                FillGrid();

                btnSave.setEnabled(true);
                btnModify.setEnabled(false);
                btnDelete.setEnabled(false);
                txtUserId.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

      /**
     * This method is an action performed on the Refresh button of the UserInformation page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method clears all the text filled in text labels
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        FillGrid();

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
        txtUserId.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // EmailID action performed
    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed

    }//GEN-LAST:event_txtEmailIDActionPerformed

     /**
     * This method is an mouse event performed on the tableUserInfo
     * 
     * @param name - evt
     * @return - void
     */
    private void tableUserInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserInfoMouseClicked

        int row = tableUserInfo.rowAtPoint(evt.getPoint());
        int col = 0;//jTable1.columnAtPoint(evt.getPoint());
        //JOptionPane.showMessageDialog(null," Value in the cell clicked :"+ " " +jTable1.getValueAt(row,col).toString());
        String StrIn = tableUserInfo.getValueAt(row, col).toString();

        Display(StrIn);

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableUserInfoMouseClicked

    // MobileNumber Action performed
    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
    }//GEN-LAST:event_txtMobileNoActionPerformed

    // LoginName Action performed
    private void txtUserLoginNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserLoginNameActionPerformed
    }//GEN-LAST:event_txtUserLoginNameActionPerformed

    // Frame opened
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

    // Display Name Action Performed
    private void txtUserDisplayNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserDisplayNameActionPerformed
    }//GEN-LAST:event_txtUserDisplayNameActionPerformed

    // User password Action performed
    private void txtUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPasswordActionPerformed
    }//GEN-LAST:event_txtUserPasswordActionPerformed

    // This method clears the text
    private void ClearText() {
        txtUserId.setText("");
        txtUserLoginName.setText("");
        txtUserPassword.setText("");
        txtUserDisplayName.setText("");
        txtMobileNo.setText("");
        txtEmailID.setText("");
        chkActive.setSelected(true);

    }

    // This method displays content by fetching details from database
    private void Display(String StrIn) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select * from user_master where u_id=" + StrIn + "");
            rs = stmt.executeQuery();
            rs.first();

            ClearText();

            txtUserId.setText(rs.getString("u_id"));
            txtUserLoginName.setText(rs.getString("u_name"));
            txtUserPassword.setText(rs.getString("u_password"));
            CmbUserType.setSelectedItem(rs.getString("u_type"));
            txtUserDisplayName.setText(rs.getString("u_display_name"));
            txtMobileNo.setText(rs.getString("u_mobile_no"));
            txtEmailID.setText(rs.getString("u_emailid"));

            String uActive;
            uActive = rs.getString("u_active");
            //JOptionPane.showMessageDialog(null, uActive);
            if (uActive == "1") {
                chkActive.setSelected(true);
            } 
             if (uActive == "0")  
            {
                chkActive.setSelected(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // Fills grid fetching details from database
    private void FillGrid() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select u_id, u_name, u_type, u_emailid from user_master order by u_id");
            rs = stmt.executeQuery();

            tableUserInfo.getColumnModel().getColumn(0).setHeaderValue("User ID");
            tableUserInfo.getColumnModel().getColumn(1).setHeaderValue("User Name");
            tableUserInfo.getColumnModel().getColumn(2).setHeaderValue("User Type");
            tableUserInfo.getColumnModel().getColumn(3).setHeaderValue("Email ID");
            tableUserInfo.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableUserInfo.getRowCount() > 0) {
                ((DefaultTableModel) tableUserInfo.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableUserInfo.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbUserType;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lablUserId;
    private javax.swing.JLabel lblDisplayName;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblLoginPwd;
    private javax.swing.JLabel lblMobileNum;
    private javax.swing.JLabel lblUserLoginName;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JTable tableUserInfo;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtUserDisplayName;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserLoginName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}
