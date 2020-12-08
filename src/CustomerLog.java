

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
 * This class is responsible to save customer log in excel sheet
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
 * 14 Display(String StrIn)
 * 15.FillGrid()
 * 
 * @author Sayali Vakil
 * 
 * This class enters the customer name and displays the all details related to that customer
 */
public class CustomerLog extends javax.swing.JInternalFrame {
    
    public CustomerLog() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustLog = new javax.swing.JTable();
        lblCustName = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        btnCustLog = new javax.swing.JButton();

        setClosable(true);
        setTitle("Customer Log Details");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportExcel)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnExportExcel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 102)));

        tableCustLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Gender", "Date of Birth", "Email ID", "Mobile No", "Email ID"
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
        tableCustLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustLogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustLog);

        lblCustName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(0, 0, 255));
        lblCustName.setText("Customer Name :");

        btnCustLog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCustLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/se.gif"))); // NOI18N
        btnCustLog.setText("View Customer Log Report");
        btnCustLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCustName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCustLog)
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustName)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustLog))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
     * This method is an action performed on the Close button of the CustomerLog page
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
     * This method exports the CustomerLog details into an excel sheet
     */
    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        try {

            TableModel model = tableCustLog.getModel();
            try (FileWriter excel = new FileWriter("c:\\Tickets\\Customer_log.xls")) {
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

            JOptionPane.showMessageDialog(null, "Customer regiter saved at c:\\Tickets\\Customer_log.xls");

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

    // Frame opened event
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {

            //reset jtable
            tableCustLog.getColumnModel().getColumn(0).setHeaderValue("Customer ID");
            tableCustLog.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
            tableCustLog.getColumnModel().getColumn(2).setHeaderValue("Gender");
            tableCustLog.getColumnModel().getColumn(3).setHeaderValue("Date of Birth");
            tableCustLog.getColumnModel().getColumn(4).setHeaderValue("Email ID");
            tableCustLog.getColumnModel().getColumn(5).setHeaderValue("Mobile No");
            tableCustLog.getColumnModel().getColumn(6).setHeaderValue("Address");
            tableCustLog.getTableHeader().resizeAndRepaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCustLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustLogActionPerformed

        FillGridCustomerLog();

    }//GEN-LAST:event_btnCustLogActionPerformed

    private void tableCustLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustLogMouseClicked


    }//GEN-LAST:event_tableCustLogMouseClicked

    // Fills customer log grid
    private void FillGridCustomerLog() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            String Qr;
            Qr = "select c_id,c_name,c_gender,c_dob,c_email_id,c_mobile_no,c_address from customer_master where c_name like '" + txtCustName.getText() + "%' order by c_id";

            PreparedStatement stmt = connection.prepareStatement(Qr);
            rs = stmt.executeQuery();

            tableCustLog.getColumnModel().getColumn(0).setHeaderValue("Customer ID");
            tableCustLog.getColumnModel().getColumn(1).setHeaderValue("Customer Name");
            tableCustLog.getColumnModel().getColumn(2).setHeaderValue("Gender");
            tableCustLog.getColumnModel().getColumn(3).setHeaderValue("Date of Birth");
            tableCustLog.getColumnModel().getColumn(4).setHeaderValue("Email ID");
            tableCustLog.getColumnModel().getColumn(5).setHeaderValue("Mobile No");
            tableCustLog.getColumnModel().getColumn(6).setHeaderValue("Address");

            tableCustLog.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableCustLog.getRowCount() > 0) {
                ((DefaultTableModel) tableCustLog.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableCustLog.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCustLog;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JTable tableCustLog;
    private javax.swing.JTextField txtCustName;
    // End of variables declaration//GEN-END:variables
}
