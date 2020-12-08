
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * This class is responsible to book bus tickets
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 4.tableBookingMouseClicked(java.awt.event.MouseEvent evt)
 * 5.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 6.cmbStartDestActionPerformed(java.awt.event.ActionEvent evt) 
 * 7.btnSearchBusActionPerformed(java.awt.event.ActionEvent evt)
 * 8.cmbPayTypeActionPerformed(java.awt.event.ActionEvent evt)
 * 9.tableBooking2MouseClicked(java.awt.event.MouseEvent evt)
 * 10.cmbCustIDActionPerformed(java.awt.event.ActionEvent evt) 
 * 11.ClearText()
 * 12.Display(String StrIn)
 * 13.FillGrid()
 * 
 * @author Sayali Vakil
 * 
 * This class is responsible to book details where he enters departing and arriving details and books tickets for customer and
 * their friends and family
 */
public class Booking extends javax.swing.JInternalFrame {

   
    public Booking() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBooking2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        panelBooking1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooking = new javax.swing.JTable();
        lblDepartDest = new javax.swing.JLabel();
        cmbStartDest = new javax.swing.JComboBox<>();
        lblArrDest = new javax.swing.JLabel();
        cmbEndDest = new javax.swing.JComboBox<>();
        lblSchDate = new javax.swing.JLabel();
        txtSchDate = new javax.swing.JTextField();
        btnSearchBus = new javax.swing.JButton();
        lblSchId = new javax.swing.JLabel();
        txtTotalAmt = new javax.swing.JTextField();
        lblJrnyDate = new javax.swing.JLabel();
        txtPayDescription = new javax.swing.JTextField();
        lblCustId = new javax.swing.JLabel();
        cmbPayType = new javax.swing.JComboBox<>();
        lblCustDetails = new javax.swing.JLabel();
        txtCustDetails = new javax.swing.JTextField();
        lblPayType = new javax.swing.JLabel();
        lblTotalAmt = new javax.swing.JLabel();
        lblPayDescription = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtIPsngrD = new javax.swing.JTextField();
        lblPsngrName = new javax.swing.JLabel();
        txtPasName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cmbPasGender = new javax.swing.JComboBox<>();
        lblPasAge = new javax.swing.JLabel();
        txtPasSeatNo = new javax.swing.JTextField();
        lblSeatNo = new javax.swing.JLabel();
        txtPasAge = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBooking2 = new javax.swing.JTable();
        txtSchDateConfirm = new javax.swing.JTextField();
        cmbCustID = new javax.swing.JComboBox<>();
        lblFarePP = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();
        txtSchID = new javax.swing.JTextField();
        lblDateFormat = new javax.swing.JLabel();

        setTitle("Booking");
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

        panelBooking2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cl.gif"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad.gif"))); // NOI18N
        btnSave.setText("SAVE BOOKING");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/re.gif"))); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBooking2Layout = new javax.swing.GroupLayout(panelBooking2);
        panelBooking2.setLayout(panelBooking2Layout);
        panelBooking2Layout.setHorizontalGroup(
            panelBooking2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBooking2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(55, 55, 55)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        panelBooking2Layout.setVerticalGroup(
            panelBooking2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBooking2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBooking2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave)
                    .addComponent(btnRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBooking1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        tableBooking.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tableBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule Id", "Bus Type", "Journey Date", "Start Time", "End Time", "Departure", "Arrival", "Fare", "Available Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBooking);

        lblDepartDest.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDepartDest.setForeground(new java.awt.Color(102, 0, 255));
        lblDepartDest.setText("Departure Destination :");

        cmbStartDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStartDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStartDestActionPerformed(evt);
            }
        });

        lblArrDest.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblArrDest.setForeground(new java.awt.Color(102, 0, 255));
        lblArrDest.setText("Arrival Destination :");

        cmbEndDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSchDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSchDate.setForeground(new java.awt.Color(102, 0, 255));
        lblSchDate.setText("Schedule Date :");

        btnSearchBus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSearchBus.setForeground(new java.awt.Color(51, 51, 255));
        btnSearchBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/se.gif"))); // NOI18N
        btnSearchBus.setText("Search Bus");
        btnSearchBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBusActionPerformed(evt);
            }
        });

        lblSchId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSchId.setForeground(new java.awt.Color(51, 0, 255));
        lblSchId.setText("Schedule ID :");

        txtTotalAmt.setEditable(false);
        txtTotalAmt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblJrnyDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblJrnyDate.setForeground(new java.awt.Color(51, 0, 255));
        lblJrnyDate.setText("Journey Date :");

        lblCustId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustId.setForeground(new java.awt.Color(51, 0, 255));
        lblCustId.setText("Customer ID :");

        cmbPayType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "Google Pay", "Paypal", "Debit Card" }));
        cmbPayType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPayTypeActionPerformed(evt);
            }
        });

        lblCustDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustDetails.setForeground(new java.awt.Color(51, 0, 255));
        lblCustDetails.setText("Customer Details :");

        txtCustDetails.setEditable(false);

        lblPayType.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPayType.setForeground(new java.awt.Color(51, 0, 255));
        lblPayType.setText("Payment Type :");

        lblTotalAmt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTotalAmt.setForeground(new java.awt.Color(51, 0, 255));
        lblTotalAmt.setText("Total Amount :");

        lblPayDescription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPayDescription.setForeground(new java.awt.Color(51, 0, 255));
        lblPayDescription.setText("Payment Dscription");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad.gif"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ed.gif"))); // NOI18N
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/de.gif"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 0, 255));
        lblID.setText("ID :");

        txtIPsngrD.setEditable(false);

        lblPsngrName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPsngrName.setForeground(new java.awt.Color(51, 0, 255));
        lblPsngrName.setText("Passenger Name :");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGender.setForeground(new java.awt.Color(51, 0, 255));
        lblGender.setText("Gender :");

        cmbPasGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbPasGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPasGenderActionPerformed(evt);
            }
        });

        lblPasAge.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPasAge.setForeground(new java.awt.Color(51, 0, 255));
        lblPasAge.setText("Age :");

        lblSeatNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSeatNo.setForeground(new java.awt.Color(51, 0, 255));
        lblSeatNo.setText("Seat No :");

        tableBooking2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger No", "Name", "Gender", "Age", "Seat No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBooking2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBooking2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBooking2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(txtIPsngrD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPsngrName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(cmbPasGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasAge)
                            .addComponent(txtPasAge, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeatNo)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPasSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(lblPsngrName)
                            .addComponent(lblGender)
                            .addComponent(lblPasAge)
                            .addComponent(lblSeatNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIPsngrD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPasGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdd)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );

        txtSchDateConfirm.setEditable(false);

        cmbCustID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustIDActionPerformed(evt);
            }
        });

        lblFarePP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFarePP.setForeground(new java.awt.Color(51, 0, 255));
        lblFarePP.setText("Fare Per Person :");

        txtFare.setEditable(false);

        txtSchID.setEditable(false);

        lblDateFormat.setForeground(new java.awt.Color(102, 0, 255));
        lblDateFormat.setText("(yyyy-MM-dd)");

        javax.swing.GroupLayout panelBooking1Layout = new javax.swing.GroupLayout(panelBooking1);
        panelBooking1.setLayout(panelBooking1Layout);
        panelBooking1Layout.setHorizontalGroup(
            panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBooking1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBooking1Layout.createSequentialGroup()
                        .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                .addComponent(lblDepartDest)
                                .addGap(47, 47, 47)
                                .addComponent(lblArrDest))
                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                .addComponent(cmbStartDest, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbEndDest, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                .addComponent(txtSchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDateFormat)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchBus))
                            .addComponent(lblSchDate))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBooking1Layout.createSequentialGroup()
                        .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSchId)
                                    .addComponent(lblCustId)
                                    .addComponent(lblTotalAmt))
                                .addGap(24, 24, 24)
                                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotalAmt)
                                    .addComponent(cmbCustID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSchID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBooking1Layout.createSequentialGroup()
                                        .addComponent(lblPayType)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbPayType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPayDescription)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPayDescription))
                                    .addGroup(panelBooking1Layout.createSequentialGroup()
                                        .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCustDetails)
                                            .addComponent(lblJrnyDate))
                                        .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtSchDateConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblFarePP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtFare))
                                            .addGroup(panelBooking1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCustDetails)))))))
                        .addGap(30, 30, 30))
                    .addGroup(panelBooking1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBooking1Layout.setVerticalGroup(
            panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBooking1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartDest)
                    .addComponent(lblArrDest)
                    .addComponent(lblSchDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStartDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEndDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBus)
                    .addComponent(lblDateFormat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchId)
                    .addComponent(lblJrnyDate)
                    .addComponent(txtSchDateConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFarePP)
                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustId)
                    .addComponent(lblCustDetails)
                    .addComponent(txtCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBooking1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalAmt)
                    .addComponent(lblPayType)
                    .addComponent(cmbPayType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPayDescription)
                    .addComponent(txtPayDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBooking2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(panelBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBooking2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * This method is an action performed on the Close button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    
     /**
     * This method is an action performed on the Save button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Add new record
        try {

            //save booking
            if (txtSchID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Select bus and  add passenger details");
                //TxtPasName.requestFocus();
                return;
            }

            if (tableBooking2.getRowCount() < 0) {
                JOptionPane.showMessageDialog(null, "Select bus and  add passenger details");
                //TxtPasName.requestFocus();
                return;
            }

            MainClass mc = new MainClass();
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //get booking id
            String sql = "select ifnull(max(bk_id),0)+1 from booking_master";
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs1 = stmt1.executeQuery(sql);
            String BookID;
            rs1.first();
            BookID = rs1.getString(1);

            //insert into booking master 
            sql = "insert into booking_master values("
                    + BookID + "," + txtSchID.getText()
                    + ",sysdate()," + txtTotalAmt.getText() + ",'" + cmbPayType.getSelectedItem().toString() + "','" + txtPayDescription.getText() + "'," + cmbCustID.getSelectedItem().toString() + "," + MainClass.strID + ")";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            //insert into booking details
            for (int j = 1; j <= tableBooking2.getRowCount(); j++) {

                sql = "insert into booking_details (bd_bm_id,bd_passenger_name,bd_gender,bd_age,bd_seat_no) values("
                        + BookID + ",'"
                        + tableBooking2.getValueAt(j - 1, 1).toString() + "','"
                        + tableBooking2.getValueAt(j - 1, 2).toString() + "',"
                        + tableBooking2.getValueAt(j - 1, 3).toString() + ",'"
                        + tableBooking2.getValueAt(j - 1, 4).toString() + "')";

                pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

            }

            mc.userLogInsertion("New Booking Created", "Booking Id : " + BookID);
            JOptionPane.showMessageDialog(null, "Booking saved. Your booking id is " + BookID);

            ClearText();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

     /**
     * This method is an action performed on the Refresh button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Mouse clicked event on table Booking
    private void tableBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookingMouseClicked

        int row = tableBooking.rowAtPoint(evt.getPoint());
        int col = 0;
        txtSchID.setText(tableBooking.getValueAt(row, 0).toString());
        txtSchDateConfirm.setText(tableBooking.getValueAt(row, 2).toString());
        txtFare.setText(tableBooking.getValueAt(row, 7).toString());
    
    }//GEN-LAST:event_tableBookingMouseClicked

    // Form opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
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

            cmbCustID.removeAllItems();
            stmt = connection.prepareStatement("select c_id from customer_master  order by c_id");
            rs = stmt.executeQuery();
            while (rs.next()) {
                cmbCustID.addItem(rs.getString(1));

            }
            rs.close();

            tableBooking.getColumnModel().getColumn(0).setHeaderValue("Schedule ID");
            tableBooking.getColumnModel().getColumn(1).setHeaderValue("Bus Type");
            tableBooking.getColumnModel().getColumn(2).setHeaderValue("Journey Date");
            tableBooking.getColumnModel().getColumn(3).setHeaderValue("Start Time");
            tableBooking.getColumnModel().getColumn(4).setHeaderValue("End Time");
            tableBooking.getColumnModel().getColumn(5).setHeaderValue("Departure");
            tableBooking.getColumnModel().getColumn(6).setHeaderValue("Arrival");
            tableBooking.getColumnModel().getColumn(7).setHeaderValue("Fare");
            tableBooking.getColumnModel().getColumn(8).setHeaderValue("Available Seats");
            tableBooking.getTableHeader().resizeAndRepaint();

            tableBooking2.getColumnModel().getColumn(0).setHeaderValue("Passenger No");
            tableBooking2.getColumnModel().getColumn(1).setHeaderValue("Name");
            tableBooking2.getColumnModel().getColumn(2).setHeaderValue("Gender");
            tableBooking2.getColumnModel().getColumn(3).setHeaderValue("Age");
            tableBooking2.getColumnModel().getColumn(4).setHeaderValue("Seat No");
            tableBooking2.getTableHeader().resizeAndRepaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbStartDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStartDestActionPerformed
    }//GEN-LAST:event_cmbStartDestActionPerformed

     /**
     * This method is an action performed on the Search bus button of the Booking page
     * 
     * @param name - evt
     * @return - void
     * 
     * It searches the particular bus
     */
    private void btnSearchBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBusActionPerformed
        
        if (txtSchDate.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter journey date");
            txtSchDate.requestFocus();
            return;
        }

        MainClass mc = new MainClass();

        if (mc.dateFormatValidation(txtSchDate.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Enter journey date in yyyy-MM-dd format only");
            txtSchDate.requestFocus();
            return;
        }

    try
    {
            Date current = new Date();
            String myFormatString = "yyyy-MM-dd";
            SimpleDateFormat df = new SimpleDateFormat(myFormatString);
            Date givenDate = df.parse(txtSchDate.getText());
            Long l = givenDate.getTime();
            //create date object
            Date next = new Date(l);
            long diff = current.getTime() - next.getTime();
            long dd=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
            if (dd>0)
            {
                JOptionPane.showMessageDialog(null, "Schedule date must be today or future date");
                txtSchDate.requestFocus();
                return;
                
            }
            /*
            JOptionPane.showMessageDialog(null,dd);
            //compare both dates
            if(next.after(current) ){
            }       
            else
            {
                JOptionPane.showMessageDialog(null, "Schedule date must be today or future date");
                TxtSchDate.requestFocus();
                return;
            }
*/
                } catch (ParseException e) {
            
             
        }
        FillGridBusSchedule(cmbStartDest.getSelectedItem().toString(), cmbEndDest.getSelectedItem().toString(), txtSchDate.getText());


    }//GEN-LAST:event_btnSearchBusActionPerformed

     /**
     * This method is an action performed on the payment type combo box of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void cmbPayTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPayTypeActionPerformed
    }//GEN-LAST:event_cmbPayTypeActionPerformed

     /**
     * This method is frtching value from the database
     * 
     * @param qr - query
     * @return - String
     */
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
    
     /**
     * This method is an action performed on the Add button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            //add passenger
            //validation
            if (txtSchID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
                //TxtPasName.requestFocus();
                return;
            }

            int PasNo;
            PasNo = tableBooking2.getRowCount() + 1;

            if (PasNo > 10) {
                JOptionPane.showMessageDialog(null, "Maximum 6 passenger are allowed in 1 ticket");
                return;
            }

            if (txtPasName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter passenger name");
                txtPasName.requestFocus();
                return;
            }

            MainClass mc = new MainClass();
            if (mc.numValidation(txtPasAge.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Enter only numbers in age");
                txtPasAge.requestFocus();
                return;
            }
            if (Integer.parseInt(txtPasAge.getText()) < 1 || Integer.parseInt(txtPasAge.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Age should between 1 to 100 years");
                txtPasAge.requestFocus();
                return;
            }
            if (txtPasSeatNo.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter seat no");
                txtPasSeatNo.requestFocus();
                return;
            }
            int i;
            for (int j = 1; j <= tableBooking2.getRowCount(); j++) {
                String StrPasName;
                StrPasName = tableBooking2.getValueAt(j - 1, 1).toString();
                if (StrPasName.equals(txtPasName.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate passenger name are not allowed");
                    return;
                }

                String StrPasSeatNo;
                StrPasSeatNo = tableBooking2.getValueAt(j - 1, 4).toString();
                if (StrPasSeatNo.equals(txtPasSeatNo.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate seat no. are not allowed");
                    return;
                }
            }

            String qr = "select ifnull(count(*),0) from booking_details, booking_master,schedule_master,bus_master "
                    + "  where bd_seat_no=" + txtPasSeatNo.getText() + " and bd_bm_id = bk_id and bk_sm_id=sm_id and sm_b_id=b_id and sm_id=" + txtSchID.getText();
            Connection connection;

            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //dupliate user login name
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs1 = stmt1.executeQuery(qr);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "Seat no alreday used");
                txtPasSeatNo.requestFocus();
                return;
            }

            ((DefaultTableModel) tableBooking2.getModel()).addRow(new Object[]{PasNo, txtPasName.getText().trim(), cmbPasGender.getSelectedItem().toString(), txtPasAge.getText(), txtPasSeatNo.getText()});;

            //calculate total
            Integer PFare = Integer.parseInt(txtFare.getText());
            Integer T = PFare * tableBooking2.getRowCount();
            txtTotalAmt.setText(T.toString());

            //clear text
            txtIPsngrD.setText("");
            txtPasName.setText("");
            cmbPasGender.setSelectedItem("Male");
            txtPasAge.setText("");
            txtPasSeatNo.setText("");

            JOptionPane.showMessageDialog(null, "Passenger added");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnAddActionPerformed

     /**
     * This method is an action performed on the Modify button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed


        if (txtSchID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
            return;
        }

        if (txtIPsngrD.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select passenger to edit");
            return;
        }

        if (txtPasName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter passenger name");
            txtPasName.requestFocus();
            return;
        }

        MainClass mc = new MainClass();
        if (mc.numValidation(txtPasAge.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Enter only numbers in age");
            txtPasAge.requestFocus();
            return;
        }
        if (Integer.parseInt(txtPasAge.getText()) < 1 || Integer.parseInt(txtPasAge.getText()) > 100) {
            JOptionPane.showMessageDialog(null, "Age should between 1 to 100 years");
            txtPasAge.requestFocus();
            return;
        }
        if (txtPasSeatNo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter seat no");
            txtPasSeatNo.requestFocus();
            return;
        }
        int i;
        for (int j = 1; j <= tableBooking2.getRowCount(); j++) {
            if (j != Integer.parseInt(txtIPsngrD.getText())) {
                String StrPasName;
                StrPasName = tableBooking2.getValueAt(j - 1, 1).toString();
                if (StrPasName.equals(txtPasName.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate passenger name are not allowed");
                    return;
                }

                String StrPasSeatNo;
                StrPasSeatNo = tableBooking2.getValueAt(j - 1, 4).toString();
                if (StrPasSeatNo.equals(txtPasSeatNo.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate seat no. are not allowed");
                    return;
                }
            }
        }

        int r;
        r = Integer.parseInt(txtIPsngrD.getText()) - 1;
        tableBooking2.setValueAt(txtPasName.getText().trim(), r, 1);
        tableBooking2.setValueAt(cmbPasGender.getSelectedItem().toString(), r, 2);
        tableBooking2.setValueAt(txtPasAge.getText(), r, 3);
        tableBooking2.setValueAt(txtPasSeatNo.getText(), r, 4);

        //((DefaultTableModel) jTable2.getModel()).addRow(new Object[]{PasNo, TxtPasName.getText().trim(),CmbPasGender.getSelectedItem().toString(),TxtPasAge.getText(),TxtPasSeatNo.getText()});;
        //clear text
        txtIPsngrD.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");

        JOptionPane.showMessageDialog(null, "Details are edited");
    }//GEN-LAST:event_btnModifyActionPerformed

     /**
     * This method is an action performed on the Delete button of the Booking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        //
        if (txtSchID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
            return;
        }

        if (txtIPsngrD.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select passenger to remove from list");
            return;
        }
        int p = JOptionPane.showConfirmDialog(this, "Do you want to remove this record ?");
        if (p == 0) {
            int r;
            r = Integer.parseInt(txtIPsngrD.getText()) - 1;
            int modelIndex = tableBooking2.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableBooking2.getModel();
            model.removeRow(modelIndex);
        }

        Integer PFare = Integer.parseInt(txtFare.getText());
        Integer T = PFare * tableBooking2.getRowCount();
        txtTotalAmt.setText(T.toString());

        txtIPsngrD.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbPasGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPasGenderActionPerformed
    }//GEN-LAST:event_cmbPasGenderActionPerformed

    // mouse clicked event on table Booking 2
    private void tableBooking2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBooking2MouseClicked
        
        int row = tableBooking2.rowAtPoint(evt.getPoint());
        int col = 0;

        txtIPsngrD.setText(tableBooking2.getValueAt(row, 0).toString());
        txtPasName.setText(tableBooking2.getValueAt(row, 1).toString());
        cmbPasGender.setSelectedItem(tableBooking2.getValueAt(row, 2).toString());
        txtPasAge.setText(tableBooking2.getValueAt(row, 3).toString());
        txtPasSeatNo.setText(tableBooking2.getValueAt(row, 4).toString());


    }//GEN-LAST:event_tableBooking2MouseClicked

    // Selecting one customer id from combo box and fetching database details for the same customer ID
    private void cmbCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustIDActionPerformed
        try {
            txtCustDetails.setText(GetValueDB("select concat(c_name , ', ', c_gender , ', ',c_email_id,', ',c_mobile_no) from customer_master where c_id=" + cmbCustID.getSelectedItem().toString()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_cmbCustIDActionPerformed

    // This method clears the text
    private void ClearText() {
        //clear text
        txtSchID.setText("");
        txtSchDateConfirm.setText("");
        txtCustDetails.setText("");
        txtTotalAmt.setText("");
        txtPayDescription.setText("");

        txtIPsngrD.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");

        txtFare.setText("");

        //remove row from passenger
        for (int j = tableBooking2.getRowCount() - 1; j >= 0; j--) {
            int r;
            r = j;
            int modelIndex = tableBooking2.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableBooking2.getModel();
            model.removeRow(modelIndex);

        }

        for (int j = tableBooking.getRowCount() - 1; j >= 0; j--) {
            int r;
            r = j;
            int modelIndex = tableBooking.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableBooking.getModel();
            model.removeRow(modelIndex);

        }

    }

    // This method displays information
    private void Display(String StrIn) {
        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // This method fills the form fetching details from the database
    private void FillGridBusSchedule(String StartDest, String EndDest, String ScheduleDate) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String Qr;
            Qr = "select sm_id, b_make_model,sm_date, sm_start_time,sm_end_time, (select d_name from destination_master d where d.d_id=sm_dest_start_id) dept, "
                    + " (select d_name from destination_master d where d.d_id=sm_dest_end_id) arrival, sm_fare, b_seats - "
                    + " (select count(*) from booking_details where bd_bm_id in (select bk_id from booking_master where bk_sm_id=sm_id)) Avl "
                    + " from schedule_master, bus_master where sm_b_id=b_id and sm_dest_start_id=(select d_id from destination_master where d_name='" + StartDest + "') "
                    + " and sm_dest_end_id=(select d_id from destination_master where d_name='" + EndDest + "') "
                    + " and sm_date='" + ScheduleDate + "' and sm_active=1 order by sm_id ";

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();

            tableBooking.getColumnModel().getColumn(0).setHeaderValue("Schedule ID");
            tableBooking.getColumnModel().getColumn(1).setHeaderValue("Bus Type");
            tableBooking.getColumnModel().getColumn(2).setHeaderValue("Journey Date");
            tableBooking.getColumnModel().getColumn(3).setHeaderValue("Start Time");
            tableBooking.getColumnModel().getColumn(4).setHeaderValue("End Time");
            tableBooking.getColumnModel().getColumn(5).setHeaderValue("Departure");
            tableBooking.getColumnModel().getColumn(6).setHeaderValue("Arriavl");
            tableBooking.getColumnModel().getColumn(7).setHeaderValue("Fare");
            tableBooking.getColumnModel().getColumn(8).setHeaderValue("Available Seat");
            tableBooking.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableBooking.getRowCount() > 0) {
                ((DefaultTableModel) tableBooking.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableBooking.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchBus;
    private javax.swing.JComboBox<String> cmbCustID;
    private javax.swing.JComboBox<String> cmbEndDest;
    private javax.swing.JComboBox<String> cmbPasGender;
    private javax.swing.JComboBox<String> cmbPayType;
    private javax.swing.JComboBox<String> cmbStartDest;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArrDest;
    private javax.swing.JLabel lblCustDetails;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblDateFormat;
    private javax.swing.JLabel lblDepartDest;
    private javax.swing.JLabel lblFarePP;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblJrnyDate;
    private javax.swing.JLabel lblPasAge;
    private javax.swing.JLabel lblPayDescription;
    private javax.swing.JLabel lblPayType;
    private javax.swing.JLabel lblPsngrName;
    private javax.swing.JLabel lblSchDate;
    private javax.swing.JLabel lblSchId;
    private javax.swing.JLabel lblSeatNo;
    private javax.swing.JLabel lblTotalAmt;
    private javax.swing.JPanel panelBooking1;
    private javax.swing.JPanel panelBooking2;
    private javax.swing.JTable tableBooking;
    private javax.swing.JTable tableBooking2;
    private javax.swing.JTextField txtCustDetails;
    private javax.swing.JTextField txtFare;
    private javax.swing.JTextField txtIPsngrD;
    private javax.swing.JTextField txtPasAge;
    private javax.swing.JTextField txtPasName;
    private javax.swing.JTextField txtPasSeatNo;
    private javax.swing.JTextField txtPayDescription;
    private javax.swing.JTextField txtSchDate;
    private javax.swing.JTextField txtSchDateConfirm;
    private javax.swing.JTextField txtSchID;
    private javax.swing.JTextField txtTotalAmt;
    // End of variables declaration//GEN-END:variables
}
