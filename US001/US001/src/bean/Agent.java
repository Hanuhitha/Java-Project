package bean;

public class Agent {
	public Agent(String firstName, String lastName, String middleName,
			String dOBMonth, String dOBDay, String dOBYear, String address,
			String email, long phoneNumber, int yearsOfExperience, String zone,
			String referenceBy, String panCard) {
		super();
		FirstName = firstName;
		LastName = lastName;
		MiddleName = middleName;
		DOBMonth = dOBMonth;
		DOBDay = dOBDay;
		DOBYear = dOBYear;
		Address = address;
		Email = email;
		PhoneNumber = phoneNumber;
		YearsOfExperience = yearsOfExperience;
		Zone = zone;
		ReferenceBy = referenceBy;
		PanCard = panCard;
	}
	
	public Agent() {
		// TODO Auto-generated constructor stub
	}

	private String FirstName;
	private String LastName;
	private String MiddleName;
	private String DOBMonth;
	private String DOBDay;
	private String DOBYear;
	private String Address;
	private String Email;
	private long PhoneNumber;
	private int YearsOfExperience ;
	private String Zone ;
	private String ReferenceBy;
	private String PanCard;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getDOBMonth() {
		return DOBMonth;
	}
	public void setDOBMonth(String dOBMonth) {
		DOBMonth = dOBMonth;
	}
	public String getDOBDay() {
		return DOBDay;
	}
	public void setDOBDay(String dOBDay) {
		DOBDay = dOBDay;
	}
	public String getDOBYear() {
		return DOBYear;
	}
	public void setDOBYear(String dOBYear) {
		DOBYear = dOBYear;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getYearsOfExperience() {
		return YearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}
	public String getZone() {
		return Zone;
	}
	public void setZone(String zone) {
		Zone = zone;
	}
	public String getReferenceBy() {
		return ReferenceBy;
	}
	public void setReferenceBy(String referenceBy) {
		ReferenceBy = referenceBy;
	}
	public String getPanCard() {
		return PanCard;
	}
	public void setPanCard(String panCard) {
		PanCard = panCard;
	}
	
	
}
