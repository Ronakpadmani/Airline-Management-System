package AirlineManagementSystem;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	private static String url = "jdbc:mysql://localhost/airline management system";
	private static String user = "ronak";
	private static String pass = "Ronakpadmani@29";

	public static void main(String[] args) throws SQLException {
		
		Database database = new Database();
		Scanner s = new Scanner(System.in);
		
		String art = """
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠏⠉⢷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠇⠀⠀⠈⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣤⠀⠀⠀⣸⡇⠀⠀⠀⠀⠀⣿⡀⠀⠀⣠⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⢀⣤⣤⡀⠀⣸⣧⣾⠶⠞⠋⢹⡇⠀⠀⠀⠀⠀⣿⠙⠛⠶⢿⣤⣿⡀⠀⣠⣤⡄⠀⠀⠀⠀
				⠀⠀⣀⣸⣷⠾⠟⠛⠉⠁⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠉⠙⠛⠿⢧⣧⣀⡀⠀⠀
				⣰⠟⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢷⡀
				⣿⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⢼⡇⠀⠀⠀⠀⠀⣿⢦⣤⣄⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⢸⡇
				⢿⣤⣤⣴⠶⠶⠟⠛⠛⠉⠉⠁⠀⠀⠸⡇⠀⠀⠀⠀⠀⣿⠀⠀⠀⠉⠉⠙⠛⠛⠷⠶⢦⣤⣤⣼⠇
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣸⡇⣴⢷⡄⣿⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡶⠞⠛⠉⠁⣇⣿⢸⣷⡏⠉⠙⠛⠶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠁⠀⠀⠀⠀⠀⣿⣿⢸⢿⡇⠀⠀⠀⠀⠀⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⣠⣤⣤⠴⠶⠶⣿⡻⠾⣸⡷⠶⠶⢤⣤⣤⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				        """;

		
		int i=0;
		do{
			
			System.out.println("\nWelcome to Airline Management System ");
	        System.out.println(art);
			System.out.println("1. Add New Passenger");
			System.out.println("2. Get Passenger Id By Name");
			System.out.println("3. Print all passengers");
			System.out.println("4. Edit Passenger");
			System.out.println("5. Delete Passenger");
			System.out.println("6. Add New Employee");
			System.out.println("7. Get Employee By Name");
			System.out.println("8. Print all Employees");
			System.out.println("9. Edit Employee");
			System.out.println("10. Delete Employee");
			System.out.println("11. Add New Plane");
			System.out.println("12. Print all Planes");
			System.out.println("13. Edit plane");
			System.out.println("14. Delete Plane");
			System.out.println("15. Add New Airports");
			System.out.println("16. Print All Airports");
			System.out.println("17. Edit Airports");
			System.out.println("18. Delete Airport");
			System.out.println("19. Create New Flight");
			System.out.println("20. Show all flights");
			System.out.println("21. Delay flight");
			System.out.println("22. Book flight");
			System.out.println("23. Set flight stuff");
			System.out.println("24. Delete Flight");
			System.out.println("25. Show flight stuff");
			System.out.println("26. Show flight passengers");
			System.out.println("27. Quit");
			
			i=s.nextInt();
			switch(i) {
			case 1:
				PassengersController.AddNewPassenger(database, s);
				break;
				
			case 2:
				PassengersController.findPassengerByName(database,s);
				break;
			
			case 3:
				PassengersController.printAllPassengers(database);
				break;
				
			case 4:
				PassengersController.EditPassenger(database, s);
				break;
				
			case 5:
				PassengersController.DeletePassenger(database , s);
				break;
			
			case 6:
				EmployeesController.AddNewEmployee(database, s);
				break;
				
			case 7:
				EmployeesController.findEmployeeByName(database, s);
				break;
				
			case 8:
				EmployeesController.printAllEmployees(database);
				break;
				
			case 9:
				EmployeesController.EditEmployee(database, s);
				break;
				
			case 10:
				EmployeesController.DeleteEmployee(database,s);
				break;
				
			case 11:
				AirplanesController.AddNewAirplane(database,s);
				break;
				
			case 12:
				AirplanesController.PrintAllPlanes(database);
				break;
				
			case 13:
				AirplanesController.EditAirplane(database, s);
				break;
				
			case 14:
				AirplanesController.DeletePlane(database, s);
				break;
			
			case 15:
				AirportsController.AddNewAirport(database, s);
				break;
				
			case 16:
				AirportsController.PrintAllAirports(database);
				break;
				
			case 17:
				AirportsController.EditAirport(database, s);
				break;
				
			case 18:
				AirportsController.DeleteAirport(database, s);
				break;
				
			case 19:
				FlightsController.AddNewFlight(database, s);
				break;
				
			case 20:
				FlightsController.showAllFlights(database);
				break;
				
			case 21:
				FlightsController.delayFlight(database, s);
				break;
				
			case 22:
				FlightsController.bookFlight(database, s);
				break;
				
			case 23:
				FlightsController.setFlightStuff(database, s);
				break;
				
			case 24:
				FlightsController.cancelFlight(database,s);
				break;
				
			case 25:
				FlightsController.printFlightStuff(database, s);
				break;
				
			case 26:
				FlightsController.printFlightPassengers(database, s);
				break;
			}
			
				
			
		}while (i!=27);
		
	}
	

}
