package LuttonHotelView;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ManagerDashboard implements ActionListener, Runnable {
	DefaultTableModel tableModel, tableModel2, tableModel4, tableModel55;
	private JFrame managerDashboard;
	private JPanel leftManagePanel;
	JTable nonD;
	JTextField categories, hide;
	JComboBox cAt;
	JTable bookingTable8;
	JPanel fifthCardPanel;
	private JPanel rightmanagePanel;
	private JPanel managerTitlePanel;
	private JPanel dashManagement;
	private JTable bookingTable3;
	private JTable bookingTable4;
	JPanel firstCardpanel;
	JPanel thirdCardPanel;
	JPanel secondcardPanel;
	JButton checkedInBTN;
	JTable corpDD;
	JButton viewbtnch;
	JButton logoutBtn;
	JButton barServices;
	JButton restaurantServices;
	JButton checkInButton;
	JButton checkOutButton;
	JButton coproateCheckIn, cOrpo, viewCorpo;
	JButton corporateCheckout;
	JTextField chekfield3, hidden;
	JButton checkBill2, generateBill2, checkoutguest2;
	JButton viewAvailableRoom;
	JTable bookingTaable44;
	// ---------------CHECKOUT BUUTON--------------
	JButton checkBill;
	JButton checkoutguest;
	JButton generateBill;
	JButton viewCheckOut;
	JDesktopPane roomPane;
	JTextField flbook;
	JButton digitalClock4;
	JButton viewCustomers;
	JButton corpoCust;
	DefaultTableModel corpopm;
	JPanel fourthCardPanel;
	Thread thread = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	private CardLayout cardLayout;
	JComboBox checkedIn;
	JComboBox checkedOut;
	JButton roomno;
	JComboBox roomtypek;
	JTextField vsioff;
	JPanel sixCardPanel;

	public static String type;

	ManagerDashboard() {
		managerDashboard = new JFrame();
		thread = new Thread(this);
		thread.start();
		Border clockBorder = BorderFactory.createLineBorder(Color.white, 3);
		digitalClock4 = new JButton();
		digitalClock4.setFont(new Font("times new roman", Font.BOLD, 18));
		digitalClock4.setFocusPainted(false);
		digitalClock4.setBorder(clockBorder);
		digitalClock4.setBackground(Color.darkGray);
		digitalClock4.setForeground(Color.white);
		digitalClock4.setBounds(100, 30, 120, 50);
		digitalClock4.setFont(new Font("times new roman", Font.BOLD, 25));
		managerDashboard.add(digitalClock4);
		// -------------------------desktop
		// pane-------------------------------------------------

		managerDashboard.getContentPane().setBackground(Color.gray);
		// -----------------------------------------------------------------------
		JPanel darkpanelTitle = new JPanel();
		darkpanelTitle.setBackground(Color.DARK_GRAY);
		darkpanelTitle.setBounds(0, 0, 1040, 90);

		managerDashboard.add(darkpanelTitle);
		JLabel titleManaager = new JLabel("RECEPTIONIST");
		titleManaager.setBounds(315, 17, 700, 60);
		titleManaager.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 80));
		titleManaager.setForeground(Color.white);
		managerDashboard.add(titleManaager);
		// ------------------------------------------------------------------------

		leftManagePanel = new JPanel();
		Border kaloborder = BorderFactory.createLineBorder(Color.gray, 4);

		// ------------------VIEW AVAILABLE ROOMS--------------------------------------
		viewCustomers = new JButton("Non-Corporate");
		viewCustomers.setBounds(10, 80, 220, 50);
		viewCustomers.setFont(new Font("times new roman", Font.BOLD, 25));
		viewCustomers.setBorder(kaloborder);
		viewCustomers.setBackground(Color.lightGray);
		viewCustomers.setFocusPainted(false);
		viewCustomers.addActionListener(this);
		viewCustomers.setForeground(Color.black);
		leftManagePanel.add(viewCustomers);

		roomPane = new JDesktopPane();
		managerDashboard.add(roomPane);
//--------------------------------------
		corpoCust = new JButton("Coporate");
		corpoCust.setBounds(10, 140, 220, 50);
		corpoCust.setFont(new Font("times new roman", Font.BOLD, 25));
		corpoCust.setBorder(kaloborder);
		corpoCust.setBackground(Color.lightGray);
		corpoCust.setFocusPainted(false);
		corpoCust.addActionListener(this);
		corpoCust.setForeground(Color.black);
		leftManagePanel.add(corpoCust);
		// ----------------------------------------------------------------------------------------
		viewAvailableRoom = new JButton("View Rooms");
		viewAvailableRoom.setBounds(10, 20, 220, 50);
		viewAvailableRoom.setFont(new Font("times new roman", Font.BOLD, 25));
		viewAvailableRoom.setBorder(kaloborder);
		viewAvailableRoom.setBackground(Color.lightGray);
		viewAvailableRoom.setFocusPainted(false);
		viewAvailableRoom.addActionListener(this);
		viewAvailableRoom.setForeground(Color.black);
		leftManagePanel.add(viewAvailableRoom);
		// --------------checkinbutton------------
		checkInButton = new JButton("CHECK IN NORMAL");

		checkInButton.setBackground(Color.lightGray);
		checkInButton.setFont(new Font("times new roman", Font.BOLD, 20));
		checkInButton.setBounds(10, 200, 220, 50);
		checkInButton.addActionListener(this);
		checkInButton.setLayout(null);
		checkInButton.setForeground(Color.black);
		checkInButton.setBorder(kaloborder);
		checkInButton.setFocusPainted(false);
		leftManagePanel.add(checkInButton);

		// -------------checkoutButton--------------
		checkOutButton = new JButton("CHECK OUT NORMAL");
		checkOutButton.setBounds(10, 260, 220, 50);
		checkOutButton.setBackground(Color.lightGray);
		checkOutButton.setFont(new Font("times new roman", Font.BOLD, 20));
		checkOutButton.addActionListener(this);
		checkOutButton.setForeground(Color.black);
		checkOutButton.setBorder(kaloborder);
		leftManagePanel.add(checkOutButton);

		coproateCheckIn = new JButton("CORP-CHECK IN");
		coproateCheckIn.setBounds(10, 320, 220, 50);
		coproateCheckIn.setBackground(Color.lightGray);
		coproateCheckIn.setFont(new Font("times new roman", Font.BOLD, 20));
		coproateCheckIn.addActionListener(this);
		coproateCheckIn.setForeground(Color.black);
		coproateCheckIn.setBorder(kaloborder);
		leftManagePanel.add(coproateCheckIn);

		corporateCheckout = new JButton("CORP-CHECK OUT");
		corporateCheckout.setBounds(10, 380, 220, 130);
		corporateCheckout.setBackground(Color.lightGray);
		corporateCheckout.setFont(new Font("times new roman", Font.BOLD, 20));
		corporateCheckout.addActionListener(this);
		corporateCheckout.setForeground(Color.black);
		corporateCheckout.setBorder(kaloborder);
		leftManagePanel.add(corporateCheckout);

		leftManagePanel.setLayout(null);
		leftManagePanel.setBackground(Color.decode("#474141"));
		leftManagePanel.setBounds(10, 100, 240, 526);
		darkpanelTitle.setLayout(null);
		managerDashboard.add(leftManagePanel);
		managerDashboard.add(darkpanelTitle);

//------------------------------------------------------------------------
		cardLayout = new CardLayout();

		dashManagement = new JPanel();
		dashManagement.setLayout(cardLayout);

		// ---
		firstCardpanel = new JPanel();
		firstCardpanel.setBackground(Color.darkGray);
		// ---------------------------------------------------
		JPanel sectoon1 = new JPanel();
		sectoon1.setBounds(0, 0, 781, 120);
		sectoon1.setBackground(Color.darkGray);

		// --------------------------------------------------
		/*
		 * JLabel checkedin = new JLabel("Checked-IN   :");
		 * checkedin.setForeground(Color.white); checkedin.setFont(new
		 * Font("TIMES NEW ROMAN", Font.BOLD, 18)); checkedin.setBounds(30, 10, 150,
		 * 50); sectoon1.add(checkedin);
		 * 
		 * checkedIn = new JComboBox(); checkedIn.setBounds(170, 15, 210, 35);
		 * checkedIn.setBackground(Color.WHITE); checkedIn.setForeground(Color.black);
		 * checkedIn.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
		 * sectoon1.add(checkedIn);
		 * 
		 * // ---------------------------------- JLabel checkedout = new
		 * JLabel("Check-out      :"); checkedout.setForeground(Color.white);
		 * checkedout.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		 * checkedout.setBounds(30, 54, 150, 50); sectoon1.add(checkedout);
		 * 
		 * checkedOut = new JComboBox(); checkedOut.setBounds(170, 64, 210, 35);
		 * checkedOut.setBackground(Color.WHITE); checkedOut.setForeground(Color.black);
		 * checkedOut.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
		 * sectoon1.add(checkedOut);
		 */
		// ---------------------------------------------
		JLabel roomNo = new JLabel("Room Number  :");
		roomNo.setForeground(Color.white);
		roomNo.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		roomNo.setBounds(30, 20, 150, 50);
		sectoon1.add(roomNo);

		roomtypek = new JComboBox();
		roomtypek.setBounds(170, 25, 200, 35);
		roomtypek.setBackground(Color.lightGray);
		roomtypek.setForeground(Color.black);
		roomtypek.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
		/*
		 * ArrayList roomm = new arrylist().getRoom(); for (int i = 0; i < roomm.size();
		 * i++) { roomtypek.addItem(roomm.get(i)); }
		 */
		sectoon1.add(roomtypek);

		// ----------------------------------
		JLabel roomType = new JLabel("Room Type  :");
		roomType.setForeground(Color.white);
		roomType.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		roomType.setBounds(420, 20, 150, 50);
		sectoon1.add(roomType);

		chekfield3 = new JTextField();
		chekfield3.setBounds(560, 25, 200, 35);
		chekfield3.setBackground(Color.lightGray);
		chekfield3.setForeground(Color.black);
		chekfield3.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		sectoon1.add(chekfield3);
		sectoon1.setLayout(null);
		firstCardpanel.add(sectoon1);

		vsioff = new JTextField();
		vsioff.setVisible(false);
		vsioff.setBounds(200, 200, 200, 200);
		sectoon1.add(vsioff);

		checkedInBTN = new JButton("CHECK IN ");
		checkedInBTN.setBounds(340, 80, 150, 30);
		checkedInBTN.setBorder(clockBorder);
		checkedInBTN.setBackground(Color.gray);
		checkedInBTN.setForeground(Color.black);
		checkedInBTN.setFocusPainted(false);

		checkedInBTN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == checkedInBTN) {
					int boid = Integer.parseInt(vsioff.getText());
					int roomid = Integer.parseInt((String) roomtypek.getSelectedItem());

					String sqkl = "update room set statusofRoom=? , booking_id = ? where RoomId=?";
					String upl = "update bookingtable set bookingStatus=? where booking_id=?;";

					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
								"root", "");
						PreparedStatement pstat = conn.prepareStatement(sqkl);

						PreparedStatement pstat2 = conn.prepareStatement(upl);

						pstat.setString(1, "active");
						pstat.setInt(2, boid);
						pstat.setInt(3, roomid);
						pstat2.setString(1, "booked");
						pstat2.setInt(2, boid);

						pstat2.executeUpdate();
						pstat.executeUpdate();

						pstat2.close();
						pstat.close();
						conn.close();
						UIManager.put("OptionPane.messageForeground", Color.white);
						UIManager.put("OptionPane.background", Color.gray);
						UIManager.put("Panel.background", Color.darkGray);

						UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

						JOptionPane.showMessageDialog(null, "Sucessfully checked in", "room",
								JOptionPane.PLAIN_MESSAGE);
						tableModel.removeRow(bookingTable3.getSelectedRow());
					} catch (Exception ex) {
						System.out.println("Error " + ex.getMessage());
					}

				}
			}

		});
		checkedInBTN.setFont(new Font("times new roman", Font.BOLD, 18));
		sectoon1.add(checkedInBTN);
		JButton viewbtnch;

		viewbtnch = new JButton("VIEW");
		viewbtnch.setBounds(220, 80, 80, 30);
		viewbtnch.setBorder(clockBorder);
		viewbtnch.setBackground(Color.gray);
		viewbtnch.setForeground(Color.black);
		viewbtnch.setFocusPainted(false);
		viewbtnch.setFont(new Font("times new roman", Font.BOLD, 18));
		sectoon1.add(viewbtnch);

		Border tableBorder = BorderFactory.createLineBorder(Color.black, 3);
		// ---------------------------------------------------------------------------------------------------------
		Border tableBorder2 = BorderFactory.createLineBorder(Color.black, 3);
		String[] customerViewColumn = { "BookingID", "FullName", "Email", "CheckInDate", "CheckOutDate", "Room Type",
				"Price", "bookingStatus" };
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(customerViewColumn);
		bookingTable3 = new JTable(tableModel);
		bookingTable3.setBorder(tableBorder);
		JScrollPane scroll1 = new JScrollPane(bookingTable3);
		bookingTable3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {

				int index = bookingTable3.getSelectedRow();

				chekfield3.setText(bookingTable3.getValueAt(index, 5).toString());
				vsioff.setText(bookingTable3.getValueAt(index, 0).toString());
				String sql = "SELECT * FROM room where roomType=? and statusofRoom=?";

				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
							"root", "");
					PreparedStatement pstat = conn.prepareStatement(sql);
					pstat.setString(1, chekfield3.getText());
					pstat.setString(2, "available");
					ResultSet rs = pstat.executeQuery();

					while (rs.next()) {
						String rom = rs.getString("RoomId");
						roomtypek.addItem(rom);
					}
					rs.close();
					pstat.close();
					conn.close();
				} catch (Exception ex) {
					System.out.println("Error " + ex.getMessage());
				}

			}
		});

		// -----------------------------------------------------------------------------------------------------------
		bookingTable3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		bookingTable3.setFillsViewportHeight(true);
		scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll1.setBounds(25, 125, 730, 385);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlll = "SELECT CONCAT(customers.FirstName, ' ', customers.LastName) AS FullName, customers.EmailAddress, bookingtable.booking_id, bookingtable.check_inDate, "
					+ "bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus FROM customers JOIN bookingtable ON customers.userid = bookingtable.userid  where bookingtable.bookingStatus='pending'";
			PreparedStatement pstat = conn.prepareStatement(sqlll);
			// pstat.setInt(1, ForeignkeyTester.userid);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int bidid = rs.getInt("booking_id");
				String fname = rs.getString("FullName");
				String emailIdAdress = rs.getString("EmailAddress");
				String chIn = rs.getString("check_inDate");
				String chout = rs.getString("checkOutDate");
				String roomtype = rs.getString("room_type");

				int pricec = rs.getInt("roomTotalCost");
				String stass = rs.getString("bookingStatus");
				tableModel.addRow(new Object[] { bidid, fname, emailIdAdress, chIn, chout, roomtype, pricec, stass });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		scroll1.setBorder(tableBorder2);
		firstCardpanel.setLayout(null);
		firstCardpanel.add(scroll1);

		secondcardPanel = new JPanel();
		Border ano2 = BorderFactory.createLineBorder(Color.white, 4);
		secondcardPanel.setBorder(ano2);
		secondcardPanel.setBackground(Color.darkGray);
		JPanel checkoutUpperPanel = new JPanel();
		checkoutUpperPanel.setBorder(ano2);
		checkoutUpperPanel.setBackground(Color.darkGray);
		// -------JLabel------------------------------------
		Border ano = BorderFactory.createLineBorder(Color.white, 4);
		checkBill = new JButton("CHECK BILL");
		checkBill.setBounds(15, 25, 200, 35);
		checkBill.setBorder(ano);
		checkBill.setBackground(Color.gray);
		checkBill.setForeground(Color.black);
		checkBill.setFocusPainted(false);
		checkBill.setFont(new Font("times new roman", Font.BOLD, 18));
		checkoutUpperPanel.add(checkBill);

		generateBill = new JButton("GENERATE");
		generateBill.setBounds(400, 25, 150, 35);
		generateBill.setBorder(ano);
		generateBill.setBackground(Color.gray);
		generateBill.setForeground(Color.black);
		generateBill.setFocusPainted(false);
		generateBill.setFont(new Font("times new roman", Font.BOLD, 18));
		checkoutUpperPanel.add(generateBill);

		checkoutguest = new JButton("CHECK OUT");
		checkoutguest.setBounds(230, 25, 150, 35);
		checkoutguest.setBorder(ano);
		checkoutguest.setBackground(Color.gray);
		checkoutguest.setForeground(Color.black);
		checkoutguest.setFocusPainted(false);
		checkoutguest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(vsioff.getText());
				String sql1 = "UPDATE bookingtable SET bookingStatus = ? WHERE booking_id = ? ";
				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
							"root", "");

					PreparedStatement pstat = conn.prepareStatement(sql1);

					pstat.setString(1, "check out");

					pstat.setInt(2, id);

					pstat.executeUpdate();

					pstat.close();

					conn.close();
					UIManager.put("OptionPane.messageForeground", Color.white);
					UIManager.put("OptionPane.background", Color.gray);
					UIManager.put("Panel.background", Color.darkGray);

					UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
					JOptionPane.showMessageDialog(null, "Checkout  Sucessfull");
					tableModel2.removeRow(bookingTable4.getSelectedRow());

				}

				catch (Exception ex) {

					JOptionPane.showMessageDialog(null, "checkout Unsucess");

					System.out.println("Error : " + ex.getMessage());

				}

			}
		});
		checkoutguest.setFont(new Font("times new roman", Font.BOLD, 18));
		checkoutUpperPanel.add(checkoutguest);

		viewCheckOut = new JButton("VIEW CHECK OUT");
		viewCheckOut.setBounds(580, 25, 180, 35);
		viewCheckOut.setBorder(ano);
		viewCheckOut.setBackground(Color.gray);
		viewCheckOut.setForeground(Color.black);
		viewCheckOut.setFocusPainted(false);
		viewCheckOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CustomerviewCheckIn mop = new CustomerviewCheckIn();

			}

		});
		viewCheckOut.setFont(new Font("times new roman", Font.BOLD, 18));
		checkoutUpperPanel.add(viewCheckOut);
		// -----------------------------------------------
		checkoutUpperPanel.setBounds(0, 0, 781, 85);
		String[] checkourtcolumn = { "FullName", "Email", "booking id", "CheckInDate", "CheckOutDate", "Room Type",
				"Price", "room No", "bookingStatus" };
		tableModel2 = new DefaultTableModel();
		tableModel2.fireTableDataChanged();
		tableModel2.setColumnIdentifiers(checkourtcolumn);
		bookingTable4 = new JTable(tableModel2);
		JScrollPane scroll2 = new JScrollPane(bookingTable4);
		bookingTable4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {

				int index = bookingTable4.getSelectedRow();

				vsioff.setText(bookingTable4.getValueAt(index, 2).toString());
			}
		});

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlll = "SELECT CONCAT(customers.FirstName, ' ', customers.LastName) AS FullName, customers.EmailAddress, bookingtable.booking_id, bookingtable.check_inDate, "
					+ "bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus ,room.RoomId FROM customers JOIN bookingtable "
					+ "ON customers.userid = bookingtable.userid  " + "JOIN room "
					+ "ON bookingtable.booking_id = room.booking_id where bookingtable.bookingStatus='booked'";
			PreparedStatement pstat = conn.prepareStatement(sqlll);

			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int bidid = rs.getInt("booking_id");
				String fname = rs.getString("FullName");
				String emailIdAdress = rs.getString("EmailAddress");
				String chIn = rs.getString("check_inDate");
				String chout = rs.getString("checkOutDate");
				String roomtype = rs.getString("room_type");
				String room = rs.getString("RoomId");

				int pricec = rs.getInt("roomTotalCost");
				String stass = rs.getString("bookingStatus");
				tableModel2.addRow(
						new Object[] { fname, emailIdAdress, bidid, chIn, chout, roomtype, pricec, room, stass });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		// -----------------------------------------------------------------------------------------------------------
		bookingTable4.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		bookingTable4.setFillsViewportHeight(true);
		scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll2.setBounds(25, 100, 730, 400);

		secondcardPanel.add(scroll2);
		checkoutUpperPanel.setLayout(null);
		secondcardPanel.setLayout(null);
		secondcardPanel.add(checkoutUpperPanel);

		thirdCardPanel = new JPanel();
		JLabel noncorp = new JLabel("Non-Corporate Customers");
		noncorp.setBounds(200, 10, 500, 50);
		noncorp.setForeground(Color.black);
		noncorp.setFont(new Font("times new roman", Font.BOLD, 36));
		String[] rooms = { "CustomerID", "FullName", "Gender", "Country", "Email", "password", "creditcard" };
		DefaultTableModel nonmp = new DefaultTableModel();
		nonmp.setColumnIdentifiers(rooms);
		nonD = new JTable(nonmp);
		nonD.setBorder(tableBorder);
		JScrollPane viewcustscrol = new JScrollPane(nonD);
		nonD.setFont(new Font("times new roman", Font.PLAIN, 14));

		nonD.setSelectionBackground(Color.darkGray);
		nonD.setSelectionForeground(Color.LIGHT_GRAY);
		// -----------------------------------------------------------------------------------------------------------
		nonD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		nonD.setFillsViewportHeight(true);
		viewcustscrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		viewcustscrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		viewcustscrol.setBounds(15, 70, 745, 450);
		viewcustscrol.setBorder(tableBorder2);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlm = "select Customers_ID, CONCAT(FirstName,\" \", LastName) as fullname, Gender,Country,EmailAddress,Password,CreditCardInfo from customers;";
			PreparedStatement pstat = conn.prepareStatement(sqlm);
			// pstat.setInt(1, ForeignkeyTester.userid);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int rid = rs.getInt("Customers_ID");
				String fn = rs.getString("fullname");

				String gen = rs.getString("Gender");

				String co = rs.getString("Country");
				String emaii = rs.getString("EmailAddress");
				String empass = rs.getString("Password");

				String cc = rs.getString("CreditCardInfo");

				nonmp.addRow(new Object[] { rid, fn, gen, co, emaii, empass, cc });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		thirdCardPanel.add(viewcustscrol);
		thirdCardPanel.add(noncorp);
		thirdCardPanel.setLayout(null);

		fourthCardPanel = new JPanel();
		JLabel corp = new JLabel("Corporate Customers");
		corp.setBounds(220, 10, 500, 50);
		corp.setForeground(Color.black);
		corp.setFont(new Font("times new roman", Font.BOLD, 36));
		fourthCardPanel.add(corp);
		String[] corporaColu = { "CorporateID", "CompanyName", "EstDATE", "Address", "Budget", "credit", "type",
				"email", "password" };
		corpopm = new DefaultTableModel();
		corpopm.setColumnIdentifiers(corporaColu);
		corpDD = new JTable(corpopm);
		corpDD.setBorder(tableBorder);
		JScrollPane coprScrol = new JScrollPane(corpDD);
		corpDD.setFont(new Font("times new roman", Font.PLAIN, 14));
		corpDD.setSelectionBackground(Color.darkGray);
		corpDD.setSelectionForeground(Color.LIGHT_GRAY);
		// -----------------------------------------------------------------------------------------------------------
		corpDD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		corpDD.setFillsViewportHeight(true);
		coprScrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		coprScrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		coprScrol.setBounds(15, 70, 745, 450);
		coprScrol.setBorder(tableBorder2);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sql5 = "SELECT CorporateID,CompanyName,EstablishmentDate,Address,Budget,PaymentTerms,CustomerType,EmailID,Password FROM corporatecustomers";
			PreparedStatement pstate = connn.prepareStatement(sql5);
			// pstat.setInt(1, ForeignkeyTester.userid);
			ResultSet rss = pstate.executeQuery();
			while (rss.next()) {

				int ccid = rss.getInt("CorporateID");
				String compn = rss.getString("CompanyName");

				String est = rss.getString("EstablishmentDate");

				String caddo = rss.getString("Address");

				int bud = rss.getInt("Budget");
				String paytr = rss.getString("PaymentTerms");
				String typeofCo = rss.getString("CustomerType");

				String ceec = rss.getString("EmailID");
				String cp = rss.getString("Password");
				corpopm.addRow(new Object[] { ccid, compn, est, caddo, bud, paytr, typeofCo, ceec, cp });
			}
			rss.close();
			pstate.close();
			connn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		fourthCardPanel.add(coprScrol);

		fourthCardPanel.setLayout(null);
		fifthCardPanel = new JPanel();
		JLabel number = new JLabel("Room Number  :");
		number.setForeground(Color.white);
		number.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		number.setBounds(30, 20, 150, 50);
		fifthCardPanel.add(number);

		cAt = new JComboBox();
		cAt.setBounds(170, 25, 200, 35);
		cAt.setBackground(Color.lightGray);
		cAt.setForeground(Color.black);
		cAt.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));

		fifthCardPanel.add(cAt);

		// ----------------------------------
		JLabel blick = new JLabel("Room Type  :");
		blick.setForeground(Color.white);
		blick.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		blick.setBounds(420, 20, 150, 50);
		fifthCardPanel.add(blick);

		categories = new JTextField();
		categories.setBounds(560, 25, 200, 35);
		categories.setBackground(Color.lightGray);
		categories.setForeground(Color.black);
		categories.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		fifthCardPanel.add(categories);
		hide = new JTextField();
		hide.setVisible(false);
		hide.setBounds(200, 200, 200, 200);
		fifthCardPanel.add(hide);
		fifthCardPanel.setBackground(Color.darkGray);
		cOrpo = new JButton("CHECK IN");
		cOrpo.setBounds(340, 80, 150, 30);
		cOrpo.setBorder(clockBorder);
		cOrpo.setBackground(Color.gray);
		cOrpo.setForeground(Color.black);
		cOrpo.setFocusPainted(false);

		cOrpo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cOrpo) {
					int id = Integer.parseInt(hide.getText());
					int roomd = Integer.parseInt((String) cAt.getSelectedItem());

					String sqkll = "update room set statusofRoom=? , booking_id = ? where RoomId=?";
					String upll = "update bookingtable set bookingStatus=? where booking_id=?;";

					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
								"root", "");
						PreparedStatement pstat = conn.prepareStatement(sqkll);

						PreparedStatement pstat2 = conn.prepareStatement(upll);

						pstat.setString(1, "active");
						pstat.setInt(2, id);
						pstat.setInt(3, roomd);
						pstat2.setString(1, "booked");
						pstat2.setInt(2, id);

						pstat2.executeUpdate();
						pstat.executeUpdate();

						pstat2.close();
						pstat.close();
						conn.close();
						UIManager.put("OptionPane.messageForeground", Color.white);
						UIManager.put("OptionPane.background", Color.gray);
						UIManager.put("Panel.background", Color.darkGray);

						UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

						JOptionPane.showMessageDialog(null, "Sucessfully checked in", "room",
								JOptionPane.PLAIN_MESSAGE);
						tableModel.removeRow(bookingTable3.getSelectedRow());
					} catch (Exception ex) {
						System.out.println("Error " + ex.getMessage());
					}

				}
			}

		});
		cOrpo.setFont(new Font("times new roman", Font.BOLD, 18));
		fifthCardPanel.add(cOrpo);

		viewbtnch = new JButton("VIEW");
		viewbtnch.setBounds(220, 80, 80, 30);
		viewbtnch.setBorder(clockBorder);
		viewbtnch.setBackground(Color.gray);
		viewbtnch.setForeground(Color.black);
		viewbtnch.setFocusPainted(false);
		viewbtnch.setFont(new Font("times new roman", Font.BOLD, 18));
		fifthCardPanel.add(viewbtnch);
		String[] corporatecolumn = { "BookingID", "CompanyName", "Email", "CheckInDate", "CheckOutDate", "Room Type",
				"Price", "bookingStatus" };
		tableModel4 = new DefaultTableModel();
		tableModel4.setColumnIdentifiers(corporatecolumn);
		bookingTable8 = new JTable(tableModel4);
		bookingTable8.setBorder(tableBorder);
		JScrollPane scroll9 = new JScrollPane(bookingTable8);
		bookingTable8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {

				int index3 = bookingTable8.getSelectedRow();

				categories.setText(bookingTable8.getValueAt(index3, 5).toString());
				hide.setText(bookingTable8.getValueAt(index3, 0).toString());
				String sql = "SELECT * FROM room where roomType=? and statusofRoom=?";

				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
							"root", "");
					PreparedStatement pstat = conn.prepareStatement(sql);
					pstat.setString(1, categories.getText());
					pstat.setString(2, "available");
					ResultSet rs = pstat.executeQuery();

					while (rs.next()) {
						String romi = rs.getString("RoomId");
						cAt.addItem(romi);
					}
					rs.close();
					pstat.close();
					conn.close();
				} catch (Exception ex) {
					System.out.println("Error " + ex.getMessage());
				}

			}
		});

		// -----------------------------------------------------------------------------------------------------------
		bookingTable8.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		bookingTable8.setFillsViewportHeight(true);
		scroll9.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll9.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll9.setBounds(25, 125, 730, 385);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlllcop = "SELECT corporatecustomers.CompanyName, corporatecustomers.EmailID, bookingtable.booking_id, bookingtable.check_inDate, bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus FROM corporatecustomers JOIN bookingtable ON corporatecustomers.userid = bookingtable.userid  where bookingtable.bookingStatus='pending'";
			PreparedStatement pstat = conn.prepareStatement(sqlllcop);
			// pstat.setInt(1, ForeignkeyTester.userid);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int bud = rs.getInt("booking_id");
				String cname = rs.getString("CompanyName");
				String emailIddress = rs.getString("EmailID");
				String chInm = rs.getString("check_inDate");
				String choutm = rs.getString("checkOutDate");
				String roomtypem = rs.getString("room_type");

				int pmricec = rs.getInt("roomTotalCost");
				String smtass = rs.getString("bookingStatus");
				tableModel4
						.addRow(new Object[] { bud, cname, emailIddress, chInm, choutm, roomtypem, pmricec, smtass });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		scroll9.setBorder(tableBorder2);

		fifthCardPanel.add(scroll9);
		fifthCardPanel.setLayout(null);
		sixCardPanel = new JPanel();
		sixCardPanel.setBackground(Color.darkGray);

		// -------JLabel------------------------------------

		checkBill2 = new JButton("CHECK BILL");
		checkBill2.setBounds(15, 25, 200, 35);
		checkBill2.setBorder(ano);
		checkBill2.setBackground(Color.gray);
		checkBill2.setForeground(Color.black);
		checkBill2.setFont(new Font("times new roman", Font.BOLD, 18));
		sixCardPanel.add(checkBill2);

		generateBill2 = new JButton("GENERATE");
		generateBill2.setBounds(400, 25, 150, 35);
		generateBill2.setBorder(ano);
		generateBill2.setBackground(Color.gray);
		generateBill2.setForeground(Color.black);
		generateBill2.setFocusPainted(false);
		generateBill2.setFont(new Font("times new roman", Font.BOLD, 18));
		sixCardPanel.add(generateBill2);

		hidden = new JTextField();
		hidden.setBounds(0, 15, 150, 150);
		hidden.setVisible(false);
		sixCardPanel.add(hidden);

		checkoutguest2 = new JButton("CHECK OUT");
		checkoutguest2.setBounds(230, 25, 150, 35);
		checkoutguest2.setFont(new Font("times new roman", Font.BOLD, 18));
		checkoutguest2.setBorder(ano);
		checkoutguest2.setBackground(Color.gray);
		checkoutguest2.setForeground(Color.black);
		checkoutguest2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int mid = Integer.parseInt(hidden.getText());
				String sql14 = "UPDATE bookingtable SET bookingStatus = ? WHERE booking_id = ? ";
				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem",
							"root", "");

					PreparedStatement pstat = conn.prepareStatement(sql14);

					pstat.setString(1, "check out");

					pstat.setInt(2, mid);

					pstat.executeUpdate();

					pstat.close();

					conn.close();
					UIManager.put("OptionPane.messageForeground", Color.white);
					UIManager.put("OptionPane.background", Color.gray);
					UIManager.put("Panel.background", Color.darkGray);

					UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
					JOptionPane.showMessageDialog(null, "Checkout  Sucessfull");
					tableModel55.removeRow(bookingTaable44.getSelectedRow());

				}

				catch (Exception ex) {

					JOptionPane.showMessageDialog(null, "checkout Unsucess");

					System.out.println("Error : " + ex.getMessage());

				}

			}
		});

		JButton viewcheckguest2 = new JButton("VIEW CHECKOUT");
		viewcheckguest2.setBounds(580, 25, 180, 35);
		viewcheckguest2.setBorder(ano);
		viewcheckguest2.setFont(new Font("times new roman", Font.BOLD, 18));
		viewcheckguest2.setBackground(Color.gray);
		viewcheckguest2.setForeground(Color.black);
		viewcheckguest2.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				corpCheckout bolo= new corpCheckout();
			}
		});
		sixCardPanel.add(viewcheckguest2);

		String[] mvc = {"booking id", "FullName", "Email", "CheckInDate", "CheckOutDate", "Room Type", "Price",
				"room No", "bookingStatus" };
		tableModel55 = new DefaultTableModel();
		tableModel55.fireTableDataChanged();
		
		tableModel55.setColumnIdentifiers(mvc);
		bookingTaable44 = new JTable(tableModel55);
		bookingTaable44.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {

				int index = bookingTaable44.getSelectedRow();

				hidden.setText(bookingTaable44.getValueAt(index, 0).toString());
			}
		});
		JScrollPane scroll22 = new JScrollPane(bookingTaable44);
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sqlll4 = "SELECT corporatecustomers.CompanyName, corporatecustomers.EmailID, bookingtable.booking_id, bookingtable.check_inDate, \r\n"
					+ "					bookingtable.checkOutDate, bookingtable.room_type, bookingtable.roomTotalCost, bookingtable.bookingStatus ,room.RoomId FROM corporatecustomers JOIN bookingtable ON corporatecustomers.userid = bookingtable.userid  JOIN room ON bookingtable.booking_id = room.booking_id where bookingtable.bookingStatus='booked'";
			PreparedStatement pstat = conn.prepareStatement(sqlll4);

			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {

				int bididm = rs.getInt("booking_id");
				String came = rs.getString("CompanyName");
				String emi = rs.getString("EmailID");
				String chIln = rs.getString("check_inDate");
				String choult = rs.getString("checkOutDate");
				String rolomtype = rs.getString("room_type");
				String rloom = rs.getString("RoomId");

				int pricenc = rs.getInt("roomTotalCost");
				String stnass = rs.getString("bookingStatus");
				tableModel55
						.addRow(new Object[] { bididm, came, emi, chIln, choult, rolomtype, rloom, pricenc, stnass });
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		// -----------------------------------------------------------------------------------------------------------
		bookingTaable44.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		bookingTaable44.setFillsViewportHeight(true);
		scroll22.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll22.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll22.setBounds(25, 100, 730, 400);
		sixCardPanel.add(scroll22);
		sixCardPanel.add(checkoutguest2);
		sixCardPanel.setLayout(null);
		dashManagement.add(firstCardpanel, "panel1");
		dashManagement.add(secondcardPanel, "panel2");
		dashManagement.add(thirdCardPanel, "panel");
		dashManagement.add(fourthCardPanel, "panel4");
		dashManagement.add(fifthCardPanel, "panel5");
		dashManagement.add(sixCardPanel, "panel6");
		dashManagement.setBounds(258, 100, 781, 526);

		// -------------menu bar--------------------

		managerDashboard.add(dashManagement);

		// ---------------------
		/*
		 * rightmanagePanel = new JPanel(); Border myBo =
		 * BorderFactory.createLineBorder(Color.white, 4); JPanel stButtonPanel = new
		 * JPanel();
		 * 
		 * ImageIcon restDoodles = new ImageIcon(
		 * "C:\\Users\\user\\eclipse-workspace\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\ximabu1.png"
		 * ); restaurantServices = new JButton("MANAGE MEALS");
		 * restaurantServices.setBounds(20, 165, 180, 30);
		 * restaurantServices.setFocusPainted(false);
		 * 
		 * restaurantServices.setFont(new Font("times new roman", Font.BOLD, 15));
		 * restaurantServices.setBackground(Color.lightGray);
		 * stButtonPanel.setBounds(10, 30, 220, 200);
		 * stButtonPanel.add(restaurantServices); JLabel imgofb = new JLabel();
		 * imgofb.setIcon(restDoodles); imgofb.setBounds(0, 0, 220, 200);
		 * imgofb.setBorder(myBo);
		 * 
		 * stButtonPanel.setLayout(null); stButtonPanel.add(imgofb);
		 * rightmanagePanel.add(stButtonPanel);
		 * 
		 * barServices = new JButton("Manage Bar"); barServices.setBounds(10, 270, 220,
		 * 200); rightmanagePanel.add(barServices);
		 * 
		 * rightmanagePanel.setLayout(null);
		 * rightmanagePanel.setBackground(Color.decode("#474141"));
		 * rightmanagePanel.setBounds(1047, 100, 240, 526); //
		 * --------------------------------------------------------
		 * darkpanelTitle.setLayout(null); managerDashboard.add(rightmanagePanel);
		 */
		// -------------------------------------------------------------------------------------
		managerDashboard.setResizable(false);
		managerDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerDashboard.setSize(1051, 672);
		managerDashboard.setLayout(null);
		managerDashboard.setLocationRelativeTo(null);
		managerDashboard.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == checkInButton) {
			// Show panel 1 and hide other panels
			firstCardpanel.setVisible(true);
			secondcardPanel.setVisible(false);
			thirdCardPanel.setVisible(false);
			fifthCardPanel.setVisible(false);
			fourthCardPanel.setVisible(false);
			sixCardPanel.setVisible(false);
		} else if (e.getSource() == checkOutButton) {
			// Show panel 2 and hide other panels
			firstCardpanel.setVisible(false);
			secondcardPanel.setVisible(true);
			thirdCardPanel.setVisible(false);
			fourthCardPanel.setVisible(false);
			fifthCardPanel.setVisible(false);
			sixCardPanel.setVisible(false);
		} else if (e.getSource() == viewCustomers) {
			firstCardpanel.setVisible(false);
			secondcardPanel.setVisible(false);
			thirdCardPanel.setVisible(true);
			fourthCardPanel.setVisible(false);
			fifthCardPanel.setVisible(false);
			sixCardPanel.setVisible(false);
		} else if (e.getSource() == corpoCust) {
			firstCardpanel.setVisible(false);
			secondcardPanel.setVisible(false);
			thirdCardPanel.setVisible(false);
			fourthCardPanel.setVisible(true);
			fifthCardPanel.setVisible(false);
			sixCardPanel.setVisible(false);
		} else if (e.getSource() == coproateCheckIn) {
			firstCardpanel.setVisible(false);
			secondcardPanel.setVisible(false);
			thirdCardPanel.setVisible(false);
			fourthCardPanel.setVisible(false);
			fifthCardPanel.setVisible(true);
			sixCardPanel.setVisible(false);
		} else if (e.getSource() == corporateCheckout) {
			firstCardpanel.setVisible(false);
			secondcardPanel.setVisible(false);
			thirdCardPanel.setVisible(false);
			fourthCardPanel.setVisible(false);
			fifthCardPanel.setVisible(false);
			sixCardPanel.setVisible(true);
		}
		if (e.getSource() == viewAvailableRoom) {
			viewRoomDash viewRoom = new viewRoomDash();
			roomPane.add(viewRoom);
		}
	}

	public static void main(String[] args) {
		new ManagerDashboard();

	}

	@Override
	public void run() {
		try {
			while (true) {

				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12) {
					hours -= 12;
				}
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);

				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);

				printTime();

				thread.sleep(1000); // in milliseconds
			}
		} catch (Exception e) {
		}
	}

	public void printTime() {
		digitalClock4.setText(timeString);
	}
}
