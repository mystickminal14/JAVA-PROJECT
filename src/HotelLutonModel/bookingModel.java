package HotelLutonModel;

public class bookingModel {

private int bookingId;
private String roomType;
private String checkIn;
private String checkOut;

private int roompp;
public bookingModel() {
	super();
	this.bookingId = 0;
	this.roomType = "";
	this.checkIn = "";
	this.checkOut = "";
	
	this.roompp = 0;
}
public bookingModel(int bookingId, String roomType, String checkIn, String checkOut, int roompp) {
	super();
	this.bookingId = bookingId;
	this.roomType = roomType;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
	this.roompp = roompp;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public String getCheckIn() {
	return checkIn;
}
public void setCheckIn(String checkIn) {
	this.checkIn = checkIn;
}
public String getCheckOut() {
	return checkOut;
}
public void setCheckOut(String checkOut) {
	this.checkOut = checkOut;
}
public int getRoompp() {
	return roompp;
}
public void setRoompp(int roompp) {
	this.roompp = roompp;
}
@Override
public String toString() {
	return "bookingModel [bookingId=" + bookingId + ", roomType=" + roomType + ", checkIn=" + checkIn + ", checkOut="
			+ checkOut + ", roompp=" + roompp + "]";
}

}