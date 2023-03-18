package bean;

public class PolicyDetails {
	
	private int policyid;
	private String policyname;
	private String policytype;
	private int nom_number;
	private int tenure;
	private Double sum;
	private String prerequisites;
	
	
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	
	public int getNom_number() {
		return nom_number;
	}
	public void setNom_number(int nom_number) {
		this.nom_number = nom_number;
	}
	
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	
	
}
