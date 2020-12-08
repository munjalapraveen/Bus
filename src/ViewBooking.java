
//import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * This class is responsible to view and manage booking
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.BtnEditActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 4.tableViewBooking1MouseClicked(java.awt.event.MouseEvent evt)
 * 5.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 6.btnSearchBookingActionPerformed(java.awt.event.ActionEvent evt)
 * 7.cmbPayTypeActionPerformed(java.awt.event.ActionEvent evt)
 * 8.btnAddActionPerformed(java.awt.event.ActionEvent evt)
 * 9.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 10.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 11.cmbPasGenderActionPerformed(java.awt.event.ActionEvent evt) 
 * 12.tableViewBooking2MouseClicked(java.awt.event.MouseEvent evt)
 * 13.btnDelete2ActionPerformed(java.awt.event.ActionEvent evt)
 * 14.btnPrintActionPerformed(java.awt.event.ActionEvent evt)
 * 15.txtBookingByActionPerformed(java.awt.event.ActionEvent evt)
 * 16.ClearText()
 * 17.Display(String StrIn)
 * 18.FillGrid()
 * 
 * @author Sayali Vakil
 * 
 * This class is responsible to view and manage tickets details tickets can be searched/fetched using Booking ID
 * and performing CRUD operations on ticket
 */
public class ViewBooking extends javax.swing.JInternalFrame {

    
    public ViewBooking() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewBooking1 = new javax.swing.JTable();
        lblBookingID = new javax.swing.JLabel();
        txtBookingID = new javax.swing.JTextField();
        btnSearchBooking = new javax.swing.JButton();
        lblSchID = new javax.swing.JLabel();
        txtTotalAmt = new javax.swing.JTextField();
        lblJourneyDate = new javax.swing.JLabel();
        txtPayDescription = new javax.swing.JTextField();
        lblCustID = new javax.swing.JLabel();
        cmbPayType = new javax.swing.JComboBox<>();
        lblCustDetails = new javax.swing.JLabel();
        txtCustDetails = new javax.swing.JTextField();
        lblPayType = new javax.swing.JLabel();
        lblTotalAmt = new javax.swing.JLabel();
        lblPayDescr = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtPasID = new javax.swing.JTextField();
        lblPasName = new javax.swing.JLabel();
        txtPasName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cmbPasGender = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        txtPasSeatNo = new javax.swing.JTextField();
        lblSeatNo = new javax.swing.JLabel();
        txtPasAge = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableViewBooking2 = new javax.swing.JTable();
        txtSchDateConfirm = new javax.swing.JTextField();
        lblFarePP = new javax.swing.JLabel();
        txtFarePP = new javax.swing.JTextField();
        txtSchID = new javax.swing.JTextField();
        txtCustID = new javax.swing.JTextField();
        lblBookingDate = new javax.swing.JLabel();
        txtBookingDate = new javax.swing.JTextField();
        lblBookingBy = new javax.swing.JLabel();
        txtBookingBy = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();

        setClosable(true);
        setTitle("View Booking");
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

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cl.gif"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        BtnEdit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ed.gif"))); // NOI18N
        BtnEdit.setText("EDIT BOOKING");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/re.gif"))); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDelete2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/de.gif"))); // NOI18N
        btnDelete2.setText("DELETE BOOKING");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnDelete2)
                .addGap(33, 33, 33)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(BtnEdit)
                    .addComponent(btnRefresh)
                    .addComponent(btnDelete2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        tableViewBooking1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule", "Bus Type", "Journey Date", "Start Time", "End Time", "Departure", "Arrival", "Fare", "Available Seats"
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
        tableViewBooking1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewBooking1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewBooking1);

        lblBookingID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBookingID.setForeground(new java.awt.Color(51, 0, 255));
        lblBookingID.setText("Booking ID :");

        btnSearchBooking.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSearchBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/se.gif"))); // NOI18N
        btnSearchBooking.setText("Search");
        btnSearchBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookingActionPerformed(evt);
            }
        });

        lblSchID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSchID.setForeground(new java.awt.Color(51, 0, 255));
        lblSchID.setText("Schedule ID :");

        txtTotalAmt.setEditable(false);
        txtTotalAmt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblJourneyDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblJourneyDate.setForeground(new java.awt.Color(51, 0, 255));
        lblJourneyDate.setText("Journey Date :");

        lblCustID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustID.setForeground(new java.awt.Color(51, 0, 255));
        lblCustID.setText("Customer ID :");

        cmbPayType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card" }));
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

        lblPayDescr.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPayDescr.setForeground(new java.awt.Color(51, 0, 255));
        lblPayDescr.setText("Payment Description");

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

        txtPasID.setEditable(false);

        lblPasName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPasName.setForeground(new java.awt.Color(0, 0, 255));
        lblPasName.setText("Passenger Name :");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 0, 255));
        lblGender.setText("Gender :");

        cmbPasGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbPasGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPasGenderActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAge.setForeground(new java.awt.Color(0, 0, 255));
        lblAge.setText("Age :");

        lblSeatNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSeatNo.setForeground(new java.awt.Color(0, 0, 255));
        lblSeatNo.setText("Seat No :");

        tableViewBooking2.setModel(new javax.swing.table.DefaultTableModel(
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
        tableViewBooking2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewBooking2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableViewBooking2);

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
                            .addComponent(txtPasID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblPasName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPasName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(cmbPasGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addGap(112, 112, 112))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPasAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSeatNo)
                            .addComponent(txtPasSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnDelete)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(lblPasName)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lblSeatNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPasGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdd)
                    .addComponent(btnModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );

        txtSchDateConfirm.setEditable(false);

        lblFarePP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFarePP.setForeground(new java.awt.Color(51, 0, 255));
        lblFarePP.setText("Fare Per Person :");

        txtFarePP.setEditable(false);

        txtSchID.setEditable(false);

        txtCustID.setEditable(false);

        lblBookingDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBookingDate.setForeground(new java.awt.Color(51, 0, 255));
        lblBookingDate.setText("Booking Date :");

        txtBookingDate.setEditable(false);

        lblBookingBy.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBookingBy.setForeground(new java.awt.Color(51, 0, 255));
        lblBookingBy.setText("Booking By :");

        txtBookingBy.setEditable(false);
        txtBookingBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookingByActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sa.gif"))); // NOI18N
        btnPrint.setText("Print ticket");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBookingID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchBooking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSchID)
                                            .addComponent(lblCustID)
                                            .addComponent(lblTotalAmt)
                                            .addComponent(lblBookingDate))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTotalAmt)
                                            .addComponent(txtSchID, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCustID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtBookingDate, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCustDetails)
                                                    .addComponent(lblJourneyDate))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtSchDateConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblFarePP)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtFarePP))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCustDetails))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPayType)
                                                    .addComponent(lblBookingBy))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtBookingBy)
                                                        .addGap(148, 148, 148))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmbPayType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(lblPayDescr)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtPayDescription)))))))))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingID)
                    .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBooking)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchID)
                    .addComponent(lblJourneyDate)
                    .addComponent(txtSchDateConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFarePP)
                    .addComponent(txtFarePP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustID)
                    .addComponent(lblCustDetails)
                    .addComponent(txtCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalAmt)
                    .addComponent(lblPayType)
                    .addComponent(cmbPayType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPayDescr)
                    .addComponent(txtPayDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBookingDate)
                            .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookingBy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtBookingBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Edit button of the login page
     * 
     * @param name - evt
     * @return - void
     */
    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        //Add new record
        try {

            //update booking
            if (txtBookingID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter booking id and search records");
                txtBookingID.requestFocus();
                return;
            }

            if (tableViewBooking1.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "No booking details found");
                txtBookingID.requestFocus();
                return;
            }

            /*
       if (TxtBookingID.getText().equals(jTable2.getValueAt(0, 0).toString())==false)
       {
         JOptionPane.showMessageDialog(null, "Enter booking id and search records");
        TxtBookingID.requestFocus();
        return;
           
       }
             */
            if (txtSchID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Select bus and  add passenger details");
                //TxtPasName.requestFocus();
                return;
            }

            if (tableViewBooking2.getRowCount() < 0) {
                JOptionPane.showMessageDialog(null, "Select bus and  add passenger details");
                //TxtPasName.requestFocus();
                return;
            }

            String BookID;

            BookID = txtBookingID.getText();
            MainClass mc = new MainClass();
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            String sql = "update booking_master set bk_amount=" + txtTotalAmt.getText() + " where bk_id =" + BookID;
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            sql = "delete from booking_details where bd_bm_id =" + BookID;
            pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            //insert into booking details
            for (int j = 1; j <= tableViewBooking2.getRowCount(); j++) {

                sql = "insert into booking_details (bd_bm_id,bd_passenger_name,bd_gender,bd_age,bd_seat_no) values("
                        + BookID + ",'"
                        + tableViewBooking2.getValueAt(j - 1, 1).toString() + "','"
                        + tableViewBooking2.getValueAt(j - 1, 2).toString() + "',"
                        + tableViewBooking2.getValueAt(j - 1, 3).toString() + ",'"
                        + tableViewBooking2.getValueAt(j - 1, 4).toString() + "')";

                pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

            }

            JOptionPane.showMessageDialog(null, "Booking updated. for booking id is " + BookID);
            
            mc.userLogInsertion("Booking edited ", "Booking ID : " + txtBookingID.getText());

            ClearText();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
      
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tableViewBooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewBooking1MouseClicked


    }//GEN-LAST:event_tableViewBooking1MouseClicked

    // Form opened event performed
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            MainClass mc = new MainClass();
            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            //reset jtable
            tableViewBooking1.getColumnModel().getColumn(0).setHeaderValue("Schedule ID");
            tableViewBooking1.getColumnModel().getColumn(1).setHeaderValue("Bus Type");
            tableViewBooking1.getColumnModel().getColumn(2).setHeaderValue("Journey Date");
            tableViewBooking1.getColumnModel().getColumn(3).setHeaderValue("Start Time");
            tableViewBooking1.getColumnModel().getColumn(4).setHeaderValue("End Time");
            tableViewBooking1.getColumnModel().getColumn(5).setHeaderValue("Departure");
            tableViewBooking1.getColumnModel().getColumn(6).setHeaderValue("Arriavl");
            tableViewBooking1.getColumnModel().getColumn(7).setHeaderValue("Fare");
            tableViewBooking1.getColumnModel().getColumn(8).setHeaderValue("Available Seat");
            tableViewBooking1.getTableHeader().resizeAndRepaint();

            tableViewBooking2.getColumnModel().getColumn(0).setHeaderValue("Passenger No");
            tableViewBooking2.getColumnModel().getColumn(1).setHeaderValue("Name");
            tableViewBooking2.getColumnModel().getColumn(2).setHeaderValue("Gender");
            tableViewBooking2.getColumnModel().getColumn(3).setHeaderValue("Age");
            tableViewBooking2.getColumnModel().getColumn(4).setHeaderValue("Seat No");
            tableViewBooking2.getTableHeader().resizeAndRepaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

     /**
     * This method is an action performed on the Search button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method searches for the particular Booking ID 
     * fetches details for that booking from the database which is booked ticket for the customer by user (Staff)
     */
    private void btnSearchBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookingActionPerformed
        
        if (txtBookingID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter booking id");
            txtBookingID.requestFocus();
            return;
        }

        FillGridViewBooking(txtBookingID.getText());


    }//GEN-LAST:event_btnSearchBookingActionPerformed

    private void cmbPayTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPayTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPayTypeActionPerformed

    public String GetValueDB(String Qr) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;
            //JOptionPane.showMessageDialog(null, Qr);

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
     * This method is an action performed on the add (+) button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method adds passengers for that customer
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //add passenger
        //validation
        if (txtSchID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
            //TxtPasName.requestFocus();
            return;
        }

        int PasNo;
        PasNo = tableViewBooking2.getRowCount() + 1;

        if (PasNo > 10) {
            JOptionPane.showMessageDialog(null, "Maximum 10 passenger are allowed in 1 ticket");
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
        //check for duplicate passenger and seat no
        int i;
        for (int j = 1; j <= tableViewBooking2.getRowCount(); j++) {
            String StrPasName;
            StrPasName = tableViewBooking2.getValueAt(j - 1, 1).toString();
            if (StrPasName.equals(txtPasName.getText().trim()) == true) {
                JOptionPane.showMessageDialog(null, "Duplicate passenger name are not allowed");
                return;
            }

            String StrPasSeatNo;
            StrPasSeatNo = tableViewBooking2.getValueAt(j - 1, 4).toString();
            if (StrPasSeatNo.equals(txtPasSeatNo.getText().trim()) == true) {
                JOptionPane.showMessageDialog(null, "Duplicate seat no. are not allowed");
                return;
            }
        }

        ((DefaultTableModel) tableViewBooking2.getModel()).addRow(new Object[]{PasNo, txtPasName.getText().trim(), cmbPasGender.getSelectedItem().toString(), txtPasAge.getText(), txtPasSeatNo.getText()});;

        //calculate total
        Integer PFare = Integer.parseInt(txtFarePP.getText());
        Integer T = PFare * tableViewBooking2.getRowCount();
        txtTotalAmt.setText(T.toString());

        //clear text
        txtPasID.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");

        JOptionPane.showMessageDialog(null, "Passenger added");
    }//GEN-LAST:event_btnAddActionPerformed

     /**
     * This method is an action performed on the modify (button beside + which has sign like modifying)
     * button of the vieBooking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
       
        if (txtSchID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
            //TxtPasName.requestFocus();
            return;
        }

        if (txtPasID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select passenger to edit");
            //TxtPasName.requestFocus();
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
        //check for duplicate passenger and seat no
        int i;
        for (int j = 1; j <= tableViewBooking2.getRowCount(); j++) {
            if (j != Integer.parseInt(txtPasID.getText())) {
                String StrPasName;
                StrPasName = tableViewBooking2.getValueAt(j - 1, 1).toString();
                if (StrPasName.equals(txtPasName.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate passenger name are not allowed");
                    return;
                }

                String StrPasSeatNo;
                StrPasSeatNo = tableViewBooking2.getValueAt(j - 1, 4).toString();
                if (StrPasSeatNo.equals(txtPasSeatNo.getText().trim()) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate seat no. are not allowed");
                    return;
                }
            }
        }

        int r;
        r = Integer.parseInt(txtPasID.getText()) - 1;
        tableViewBooking2.setValueAt(txtPasName.getText().trim(), r, 1);
        tableViewBooking2.setValueAt(cmbPasGender.getSelectedItem().toString(), r, 2);
        tableViewBooking2.setValueAt(txtPasAge.getText(), r, 3);
        tableViewBooking2.setValueAt(txtPasSeatNo.getText(), r, 4);

        //((DefaultTableModel) jTable2.getModel()).addRow(new Object[]{PasNo, TxtPasName.getText().trim(),CmbPasGender.getSelectedItem().toString(),TxtPasAge.getText(),TxtPasSeatNo.getText()});;
        //clear text
        txtPasID.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");

        JOptionPane.showMessageDialog(null, "Details are edited");
    }//GEN-LAST:event_btnModifyActionPerformed

    
     /**
     * This method is an action performed on the delete (red delete sign) button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        //
        if (txtSchID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select bus to add/ edit passenger details");
            //TxtPasName.requestFocus();
            return;
        }

        if (txtPasID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select passenger to remove from list");
            //TxtPasName.requestFocus();
            return;
        }
        int p = JOptionPane.showConfirmDialog(this, "Do you want to remove this record ?");
        if (p == 0) {
            int r;
            r = Integer.parseInt(txtPasID.getText()) - 1;
            int modelIndex = tableViewBooking2.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableViewBooking2.getModel();
            model.removeRow(modelIndex);
        }

        //calculate total
        Integer PFare = Integer.parseInt(txtFarePP.getText());
        Integer T = PFare * tableViewBooking2.getRowCount();
        txtTotalAmt.setText(T.toString());

        //clear text
        txtPasID.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbPasGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPasGenderActionPerformed
    }//GEN-LAST:event_cmbPasGenderActionPerformed

     /**
     * This method is an action performed on the table view booking of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     */
    private void tableViewBooking2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewBooking2MouseClicked
        //display
        int row = tableViewBooking2.rowAtPoint(evt.getPoint());
        int col = 0;//jTable1.columnAtPoint(evt.getPoint());
        
        //display selected schedule
        txtPasID.setText(tableViewBooking2.getValueAt(row, 0).toString());
        txtPasName.setText(tableViewBooking2.getValueAt(row, 1).toString());
        cmbPasGender.setSelectedItem(tableViewBooking2.getValueAt(row, 2).toString());
        txtPasAge.setText(tableViewBooking2.getValueAt(row, 3).toString());
        txtPasSeatNo.setText(tableViewBooking2.getValueAt(row, 4).toString());


    }//GEN-LAST:event_tableViewBooking2MouseClicked

     /**
     * This method is an action performed on the Delete Booking button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        try {
            if (txtBookingID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter booking id for delete.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this booking ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from booking_details where bd_bm_id= =" + txtBookingID.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                sql = "delete from booking_master where bk_id= =" + txtBookingID.getText() + "";
                pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");

                 mc.userLogInsertion("Booking edited ", "Booking ID : " + txtBookingID.getText());
                 
                ClearText();

                txtBookingID.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }//GEN-LAST:event_btnDelete2ActionPerformed

     /**
     * This method is an action performed on the Print button of the ViewBooking page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method saves ticket for that particular booking ID in the PDF format at provided C drive location
     */
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:

        try {

            if (txtBookingID.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter booking id and search records");
                txtBookingID.requestFocus();
                return;
            }

            if (tableViewBooking1.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "No booking details found");
                txtBookingID.requestFocus();
                return;
            }

            createPdf("C:\\Tickets\\Ticket_" + txtBookingID.getText() + ".pdf");

            MainClass mc = new MainClass();
            mc.userLogInsertion("Ticket Printed ", "Booking ID : " + txtBookingID.getText());
            
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("C:\\Tickets\\Ticket_" + txtBookingID.getText() + ".pdf"));
            } else {
                System.out.println("Open is not supported");
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtBookingByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingByActionPerformed
    }//GEN-LAST:event_txtBookingByActionPerformed

    // Creating ticket pdf
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        PdfPTable table = new PdfPTable(5);
        table.setWidths(new int[]{1, 1, 1, 1, 1});

        table.addCell(createCell("---- Bus Reservation System ---- ", 0, 5, Element.ALIGN_CENTER));
        table.addCell(createCell("  ", 0, 5, Element.ALIGN_CENTER));

        //1
        table.addCell(createCell("Booking ID", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(txtBookingID.getText(), 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Booking Date", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(txtBookingDate.getText(), 1, 2, Element.ALIGN_LEFT));
        //2
        table.addCell(createCell("Destination", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(tableViewBooking1.getValueAt(0, 5).toString() + " - " + tableViewBooking1.getValueAt(0, 6).toString(), 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Journey Date", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(txtSchDateConfirm.getText(), 1, 2, Element.ALIGN_LEFT));
        //3
        table.addCell(createCell(" ", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(" ", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Journey Time", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell(tableViewBooking1.getValueAt(0, 3).toString() + " - " + tableViewBooking1.getValueAt(0, 4).toString(), 1, 2, Element.ALIGN_LEFT));

        table.addCell(createCell("  ", 0, 5, Element.ALIGN_CENTER));

        table.addCell(createCell("Customer Details", 1, 5, Element.ALIGN_CENTER));
        table.addCell(createCell(txtCustDetails.getText(), 1, 5, Element.ALIGN_CENTER));

        table.addCell(createCell("  ", 0, 5, Element.ALIGN_CENTER));

        table.addCell(createCell("Passenger Details", 1, 5, Element.ALIGN_CENTER));
        table.addCell(createCell("ID", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Name", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Gender", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Age", 1, 1, Element.ALIGN_LEFT));
        table.addCell(createCell("Seat No", 1, 1, Element.ALIGN_LEFT));

        // passenger details
        for (int j = 1; j <= tableViewBooking2.getRowCount(); j++) {

            table.addCell(createCell(tableViewBooking2.getValueAt(j - 1, 0).toString(), 1, 1, Element.ALIGN_LEFT));
            table.addCell(createCell(tableViewBooking2.getValueAt(j - 1, 1).toString(), 1, 1, Element.ALIGN_LEFT));
            table.addCell(createCell(tableViewBooking2.getValueAt(j - 1, 2).toString(), 1, 1, Element.ALIGN_LEFT));
            table.addCell(createCell(tableViewBooking2.getValueAt(j - 1, 3).toString(), 1, 1, Element.ALIGN_LEFT));
            table.addCell(createCell(tableViewBooking2.getValueAt(j - 1, 4).toString(), 1, 1, Element.ALIGN_LEFT));
        }

        table.addCell(createCell("Total Amount", 1, 4, Element.ALIGN_LEFT));
        table.addCell(createCell(txtTotalAmt.getText(), 1, 1, Element.ALIGN_RIGHT));
        document.add(table);
        document.close();
    }

    public PdfPCell createCell(String content, float borderWidth, int colspan, int alignment) {
        PdfPCell cell = new PdfPCell(new Phrase(content));
        cell.setBorderWidth(borderWidth);
        cell.setColspan(colspan);
        cell.setHorizontalAlignment(alignment);
        return cell;
    }

    // Clears the text filled in the ViewBooking Form
    private void ClearText() {
        //clear text
        txtSchID.setText("");
        txtSchDateConfirm.setText("");
        txtCustDetails.setText("");
        txtTotalAmt.setText("");
        txtPayDescription.setText("");
        txtCustID.setText("");
        txtPasID.setText("");
        txtPasName.setText("");
        cmbPasGender.setSelectedItem("Male");
        txtPasAge.setText("");
        txtPasSeatNo.setText("");

        txtFarePP.setText("");

        //remove row from passenger
        for (int j = tableViewBooking2.getRowCount() - 1; j >= 0; j--) {
            int r;
            r = j;
            int modelIndex = tableViewBooking2.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableViewBooking2.getModel();
            model.removeRow(modelIndex);

        }

        for (int j = tableViewBooking1.getRowCount() - 1; j >= 0; j--) {
            int r;
            r = j;
            int modelIndex = tableViewBooking1.convertRowIndexToModel(r); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tableViewBooking1.getModel();
            model.removeRow(modelIndex);

        }

    }

    // Display information in the ViewBooking form
    private void Display(String StrIn) {
        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // Fills grid by fetching details for the particular booking id from databases
    private void FillGridViewBooking(String BookingID) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String Qr;
            Qr = "select bk_id, b_make_model,sm_date, sm_start_time,sm_end_time, (select d_name from destination_master d where d.d_id=sm_dest_start_id) dept,"
                    + "(select d_name from destination_master d where d.d_id=sm_dest_end_id) arrival, sm_fare, b_seats - "
                    + "(select count(*) from booking_details where bd_bm_id in (select bk_id from booking_master where bk_sm_id=sm_id)) Avl "
                    + "from schedule_master, bus_master, booking_master where sm_b_id=b_id and bk_sm_id=sm_id and bk_id= " + BookingID;

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();

            tableViewBooking1.getColumnModel().getColumn(0).setHeaderValue("Booking ID");
            tableViewBooking1.getColumnModel().getColumn(1).setHeaderValue("Bus Type");
            tableViewBooking1.getColumnModel().getColumn(2).setHeaderValue("Journey Date");
            tableViewBooking1.getColumnModel().getColumn(3).setHeaderValue("Start Time");
            tableViewBooking1.getColumnModel().getColumn(4).setHeaderValue("End Time");
            tableViewBooking1.getColumnModel().getColumn(5).setHeaderValue("Departure");
            tableViewBooking1.getColumnModel().getColumn(6).setHeaderValue("Arriavl");
            tableViewBooking1.getColumnModel().getColumn(7).setHeaderValue("Fare");
            tableViewBooking1.getColumnModel().getColumn(8).setHeaderValue("Available Seat");

            tableViewBooking1.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableViewBooking1.getRowCount() > 0) {
                ((DefaultTableModel) tableViewBooking1.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableViewBooking1.getModel()).insertRow(rs.getRow() - 1, row);
            }

            rs.close();
            // display booking details
            stmt = connection.prepareStatement("select * from booking_master, customer_master, schedule_master where c_id=bk_cust_id and bk_sm_id=sm_id and bk_id=" + BookingID);
            rs = stmt.executeQuery();
            rs.first();

            txtSchID.setText(rs.getString("bk_sm_id"));
            txtSchDateConfirm.setText(rs.getString("sm_date"));
            txtCustDetails.setText(rs.getString("c_name") + ", " + rs.getString("c_gender") + ", " + rs.getString("c_mobile_no") + ", " + rs.getString("c_email_id"));
            txtTotalAmt.setText(rs.getString("bk_amount"));
            txtPayDescription.setText(rs.getString("bk_pay_details"));
            txtCustID.setText(rs.getString("c_id"));

            txtPasID.setText("");
            txtPasName.setText("");
            cmbPasGender.setSelectedItem("");
            txtPasAge.setText("");
            txtPasSeatNo.setText("");

            txtFarePP.setText(rs.getString("sm_fare"));
            txtBookingDate.setText(rs.getString("bk_date"));
            txtBookingBy.setText(rs.getString("bk_entry_by"));

            rs.close();
            // display booking details
            stmt = connection.prepareStatement("select bd_id,bd_passenger_name,bd_gender,bd_age,bd_seat_no  from booking_details where bd_bm_id = " + BookingID + " order by bd_id");
            rs = stmt.executeQuery();

            // Removing Previous Data
            while (tableViewBooking2.getRowCount() > 0) {
                ((DefaultTableModel) tableViewBooking2.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableViewBooking2.getModel()).insertRow(rs.getRow() - 1, row);
            }
            DefaultTableModel model = (DefaultTableModel) tableViewBooking2.getModel();
            for (int j = 1; j <= tableViewBooking2.getRowCount(); j++) {

                model.setValueAt(j, j - 1, 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearchBooking;
    private javax.swing.JComboBox<String> cmbPasGender;
    private javax.swing.JComboBox<String> cmbPayType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBookingBy;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblBookingID;
    private javax.swing.JLabel lblCustDetails;
    private javax.swing.JLabel lblCustID;
    private javax.swing.JLabel lblFarePP;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblJourneyDate;
    private javax.swing.JLabel lblPasName;
    private javax.swing.JLabel lblPayDescr;
    private javax.swing.JLabel lblPayType;
    private javax.swing.JLabel lblSchID;
    private javax.swing.JLabel lblSeatNo;
    private javax.swing.JLabel lblTotalAmt;
    private javax.swing.JTable tableViewBooking1;
    private javax.swing.JTable tableViewBooking2;
    private javax.swing.JTextField txtBookingBy;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtBookingID;
    private javax.swing.JTextField txtCustDetails;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtFarePP;
    private javax.swing.JTextField txtPasAge;
    private javax.swing.JTextField txtPasID;
    private javax.swing.JTextField txtPasName;
    private javax.swing.JTextField txtPasSeatNo;
    private javax.swing.JTextField txtPayDescription;
    private javax.swing.JTextField txtSchDateConfirm;
    private javax.swing.JTextField txtSchID;
    private javax.swing.JTextField txtTotalAmt;
    // End of variables declaration//GEN-END:variables
}
