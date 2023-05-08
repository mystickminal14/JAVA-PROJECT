package LuttonHotelView;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import com.toedter.calendar.JDateChooser;

import HotelLutonConnection.CustomerRegistrationConnector;
import HotelLutonConnection.bookingcon;




import HotelLutonModel.bookingModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bookingDashboard implements ActionListener, Runnable {
	private JFrame bookingDash;
	private JPanel bookingPanel;
	private JPanel SingleRoom;
	private JPanel DoubleRoom;
	private JPanel TwinRoom;
	private JPanel footer;
	private JButton viewdet;
	private JButton viewdet2;
	private JButton viewdet3;
	private JButton bookBtn;
	JDateChooser checkInDATE;
	JButton digitalClock;
	JComboBox whichroom;
	// JComboBox price;
	JTextField priceroom;
	Thread thread = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	JDateChooser checkOutDATE;
	JButton homeButton;
	JTextField price;

	bookingDashboard() {
		bookingDash = new JFrame();
		bookingDash.getContentPane().setBackground(Color.LIGHT_GRAY);

		bookingPanel = new JPanel();
		thread = new Thread(this);
		thread.start();
		Border clockBorder = BorderFactory.createLineBorder(Color.white, 3);
		digitalClock = new JButton();
		digitalClock.setFont(new Font("times new roman", Font.BOLD, 18));
		digitalClock.setFocusPainted(false);
		digitalClock.setBorder(clockBorder);
		digitalClock.setBackground(Color.darkGray);
		digitalClock.setForeground(Color.white);
		digitalClock.setBounds(15, 50, 80, 30);
		bookingDash.add(digitalClock);
		JLabel bookkAroom = new JLabel("BOOK  A  ROOM");

		bookkAroom.setFont(new Font("Times new roman", Font.BOLD, 70));
		bookkAroom.setForeground(Color.DARK_GRAY);
		bookingPanel.add(bookkAroom);

		bookingPanel.setBackground(Color.gray);
		bookingPanel.setBounds(0, 0, 1100, 90);
		bookingDash.add(bookingPanel);
		// ------------------------ calender
		// picker------------------------------------------

		Border overcombo = BorderFactory.createLineBorder(Color.BLACK, 4);
		String[] selectAroom = { "Single Room", "Double Room", "Twin Room" };
		whichroom = new JComboBox<String>(selectAroom);
		whichroom.setBounds(50, 100, 200, 40);
		whichroom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String combox = (String) whichroom.getSelectedItem();
					if (combox.equals("Single Room")) {
						price.setText("3500");
					} else if (combox.equals("Double Room")) {
						price.setText("5500");
					} else if (combox.equals("Twin Room")) {
						price.setText("8500");
					}
				}
			}
		});
		whichroom.setBackground(Color.gray);

		whichroom.setBorder(overcombo);
		whichroom.setForeground(Color.black);
		whichroom.setEditable(true);
		bookingDash.add(whichroom);

		price = new JTextField("3500");
		price.setBackground(Color.white);
		price.setFont(new Font("times new roman", Font.BOLD, 16));
		price.setEnabled(false);
		price.setDisabledTextColor(Color.black);
		price.setBounds(710, 100, 150, 40);
		price.setForeground(Color.black);
		price.setBorder(overcombo);
		bookingDash.add(price);
		/*
		 * String [] priceoffRoom= {"3500","5500","8000"}; // price= new
		 * JComboBox(priceoffRoom); //price.setBounds(710,100,150,40);
		 * //price.setBackground(Color.gray); price.setForeground(Color.black);
		 * price.setEditable(true); price.setBorder(overcombo); bookingDash.add(price);
		 * 
		 */

		/*
		 * JComboBox checkinpicker= new JComboBox(chekc);
		 * checkinpicker.setBounds(270,100,200,40);;
		 * checkinpicker.setBackground(Color.gray); checkinpicker.setBorder(overcombo);
		 * checkinpicker.setForeground(Color.black); checkinpicker.setEditable(true);
		 * bookingDash.add(checkinpicker);
		 */
		checkInDATE = new JDateChooser();
		checkInDATE.setBounds(270, 100, 200, 40);
		checkInDATE.setBackground(Color.gray);
		checkInDATE.setForeground(Color.black);
		checkInDATE.setBorder(overcombo);
		bookingDash.add(checkInDATE);

		/*
		 * JComboBox checkoutPicker= new JComboBox(chekc);
		 * checkoutPicker.setBounds(490,100,200,40);
		 * checkoutPicker.setBackground(Color.gray);
		 * checkoutPicker.setForeground(Color.black);
		 * checkoutPicker.setBorder(overcombo); checkoutPicker.setEditable(true);
		 * bookingDash.add(checkoutPicker);
		 */
		checkOutDATE = new JDateChooser();
		checkOutDATE.setBounds(490, 100, 200, 40);
		checkOutDATE.setBackground(Color.gray);
		checkOutDATE.setForeground(Color.black);
		checkOutDATE.setBorder(overcombo);
		bookingDash.add(checkOutDATE);

		// ---------------------------------------------------

		Border btnofbtn = BorderFactory.createLineBorder(Color.white, 3);
		bookBtn = new JButton("BOOK");
		bookBtn.setBounds(900, 100, 80, 40);
		bookBtn.setFont(new Font("times new roman", Font.BOLD, 15));
		bookBtn.setBackground(Color.DARK_GRAY);
		bookBtn.setForeground(Color.white);
		bookBtn.setFocusPainted(false);
		bookBtn.setBorder(btnofbtn);
		bookBtn.addActionListener(this);
		// bookBtn.setBorderPainted(false);
		bookingDash.add(bookBtn);
		JPanel homepan = new JPanel();
		ImageIcon homeButn = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\homeButton.png");
		JLabel homeLab = new JLabel();
		homeLab.setBounds(0, 0, 45, 40);
		homeLab.setIcon(homeButn);
		homeButton = new JButton();
		homeButton.addActionListener(this);
		homeButton.setBounds(0, 0, 45, 40);
		homeButton.setLayout(null);
		homeButton.add(homeLab);
		homepan.add(homeButton);
		homepan.setLayout(null);
		homepan.setBounds(1000, 100, 45, 40);

		bookingDash.add(homepan);

		// --------------------------SINGLE BED
		// PANEL-------------------------------------------------
		ImageIcon singleImg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\SingleBED.png");
		Border bed = BorderFactory.createLineBorder(Color.white, 5);
		SingleRoom = new JPanel();
		// SingleRoom.setBackground(new Color(116, 46, 46));
		SingleRoom.setBackground(Color.DARK_GRAY);
		JLabel singleRoomLabel = new JLabel();
		singleRoomLabel.setIcon(singleImg);
		singleRoomLabel.setBorder(bed);
		singleRoomLabel.setBounds(30, 15, 280, 250);
		SingleRoom.add(singleRoomLabel);

		// -------------------------single room label////////////////////
		JPanel subPanel = new JPanel();
		subPanel.setBackground(Color.LIGHT_GRAY);
		subPanel.setBounds(123, 270, 83, 20);
		JLabel single = new JLabel("SINGLE ROOM");
		single.setBounds(2, 0, 100, 20);
		single.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		single.setForeground(Color.black);
		subPanel.add(single);
		subPanel.setLayout(null);
		SingleRoom.add(subPanel);

		// ----------ANOTHER SUB PANEL-------------------
		JPanel subPanel2 = new JPanel();
		subPanel2.setBackground(Color.LIGHT_GRAY);
		subPanel2.setBounds(30, 300, 280, 220);
		JLabel dashdesc = new JLabel("---DESCRIPTION---");
		dashdesc.setBounds(70, 0, 250, 20);
		// ----------------------------------------DESCRIPTION PANEL FOR SINGLE
		// ROOM------------------------------
		JLabel descofSingleroom = new JLabel(
				"<HTML><p><center>Single Bed<br>Comfortable matress with cushion<br>shower<br> TV and shower<br>Balcony View<br><br><i>PRICE: 3500</i></center></P></HTML>");
		descofSingleroom.setForeground(Color.DARK_GRAY);
		descofSingleroom.setFont(new Font("Times new roman", Font.BOLD, 16));
		descofSingleroom.setBounds(26, 8, 250, 155);
		subPanel2.add(descofSingleroom);
		subPanel2.setLayout(null);
		dashdesc.setFont(new Font("Times new roman", Font.BOLD, 15));
		dashdesc.setForeground(Color.darkGray);
		subPanel2.add(dashdesc);

		// ------------adding view details button----------------------------
		Border bb = BorderFactory.createLineBorder(Color.white, 3);
		viewdet = new JButton("VIEW-DETAILS");
		viewdet.setForeground(Color.white);
		viewdet.setBackground(Color.black);
		viewdet.setBorder(bb);
		viewdet.setFont(new Font("Times new roman", Font.BOLD, 15));
		viewdet.setBounds(70, 180, 128, 30);
		viewdet.addActionListener(this);
		viewdet.setFocusPainted(false);
		subPanel2.add(viewdet);
		subPanel2.setLayout(null);
		SingleRoom.add(subPanel2);
		// SingleRoom.setBackground( Color.gray);
		SingleRoom.setBounds(10, 160, 345, 540);
		SingleRoom.setLayout(null);
		bookingDash.add(SingleRoom);
		// --------------------------------------------------------------------------------------------------
		// ----------------------------------------DOUBLE ROOM-----
		DoubleRoom = new JPanel();
		DoubleRoom.setBackground(Color.DARK_GRAY);
		// DoubleRoom.setBackground(new Color(116, 46, 46));

		ImageIcon DoubleImg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\doubleBED.png");
		Border doublebed = BorderFactory.createLineBorder(Color.white, 5);

		JLabel doubleRoomLabel = new JLabel();
		doubleRoomLabel.setIcon(DoubleImg);
		doubleRoomLabel.setBorder(doublebed);
		doubleRoomLabel.setBounds(30, 15, 280, 250);
		DoubleRoom.add(doubleRoomLabel);

		// -------------------------double room label////////////////////
		JPanel subPanel3 = new JPanel();
		subPanel3.setBackground(Color.LIGHT_GRAY);
		subPanel3.setBounds(123, 270, 89, 20);
		JLabel doubler = new JLabel("DOUBLE ROOM");
		doubler.setBounds(2, 0, 100, 20);
		doubler.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		doubler.setForeground(Color.black);
		subPanel3.add(doubler);
		subPanel3.setLayout(null);
		DoubleRoom.add(subPanel3);

		// ----------ANOTHER SUB PANEL-------------------
		JPanel subPanel4 = new JPanel();
		subPanel4.setBackground(Color.LIGHT_GRAY);
		subPanel4.setBounds(30, 300, 280, 220);
		JLabel dashdesc2 = new JLabel("---DESCRIPTION---");
		dashdesc2.setBounds(70, 0, 250, 20);
		dashdesc2.setFont(new Font("Times new roman", Font.BOLD, 15));
		dashdesc2.setForeground(Color.DARK_GRAY);
		subPanel4.add(dashdesc2);
		JLabel descofDoubleroom = new JLabel(
				"<HTML><p><center>Full-sized Double Bed<br>En-suite bathroom<br>bathtub and shower<br> Luxurious and upgraded furniture<br>Private Balcony View<br><br><i>PRICE: 5500</i></center></P></HTML>");
		descofDoubleroom.setForeground(Color.DARK_GRAY);
		descofDoubleroom.setFont(new Font("Times new roman", Font.BOLD, 16));
		descofDoubleroom.setBounds(26, 8, 250, 155);
		subPanel4.add(descofDoubleroom);

		// ----------------view button----------------------
		viewdet2 = new JButton("VIEW-DETAILS");
		viewdet2.setForeground(Color.white);
		viewdet2.setBackground(Color.black);
		viewdet2.setBorder(bb);
		viewdet2.setFont(new Font("Times new roman", Font.BOLD, 15));
		viewdet2.setBounds(80, 180, 128, 30);
		viewdet2.addActionListener(this);
		viewdet2.setFocusPainted(false);
		subPanel4.add(viewdet2);
		subPanel4.setLayout(null);
		DoubleRoom.add(subPanel4);
		DoubleRoom.setLayout(null);
		DoubleRoom.setBounds(370, 160, 345, 540);
		bookingDash.add(DoubleRoom);

		TwinRoom = new JPanel();
		TwinRoom.setBackground(Color.DARK_GRAY);
		// TwinRoom.setBackground(new Color(116, 46, 46));
		ImageIcon twinimg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\twin.png");

		JLabel twinRoomLabel = new JLabel();
		twinRoomLabel.setIcon(twinimg);
		twinRoomLabel.setBorder(doublebed);
		twinRoomLabel.setBounds(30, 15, 280, 250);
		TwinRoom.add(twinRoomLabel);

		// -------------------------twin room label////////////////////
		JPanel subPanel6 = new JPanel();
		subPanel6.setBackground(Color.LIGHT_GRAY);
		subPanel6.setBounds(123, 270, 89, 20);
		JLabel triper = new JLabel("TWIN ROOM");
		triper.setBounds(2, 0, 100, 20);
		triper.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		triper.setForeground(Color.black);
		subPanel6.add(triper);
		subPanel6.setLayout(null);
		TwinRoom.add(subPanel6);

		// ----------ANOTHER SUB PANEL-------------------
		JPanel subPanel7 = new JPanel();
		subPanel7.setBackground(Color.LIGHT_GRAY);
		subPanel7.setBounds(30, 300, 280, 220);
		JLabel dashdesc3 = new JLabel("---DESCRIPTION---");
		dashdesc3.setBounds(70, 0, 250, 20);
		dashdesc3.setFont(new Font("Times new roman", Font.BOLD, 15));
		dashdesc3.setForeground(Color.DARK_GRAY);
		subPanel7.add(dashdesc3);
		// --------------------------------------
		JLabel descoftwinroom = new JLabel(
				"<HTML><p><center>Elegant decor and ambience<br>Equipped with clean and comfortable bedding<br>private jacuzzi and spa<br> Luxurious and stylish furniture<br><br><i>PRICE: 8500</i></center></P></HTML>");
		descoftwinroom.setForeground(Color.DARK_GRAY);
		descoftwinroom.setFont(new Font("Times new roman", Font.BOLD, 16));
		descoftwinroom.setBounds(26, 8, 250, 155);
		subPanel7.add(descoftwinroom);
		// -------------------------------------------
		viewdet3 = new JButton("VIEW-DETAILS");
		viewdet3.setForeground(Color.white);
		viewdet3.setBackground(Color.black);
		viewdet3.setBorder(bb);
		viewdet3.setFont(new Font("Times new roman", Font.BOLD, 15));
		viewdet3.setBounds(80, 180, 128, 30);
		viewdet3.addActionListener(this);
		viewdet3.setFocusPainted(false);
		subPanel7.add(viewdet3);
		subPanel7.setLayout(null);
		TwinRoom.add(subPanel7);

		TwinRoom.setLayout(null);
		TwinRoom.setBounds(730, 160, 345, 540);
		bookingDash.add(TwinRoom);

		footer = new JPanel();
		footer.setBounds(0, 710, 1100, 35);
		footer.setBackground(Color.black);
		bookingDash.add(footer);

		// ----------------------TO PLACE THE WINDOW IN
		// CENTER-------------------------------------------------------------------------------------------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int windowWidth = 1100;
		int windowHeight = 780;

		int windowX = (screenWidth - windowWidth) / 2;
		int windowY = (screenHeight - windowHeight) / 2;

		bookingDash.setSize(windowWidth, windowHeight);
		bookingDash.setLocation(windowX, windowY);
		// --------------------------------------------------------------------------------------------------------------------

		bookingDash.setResizable(false);
		bookingDash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bookingDash.setSize(1100, 780);
		bookingDash.setLayout(null);
		bookingDash.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bookBtn) {
			int bookingId = 0;
			String roomCateg = "";
			if (whichroom.getSelectedItem() != null) {
				roomCateg = whichroom.getSelectedItem().toString();
			}
			String checkIn = ((JTextField) checkInDATE.getDateEditor().getUiComponent()).getText();
			String checkOut = ((JTextField) checkOutDATE.getDateEditor().getUiComponent()).getText();

			// int roomPrice = 0;
			/*
			 * if (price.getSelectedItem() != null) { String selectedPrice =
			 * price.getSelectedItem().toString(); roomPrice =
			 * Integer.parseInt(selectedPrice); }
			 */
			int roomPrice = Integer.parseInt(price.getText());

			// -------------------------------------------------------
			bookingModel ss1 = new bookingModel(bookingId, roomCateg, checkIn, checkOut, roomPrice);

			bookingcon conbk = new bookingcon();

			boolean result1 = conbk.save(ss1);

			if (result1) {
				UIManager.put("OptionPane.messageForeground", Color.white);
				UIManager.put("OptionPane.background", Color.gray);
				UIManager.put("Panel.background", Color.darkGray);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
				JOptionPane.showMessageDialog(null, "Congratulation!! You have successfully booked your room.");
				int resultop = JOptionPane.showConfirmDialog(null, "Click YES to open your dashboard");
				if (resultop == JOptionPane.OK_OPTION) {

					CustomerDashboard newdashFrame = new CustomerDashboard();
					bookingDash.dispose();
				}

				whichroom.setSelectedIndex(0);
				checkInDATE.setToolTipText("");
				checkOutDATE.setToolTipText("");

				price.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "ERRORR");
			}
		}

		if (e.getSource() == viewdet) {
			SingleRoomDashboard sigroomDash = new SingleRoomDashboard();
			bookingDash.dispose();

		}

		if (e.getSource() == viewdet2) {
			DoubleRoomSpecification doubleRoomSpecification = new DoubleRoomSpecification();
			bookingDash.dispose();
		}

		if (e.getSource() == viewdet3) {
			TwinRoomDashboard twinRoomDashboard = new TwinRoomDashboard();
			bookingDash.dispose();
		}
		if (e.getSource() == homeButton) {
			CustomerDashboard openDahPlz = new CustomerDashboard();
			bookingDash.dispose();
		}
	}

	public static void main(String[] args) {
		new bookingDashboard();
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
		digitalClock.setText(timeString);
	}

}
