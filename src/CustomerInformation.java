

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.concurrent.TimeUnit;

 /**
 * This class is responsible for adding customer details by Staff(User) member
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 4.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 5.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 6.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 7.TxtAddressActionPerformed(java.awt.event.ActionEvent evt)
 * 8.txtDOBActionPerformed(java.awt.event.ActionEvent evt) 
 * 9.txtCustNameActionPerformed(java.awt.event.ActionEvent evt)
 * 10.txtMobileNoActionPerformed(java.awt.event.ActionEvent evt)
 * 11.tableCustInfoMouseClicked(java.awt.event.MouseEvent evt)
 * 12.txtEmailIDActionPerformed(java.awt.event.ActionEvent evt)
 * 13.ClearText()
 * 14.Display(String StrIn)
 * 15.FillGrid()
 * 
 * @author Surya Raj
 * 
 * This class adds customer details like customer id, customer name, gender, date of birth, email id, mobile number
 * and address 
 */
public class CustomerInformation extends javax.swing.JInternalFrame {

    public CustomerInformation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustInfo = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCustId = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustInfo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        lblAddr = new javax.swing.JLabel();
        TxtAddress = new javax.swing.JTextField();
        lblYearFormat = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Customer Information");
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

        panelCustInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

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

        javax.swing.GroupLayout panelCustInfoLayout = new javax.swing.GroupLayout(panelCustInfo);
        panelCustInfo.setLayout(panelCustInfoLayout);
        panelCustInfoLayout.setHorizontalGroup(
            panelCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustInfoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustInfoLayout.setVerticalGroup(
            panelCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCustInfoLayout.createSequentialGroup()
                        .addGroup(panelCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnModify)
                            .addComponent(btnDelete)
                            .addComponent(btnRefresh))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        lblCustId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustId.setForeground(new java.awt.Color(51, 0, 255));
        lblCustId.setText("Customer Id :");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGender.setForeground(new java.awt.Color(51, 0, 255));
        lblGender.setText("Gender :");

        txtCustID.setEditable(false);

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        lblEmailId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(51, 0, 255));
        lblEmailId.setText("Email ID :");

        tableCustInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Id", "Customer Name", "Mobile No", "Email Id"
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
        tableCustInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustInfo);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Mobile No :");

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(51, 0, 255));
        lblDOB.setText("Date of Birth :");

        lblCustName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(51, 0, 255));
        lblCustName.setText("Customer Name :");

        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        lblAddr.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAddr.setForeground(new java.awt.Color(51, 0, 255));
        lblAddr.setText("Address :");

        TxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAddressActionPerformed(evt);
            }
        });

        lblYearFormat.setForeground(new java.awt.Color(51, 0, 255));
        lblYearFormat.setText("(yyyy-MM-dd)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustId)
                            .addComponent(lblGender)
                            .addComponent(lblEmailId)
                            .addComponent(lblAddr))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAddress)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustID)
                                    .addComponent(cmbGender, 0, 159, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustName)
                                    .addComponent(lblDOB)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCustName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblYearFormat)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustId)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustName)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearFormat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmailId))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelCustInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCustInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the Customer information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Save button of the Customer information page
     * 
     * @param name - evt
     * @return - void
     * 
     * It saves all the customer information
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Add new record
        try 
        {
            if (txtCustName.getText().trim().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Enter customer name");
                txtCustName.requestFocus();
                return;
            }

            MainClass mc = new MainClass();

            if (txtDOB.getText().trim().length() == 0) 
            {
                JOptionPane.showMessageDialog(null, "Enter date of birth");
                txtDOB.requestFocus();
                return;
            }

            if (mc.dateFormatValidation(txtDOB.getText()) == false) 
            {
                JOptionPane.showMessageDialog(null, "Invalid date of birth, it shoud be in YYYY-MM-DD format only");
                txtDOB.requestFocus();
                return;
            }
            
            if (mc.mobileNumberValidation(txtMobileNo.getText()) == false)
            {
                JOptionPane.showMessageDialog(null, "Mobile number is invalid. Please enter valid 10 digit mobile number");
                txtMobileNo.requestFocus();
                return;

            }

            try
            {
                Date current = new Date();
                String myFormatString = "yyyy-MM-dd";
                SimpleDateFormat df = new SimpleDateFormat(myFormatString);
                Date givenDate = df.parse(txtDOB.getText());
                Long l = givenDate.getTime();
                //create date object
                Date next = new Date(l);
                long diff = current.getTime() - next.getTime();
                long dd=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
            if (dd<0)
            {
                JOptionPane.showMessageDialog(null, "Date of birth can not be future date");
                txtDOB.requestFocus();
                return;
                
            }
          

            } catch (ParseException e) {
                         
        }

            if (txtEmailID.getText().trim().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Enter email id");
                txtEmailID.requestFocus();
                return;
            }

            if (mc.emailValidation(txtEmailID.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Email is is invalid");
                txtEmailID.requestFocus();
                return;

            }

            if (txtMobileNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter mobile no");
                txtMobileNo.requestFocus();
                return;
            }
            if (mc.numValidation(txtMobileNo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Mobile no should have only numbers");
                txtMobileNo.requestFocus();
                return;

            }
            if (TxtAddress.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter address");
                TxtAddress.requestFocus();
                return;
            
                
            }
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //insert into  master 
            String sql = "insert into customer_master (c_name,c_gender,c_dob,c_email_id,c_mobile_no,c_address,c_create_date,c_create_by) values ('"
                    + txtCustName.getText() + "','" + cmbGender.getSelectedItem().toString()
                    + "','" + txtDOB.getText() + "','" + txtEmailID.getText() + "','" + txtMobileNo.getText() + "','" + TxtAddress.getText() + "',sysdate()," + MainClass.strID + ")";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record added.");
            mc.userLogInsertion("New customer added ", "Customer Name : " + txtCustName.getText());
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtCustID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }//GEN-LAST:event_btnSaveActionPerformed

     /**
     * This method is an action performed on the Modify button of the Customer information page
     * 
     * @param name - evt
     * @return - void
     * 
     * It modifies customer information
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        //modify record
        try {
            if (txtCustName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter customer name");
                txtCustName.requestFocus();
                return;
            }

            MainClass mc = new MainClass();

            if (txtDOB.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter password");
                txtDOB.requestFocus();
                return;
            }

            if (mc.dateFormatValidation(txtDOB.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Invalid date of birth, it shoud be in YYYY-MM-DD format only");
                txtDOB.requestFocus();
                return;
            }

           
            if (txtEmailID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter email id");
                txtEmailID.requestFocus();
                return;
            }

            if (mc.emailValidation(txtEmailID.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Email is is invalid");
                txtEmailID.requestFocus();
                return;

            }

            if (txtMobileNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter mobile no");
                txtMobileNo.requestFocus();
                return;
            }
            if (mc.numValidation(txtMobileNo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Mobile no should have only numbers");
                txtMobileNo.requestFocus();
                return;

            }
            if (TxtAddress.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter address");
                TxtAddress.requestFocus();
                return;
            }
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //update  master 
            String sql = "update customer_master set c_name='" + txtCustName.getText() + "', c_gender ='" + cmbGender.getSelectedItem().toString()
                    + "',c_dob='" + txtDOB.getText() + "', c_email_id='" + txtEmailID.getText() + "',c_mobile_no='" + txtMobileNo.getText() + "', c_address ='" + TxtAddress.getText() + "', c_modify_date= sysdate(), c_modify_by=" + MainClass.strID
                    + " where c_id =" + txtCustID.getText();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record updated.");

            mc.userLogInsertion("Customer updated ", "Customer Name : " + txtCustName.getText());
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtCustID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    
     /**
     * This method is an action performed on the Delete button of the Customer information page
     * 
     * @param name - evt
     * @return - void
     * 
     * It deletes all the selected customer information
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtCustID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "No record found for delete.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this record ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from customer_master where c_id =" + txtCustID.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");
                mc.userLogInsertion("Customer deleted ", "Customer Name : " + txtCustName.getText());

                ClearText();
                FillGrid();

                btnSave.setEnabled(true);
                btnModify.setEnabled(false);
                btnDelete.setEnabled(false);
                txtCustID.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

     /**
     * This method is an action performed on the Refresh button of the Customer information page
     * 
     * @param name - evt
     * @return - void
     * 
     * Clears text in the customer information form
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        FillGrid();

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
        txtCustID.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Form opened event
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

    private void TxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddressActionPerformed
    }//GEN-LAST:event_TxtAddressActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
    }//GEN-LAST:event_txtCustNameActionPerformed

    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
    }//GEN-LAST:event_txtMobileNoActionPerformed

    
    // Customer table info mouse clicked event
    private void tableCustInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustInfoMouseClicked

        int row = tableCustInfo.rowAtPoint(evt.getPoint());
        int col = 0;
        String StrIn = tableCustInfo.getValueAt(row, col).toString();

        Display(StrIn);

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableCustInfoMouseClicked

    
    
    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed

    }//GEN-LAST:event_txtEmailIDActionPerformed

    // It clears the text in the form
    private void ClearText() {
        txtCustID.setText("");
        txtCustName.setText("");
        txtDOB.setText("");
        txtMobileNo.setText("");
        txtEmailID.setText("");
        TxtAddress.setText("");

    }

    // Displays Customer Information Form
    private void Display(String StrIn) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select * from customer_master where c_id=" + StrIn + "");
            rs = stmt.executeQuery();
            rs.first();

            ClearText();

            txtCustID.setText(rs.getString("c_id"));
            txtCustName.setText(rs.getString("c_name"));
            txtDOB.setText(rs.getString("c_dob"));
            cmbGender.setSelectedItem(rs.getString("c_gender"));
            txtMobileNo.setText(rs.getString("c_mobile_no"));
            txtEmailID.setText(rs.getString("c_email_id"));
            TxtAddress.setText(rs.getString("c_address"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // Fills Customer information data
    private void FillGrid() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select c_id, c_name, c_mobile_no, c_email_id from customer_master order by c_id");
            rs = stmt.executeQuery();

            tableCustInfo.getColumnModel().getColumn(0).setHeaderValue("Cust ID");
            tableCustInfo.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
            tableCustInfo.getColumnModel().getColumn(2).setHeaderValue("Mobile No");
            tableCustInfo.getColumnModel().getColumn(3).setHeaderValue("Email ID");
            tableCustInfo.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableCustInfo.getRowCount() > 0) {
                ((DefaultTableModel) tableCustInfo.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableCustInfo.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblYearFormat;
    private javax.swing.JPanel panelCustInfo;
    private javax.swing.JTable tableCustInfo;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtMobileNo;
    // End of variables declaration//GEN-END:variables
}
