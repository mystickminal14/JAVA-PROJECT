package HotelLutonModel;

public class coprorateModel {
	private int corporateId;
	private String companyname;
	private String date;
	private String address;
	private int budget;
	private int payterms;
    private int companySize;
    private String emailid;
    private String password;
	public coprorateModel() {
		super();
		this.corporateId = 0;
		this.companyname = "";
		this.date = "";
		this.address = "";
		this.budget = 0;
		this.payterms = 0;
		this.companySize = 0;
		this.emailid = "";
		this.password = "";
	}
	public coprorateModel(int corporateId, String companyname, String date, String address, int budget, int payterms,
			int companySize, String emailid, String password) {
		super();
		this.corporateId = corporateId;
		this.companyname = companyname;
		this.date = date;
		this.address = address;
		this.budget = budget;
		this.payterms = payterms;
		this.companySize = companySize;
		this.emailid = emailid;
		this.password = password;
	}
	public int getCorporateId() {
		return corporateId;
	}
	public void setCorporateId(int corporateId) {
		this.corporateId = corporateId;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getPayterms() {
		return payterms;
	}
	public void setPayterms(int payterms) {
		this.payterms = payterms;
	}
	public int getCompanySize() {
		return companySize;
	}
	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "coprorateModel [corporateId=" + corporateId + ", companyname=" + companyname + ", date=" + date
				+ ", address=" + address + ", budget=" + budget + ", payterms=" + payterms + ", companySize="
				+ companySize + ", emailid=" + emailid + ", password=" + password + "]";
	}
    
    
}