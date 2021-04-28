
public class Tourist extends Ticket {
	
	private String hotelAddress;
	private String[] touristLocations = new String[5];
	
	
	public Tourist(String pnr, String source, String destination, Flight flight, String departureDateTime,
				   String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean isCancelled,
				   String hotelAddress) {
		
		super(pnr, source, destination, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, isCancelled);
		this.hotelAddress = hotelAddress;
	}
	
	public void addTouristLocation(String location) {
		int i = 0;
		while (touristLocations[i] != null) {
			i++;
			if (i==5) {
				System.out.println("Location cannot be added");
				break;
			}
		}
		if (i != 5) {
			this.touristLocations[i] = location;
		}
	}
	
	public void removeTouristLocation(String location) {
		
		for (int i=0; i<5; i++) {
			if (this.touristLocations[i] == location) {
				this.touristLocations[i] = null;
				break;
			}
		}
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String[] getTouristLocations() {
		return touristLocations;
	}

	public void setTouristLocations(String[] touristLocations) {
		this.touristLocations = touristLocations;
	}
	
}
