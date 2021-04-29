
public class Regular extends Ticket{

	private String specialServices;
	

	public Regular(String pnr, String source, String destination, Flight flight, String departureDateTime,
			       String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean isCancelled,
			       String specialServices) {
		
		super(pnr, source, destination, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, isCancelled);
		this.specialServices = specialServices;
	}
	
	public String getSpecialServices() {
		return this.specialServices;
	}
	
	public void setSpecialServices(String newServices) {
		this.specialServices = newServices;
	}
	
}
