package HotelLutonConnection;

import java.sql.*;

import HotelLutonModel.userregister;

public class customerLogin {

	public userregister save(userregister logIncust) {

		String url = "jdbc:mysql://localhost:/onlinehotelbookingsystem";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			String sql = "SELECT * FROM userhotel where userEmailAddress=? and userPasscode=?";
			PreparedStatement pstat = conn.prepareStatement(sql);

			pstat.setString(1, logIncust.getEmailAddressUser());
			pstat.setString(2, logIncust.getUserPass());
			ResultSet rs = pstat.executeQuery();
			if (rs.next()) {
			logIncust.setGuestId(rs.getInt("userid"));

			}
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return logIncust;

	}

}