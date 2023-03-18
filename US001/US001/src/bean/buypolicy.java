package bean;

public class buypolicy 

{
	String insurance;
	String policy;
	String Tenure;
	String Nominee;
	String nomineerel;
	String q1;
	String q2;
	String q3;
	//String agentid;
	
	public String getNomineerel() {
		return nomineerel;
	}
	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String getQ3() {
		return q3;
	}
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	public void setNomineerel(String nomineerel) {
		this.nomineerel = nomineerel;
	}
	String Premiumtype;
	String SumAssured;
	String PremiumAmount;
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getTenure() {
		return Tenure;
	}
	public void setTenure(String tenure) {
		Tenure = tenure;
	}
	public String getNominee() {
		return Nominee;
	}
	public void setNominee(String nominee) {
		Nominee = nominee;
	}
	public String getPremiumtype() {
		return Premiumtype;
	}
	public void setPremiumtype(String premiumtype) {
		Premiumtype = premiumtype;
	}
	public String getSumAssured() {
		return SumAssured;
	}
	public void setSumAssured(String sumAssured) {
		SumAssured = sumAssured;
	}
	public String getPremiumAmount() {
		return PremiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		PremiumAmount = premiumAmount;
	}
	
}
