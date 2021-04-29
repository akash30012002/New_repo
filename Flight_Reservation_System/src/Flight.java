
public class Flight {

	private String flightNo;
	private String airline;
	private int capacity;
	private int seatsBooked;
	
	
	public Flight(String flightNo, String airline, int capacity, int seatsBooked) {
		this.flightNo = flightNo;
		this.airline = airline;
		this.capacity = capacity;
		this.seatsBooked = seatsBooked;
	}
	
	public String getFlightDetails() {
		return "Airline: " + this.airline + ", Flight No: " + this.flightNo;
	}
	
	public boolean checkAvailability() {
		return (this.seatsBooked < this.capacity) ? true : false; 
	}
	
	public void updateSeatsBooked() {
		this.seatsBooked++ ;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
}
