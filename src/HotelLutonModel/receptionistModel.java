package HotelLutonModel;

public class receptionistModel {
private String receptionistEmail;
private String receptionistPassword;
public receptionistModel() {
	super();
	this.receptionistEmail = "";
	this.receptionistPassword = "";
}
public receptionistModel(String receptionistEmail, String receptionistPassword) {
	super();
	this.receptionistEmail = receptionistEmail;
	this.receptionistPassword = receptionistPassword;
}
public String getReceptionistEmail() {
	return receptionistEmail;
}
public void setReceptionistEmail(String receptionistEmail) {
	this.receptionistEmail = receptionistEmail;
}
public String getReceptionistPassword() {
	return receptionistPassword;
}
public void setReceptionistPassword(String receptionistPassword) {
	this.receptionistPassword = receptionistPassword;
}
@Override
public String toString() {
	return "receptionistModel [receptionistEmail=" + receptionistEmail + ", receptionistPassword="
			+ receptionistPassword + "]";
}


}
