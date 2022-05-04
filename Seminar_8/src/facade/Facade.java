package facade;

public class Facade {

	
	public static void reservation(String initialLocation, String destination) {
		//flight
		//room
		Airline company = new Airline("CTS flight");
		Flight toGo = company.flightBooking(initialLocation, destination);
		Flight back = company.flightBooking(initialLocation, destination);
		
		
		Hotel hotel = new Hotel("CTS Hotel");
		hotel.roomBooking(destination);
		
	}
}
