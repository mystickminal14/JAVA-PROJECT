package HotelLutonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import HotelLutonModel.ForeignkeyTester;
import HotelLutonModel.bookingModel;

public class bookingcon {
	public boolean save(bookingModel booknow) {
		boolean result= false;
		
		String url = "jdbc:mysql://localhost/onlinehotelbookingsystem";

		try {

			Connection con = DriverManager.getConnection(url, "root", "");
			String sqlvsw="insert into bookingtable(booking_id,room_type,check_inDate,checkOutDate,roomTotalCost,userid) values(?,?,?,?,?,?);";
			PreparedStatement pstmt=con.prepareStatement(sqlvsw);
			
			pstmt.setInt(1,booknow.getBookingId());
			pstmt.setString(2,booknow.getRoomType());
			pstmt.setString(3,booknow.getCheckIn());
			pstmt.setString(4,booknow.getCheckOut());
			pstmt.setInt(5,booknow.getRoompp());
			pstmt.setInt(6,ForeignkeyTester.userid);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			result=true;
		
	}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		
	}
		return result;
	}
	

}
