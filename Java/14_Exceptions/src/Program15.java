//18. Write a program to generate SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program15 {

	public static void main(String[] args) {
		
		//creating a connection
		Connection connection = null;
		Statement statement = null;

		//creating try catch finally block to handle the exception
		try {
			
			
			// Attempt to establish a connection to a non-existing database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/non_existing_database", "username",
					"password");

			// Attempt to execute a SQL statement on the connection
			statement = connection.createStatement();
			
			//writing the query
			statement.execute("SELECT * FROM non_existing_table");
		} 
		
		catch (SQLException e) {
			
			// Handle the exception
			System.out.println("SQLException caught!");
			
			/* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
			e.printStackTrace();
		} 
		
		finally {
			// Close the resources

			try {
				
				//checking the condition
				if (statement != null) {
					statement.close();
				}
			}
			
			//SQLException occures it the connection is not made properly or the query is executed incorrectly
			catch (SQLException ex) {
				
				/* printStackTrace() prints the throwable Exception object as well as with other Information
	            like the line number where Exception occurs and class name where the exception occurred.*/
				ex.printStackTrace();
			}
		}
	}

}
