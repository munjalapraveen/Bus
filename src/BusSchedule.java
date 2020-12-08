
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;


/**
 * This class is responsible to schedule bus
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 4.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 5.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 6.tableBusScheduleMouseClicked(java.awt.event.MouseEvent evt) 
 * 7.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 8.chkActiveActionPerformed(java.awt.event.ActionEvent evt)
 * 9.cmbBusIDActionPerformed(java.awt.event.ActionEvent evt)
 * 10.cmbStartDestActionPerformed(java.awt.event.ActionEvent evt)
 * 11.ClearText()
 * 12.Display(String StrIn)
 * 13.FillGrid()
 * 
 * @author Surya Raj
 * 
 * Bus scheduling includes bus details, departure place, arriving place, departing time, arriving time and schedule date
 */
public class BusSchedule extends javax.swing.JInternalFrame {

   
    public BusSchedule() {
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
        lblSchId = new javax.swing.JLabel();
        lblBusId = new javax.swing.JLabel();
        txtSchID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBusSchedule = new javax.swing.JTable();
        lblScheduleDate = new javax.swing.JLabel();
        txtSchDate = new javax.swing.JTextField();
        cmbStartDest = new javax.swing.JComboBox<>();
        lblBusDetails = new javax.swing.JLabel();
        LblBusDeatils = new javax.swing.JLabel();
        lblDepartingPlace = new javax.swing.JLabel();
        cmbBusID = new javax.swing.JComboBox<>();
        lblArrivingPlace = new javax.swing.JLabel();
        cmbEndDest = new javax.swing.JComboBox<>();
        lblFare = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();
        lblDepartingTime = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        lblArrivalTime = new javax.swing.JLabel();
        txtBusDetails = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        lblYearFormat = new javax.swing.JLabel();
        lblTimeFormat = new javax.swing.JLabel();
        lblTimeFormat2 = new javax.swing.JLabel();

        setTitle("Bus Schedule Information");
        setPreferredSize(new java.awt.Dimension(1050, 900));
        setRequestFocusEnabled(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRefresh)
                .addGap(39, 39, 39)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblSchId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSchId.setForeground(new java.awt.Color(51, 0, 255));
        lblSchId.setText("Schedule ID :");

        lblBusId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusId.setForeground(new java.awt.Color(51, 0, 255));
        lblBusId.setText("Bus ID :");

        txtSchID.setEditable(false);

        tableBusSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule ID", "Bus No", "Bus Type", "Journey Date", "Departure", "Arrival", "Fare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBusSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBusScheduleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBusSchedule);

        lblScheduleDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblScheduleDate.setForeground(new java.awt.Color(0, 0, 255));
        lblScheduleDate.setText("Schedule Date :");

        cmbStartDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStartDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStartDestActionPerformed(evt);
            }
        });

        lblBusDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusDetails.setForeground(new java.awt.Color(51, 0, 255));
        lblBusDetails.setText("Bus Details :");

        lblDepartingPlace.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDepartingPlace.setForeground(new java.awt.Color(51, 0, 255));
        lblDepartingPlace.setText("Departing Place :");

        cmbBusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBusIDActionPerformed(evt);
            }
        });

        lblArrivingPlace.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblArrivingPlace.setForeground(new java.awt.Color(0, 0, 255));
        lblArrivingPlace.setText("Arriving Place :");

        cmbEndDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFare.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFare.setForeground(new java.awt.Color(0, 0, 255));
        lblFare.setText("Fare :");

        chkActive.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        chkActive.setForeground(new java.awt.Color(0, 51, 255));
        chkActive.setText("Schedule Active");
        chkActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActiveActionPerformed(evt);
            }
        });

        lblDepartingTime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDepartingTime.setForeground(new java.awt.Color(0, 0, 255));
        lblDepartingTime.setText("Departing Time :");

        lblArrivalTime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblArrivalTime.setForeground(new java.awt.Color(0, 0, 255));
        lblArrivalTime.setText("Arrival Time :");

        txtBusDetails.setEditable(false);

        lblYearFormat.setForeground(new java.awt.Color(51, 0, 255));
        lblYearFormat.setText("(yyyy-MM-dd)");

        lblTimeFormat.setForeground(new java.awt.Color(51, 0, 255));
        lblTimeFormat.setText("(HH:MM)");

        lblTimeFormat2.setForeground(new java.awt.Color(51, 0, 255));
        lblTimeFormat2.setText("(HH:MM)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSchId)
                                    .addComponent(lblBusId))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSchID)
                                    .addComponent(cmbBusID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDepartingPlace)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFare)
                                            .addComponent(lblDepartingTime))
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbStartDest, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblTimeFormat))
                                        .addComponent(txtFare, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(LblBusDeatils, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblScheduleDate)
                                            .addComponent(lblBusDetails)
                                            .addComponent(lblArrivingPlace)
                                            .addComponent(lblArrivalTime))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBusDetails)
                                            .addComponent(cmbEndDest, 0, 270, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtSchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblYearFormat))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTimeFormat2))))
                                    .addComponent(chkActive))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblScheduleDate)
                        .addComponent(txtSchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblYearFormat))
                    .addComponent(lblSchId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusId)
                    .addComponent(lblBusDetails)
                    .addComponent(LblBusDeatils)
                    .addComponent(cmbBusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDepartingPlace)
                        .addComponent(cmbStartDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbEndDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblArrivingPlace))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeFormat)
                            .addComponent(lblTimeFormat2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDepartingTime))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblArrivalTime)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFare)
                    .addComponent(chkActive))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(781, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(576, 576, 576))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the Bus Schedule page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Save button of the Bus Schedule page
     * 
     * @param name - evt
     * @return - void
     * 
     * It saves all bus scheduled information
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Add new record
        try {
            //validation
            if (txtSchDate.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter schedule date");
                txtSchDate.requestFocus();
                return;
            }

            //check for duplicate 
            MainClass mc = new MainClass();

            if (mc.dateFormatValidation(txtSchDate.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter schedule date in yyyy-MM-dd format only");
                txtSchDate.requestFocus();
                return;
            }

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sqlQuery1;//= " select b_id from bus_master where b_name='" + CmbBusID.getSelectedItem().toString() + "'";
            ResultSet rs1; //= stmt1.executeQuery(sqlQuery1);
            String BusID;
            BusID = cmbBusID.getSelectedItem().toString();//rs1.getString("b_id");

            sqlQuery1 = "select count(*) from schedule_master where sm_date ='" + txtSchDate.getText() + "' and sm_b_id = " + BusID;
            rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "Please check schedule date, same bus can not run on same day");
                txtSchDate.requestFocus();
                return;
            }

            if (cmbStartDest.getSelectedItem().toString().equals(cmbEndDest.getSelectedItem().toString()) == true) {
                JOptionPane.showMessageDialog(null, "Departure and arrival destination can not be same");
                cmbStartDest.requestFocus();
                return;
            }

            if (txtStartTime.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter departure time");
                txtStartTime.requestFocus();
                return;
            }
            if (mc.timeFormatValidation(txtStartTime.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter departure time in HH:MM format only");
                txtStartTime.requestFocus();
                return;
            }
            if (txtEndTime.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter arriave time");
                txtEndTime.requestFocus();
                return;
            }
            if (mc.timeFormatValidation(txtEndTime.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter arrival time in HH:MM format only");
                txtEndTime.requestFocus();
                return;
            }
            if (txtFare.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter fare");
                txtFare.requestFocus();
                return;
            }
            if (mc.numValidation(txtFare.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter only numbers in fare");
                txtFare.requestFocus();
                return;

            }

            String StartDestID;
            String EndDestID;

            StartDestID = GetValueDB(" select d_id from destination_master where d_name='" + cmbStartDest.getSelectedItem().toString() + "'");
            EndDestID = GetValueDB(" select d_id from destination_master where d_name='" + cmbEndDest.getSelectedItem().toString() + "'");

            //insert into user master 
            String sql = "insert into schedule_master(sm_b_id,sm_date,sm_dest_start_id,sm_dest_end_id,sm_active,sm_fare,sm_create_by,sm_create_date,sm_start_time,sm_end_time) values ("
                    + BusID + ",'" + txtSchDate.getText() + "'," + StartDestID + "," + EndDestID + ",1," + txtFare.getText() + "," + MainClass.strID + ",sysdate(),'" + txtStartTime.getText() + "','" + txtEndTime.getText() + "')";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            mc.userLogInsertion("New schedule created ", "Schedule Date : " + txtSchDate.getText());
            
            JOptionPane.showMessageDialog(null, "Schdeule added.");

            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtSchID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

     /**
     * This method is an action performed on the Modify button of the Bus Schedule page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        //modify record
        try {
            if (txtSchDate.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter schedule date");
                txtSchDate.requestFocus();
                return;
            }

            //check for duplicate 
            MainClass mc = new MainClass();

            if (mc.dateFormatValidation(txtSchDate.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter schedule date in yyyy-MM-dd format only");
                txtSchDate.requestFocus();
                return;
            }

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sqlQuery1;//= " select b_id from bus_master where b_name='" + CmbBusID.getSelectedItem().toString() + "'";
            ResultSet rs1; //= stmt1.executeQuery(sqlQuery1);
            String BusID;
            BusID = cmbBusID.getSelectedItem().toString();//rs1.getString("b_id");

            sqlQuery1 = "select count(*) from schedule_master where sm_date ='" + txtSchID.getText() + "' and sm_b_id = " + BusID;
            rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "Please check schedule date, same bus can not run on same day");
                txtSchDate.requestFocus();
                return;
            }

            if (txtStartTime.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter departure time");
                txtStartTime.requestFocus();
                return;
            }
            if (txtEndTime.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter arriave time");
                txtEndTime.requestFocus();
                return;
            }
            if (txtFare.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter fare");
                txtFare.requestFocus();
                return;
            }
            if (mc.numValidation(txtFare.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter only numbers in fare");
                txtFare.requestFocus();
                return;

            }

            String StartDestID;
            String EndDestID;

            StartDestID = GetValueDB(" select d_id from destination_master where d_name='" + cmbStartDest.getSelectedItem().toString() + "'");
            EndDestID = GetValueDB(" select d_id from destination_master where d_name='" + cmbEndDest.getSelectedItem().toString() + "'");

            String uActive = "1";
            if (chkActive.isSelected() == true) {
                uActive = "1";
            } else {
                uActive = "0";
            }

            //update 
            //          String sql = "insert into schedule_master  (sm_b_id,sm_date,sm_dest_start_id,sm_dest_end_id,sm_active,sm_fare,sm_create_by,sm_create_date,sm_start_time,sm_end_time) values ('" 
            String sql = "update schedule_master set sm_b_id=" + BusID + ",  sm_date ='" + txtSchDate.getText()
                    + "', sm_dest_start_id = " + StartDestID
                    + ", sm_dest_end_id = " + EndDestID
                    + ", sm_active =" + uActive
                    + ", sm_fare = " + txtFare.getText()
                    + ", sm_start_time = '" + txtStartTime.getText()
                    + "',sm_end_time = '" + txtEndTime.getText()
                    + "' where sm_id =" + txtSchID.getText();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record updated.");

            mc.userLogInsertion("Bus schedule updated ", "Schedule Date : " + txtSchDate.getText());
            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            txtSchID.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

     /**
     * This method is an action performed on the Delete button of the Bus Schedule page
     * 
     * @param name - evt
     * @return - void
     * 
     * It deletes all the information
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtSchID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "No record found for delete.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this record ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from schedule_master where sm_id =" + txtSchID.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");

                ClearText();
                FillGrid();

                btnSave.setEnabled(true);
                btnModify.setEnabled(false);
                btnDelete.setEnabled(false);
                txtSchID.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

     /**
     * This method is an action performed on the Refresh button of the Bus Schedule page
     * 
     * @param name - evt
     * @return - void
     * 
     * It clears all the data
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        FillGrid();

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
        txtSchID.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Bus scedule table mouse clicked event
    private void tableBusScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBusScheduleMouseClicked

        int row = tableBusSchedule.rowAtPoint(evt.getPoint());
        int col = 0;//jTable1.columnAtPoint(evt.getPoint());
        //JOptionPane.showMessageDialog(null," Value in the cell clicked :"+ " " +jTable1.getValueAt(row,col).toString());
        String StrIn = tableBusSchedule.getValueAt(row, col).toString();

        Display(StrIn);

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableBusScheduleMouseClicked

    // Form opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            FillGrid();

            MainClass mc = new MainClass();
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            cmbStartDest.removeAllItems();
            cmbEndDest.removeAllItems();
            PreparedStatement stmt = connection.prepareStatement("select d_name from destination_master where d_active=1 order by d_name");
            rs = stmt.executeQuery();
            while (rs.next()) {
                cmbStartDest.addItem(rs.getString(1));
                cmbEndDest.addItem(rs.getString(1));
            }
            rs.close();

            cmbBusID.removeAllItems();
            stmt = connection.prepareStatement("select b_id from bus_master where b_active=1 order by b_id");
            rs = stmt.executeQuery();
            while (rs.next()) {
                cmbBusID.addItem(rs.getString(1));

            }
            rs.close();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

    // Check where the schedule is active or not method
    private void chkActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActiveActionPerformed
    }//GEN-LAST:event_chkActiveActionPerformed

    // this method automatically fetched Bus ID detailsfrom database and fill the textfield for BusID
    private void cmbBusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBusIDActionPerformed

        txtBusDetails.setText(GetValueDB("select  concat( b_make_model , ', ', b_type , ', ', b_seats_layout) from bus_master where b_id=" + cmbBusID.getSelectedItem().toString()));

    }//GEN-LAST:event_cmbBusIDActionPerformed

    // action performed on start destination combo box
    private void cmbStartDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStartDestActionPerformed
    }//GEN-LAST:event_cmbStartDestActionPerformed

    // This method clears the text
    private void ClearText() {
        txtSchID.setText("");
        txtSchDate.setText("");
        txtBusDetails.setText("");
        txtStartTime.setText("");
        txtEndTime.setText("");
        txtFare.setText("");

        chkActive.setSelected(true);

    }

    // This method displays all the information fetching details from database
    private void Display(String StrIn) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select * from schedule_master where sm_id=" + StrIn + "");
            rs = stmt.executeQuery();
            rs.first();

            ClearText();

            txtSchID.setText(rs.getString("sm_id"));
            txtSchDate.setText(rs.getString("sm_date"));
            cmbBusID.setSelectedItem(rs.getString("sm_b_id"));
            //TxtBusDetails.setText(GetValueDB("select concat( b_make_model , ', ', b_type , ', ', b_seats_layout)  from bus_master where b_id=" + rs.getString("sm_b_id")));
            txtStartTime.setText(rs.getString("sm_start_time"));
            txtEndTime.setText(rs.getString("sm_end_time"));
            txtFare.setText(rs.getString("sm_fare"));

            cmbStartDest.setSelectedItem(GetValueDB(" select   d_name from destination_master where d_id=" + rs.getString("sm_dest_start_id")));
            cmbEndDest.setSelectedItem(GetValueDB(" select   d_name from destination_master where d_id=" + rs.getString("sm_dest_end_id")));

            String uActive;
            uActive = rs.getString("sm_active");
            if (uActive == "1") {
                chkActive.setSelected(true);
            } else {
                //ChkActive.setSelected(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // This method gets value from database
    public String GetValueDB(String Qr) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();
            rs.first();
            return rs.getString(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "";
        }

    }

    // This method fills grid fetching details from database
    private void FillGrid() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String qr;
            qr = "select sm_id, b_no, b_make_model,sm_date, (select d_name from destination_master d where d.d_id=sm_dest_start_id) dept,"
                    + "(select d_name from destination_master d where d.d_id=sm_dest_end_id) arrival, sm_fare "
                    + "from schedule_master, bus_master where sm_b_id=b_id order by sm_id";

            PreparedStatement stmt = connection.prepareStatement(qr);
            rs = stmt.executeQuery();

            tableBusSchedule.getColumnModel().getColumn(0).setHeaderValue("Schedule ID");
            tableBusSchedule.getColumnModel().getColumn(1).setHeaderValue("Bus No");
            tableBusSchedule.getColumnModel().getColumn(2).setHeaderValue("Bus Type");
            tableBusSchedule.getColumnModel().getColumn(3).setHeaderValue("Journey Date");
            tableBusSchedule.getColumnModel().getColumn(4).setHeaderValue("Departure");
            tableBusSchedule.getColumnModel().getColumn(5).setHeaderValue("Arrival");
            tableBusSchedule.getColumnModel().getColumn(6).setHeaderValue("Fare");

            tableBusSchedule.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableBusSchedule.getRowCount() > 0) {
                ((DefaultTableModel) tableBusSchedule.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableBusSchedule.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBusDeatils;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JComboBox<String> cmbBusID;
    private javax.swing.JComboBox<String> cmbEndDest;
    private javax.swing.JComboBox<String> cmbStartDest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArrivalTime;
    private javax.swing.JLabel lblArrivingPlace;
    private javax.swing.JLabel lblBusDetails;
    private javax.swing.JLabel lblBusId;
    private javax.swing.JLabel lblDepartingPlace;
    private javax.swing.JLabel lblDepartingTime;
    private javax.swing.JLabel lblFare;
    private javax.swing.JLabel lblSchId;
    private javax.swing.JLabel lblScheduleDate;
    private javax.swing.JLabel lblTimeFormat;
    private javax.swing.JLabel lblTimeFormat2;
    private javax.swing.JLabel lblYearFormat;
    private javax.swing.JTable tableBusSchedule;
    private javax.swing.JTextField txtBusDetails;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtFare;
    private javax.swing.JTextField txtSchDate;
    private javax.swing.JTextField txtSchID;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}
