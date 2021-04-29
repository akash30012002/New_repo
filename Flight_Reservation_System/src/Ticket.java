

public abstract class Ticket {

	private String pnr;
	private String source;
	private String destination;
	private Flight flight;
	private String departureDateTime;
	private String arrivalDateTime;
	private Passenger passenger;
	private String seatNo;
	private float price;
	private boolean isCancelled;
	
	
	public Ticket(String pnr, String source, String destination, Flight flight, String departureDateTime,
			String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean isCancelled) {

		this.pnr = pnr;
		this.source = source;
		this.destination = destination;
		this.flight = flight;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.passenger = passenger;
		this.seatNo = seatNo;
		this.price = price;
		this.isCancelled = isCancelled;
		
		if (flight.checkAvailability()) {
			System.out.println("Seat Booked");
			flight.updateSeatsBooked();
		}
		
		else {
			this.cancelTicket();
			System.out.println("The ticket cannot be booked as the flight is full");
		}
	}
	
	public String checkStatus() {
		String state = (this.isCancelled) ? "Cancelled" : "Confirmed";
		return state;
	}
	
	public float journeyDuration() {
		return 0.0f;
	}
	
	public void cancelTicket() {
		this.isCancelled = true;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
}
