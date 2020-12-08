
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 * This class is responsible to save booking log in excel sheet
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnExportExcelActionPerformed(java.awt.event.ActionEvent evt)
 * 3.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 4.btnBookingLogActionPerformed(java.awt.event.ActionEvent evt)
 * 5.tableBookingLogMouseClicked(java.awt.event.MouseEvent evt) 
 * 6.txtlJrnyFromDateActionPerformed(java.awt.event.ActionEvent evt)
 * 7.FillGridBusSchedule()
 * 
 * @author Adwait Dabhade
 * 
 * This class enters the booking id and displays the all details related to that booking
 */
public class BookingLog extends javax.swing.JInternalFrame {

    
    public BookingLog() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBookingLog2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        pnlBookingLog1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookingLog = new javax.swing.JTable();
        lblJrnyFromDate = new javax.swing.JLabel();
        txtlJrnyFromDate = new javax.swing.JTextField();
        btnBookingLog = new javax.swing.JButton();
        lblJrnyToDate = new javax.swing.JLabel();
        txtJrnyToDate = new javax.swing.JTextField();
        lblDateFormat = new javax.swing.JLabel();
        lblDateFormat2 = new javax.swing.JLabel();

        setTitle("Booking Log Details");
        setPreferredSize(new java.awt.Dimension(800, 500));
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

        pnlBookingLog2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cl.gif"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnExportExcel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sa.gif"))); // NOI18N
        btnExportExcel.setText("EXPORT TO EXCEL");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBookingLog2Layout = new javax.swing.GroupLayout(pnlBookingLog2);
        pnlBookingLog2.setLayout(pnlBookingLog2Layout);
        pnlBookingLog2Layout.setHorizontalGroup(
            pnlBookingLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookingLog2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportExcel)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );
        pnlBookingLog2Layout.setVerticalGroup(
            pnlBookingLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookingLog2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBookingLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnExportExcel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBookingLog1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        tableBookingLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Customer Name", "Booking Date", "Bus Type", "Bus No", "Journey Date", "From Destination", "To Destination", "No of Passengers"
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
        tableBookingLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingLogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBookingLog);

        lblJrnyFromDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblJrnyFromDate.setForeground(new java.awt.Color(51, 0, 255));
        lblJrnyFromDate.setText("Jounrney Date From :");

        txtlJrnyFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlJrnyFromDateActionPerformed(evt);
            }
        });

        btnBookingLog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBookingLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/se.gif"))); // NOI18N
        btnBookingLog.setText("View Booking Log Report");
        btnBookingLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingLogActionPerformed(evt);
            }
        });

        lblJrnyToDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblJrnyToDate.setForeground(new java.awt.Color(51, 0, 255));
        lblJrnyToDate.setText("Journey Date To :");

        lblDateFormat.setForeground(new java.awt.Color(51, 0, 255));
        lblDateFormat.setText("(YYYY-MM-DD)");

        lblDateFormat2.setForeground(new java.awt.Color(51, 0, 255));
        lblDateFormat2.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout pnlBookingLog1Layout = new javax.swing.GroupLayout(pnlBookingLog1);
        pnlBookingLog1.setLayout(pnlBookingLog1Layout);
        pnlBookingLog1Layout.setHorizontalGroup(
            pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                        .addComponent(lblJrnyFromDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                                .addComponent(txtlJrnyFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblJrnyToDate))
                            .addComponent(lblDateFormat))
                        .addGap(9, 9, 9)
                        .addGroup(pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                                .addComponent(txtJrnyToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBookingLog))
                            .addComponent(lblDateFormat2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBookingLog1Layout.setVerticalGroup(
            pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJrnyFromDate)
                    .addComponent(txtlJrnyFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJrnyToDate)
                    .addComponent(txtJrnyToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookingLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBookingLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBookingLog1Layout.createSequentialGroup()
                        .addComponent(lblDateFormat)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookingLog1Layout.createSequentialGroup()
                        .addComponent(lblDateFormat2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBookingLog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBookingLog2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBookingLog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBookingLog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the BookingLog page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

      /**
     * This method is an action performed on the Export button of the CustomerLog page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method exports the BookingLog details into an excel sheet
     */
    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        try {

            TableModel model = tableBookingLog.getModel();
            try (FileWriter excel = new FileWriter("c:\\Tickets\\Booking_log.xls")) {
                for (int i = 0; i < model.getColumnCount(); i++) {
                    excel.write(model.getColumnName(i) + "\t");
                }

                excel.write("\n");

                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        excel.write(model.getValueAt(i, j).toString() + "\t");
                    }
                    excel.write("\n");
                }
            }

            JOptionPane.showMessageDialog(null, "Booking register saved at c:\\Tickets\\Booking_log.xls");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed

    
    // Converting to excel format
    public void toExcel(JTable table, String file) {
        try {
            TableModel model = table.getModel();
            try (FileWriter excel = new FileWriter(file)) {
                for (int i = 0; i < model.getColumnCount(); i++) {
                    excel.write(model.getColumnName(i) + "\t");
                }

                excel.write("\n");

                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        excel.write(model.getValueAt(i, j).toString() + "\t");
                    }
                    excel.write("\n");
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    // Frme opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {

            //reset jtable
            tableBookingLog.getColumnModel().getColumn(0).setHeaderValue("Booking ID");
            tableBookingLog.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
            tableBookingLog.getColumnModel().getColumn(2).setHeaderValue("Booking Date");
            tableBookingLog.getColumnModel().getColumn(3).setHeaderValue("Bus Type");
            tableBookingLog.getColumnModel().getColumn(4).setHeaderValue("Bus No");
            tableBookingLog.getColumnModel().getColumn(5).setHeaderValue("Journey Date");
            tableBookingLog.getColumnModel().getColumn(6).setHeaderValue("Destination From");
            tableBookingLog.getColumnModel().getColumn(7).setHeaderValue("Destination To");
            tableBookingLog.getColumnModel().getColumn(8).setHeaderValue("No. of Passengers");
            tableBookingLog.getTableHeader().resizeAndRepaint();
            tableBookingLog.getTableHeader().resizeAndRepaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

     /**
     * This method is an action performed on the View BookingLog report button of the BookingLog page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method shows all the details related to particular booking ID
     */
    private void btnBookingLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingLogActionPerformed
        // TODO add your handling code here:
        if (txtlJrnyFromDate.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter booking date from");
            txtlJrnyFromDate.requestFocus();
            return;
        }

        MainClass mc = new MainClass();

        if (mc.dateFormatValidation(txtlJrnyFromDate.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Enter booking date in yyyy-MM-dd format only");
            txtlJrnyFromDate.requestFocus();
            return;
        }

        if (txtJrnyToDate.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter booking date to");
            txtJrnyToDate.requestFocus();
            return;
        }

        if (mc.dateFormatValidation(txtJrnyToDate.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Enter booking date in yyyy-MM-dd format only");
            txtJrnyToDate.requestFocus();
            return;
        }
        FillGridBusSchedule();

    }//GEN-LAST:event_btnBookingLogActionPerformed

    private void tableBookingLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookingLogMouseClicked


    }//GEN-LAST:event_tableBookingLogMouseClicked

    private void txtlJrnyFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlJrnyFromDateActionPerformed
    }//GEN-LAST:event_txtlJrnyFromDateActionPerformed

    // Fills Grid by fetching details from database
    private void FillGridBusSchedule() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String Qr;
            Qr = "select bk_id, c_name, bk_date,  b_make_model, b_no, sm_date, "
                    + "(select d_name from destination_master d where d.d_id=sm_dest_start_id) dept, "
                    + "(select d_name from destination_master d where d.d_id=sm_dest_end_id) arrival, "
                    + "(select count(*) from booking_details where bd_bm_id = bk_id) Passengers "
                    + "from booking_master, customer_master, schedule_master, bus_master "
                    + "where bk_sm_id=sm_id and bk_cust_id=c_id and sm_b_id=b_id "
                    + "and sm_date between '" + txtlJrnyFromDate.getText() + " 00:00' and '" + txtJrnyToDate.getText() + " 23:59' order by bk_id";

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();

            tableBookingLog.getColumnModel().getColumn(0).setHeaderValue("Booking ID");
            tableBookingLog.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
            tableBookingLog.getColumnModel().getColumn(2).setHeaderValue("Booking Date");
            tableBookingLog.getColumnModel().getColumn(3).setHeaderValue("Bus Type");
            tableBookingLog.getColumnModel().getColumn(4).setHeaderValue("Bus No");
            tableBookingLog.getColumnModel().getColumn(5).setHeaderValue("Journey Date");
            tableBookingLog.getColumnModel().getColumn(6).setHeaderValue("Destination From");
            tableBookingLog.getColumnModel().getColumn(7).setHeaderValue("Destination To");
            tableBookingLog.getColumnModel().getColumn(8).setHeaderValue("No. of Passengers");
            tableBookingLog.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableBookingLog.getRowCount() > 0) {
                ((DefaultTableModel) tableBookingLog.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableBookingLog.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookingLog;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDateFormat;
    private javax.swing.JLabel lblDateFormat2;
    private javax.swing.JLabel lblJrnyFromDate;
    private javax.swing.JLabel lblJrnyToDate;
    private javax.swing.JPanel pnlBookingLog1;
    private javax.swing.JPanel pnlBookingLog2;
    private javax.swing.JTable tableBookingLog;
    private javax.swing.JTextField txtJrnyToDate;
    private javax.swing.JTextField txtlJrnyFromDate;
    // End of variables declaration//GEN-END:variables
}
