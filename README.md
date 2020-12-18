# Bus


Steps to Run Bus Management System Application :

1. Install Netbeans IDE 8.2 RC in your PC
2. Install Xampp V3.2.4 
3. Create New Project --> Bus Management System in Netbeans IDE
4. Paste src folder into this project (This will add all class files and images used for project)
5. Right click on Bus Management System (project name) and select Properties --> Libraries --> Add JAR/Folder -->
	and select mysql-connector-java-5.1.48-bin jar (choose from your computer from submitted files) for database connectivity 
6. Once again click on Add JAR/Folder --> select itextpdf-5.1.1 jar (choose from your computer from submitted files) to generate ticket in pdf format.
7. To start the MYSQL, open Xampp and start MYSQL
8. Click import --> Choose File (choose from your computer from submitted files) --> select busmgmnt.sql --> Click Go (This will create busmanagement database)
9. In Netbeans, Open MainClass.java file and change strUid (MYSQL username) and strPwd (MYSQL password)

	public String strUrl = "jdbc:mysql://localhost/busmanagement?useSSL=false";
    public String strUid = "root";
    public String strPwd = "root";
	
	To know your MYSQL username and password --> Open Xampp --> Click Mysql's admin --> Click SQL --> and run SELECT * FROM mysql.user;
	Please undate your username and password in MainClass.java
10. In Netbeans, right click on Bus Management System (project name) and run the project.
11. It will display Login page, enter username and password both as 'admin' 
	

     
