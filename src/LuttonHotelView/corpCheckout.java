package LuttonHotelView;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class corpCheckout {
	JFrame goCheck;
	DefaultTableModel mol;
	JTable mirale;
corpCheckout(){
	goCheck= new JFrame();
	
	
	goCheck.getContentPane().setBackground(Color.lightGray);

	JLabel check2 = new JLabel("CHECKED OUT GUESTS");

	check2.setFont(new Font("times new roman", Font.BOLD, 45));

	check2.setBackground(Color.black);

	check2.setBounds(100, 25, 600, 45);

	goCheck.add(check2);

	String[] kaikai2 = { "BookingID", "Name", "check in date", "check out date", "Room No", "Room type",
			"Booking status" };

	 mol = new DefaultTableModel();

	mol.setColumnIdentifiers(kaikai2);

	mirale = new JTable(mol);

	JScrollPane vll2 = new JScrollPane(mirale);

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
				"");
		String sll = "SELECT corporatecustomers.CompanyName, corporatecustomers.EmailID, bookingtable.booking_id, bookingtable.check_inDate, bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus ,room.RoomId FROM corporatecustomers JOIN bookingtable ON corporatecustomers.userid = bookingtable.userid  JOIN room ON bookingtable.booking_id = room.booking_id where bookingtable.bookingStatus='check out'";
		PreparedStatement pstat = conn.prepareStatement(sll);

		ResultSet rs = pstat.executeQuery();
		while (rs.next()) {

			int bidid = rs.getInt("booking_id");
			String fname = rs.getString("CompanyName");
			String emailIdAdress = rs.getString("EmailID");
			String chIn = rs.getString("check_inDate");
			String chout = rs.getString("checkOutDate");
			String roomtype = rs.getString("room_type");
			String room = rs.getString("RoomId");
			int pricec = rs.getInt("roomTotalCost");
			String stass = rs.getString("bookingStatus");
			mol.addRow(new Object[] { bidid, fname,emailIdAdress, chIn, chout, room, roomtype, stass });
		}
		rs.close();
		pstat.close();
		conn.close();
	} catch (Exception ex) {
		System.out.println("Error : " + ex.getMessage());
	}

	mirale.setFont(new Font("times new roman", Font.PLAIN, 14));

	mirale.setCellSelectionEnabled(true);

	mirale.setSelectionBackground(Color.white);

	mirale.setSelectionForeground(Color.black);

	// -----------------------------------------------------------------------------------------------------------
	mirale.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

	mirale.setFillsViewportHeight(true);

	vll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	vll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	vll2.setBounds(30, 100, 640, 450);

	goCheck.add(vll2);

	goCheck.setSize(700,600);
	goCheck.setLocationRelativeTo(null);
	goCheck.setResizable(false);
	goCheck.setLayout(null);
	goCheck.setVisible(true);
}
public static void main(String [] args) {
	new corpCheckout();
	
}
}
