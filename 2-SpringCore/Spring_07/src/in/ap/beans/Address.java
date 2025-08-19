package in.ap.beans;

public class Address {
	
	private int houseNo;
	private String city;
	private int pincode;
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		
		return "House No. :" + houseNo + ", City :" + city + ", Pincode :" + pincode;
	}
	
	
}
