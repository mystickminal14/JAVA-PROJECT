package HotelLutonModel;

public class userregister {
	private int guestId;
private String emailAddressUser;
private String userPass;

public userregister() {
	
	this.guestId=0;
	this.emailAddressUser = "";
	this.userPass = "";

}

public userregister(int guestId, String emailAddressUser, String userPass) {
	
	this.guestId = guestId;
	this.emailAddressUser = emailAddressUser;
	this.userPass = userPass;
}

public int getGuestId() {
	return guestId;
}

public void setGuestId(int guestId) {
	this.guestId = guestId;
}

public String getEmailAddressUser() {
	return emailAddressUser;
}
public void setEmailAddressUser(String emailAddressUser) {
	this.emailAddressUser = emailAddressUser;
}
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}

@Override
public String toString() {
	return "userregister [guestId=" + guestId + ", emailAddressUser=" + emailAddressUser + ", userPass=" + userPass
			+ "]";
}



}
