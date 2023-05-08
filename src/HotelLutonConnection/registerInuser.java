package HotelLutonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import HotelLutonModel.userregister;

public class registerInuser {

	public boolean save(userregister userreg) {
		boolean result = false;

		String url = "jdbc:mysql://localhost/onlinehotelbookingsystem";

		try {

			Connection con = DriverManager.getConnection(url, "root", "");
			String sqlv = "INSERT INTO userhotel(userEmailAddress,userPasscode) values (?,?);";
			PreparedStatement pstmt = con.prepareStatement(sqlv);

			pstmt.setString(1, userreg.getEmailAddressUser());
			pstmt.setString(2, userreg.getUserPass());
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			result = true;

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());

		}
		return result;

	}
}
