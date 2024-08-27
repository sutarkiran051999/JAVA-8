package StreamPractice;

public class Address {

	private String city;
	private String District;
	private int pinCode;
	private String State;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String city, String district, int pinCode, String state) {
		super();
		this.city = city;
		District = district;
		this.pinCode = pinCode;
		State = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return District;
	}


	public void setDistrict(String district) {
		District = district;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", District=" + District + ", pinCode=" + pinCode + ", State=" + State + "]";
	}
	
	
	
	
}
