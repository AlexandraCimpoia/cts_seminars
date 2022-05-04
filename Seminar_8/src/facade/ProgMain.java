package facade;

public class ProgMain {

	//facade usureaza munca de utilizare a clientului
	//exemplul cu telecomanda si schimbarea canalului pe 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ce este facut mai jos va trebui evitat
//		Airline company = new Airline("CTS flight");
//		Flight toGo = company.flightBooking("Bucharest", "Cluj");
//		Flight back = company.flightBooking("Cluj", "Bucharest");
//		
//		
//		Hotel hotel = new Hotel("CTS Hotel");
//		hotel.roomBooking("Cluj");
		
		//exact ce am facut mai sus
		Facade.reservation("Bucharest", "Cluj");
	}

}
