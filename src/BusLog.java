
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
 * This class is responsible to save Bus log in excel sheet
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnExportExcelActionPerformed(java.awt.event.ActionEvent evt)
 * 3.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)
 * 4.btnBusLogReportActionPerformed(java.awt.event.ActionEvent evt)
 * 5.tableBusLogMouseClicked(java.awt.event.MouseEvent evt)
 * 6.FillGridBusSchedule()
 * 
 * @author Adwait Dabhade
 * 
 * This class enters the bus number and displays the all details related to that Bus
 */
public class BusLog extends javax.swing.JInternalFrame {

    
    public BusLog() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusLog2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        panelBusLog1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBusLog = new javax.swing.JTable();
        lblBusNo = new javax.swing.JLabel();
        txtBus = new javax.swing.JTextField();
        btnBusLogReport = new javax.swing.JButton();

        setTitle("Bus Log Details");
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

        panelBusLog2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

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

        javax.swing.GroupLayout panelBusLog2Layout = new javax.swing.GroupLayout(panelBusLog2);
        panelBusLog2.setLayout(panelBusLog2Layout);
        panelBusLog2Layout.setHorizontalGroup(
            panelBusLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusLog2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportExcel)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        panelBusLog2Layout.setVerticalGroup(
            panelBusLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusLog2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBusLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnExportExcel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBusLog1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        tableBusLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bus ID", "Bus No", "Bus Model", "Driver Name", "Bus Type", "No of Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBusLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBusLogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBusLog);

        lblBusNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBusNo.setForeground(new java.awt.Color(0, 0, 255));
        lblBusNo.setText("Bus No :");

        btnBusLogReport.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBusLogReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/se.gif"))); // NOI18N
        btnBusLogReport.setText("View Bus Log Report");
        btnBusLogReport.setToolTipText("");
        btnBusLogReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusLogReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusLog1Layout = new javax.swing.GroupLayout(panelBusLog1);
        panelBusLog1.setLayout(panelBusLog1Layout);
        panelBusLog1Layout.setHorizontalGroup(
            panelBusLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusLog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelBusLog1Layout.createSequentialGroup()
                        .addComponent(lblBusNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusLogReport)
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBusLog1Layout.setVerticalGroup(
            panelBusLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusLog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusNo)
                    .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusLogReport))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBusLog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusLog2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(panelBusLog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusLog2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * This method is an action performed on the Close button of the BusLog page
     * 
     * @param name - evt
     * @return - void
     */
	 
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Export button of the BusLog page
     * 
     * @param name - evt
     * @return - void
     * 
     * This method exports the BusLog details into an excel sheet
     */
    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        try {

            TableModel model = tableBusLog.getModel();
            try (FileWriter excel = new FileWriter("c:\\Tickets\\bus_log.xls")) {
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

            JOptionPane.showMessageDialog(null, "Customer regiter saved at c:\\Tickets\\bus_log.xls");

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

    // Form opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

    // Action performed on the View Bus Log Report button
    private void btnBusLogReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusLogReportActionPerformed

        FillGridBusLogReport();

    }//GEN-LAST:event_btnBusLogReportActionPerformed

    private void tableBusLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBusLogMouseClicked


    }//GEN-LAST:event_tableBusLogMouseClicked

    // Fills the BusLog form by fetching details from the database
    private void FillGridBusLogReport() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String Qr;
            Qr = "select b_id,b_no,b_make_model,b_driver,b_type,b_seats from bus_master where b_no like '" + txtBus.getText() + "%' order by b_id";

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();



            tableBusLog.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableBusLog.getRowCount() > 0) {
                ((DefaultTableModel) tableBusLog.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableBusLog.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusLogReport;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusNo;
    private javax.swing.JPanel panelBusLog1;
    private javax.swing.JPanel panelBusLog2;
    private javax.swing.JTable tableBusLog;
    private javax.swing.JTextField txtBus;
    // End of variables declaration//GEN-END:variables
}
