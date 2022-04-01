import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class jdbcTest {
	public static void main(String[] args) {
		Connection myConn = null;
		Statement myStmt = null;
		//PreparedStatement myStmt = null;
		ResultSet myRs = null;
			
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String columnNamePattern = null;
		String[] types = null;
		

		try {

			//myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Repent@785260194");

			//myStmt = myConn.createStatement();
			
			
		//Select values to view from the table using a prepared statement
			
			//myStmt = myConn.prepareStatement("select * from employees where salary > ? and department = ?");
			//myStmt.setDouble(1, 80000);
			//myStmt.setString(2, "Legal");
			//myRs = myStmt.executeQuery();
			
			
		//Deleting values from the table and showing how many where deleted by the change using a prepared statement 
			
			//myStmt = myConn.prepareStatement("delete from employees " + "where salary > ? and department = ?");
			//myStmt.setDouble(1,  800000);
			//myStmt.setString(2, "Legal");
			//int rowsAffected = myStmt.executeUpdate();
			
			
		//Inserting values into the table
			
			// int rowsAffected = myStmt
			// .executeUpdate("INSERT INTO Employees " + " (last_name, first_name, email,
			// department, salary) "
			// + "values " + "('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");

			
		//Updating values in the table
			
			//int rowsAffected = myStmt.executeUpdate("update employees " + "set email = 'john.doe@luv2code.com' "
					//+ "where last_name = 'Doe' and first_name = 'John'");
			
			
		//Deleting values from the table
			
			//int rowsAffected = myStmt.executeUpdate("delete from employees " + "where last_name = 'Doe' and first_name = 'John'");
			
			
		//Selecting and showing the values within the table according to the parameters placed
			
			// myRs = myStmt.executeQuery("select * from employees order by last_name");

			
			// while (myRs.next()) {
			// System.out.println(myRs.getString("Last_Name") + " " +
			// myRs.getString("First_Name"));
			// }
			
			
		//Getting metadata, displaying database information, and displaying JDBC driver information
			
			//DatabaseMetaData databaseMetaData = myConn.getMetaData();
			//System.out.println("Product Name: " + databaseMetaData.getDatabaseProductName());
			//System.out.println("Product Version: "+ databaseMetaData.getDatabaseProductVersion());
			//System.out.println();
			//System.out.println("JDBC Driver Name: " + databaseMetaData.getDriverName());
			//System.out.println("JDBC Driver Version: "+ databaseMetaData.getDriverVersion());
			
			//DatabaseMetaData databaseMetaData = myConn.getMetaData();
			//myRs = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern, types);
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("Table_Name"));
			//}
			//myRs = databaseMetaData.getColumns(catalog, schemaPattern, "employees", columnNamePattern);
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("Column_Name"));
			//}
			
			
		//Run Query, getting result set metadata and displaying information
			
			//myStmt = myConn.createStatement();
			//myRs = myStmt.executeQuery("select id, last_name, first_name, salary from employees");
			//ResultSetMetaData rsMetaData = myRs.getMetaData();
			//int columnCount = rsMetaData.getColumnCount();
			//System.out.println("Column count: " + columnCount + "\n");
			//for (int column = 1; column <= columnCount; column++) {
			//	System.out.println("Column name: " + rsMetaData.getColumnName(column));
			//	System.out.println("Column type name: " +rsMetaData.getColumnTypeName(column));
			//	System.out.println("Is Nullable: " + rsMetaData.isNullable(column));
			//	System.out.println("Is Auto Increment: " + rsMetaData.isAutoIncrement(column) + "\n");
			//}
			
			
		//	Loading the properties file, reading and connecting to database using properties file
			//Properties props = new Properties();
			//props.load(new FileInputStream("C:\\Users\\NoirPhantom\\eclipse-workspace\\JDBC-Test\\demo-properties.txt"));
			//String theUser = props.getProperty("user");
			//String thePassword = props.getProperty("password");
			//String theDburl = props.getProperty("dburl");
			//myConn = DriverManager.getConnection(theDburl, theUser, thePassword);	
			//System.out.println("Connection Successful!");

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
