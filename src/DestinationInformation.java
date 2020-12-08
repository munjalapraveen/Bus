
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;

/**
 * This class is responsible to enter destination details for Bus Management System
 * This class contains following methods :
 * 
 * 1.btnCloseActionPerformed(java.awt.event.ActionEvent evt)
 * 2.btnSaveActionPerformed(java.awt.event.ActionEvent evt)
 * 3.btnModifyActionPerformed(java.awt.event.ActionEvent evt)
 * 4.btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
 * 5.btnRefreshActionPerformed(java.awt.event.ActionEvent evt)
 * 6.tableDestinationMouseClicked(java.awt.event.MouseEvent evt)
 * 7.formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) 
 * 8.txtDestinNameActionPerformed(java.awt.event.ActionEvent evt)
 * 9.chkActiveActionPerformed(java.awt.event.ActionEvent evt)
 * 10.ClearText()
 * 11.Display(String StrIn)
 * 12.FillGrid()
 * 
 * @author Abhinandan Reddy
 */
public class DestinationInformation extends javax.swing.JInternalFrame {

   
    public DestinationInformation() {
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
        lblDestinId = new javax.swing.JLabel();
        lblDestinName = new javax.swing.JLabel();
        TxtDestId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDestination = new javax.swing.JTable();
        chkActive = new javax.swing.JCheckBox();
        txtDestinName = new javax.swing.JTextField();

        setTitle("Destination Master");
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

        lblDestinId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDestinId.setForeground(new java.awt.Color(0, 0, 255));
        lblDestinId.setText("Destination ID :");
        lblDestinId.setToolTipText("");

        lblDestinName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDestinName.setForeground(new java.awt.Color(0, 0, 255));
        lblDestinName.setText("Destination Name :");

        TxtDestId.setEditable(false);

        tableDestination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DestinationId", "DestinationName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDestinationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDestination);

        chkActive.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        chkActive.setForeground(new java.awt.Color(0, 0, 255));
        chkActive.setText("Destination Active");
        chkActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActiveActionPerformed(evt);
            }
        });

        txtDestinName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinNameActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDestinId)
                            .addComponent(lblDestinName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkActive, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestinName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDestId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDestId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestinId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestinName)
                    .addComponent(txtDestinName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkActive)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

     /**
     * This method is an action performed on the Close button of the Destination Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

     /**
     * This method is an action performed on the Save button of the Destination Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Add new record
        try {
            //validation
            if (txtDestinName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter destination name");
                txtDestinName.requestFocus();
                return;
            }

            //check for duplicate 
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from destination_master where d_name ='" + txtDestinName.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 0) {
                JOptionPane.showMessageDialog(null, "Duplicate destination name are not allowed");
                txtDestinName.requestFocus();
                return;
            }

            //insert into user master 
            String sql = "insert into destination_master (d_name, d_active) values ('"
                    + txtDestinName.getText() + "',1)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record added.");

            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            TxtDestId.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * This method is an action performed on the Modify button of the Destination Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        //modify record
        try {
            if (TxtDestId.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Select destination from grid to edit");
                TxtDestId.requestFocus();
                return;
            }

            if (txtDestinName.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter user display name");
                txtDestinName.requestFocus();
                return;
            }

            //update record
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

            //dupliate user login name
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery1 = "select count(*) from destination_master where d_name ='" + txtDestinName.getText() + "'";
            ResultSet rs1 = stmt1.executeQuery(sqlQuery1);

            rs1.first();
            int rscount = rs1.getInt(1);
            if (rscount > 1) {
                JOptionPane.showMessageDialog(null, "Duplicate destination name are not allowed");
                txtDestinName.requestFocus();
                return;
            }

            String uActive = "1";
            if (chkActive.isSelected() == true) {
                uActive = "1";
            } else {
                uActive = "0";
            }

            //update user master 
            String sql = "update destination_master set d_name='" + txtDestinName.getText() + "',  d_active =" + uActive + " where d_id =" + TxtDestId.getText();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Record updated.");

            ClearText();
            FillGrid();

            btnSave.setEnabled(true);
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            TxtDestId.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    /**
     * This method is an action performed on the Delete button of the Destination Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (TxtDestId.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "No record found for delete.");
                return;
            }

            int p = JOptionPane.showConfirmDialog(this, "Do you want to delete this record ?");
            if (p == 0) {

                MainClass mc = new MainClass();

                Connection connection;
                connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);

                String sql = "delete from destination_master where d_id =" + TxtDestId.getText() + "";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record deleted.");

                ClearText();
                FillGrid();

                btnSave.setEnabled(true);
                btnModify.setEnabled(false);
                btnDelete.setEnabled(false);
                TxtDestId.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * This method is an action performed on the Refresh button of the Destination Information page
     * 
     * @param name - evt
     * @return - void
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        ClearText();
        FillGrid();

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
        TxtDestId.requestFocus();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // mouse clicked event on destination table
    private void tableDestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDestinationMouseClicked

        int row = tableDestination.rowAtPoint(evt.getPoint());
        int col = 0;//jTable1.columnAtPoint(evt.getPoint());
        //JOptionPane.showMessageDialog(null," Value in the cell clicked :"+ " " +jTable1.getValueAt(row,col).toString());
        String StrIn = tableDestination.getValueAt(row, col).toString();

        Display(StrIn);

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableDestinationMouseClicked

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

    private void txtDestinNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinNameActionPerformed

    private void chkActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkActiveActionPerformed

    // Clears all text filled in the form
    private void ClearText() {
        TxtDestId.setText("");

        txtDestinName.setText("");

        chkActive.setSelected(true);

    }

    // Display all the information fetching details from database
    private void Display(String StrIn) {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select * from destination_master where d_id=" + StrIn + "");
            rs = stmt.executeQuery();
            rs.first();

            ClearText();

            TxtDestId.setText(rs.getString("d_id"));

            txtDestinName.setText(rs.getString("d_name"));

            String uActive;
            uActive = rs.getString("d_active");
            if (uActive == "1") {
                chkActive.setSelected(true);
            } else {
                chkActive.setSelected(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }

    // Fiils grid using all the information fetching details from database
    private void FillGrid() {
        try {
            MainClass mc = new MainClass();

            Connection connection;
            connection = DriverManager.getConnection(mc.strUrl, mc.strUid, mc.strPwd);
            ResultSet rs;

            PreparedStatement stmt = connection.prepareStatement("select d_id, d_name from destination_master order by d_id");
            rs = stmt.executeQuery();

            tableDestination.getColumnModel().getColumn(0).setHeaderValue("Destination ID");
            tableDestination.getColumnModel().getColumn(1).setHeaderValue("Destination Name");

            tableDestination.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (tableDestination.getRowCount() > 0) {
                ((DefaultTableModel) tableDestination.getModel()).removeRow(0);
            }

            //Creating Object []rowData for jTable's Table Model
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) tableDestination.getModel()).insertRow(rs.getRow() - 1, row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDestId;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestinId;
    private javax.swing.JLabel lblDestinName;
    private javax.swing.JTable tableDestination;
    private javax.swing.JTextField txtDestinName;
    // End of variables declaration//GEN-END:variables
}
