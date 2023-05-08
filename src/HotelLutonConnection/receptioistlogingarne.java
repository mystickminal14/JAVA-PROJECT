package HotelLutonConnection;


	import java.sql.*;

	import HotelLutonModel.receptionistModel;
	public class receptioistlogingarne {

		public boolean save(receptionistModel receplog) {
		
				boolean result= false;
				String url = "jdbc:mysql://localhost:/onlinehotelbookingsystem";
				try {
				Connection conn = DriverManager.getConnection(url, "root", "");
				String sql = "Select * from receptionist where Email=? AND password=?;";
				PreparedStatement pstat = conn.prepareStatement(sql);

				pstat.setString(1, receplog.getReceptionistEmail());
				pstat.setString(2, receplog.getReceptionistPassword());
				ResultSet rs=pstat.executeQuery();//Save
				if (rs.next()) {
				   rs.close();
				pstat.close();
				conn.close();
				result=true;
				}
				pstat.close();
				conn.close();
				}
				catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
				}
				return result;

				}

				}
		



