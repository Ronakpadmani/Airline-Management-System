package AirlineManagementSystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirportsController {
	
	public static void AddNewAirport(Database database , Scanner s) throws SQLException {
		System.out.println("Enter city: ");
		String city = s.next();
		int id=0;
		
		ArrayList<Airport> airports = getAllAirports(database);
		
		if(airports.size()!=0) {
			
			id = airports.get(airports.size()-1).getId()+1;

		}else {
			id=0;
		}
		
		Airport airport = new Airport();
		airport.setId(id);
		airport.setCity(city);
		
		String insert="INSERT INTO `airports`(`id`, `city`) VALUES ('"+airport.getId()+"','"+airport.getCity()+"')";
		database.getStatement().execute(insert);
		System.out.println("Airports Added Successfully");
		
	}
	
	public static ArrayList<Airport> getAllAirports(Database database) throws SQLException{
		ArrayList<Airport> airports = new ArrayList<>();
		String get = "SELECT * FROM `airports`;";
		ResultSet rs = database.getStatement().executeQuery(get);
		while(rs.next()) {
			Airport a = new Airport();
			a.setId(rs.getInt("id"));
			a.setCity(rs.getString("city"));
			airports.add(a);
			
		}
		
		return airports;
	}
	
	public static void PrintAllAirports(Database database) throws SQLException {
		System.out.println("-------------------------");
		System.out.println("id\tcity");
		for (Airport a: getAllAirports(database)) {
			a.print();
		}
		System.out.println("-------------------------");
	}
	
	public static void EditAirport(Database database,Scanner s) throws SQLException
	{
		System.out.println("Enter id (int): \n(-1 to show all airports)");
		int id = s.nextInt();
		if (id==-1) {
			PrintAllAirports(database);
			System.out.println("Enter airport id (int): ");
			id=s.nextInt();
		}
		Airport airport =getAirport(database ,id);
		System.out.println("Enter city:");
		String city = s.next();
		airport.setCity(city);
		String update = "UPDATE `airports` SET `id`='"+airport.getId()+"',`city`='"+airport.getCity()+"' WHERE `id` = "+airport.getId()+";";
		database.getStatement().execute(update);
		System.out.println("Airport Edited Successfully");
		

	}
	
	public static Airport getAirport(Database database,int id) throws SQLException {
		Airport a = new Airport();
		String get = "SELECT `id`, `city` FROM `airports` WHERE `id` = "+id+" ;";
		ResultSet rs = database.getStatement().executeQuery(get);
		rs.next();
		a.setId(rs.getInt("id"));
		a.setCity(rs.getString("city"));
		return a;
		
	}
	
	public static void DeleteAirport(Database database , Scanner s) throws SQLException {
		System.out.println("Enter id (int): \n(-1 to show all Airports)");
		int id = s.nextInt();
		if(id==-1) {
			PrintAllAirports(database);
			System.out.println("Enter Airport id (int): ");
			id=s.nextInt();
		}
		String delete = "DELETE FROM `airports` WHERE `id`="+id+";";
		database.getStatement().execute(delete);
		System.out.println("Airport Deleted Successfully");
		System.out.println();
	}

}
