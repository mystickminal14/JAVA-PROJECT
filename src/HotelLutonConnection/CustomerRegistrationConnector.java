package HotelLutonConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import HotelLutonModel.registernon;

public class CustomerRegistrationConnector{
	
	public boolean save(registernon mul) {
		boolean result= false;
		
		String url = "jdbc:mysql://localhost/onlinehotelbookingsystem";

		try {

			Connection con = DriverManager.getConnection(url, "root", "");
			String sqlcust="SELECT userid from userhotel";
			String sqlv="insert into customers(FirstName,LastName,Age,Gender,Address,Country,EmailAddress,Password,CreditCardInfo,Customer_Type,userid) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sqlv);
			PreparedStatement selectKai= con.prepareStatement(sqlcust);
			ResultSet rs=selectKai.executeQuery();
			while(rs.next()) {
				pstmt.setInt(11,rs.getInt("userid"));
			}
			pstmt.setString(1,mul.getFirstName());
			pstmt.setString(2,mul.getLastnam());
			pstmt.setInt(3,mul.getAge());
			pstmt.setString(4,mul.getGender());
			pstmt.setString(5,mul.getAdd());
			pstmt.setString(6,mul.getCount());
			
			pstmt.setString(7,mul.getEmId());
			pstmt.setString(8,mul.getPass());
			
			pstmt.setInt(9,mul.getCreditInfo());
			pstmt.setString(10,mul.getType());
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			result=true;
		
	}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		
	}
		return result;

}}