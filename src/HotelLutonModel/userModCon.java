package HotelLutonModel;
import HotelLutonConnection.customerLogin;
public class userModCon {
private userregister user;
public userModCon() {
	this.user= new userregister();
	
	
}
public userModCon(userregister user) {
	this.user=user;
	
}
public userregister getUser() {
	return user;
	
}
public void setUser(userregister user) {
	this.user=user;
}
public void min(){
	this.user=new customerLogin().save(this.user);
}
}
