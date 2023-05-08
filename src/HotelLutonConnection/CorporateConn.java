package HotelLutonConnection;
import java.sql.*;

import HotelLutonModel.coprorateModel;
public class CorporateConn {

	public boolean save(coprorateModel registerDoneCorp) {
		boolean result= false;
		
		String url = "jdbc:mysql://localhost/onlinehotelbookingsystem";

		try {

			Connection conect = DriverManager.getConnection(url, "root", "");
			String sqlcorpo="SELECT userid from userhotel";
			String sqlQuer="insert into corporatecustomers(CorporateID,CompanyName,EstablishmentDate,Address,Budget,PaymentTerms,companySize,emailID,password,userid)values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstatement=conect.prepareStatement(sqlQuer);
			PreparedStatement selectKai= conect.prepareStatement(sqlcorpo);
			ResultSet rs=selectKai.executeQuery();
			while(rs.next()) {
				pstatement.setInt(10,rs.getInt("userid"));
			}
			pstatement.setInt(1,registerDoneCorp.getCorporateId());
			pstatement.setString(2,registerDoneCorp.getCompanyname());
			pstatement.setString(3,registerDoneCorp.getDate());
			pstatement.setString(4,registerDoneCorp.getAddress());
			pstatement.setInt(5,registerDoneCorp.getBudget());
			pstatement.setInt(6,registerDoneCorp.getPayterms());
			pstatement.setInt(7,registerDoneCorp.getCompanySize());
			pstatement.setString(8,registerDoneCorp.getEmailid());
			pstatement.setString(9,registerDoneCorp.getPassword());
			pstatement.executeUpdate();
			pstatement.close();
			conect.close();
			result=true;
		
	}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		
	}
		return result;
	}

}
