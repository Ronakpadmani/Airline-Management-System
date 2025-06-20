package AirlineManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	
	private static String url = "jdbc:mysql://localhost/airline management system";
	private static String user = "ronak";
	private static String pass = "Ronakpadmani@29";
	private Statement statement;
	
	public Database() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, user, pass);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
	}
	
	public Statement getStatement() {
		return statement;
	}
	
	

}
