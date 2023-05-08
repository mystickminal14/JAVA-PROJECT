package LuttonHotelView;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerviewCheckIn extends JInternalFrame {

	DefaultTableModel kai11;
	JTable kyrie;
	JFrame viewCustCheckin;

	CustomerviewCheckIn() {

		viewCustCheckin = new JFrame();

		viewCustCheckin.getContentPane().setBackground(Color.lightGray);

		JLabel check1 = new JLabel("CHECKED OUT GUESTS");

		check1.setFont(new Font("times new roman", Font.BOLD, 45));

		check1.setBackground(Color.black);

		check1.setBounds(100, 25, 600, 45);

		viewCustCheckin.add(check1);

		String[] kaikai = { "BookingID", "Name", "check in date", "check out date", "Room No", "Room type",
				"Booking status" };

		kai11 = new DefaultTableModel();

		kai11.setColumnIdentifiers(kaikai);

		kyrie = new JTable(kai11);

		JScrollPane vobn2 = new JScrollPane(kyrie);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlll = "SELECT CONCAT(customers.FirstName, ' ', customers.LastName) AS FullName, customers.EmailAddress, bookingtable.booking_id, bookingtable.check_inDate, "
					+ "bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus ,room.RoomId FROM customers JOIN bookingtable "
					+ "ON customers.userid = bookingtable.userid  " + "JOIN room "
					+ "ON bookingtable.booking_id = room.booking_id where bookingtable.bookingStatus='check out'";
			PreparedStatement pstat = conn.prepareStatement(sqlll);

			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int bidid = rs.getInt("booking_id");
				String fname = rs.getString("FullName");
				// String emailIdAdress = rs.getString("EmailAddress");
				String chIn = rs.getString("check_inDate");
				String chout = rs.getString("checkOutDate");
				String roomtype = rs.getString("room_type");
				String room = rs.getString("RoomId");

				int pricec = rs.getInt("roomTotalCost");
				String stass = rs.getString("bookingStatus");
				kai11.addRow(new Object[] { bidid, fname, chIn, chout, room, roomtype, stass });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		kyrie.setFont(new Font("times new roman", Font.PLAIN, 14));

		kyrie.setCellSelectionEnabled(true);

		kyrie.setSelectionBackground(Color.white);

		kyrie.setSelectionForeground(Color.black);

		// -----------------------------------------------------------------------------------------------------------

		kyrie.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		kyrie.setFillsViewportHeight(true);

		vobn2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		vobn2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		vobn2.setBounds(30, 100, 640, 450);

		viewCustCheckin.add(vobn2);

		viewCustCheckin.setLayout(null);

		viewCustCheckin.setVisible(true);

		viewCustCheckin.setSize(700, 600);

		viewCustCheckin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		viewCustCheckin.setLocationRelativeTo(null);

		viewCustCheckin.setVisible(true);

	}

	public static void main(String[] args) {

		new CustomerviewCheckIn();

	}

}
