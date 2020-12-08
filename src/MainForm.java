
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This class is responsible to display all the contents of the MainForm of Bus Management System
 * This class contains following methods :
 * 
 * 1. void itemDestinationActionPerformed(java.awt.event.ActionEvent evt)
 * 2. void itemBusScheduleActionPerformed(java.awt.event.ActionEvent evt)
 * 3. void itemBusInfoActionPerformed(java.awt.event.ActionEvent evt)
 * 4. void itmBookingActionPerformed(java.awt.event.ActionEvent evt)
 * 5. void itemManageBookingActionPerformed(java.awt.event.ActionEvent evt)
 * 6. void formWindowOpened(java.awt.event.WindowEvent evt)
 * 7. void menuExitActionPerformed(java.awt.event.ActionEvent evt)
 * 8. void itemYesActionPerformed(java.awt.event.ActionEvent evt)
 * 9. void itemUserInfoActionPerformed(java.awt.event.ActionEvent evt)
 * 10. void itemCustInfoActionPerformed(java.awt.event.ActionEvent evt)
 * 11. void menuChangePwdActionPerformed(java.awt.event.ActionEvent evt)
 * 12. void itemBookingLogActionPerformed(java.awt.event.ActionEvent evt)
 * 13. void itemOpenActionPerformed(java.awt.event.ActionEvent evt)
 * 14. void menuReportActionPerformed(java.awt.event.ActionEvent evt)
 * 15. void itemCustLogActionPerformed(java.awt.event.ActionEvent evt)
 * 16. void itemBusLogActionPerformed(java.awt.event.ActionEvent evt)
 * 17. void itemUserReportActionPerformed(java.awt.event.ActionEvent evt)
 * 18. void main(String args)
 * 
 * In this class Admin is responsible to to CRUD operations on User, Bus and Destination details
 * Admin is responsible to schedule Bus and manage user activity report
 * In this class User(Staff) is responsible to do CRUD operations on Customers.
 * User is also responsible for View and Manage bookings.
 * In this class Admin/User can see Customer, Booking and Bus log 
 * 
 * @author Mamta Sinha
 */
public class MainForm extends JFrame {
    //Constructor for MainForm
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIMG1 = new javax.swing.JLabel();
        lblIMG2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAdmin = new javax.swing.JMenu();
        itemUserInfo = new javax.swing.JMenuItem();
        itemBusInfo = new javax.swing.JMenuItem();
        itemDestination = new javax.swing.JMenuItem();
        itemBusSchedule = new javax.swing.JMenuItem();
        itemUserReport = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        itemCustInfo = new javax.swing.JMenuItem();
        itmBooking = new javax.swing.JMenuItem();
        itemManageBooking = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        itemBookingLog = new javax.swing.JMenuItem();
        itemCustLog = new javax.swing.JMenuItem();
        itemBusLog = new javax.swing.JMenuItem();
        menuChangePwd = new javax.swing.JMenu();
        itemOpen = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();
        itemYes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bus Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome to Bus Management System");
        desktop.add(lblWelcome);
        lblWelcome.setBounds(430, 30, 540, 90);
        desktop.add(jLabel1);
        jLabel1.setBounds(280, 150, 0, 160);

        lblIMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/covid_img_resize.jpg"))); // NOI18N
        desktop.add(lblIMG1);
        lblIMG1.setBounds(990, 70, 460, 860);

        lblIMG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/covid_img_main.jpg"))); // NOI18N
        desktop.add(lblIMG2);
        lblIMG2.setBounds(0, 130, 981, 770);

        menuBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        menuAdmin.setForeground(new java.awt.Color(102, 51, 255));
        menuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin2.jpg"))); // NOI18N
        menuAdmin.setText("ADMIN");
        menuAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        itemUserInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemUserInfo.setText("User Information");
        itemUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUserInfoActionPerformed(evt);
            }
        });
        menuAdmin.add(itemUserInfo);

        itemBusInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemBusInfo.setText("Bus Information");
        itemBusInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBusInfoActionPerformed(evt);
            }
        });
        menuAdmin.add(itemBusInfo);

        itemDestination.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemDestination.setText("Destination Information");
        itemDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDestinationActionPerformed(evt);
            }
        });
        menuAdmin.add(itemDestination);

        itemBusSchedule.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemBusSchedule.setText("Bus Schedule");
        itemBusSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBusScheduleActionPerformed(evt);
            }
        });
        menuAdmin.add(itemBusSchedule);

        itemUserReport.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemUserReport.setText("User Activity Log Report");
        itemUserReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUserReportActionPerformed(evt);
            }
        });
        menuAdmin.add(itemUserReport);

        menuBar.add(menuAdmin);

        menuUser.setForeground(new java.awt.Color(102, 51, 255));
        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user4.png"))); // NOI18N
        menuUser.setText("   USER          ");
        menuUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        itemCustInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemCustInfo.setText("Customer Information");
        itemCustInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustInfoActionPerformed(evt);
            }
        });
        menuUser.add(itemCustInfo);

        itmBooking.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itmBooking.setText("New Booking");
        itmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBookingActionPerformed(evt);
            }
        });
        menuUser.add(itmBooking);

        itemManageBooking.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemManageBooking.setText("Manage Booking");
        itemManageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManageBookingActionPerformed(evt);
            }
        });
        menuUser.add(itemManageBooking);

        menuBar.add(menuUser);

        menuReport.setForeground(new java.awt.Color(102, 51, 255));
        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report2.png"))); // NOI18N
        menuReport.setText("   REPORT   ");
        menuReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportActionPerformed(evt);
            }
        });

        itemBookingLog.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemBookingLog.setText("Booking Log");
        itemBookingLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBookingLogActionPerformed(evt);
            }
        });
        menuReport.add(itemBookingLog);

        itemCustLog.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemCustLog.setText("Customer Log");
        itemCustLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustLogActionPerformed(evt);
            }
        });
        menuReport.add(itemCustLog);

        itemBusLog.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemBusLog.setText("Bus Log");
        itemBusLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBusLogActionPerformed(evt);
            }
        });
        menuReport.add(itemBusLog);

        menuBar.add(menuReport);

        menuChangePwd.setForeground(new java.awt.Color(102, 51, 255));
        menuChangePwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/p.gif"))); // NOI18N
        menuChangePwd.setText("CHANGE PASSWORD   ");
        menuChangePwd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuChangePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChangePwdActionPerformed(evt);
            }
        });

        itemOpen.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemOpen.setText("Open");
        itemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenActionPerformed(evt);
            }
        });
        menuChangePwd.add(itemOpen);

        menuBar.add(menuChangePwd);

        menuExit.setForeground(new java.awt.Color(102, 51, 255));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/e.gif"))); // NOI18N
        menuExit.setText(" EXIT   ");
        menuExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        itemYes.setBackground(new java.awt.Color(0, 0, 255));
        itemYes.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        itemYes.setText("Yes");
        itemYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemYesActionPerformed(evt);
            }
        });
        menuExit.add(itemYes);

        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is an action performed on the DestinationInformation menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for DestinationInformation class which is responsible to add the destination details.
     */
    private void itemDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDestinationActionPerformed
        DestinationInformation m = new DestinationInformation();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemDestinationActionPerformed
    
     /**
     * This method is an action performed on the Bus Schedule menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for BusSchedule class which is responsible for scheduling the Bus 
     */
    private void itemBusScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBusScheduleActionPerformed

        BusSchedule m = new BusSchedule();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemBusScheduleActionPerformed

     /**
     * This method is an action performed on the Bus Information menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for BusInformation class which is responsible for CRUD operations of Bus.
     */   
    private void itemBusInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBusInfoActionPerformed

        BusInformation m = new BusInformation();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemBusInfoActionPerformed

     /**
     * This method is an action performed on the Booking menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for Booking class which is responsible for booking ticket for customer by user(staff)
     */ 
    private void itmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBookingActionPerformed

        Booking m = new Booking();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itmBookingActionPerformed

     /**
     * This method is an action performed on the Manage Booking menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for ViewBooking class which is responsible to manage already booked tickets and ticket printing
     */ 
    private void itemManageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemManageBookingActionPerformed

        ViewBooking m = new ViewBooking();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemManageBookingActionPerformed

     /**
     * This method is to open window for Admin/User
     * 
     * @param name - evt
     * @return - void
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if (MainClass.strUserType.endsWith("admin") == true) {

            menuAdmin.setEnabled(true);
            menuUser.setEnabled(true);
        }
        if (MainClass.strUserType.endsWith("user") == true) {
            menuUser.setEnabled(true);
            menuAdmin.setEnabled(false);
        }

    }//GEN-LAST:event_formWindowOpened

     /**
     * This method is an action performed on the Exit menu
     * 
     * @param name - evt
     * @return - void
     */ 
    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_menuExitActionPerformed

    /**
     * This method is an action performed on the Yes menu item
     * 
     * @param name - evt
     * @return - void
     */ 
    private void itemYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemYesActionPerformed
        System.exit(1);
    }//GEN-LAST:event_itemYesActionPerformed

    /**
     * This method is an action performed on the User Information menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for UserInformation class which is responsible for CRUD operations Users
     */ 
    private void itemUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUserInfoActionPerformed

        UserInformation m = new UserInformation();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemUserInfoActionPerformed

    /**
     * This method is an action performed on the Customer Information menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for CustomerInformation class which is responsible for CRUD operations Customers
     */ 
    private void itemCustInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustInfoActionPerformed

        CustomerInformation m = new CustomerInformation();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemCustInfoActionPerformed

    private void menuChangePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChangePwdActionPerformed


    }//GEN-LAST:event_menuChangePwdActionPerformed

    /**
     * This method is an action performed on the Booking Log menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for BookingLog class which is responsible generate booking log by entering booking ID.
     */
    private void itemBookingLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBookingLogActionPerformed

        BookingLog m = new BookingLog();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemBookingLogActionPerformed

     /**
     * This method is an action performed on the Open menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for ChangePassword class which is responsible to create new password for Admin/User
     */
    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed
        ChangePassword m = new ChangePassword();
        desktop.add(m);
        m.setVisible(true);

    }//GEN-LAST:event_itemOpenActionPerformed

    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
    }//GEN-LAST:event_menuReportActionPerformed

    /**
     * This method is an action performed on the Customer Log menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for CustomerLog class which is responsible to generate customer log report by entering customer name.
     */
    private void itemCustLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustLogActionPerformed
        CustomerLog m = new CustomerLog();
        desktop.add(m);
        m.setVisible(true);        
    }//GEN-LAST:event_itemCustLogActionPerformed
    
    /**
     * This method is an action performed on the Bus Log menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for BusLog class which is responsible to generate Bus log report by entering Bus Number.
     */
    private void itemBusLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBusLogActionPerformed
        BusLog m = new BusLog();
        desktop.add(m);
        m.setVisible(true);  
    }//GEN-LAST:event_itemBusLogActionPerformed

    
    /**
     * This method is an action performed on the UserActivityLOgReport  menu item
     * 
     * @param name - evt
     * @return - void
     * 
     * This method creates object for UserLogRegsiter class which is responsible to generate maintain admin/user log
     */
    private void itemUserReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUserReportActionPerformed
        UserLogRegsiter m = new UserLogRegsiter();
        desktop.add(m);
        m.setVisible(true);  
    }//GEN-LAST:event_itemUserReportActionPerformed

      /**
     * This method is main method where the execution of MainForm page takes place at first
     * 
     * @param name - args
     * @return - void
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemBookingLog;
    private javax.swing.JMenuItem itemBusInfo;
    private javax.swing.JMenuItem itemBusLog;
    private javax.swing.JMenuItem itemBusSchedule;
    private javax.swing.JMenuItem itemCustInfo;
    private javax.swing.JMenuItem itemCustLog;
    private javax.swing.JMenuItem itemDestination;
    private javax.swing.JMenuItem itemManageBooking;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemUserInfo;
    private javax.swing.JMenuItem itemUserReport;
    private javax.swing.JMenuItem itemYes;
    private javax.swing.JMenuItem itmBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIMG1;
    private javax.swing.JLabel lblIMG2;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuChangePwd;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
