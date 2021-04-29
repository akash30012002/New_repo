
public class Passenger {
	
	private Contact contact;
	private Address address;
	
	private static int idCounter;
	private int id;
	
	static {
		idCounter = 0;
	}
	
	
	Passenger(String name, String phoneNumber, String email, String street, String city, String state){
		this.id = ++idCounter;
		this.contact = new Contact(name, phoneNumber, email);
		this.address = new Address(street, city, state);
	}
	
	public String getAddress() {
		return address.sendAddress();
	}
	
	public String getContact() {
		return contact.sendContact();
	}
	
	public void setAddress(String street, String city, String state) {
		address.updateAddress(street, city, state);
	}
	
	public void setContact(String name, String phoneNumber, String email) {
		contact.updateContact(name, phoneNumber, email);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getPassengerCount() {
		return idCounter;
	}
	
	private static class Address {

		private String street;
		private String city;
		private String state;
		
		Address(String street, String city, String state){
			this.street = street;
			this.city = city;
			this.state = state;
		}
		
		public String sendAddress() {
			return "Street: " + this.street + ", City: " + this.city + ", State: " + this.state;
		}
		
		public void updateAddress(String street, String city, String state) {
			this.street = street;
			this.city = city;
			this.state = state;
		}

		
	}
	

	private static class Contact {
	
		private String name;
		private String phoneNumber;
		private String email;
		
		Contact(String name, String phoneNumber, String email){
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
		
		public String sendContact() {
			return "Name: " + this.name + ", Phone: " + this.phoneNumber + ", Email: " + this.email;
		}
		
		public void updateContact(String name, String phoneNumber, String email) {
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
	
	
}

	
}
