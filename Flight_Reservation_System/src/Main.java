
public class Main {

	public static void main(String[] args) {
		
		Flight indigo320 = new Flight("A320","indigo",5,0);
		
		Passenger passenger1 = new Passenger("Akash", "9920935531", "akash@gmail.com", "Sesame street", "Mumbai", "Mah");
		Passenger passenger2 = new Passenger("Rajat", "9892715423", "rajat@gmail.com", "Park Street", "New Delhi", "Delhi");
		
		Regular ticket1 = new Regular("1101", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger1, "A1", 5400, false, "Food");

		Tourist ticket4 = new Tourist("1102", "Kolkata", "mumbai", indigo320, "10/2/2021 5:50",
				"11/2/2021 5:50", passenger2, "A1", 5400, false, "WestIn");
		
		
		printTicketDetails(ticket1);
		printTicketDetails(ticket4);
		
	}
	
	public static void printTicketDetails(Regular ticket) {	
		System.out.println(ticket.getPnr());
	}
	
	public static void printTicketDetails(Tourist ticket) {	
		System.out.println(ticket.getPnr());
	}
}
