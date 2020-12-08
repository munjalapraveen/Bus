
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 * This class contains the database connectivity details.
 * This class is also responsible for validation methods
 * This class contains following methods :
 * 
 * 1. boolean dateValidation(String InDate, String DateFormat)
 * 2. Boolean dateFormatValidation(String dateToValdate)
 * 3. boolean numValidation(String input)
 * 4. boolean emailValidation(String email)
 * 5. Boolean timeFormatValidation(String dateToValdate)
 * 6. boolean mobileNumberValidation(String MobileNo)
 * 7. void userLogInsertion(String ActivityType, String ActivityRemark)

 * @author Mamta Sinha
 */
public class MainClass {
  

    public String strUrl = "jdbc:mysql://localhost/busmanagement?useSSL=false";
    public String strUid = "root";
    public String strPwd = "root";

    public static String strUser;
    public static String strUserType;
    public static String strID;
    
     /**
     * This method is responsible for date validation
     * 
     * @param InDate - its the date
     * @param DateFormat - its the date format
     * @return - boolean
     */
    public boolean dateValidation(String InDate, String DateFormat) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DateFormat);
            sdf.setLenient(false);
            Date date = sdf.parse(InDate);
            if (!sdf.format(date).equals(InDate)) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    
     /**
     * This method is responsible for date format validation
     * 
     * @param dateToValdate - its the date to validate
     * @return - boolean
     */
    public Boolean dateFormatValidation(String dateToValdate) {

        if (dateToValdate.length() != 10) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setLenient(false);
        try {
        	Date date = formatter.parse(dateToValdate);
            return true;
        } catch (ParseException e) {
            //If input date is in different format or invalid.
            return false;
        }
    }
     /**
     * This method is responsible for number validation
     * 
     * @param input - its the number to validate
     * @return - boolean
     */
    public boolean numValidation(String input) {
        String ePattern = "[0-9]+";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(input);
        return m.matches();
    }
     /**
     * This method is responsible for email id validation
     * 
     * @param email - its the email id to validate
     * @return - boolean
     */
    public boolean emailValidation(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    
     /**
     * This method is responsible for time format validation
     * 
     * @param timeToValdate - its the time format to validate
     * @return - boolean
     */
    public Boolean timeFormatValidation(String timeToValdate) {

        if (timeToValdate.length() != 5) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        formatter.setLenient(false);
        try {
            Date date = formatter.parse(timeToValdate);
            return true;
        } catch (ParseException e) {
            //If input date is in different format or invalid.
            return false;
        }
    }
    /**
     * This method is responsible for mobile number validation
     * 
     * @param MobileNo - its the mobile number entered by user/admin
     * @return - boolean
     */
    public boolean mobileNumberValidation(String MobileNo) {
        Pattern p = Pattern.compile("(1/91)?[7-9][0-9]{9}"); 
        Matcher m = p.matcher(MobileNo); 
        return (m.find() && m.group().equals(MobileNo));
            
    }
    
     /**
     * This method is responsible to maintain the user activity log
     * 
     * @param ActivityType - Its what kind of activity user/admin is doing
     * @param ActivityRemark - Its activity remark

     * @return - void
     */
    public void userLogInsertion(String ActivityType, String ActivityRemark)
    {
         try {
          
             String qr="";
            qr="insert into user_log (ul_activity,ul_user_id,ul_activity_date,ul_status) "
            + "values ('" + ActivityType + "'," + strID + ",sysdate(),'" + ActivityRemark + "')";
            
            Connection connection;
            connection = DriverManager.getConnection(strUrl, strUid, strPwd);
            PreparedStatement pst = connection.prepareStatement(qr);
            pst.executeUpdate(qr);

       } catch (Exception e) {
            return;
        }
    }
}
