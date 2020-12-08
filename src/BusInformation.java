
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;

/**
 * This class is responsible to enter bus details for Bus Management System
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 4.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 5.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 6.tableBusMouseClicked(java.awt.event.MouseEvent evt)
 * 7.txtNoSeatsActionPerformed(java.awt.event.ActionEvent evt)
 * 8.txtBusNoActionPerformed(java.awt.event.ActionEvent evt)
 * 9.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 10.txtMakeModelActionPerformed(java.awt.event.ActionEvent evt)
 * 11.txtYearActionPerformed(java.awt.event.ActionEvent evt)
 * 12.txtDriverNameActionPerformed(java.awt.event.ActionEvent evt)
 * 13.ClearText()
 * 14.Display(String StrIn)
 * 15.FillGrid()
 * 
 * @author Abhinandan Reddy
 */
public class BusInformation extends javax.swing.JInternalFrame {

   
    public BusInformation() {
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
        jPanel1 = new javax.swing.JPanel();
        lblBusId = new javax.swing.JLabel();
        lblBusModel = new javax.swing.JLabel();
        txtBusID = new javax.swing.JTextField();
        lblBusType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBus = new javax.swing.JTable();
        lblNumSeats = new javax.swing.JLabel();
        txtNoSeats = new javax.swing.JTextField();
        lblMfdYear = new javax.swing.JLabel();
        lblBusNo = new javax.swing.JLabel();
        txtBusNo = new javax.swing.JTextField();
        txtMakeModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblSeatLout = new javax.swing.JLabel();
        CmbSeatLayout = new javax.swing.JComboBox<>();
        lblDriverName = new javax.swing.JLabel();
        txtDriverName = new javax.swing.JTextField();
        cmbBusType = new javax.swing.JComboBox<>();
        chkActive = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Bus Information");
        setAutoscrolls(true);
        setNormalBounds(new java.awt.Rectangle(0, 0, 74, 0));
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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

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
                .addGap(55, 55, 55)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        lblBusId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusId.setForeground(new java.awt.Color(51, 0, 255));
        lblBusId.setText("Bus ID :");

        lblBusModel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusModel.setForeground(new java.awt.Color(0, 0, 255));
        lblBusModel.setText("Bus Model :");

        txtBusID.setEditable(false);

        lblBusType.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusType.setForeground(new java.awt.Color(51, 0, 255));
        lblBusType.setText("Bus Type :");

        tableBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bus ID", "Bus No", "Bus Model", "NumOfSeats"
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
        tableBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBus);

        lblNumSeats.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumSeats.setForeground(new java.awt.Color(0, 0, 255));
        lblNumSeats.setText("No. of Seats : ");

        txtNoSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoSeatsActionPerformed(evt);
            }
        });

        lblMfdYear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMfdYear.setForeground(new java.awt.Color(0, 0, 255));
        lblMfdYear.setText("Mfd Year :");

        lblBusNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusNo.setForeground(new java.awt.Color(0, 0, 255));
        lblBusNo.setText("Bus No. :");

        txtBusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusNoActionPerformed(evt);
            }
        });

        txtMakeModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakeModelActionPerformed(evt);
            }
        });

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        lblSeatLout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSeatLout.setForeground(new java.awt.Color(0, 0, 255));
        lblSeatLout.setText("Seat Layout :");

        CmbSeatLayout.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 X 2", "2 X 3" }));

        lblDriverName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDriverName.setForeground(new java.awt.Color(0, 0, 255));
        lblDriverName.setText("Driver Name :");

        txtDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverNameActionPerformed(evt);
            }
        });

        cmbBusType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luxury Bus", "Sleeper Bus", "Semi Sleeper Bus", "A/C Bus", "Passenger Bus", "Others" }));

        chkActive.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        chkActive.setForeground(new java.awt.Color(51, 0, 255));
        chkActive.setText("Bus Active");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBusId)
                            .addComponent(lblBusModel)
                            .addComponent(lblBusType)
                            .addComponent(lblDriverName))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDriverName)
                            .addComponent(txtMakeModel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(cmbBusType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkActive)
                            .addComponent(txtBusID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBusNo)
                            .addComponent(lblMfdYear)
                            .addComponent(lblNumSeats)
                            .addComponent(lblSeatLout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNoSeats, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusNo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(CmbSeatLayout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBusId)
                            .addComponent(txtBusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBusModel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBusNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMfdYear)
                            .addComponent(txtMakeModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumSeats)
                            .addComponent(lblBusType)
                            .addComponent(cmbBusType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatLout)
                    .addComponent(CmbSeatLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDriverName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkActive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1084, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     /**
     * This method is an action performed on the Close button of the Bus Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * This method is an action performed on the Save button of the Bus Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Add new record
        try {
            //validation
            if (txtBusNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus no.");
                txtBusNo.requestFocus();
                return;
            }

            //check for duplicate 
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from bus_master where b_no ='" + txtBusNo.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "Duplicate bus no.  are not allowed");
                txtBusNo.requestFocus();
                return;
            }

            if (txtMakeModel.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus make and model");
                txtMakeModel.requestFocus();
                return;
            }
            if (txtYear.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus model year");
                txtYear.requestFocus();
                return;
            }
            if (mc.numValidation(txtYear.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Bus make year should have only numbers");
                txtYear.requestFocus();
                return;

            }

            if (txtNoSeats.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter no. of seats");
                txtNoSeats.requestFocus();
                return;
            }
            if (mc.numValidation(txtNoSeats.getText()) == false) {
                JOptionPane.showMessageDialog(null, "No. of seats should have only numbers");
                txtNoSeats.requestFocus();
                return;

            }
            if (txtDriverName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter name of driver");
                txtDriverName.requestFocus();
                return;
            }
            //insert into user master 
            String sql = "insert into bus_master (b_no,b_make_model,b_year,b_driver,b_type,b_seats,b_seats_layout,b_create_by,b_create_date,b_active) values ('"
                    + txtBusNo.getText() + "','" + txtMakeModel.getText() + "'," + txtYear.getText() + ",'" + txtDriverName.getText() + "','"
                    + cmbBusType.getSelectedItem().toString() + "'," + txtNoSeats.getText() + ",'" + CmbSeatLayout.getSelectedItem().toString()
                    + "'," + MainClass.strID + ",sysdate(),1)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            mc.userLogInsertion("New bus details Created", "Bus No : " + txtBusNo.getText());
            
            JOptionPane.showMessageDialog(null, "Record added.");

            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtBusID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * This method is an action performed on the Modify button of the Bus Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        try {
            //update record
            MainClass mc = new MainClass();
            if (txtBusID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Select user from grid to edit");
                txtBusID.requestFocus();
                return;
            }
            if (txtBusNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus no.");
                txtBusNo.requestFocus();
                return;
            }

            if (txtMakeModel.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus model");
                txtMakeModel.requestFocus();
                return;
            }
            if (txtYear.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter bus model year");
                txtYear.requestFocus();
                return;
            }
            if (mc.numValidation(txtYear.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Bus model year should have only numbers");
                txtYear.requestFocus();
                return;

            }

            if (txtNoSeats.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter no. of seats");
                txtNoSeats.requestFocus();
                return;
            }
            if (mc.numValidation(txtNoSeats.getText()) == false) {
                JOptionPane.showMessageDialog(null, "No. of seats should have only numbers");
                txtNoSeats.requestFocus();
                return;

            }
            if (txtDriverName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter name of driver");
                txtDriverName.requestFocus();
                return;
            }

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //dupliate user login name
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from bus_master where b_no ='" + txtBusNo.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 1) {
                JOptionPane.showMessageDialog(null, "Duplicate bus no.  are not allowed");
                txtBusNo.requestFocus();
                return;
            }

            String uActive = "1";
            if (chkActive.isSelected() == true) {
                uActive = "1";
            } else {
                uActive = "0";
            }

            //update user master 
            String sql = "update bus_master set b_no='" + txtBusNo.getText() + "', b_make_model ='" + txtMakeModel.getText() + "',b_year=" + txtYear.getText()
                    + ",b_driver='" + txtDriverName.getText() + "', b_type='" + cmbBusType.getSelectedItem().toString() + "',b_seats=" + txtNoSeats.getText()
                    + ",b_seats_layout='" + CmbSeatLayout.getSelectedItem().toString() + "',  b_active =" + uActive + ", b_modify_date= sysdate(), b_modify_by=" + MainClass.strID
                    + " where b_id =" + txtBusID.getText();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record updated.");

            mc.userLogInsertion("Bus details updated", "Bus No : " + txtBusNo.getText());
            
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtBusID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    /**
     * This method is an action performed on the Delete button of the Bus Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtBusID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "No record found for deletion.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this record ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from bus_master where n_id =" + txtBusID.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");

                mc.userLogInsertion("Bus details deleted", "Bus No : " + txtBusNo.getText());
                
                ClearText();
                FillGrid();

                btnSave.setEnabled(true);
                btnModify.setEnabled(false);
                btnDelete.setEnabled(false);
                txtBusID.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * This method is an action performed on the Refresh button of the Bus Information page
     * 
     * @param name - evt
     * @return - void
     * It clears all the text filled
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        FillGrid();

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
        txtBusID.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Bus table mouse clicked event method
    private void tableBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBusMouseClicked

        int row = tableBus.rowAtPoint(evt.getPoint());
        int col = 0;//jTable1.columnAtPoint(evt.getPoint());
        //JOptionPane.showMessageDialog(null," Value in the cell clicked :"+ " " +jTable1.getValueAt(row,col).toString());
        String StrIn = tableBus.getValueAt(row, col).toString();

        Display(StrIn);

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableBusMouseClicked

    // Number of seats action performed
    private void txtNoSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoSeatsActionPerformed
    }//GEN-LAST:event_txtNoSeatsActionPerformed

    // Bus number action performed
    private void txtBusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusNoActionPerformed
    }//GEN-LAST:event_txtBusNoActionPerformed

    // Frame opened event happened
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

    // Bus make model action performed
    private void txtMakeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakeModelActionPerformed
    }//GEN-LAST:event_txtMakeModelActionPerformed

    // Year textfield action performed
    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
    }//GEN-LAST:event_txtYearActionPerformed

    // Driver name text field action performed
    private void txtDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverNameActionPerformed
    }//GEN-LAST:event_txtDriverNameActionPerformed

    private void ClearText() {
        txtBusID.setText("");
        txtBusNo.setText("");
        txtYear.setText("");
        txtMakeModel.setText("");
        txtNoSeats.setText("");
        txtDriverName.setText("");
        chkActive.setSelected(true);

    }

    // Displaying all the information fetching details from the database
    private void Display(String StrIn) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select * from bus_master where b_id=" + StrIn + "");
            rs = stmt.executeQuery();
            rs.first();

            ClearText();

            txtBusID.setText(rs.getString("b_id"));
            txtBusNo.setText(rs.getString("b_no"));
            txtMakeModel.setText(rs.getString("b_make_model"));
            txtYear.setText(rs.getString("b_year"));
            cmbBusType.setSelectedItem(rs.getString("b_type"));
            txtNoSeats.setText(rs.getString("b_seats"));
            txtDriverName.setText(rs.getString("b_driver"));
            CmbSeatLayout.setSelectedItem(rs.getString("b_seats_layout"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }
    
    // Filling grid fetching information from the database
    private void FillGrid() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select b_id, b_no, b_make_model, b_seats from bus_master order by b_id");
            rs = stmt.executeQuery();

            tableBus.getColumnModel().getColumn(0).setHeaderValue("Bus ID");
            tableBus.getColumnModel().getColumn(1).setHeaderValue("Bus No");
            tableBus.getColumnModel().getColumn(2).setHeaderValue("Bus Model");
            tableBus.getColumnModel().getColumn(3).setHeaderValue("No. of Seats");
            tableBus.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableBus.getRowCount() > 0) {
                ((DefaultTableModel) tableBus.getModel()).removeRow(0);
            }

            
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableBus.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbSeatLayout;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JComboBox<String> cmbBusType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusId;
    private javax.swing.JLabel lblBusModel;
    private javax.swing.JLabel lblBusNo;
    private javax.swing.JLabel lblBusType;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblMfdYear;
    private javax.swing.JLabel lblNumSeats;
    private javax.swing.JLabel lblSeatLout;
    private javax.swing.JTable tableBus;
    private javax.swing.JTextField txtBusID;
    private javax.swing.JTextField txtBusNo;
    private javax.swing.JTextField txtDriverName;
    private javax.swing.JTextField txtMakeModel;
    private javax.swing.JTextField txtNoSeats;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
