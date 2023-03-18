package bean;

public class Manager {

	private String FullName;
	private String Dob;
	private String Area;
	private String City;
	private String StateZone;
	private String Designation;
	
	public Manager(String fullName, String dob, String area, String city,
			String stateZone, String designation) {
		super();
		FullName = fullName;
		Dob = dob;
		Area = area;
		City = city;
		StateZone = stateZone;
		Designation = designation;
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStateZone() {
		return StateZone;
	}

	public void setStateZone(String stateZone) {
		StateZone = stateZone;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
}
