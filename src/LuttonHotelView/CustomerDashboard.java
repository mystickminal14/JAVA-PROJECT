package LuttonHotelView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CustomerDashboard implements ActionListener, Runnable {
	private JFrame customerDash;
	private JPanel titleofDash;
	private JPanel userInfosection;
	private JPanel bookNowsec;
	private JPanel viewBooksection;
	private JButton bookNowButton;
	Thread thread = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	JTextField details;
	JButton digitalCLock33;
	JButton restButton;
	JButton viewButton;
	JButton logoutToLogin;

	public CustomerDashboard() {
		customerDash = new JFrame();
		customerDash.getContentPane().setBackground(Color.black);
		thread = new Thread(this);
		thread.start();
		Border clockBorder = BorderFactory.createLineBorder(Color.white, 3);
		digitalCLock33 = new JButton();
		digitalCLock33.setFont(new Font("times new roman", Font.BOLD, 18));
		digitalCLock33.setFocusPainted(false);
		digitalCLock33.setBorder(clockBorder);
		digitalCLock33.setBackground(Color.darkGray);
		digitalCLock33.setForeground(Color.white);
		digitalCLock33.setBounds(950, 40, 80, 30);
		customerDash.add(digitalCLock33);
//----------------------------------------------------------------------------------------------------
		titleofDash = new JPanel();
		// -----------------LABEL-------------
		JLabel cust = new JLabel("CUSTOMER DASHBOARD");
		cust.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 60));
		cust.setForeground(Color.black);
		titleofDash.add(cust);
		titleofDash.setBounds(0, 0, 1080, 80);
		titleofDash.setBackground(Color.gray);
		customerDash.add(titleofDash);

//----------------------------------------------------------------------------------------------------------
		Border userbor = BorderFactory.createLineBorder(Color.black, 6);
		userInfosection = new JPanel();

		JLabel informationLabel = new JLabel("--INFORMATION--");
		informationLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		informationLabel.setForeground(Color.gray);
		informationLabel.setBounds(50, 200, 180, 50);
		userInfosection.add(informationLabel);
		// -----------------------------------------------------------
		/*
		 * JLabel infolab= new
		 * JLabel("<html><b>Name  :<br><br>Age  :<br><br>Gender  :<br><br>Address  :<br><br>Country  :</b></html>"
		 * ); infolab.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,18));
		 * infolab.setForeground(Color.black); infolab.setBounds(40,193,180,300);
		 * userInfosection.add(infolab);
		 */
		details = new JTextField();
		details.setBounds(30, 200, 220, 250);
		details.setBackground(Color.gray);
		details.setLayout(null);
		userInfosection.add(details);

		// -------------------------help-----------------------------------

		JLabel helplabel = new JLabel("-- HELP & SUPPORT --");
		helplabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		helplabel.setForeground(Color.black);
		helplabel.setBounds(35, 450, 250, 50);
		userInfosection.add(helplabel);
		// ---------------------------------------------
		JLabel EmailidHotelLA = new JLabel("Lutton20Hotel@gmail.com");
		EmailidHotelLA.setForeground(Color.black);
		EmailidHotelLA.setFont(new Font("Georgia", Font.BOLD, 12));
		EmailidHotelLA.setBounds(55, 480, 200, 50);
		userInfosection.add(EmailidHotelLA);

		JLabel contactNOlabel = new JLabel("9564944944");
		contactNOlabel.setForeground(Color.black);
		contactNOlabel.setFont(new Font("Georgia", Font.BOLD, 13));
		contactNOlabel.setBounds(90, 495, 100, 50);
		userInfosection.add(contactNOlabel);

		JLabel AddressofHotellabel = new JLabel("London,UK");
		AddressofHotellabel.setForeground(Color.black);
		AddressofHotellabel.setFont(new Font("Georgia", Font.BOLD, 13));
		AddressofHotellabel.setBounds(90, 513, 100, 50);
		userInfosection.add(AddressofHotellabel);
		JPanel logoutbtn = new JPanel();
		ImageIcon outlog = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\LOGOUUT.png");
		JLabel logoutbtnlabl = new JLabel();
		logoutbtnlabl.setBounds(0, 0, 45, 40);
		logoutbtnlabl.setIcon(outlog);
		logoutToLogin = new JButton();
		logoutToLogin.setBounds(0, 0, 45, 40);
		logoutToLogin.addActionListener(this);
		logoutToLogin.setLayout(null);
		logoutToLogin.add(logoutbtnlabl);
		logoutbtn.add(logoutToLogin);
		logoutbtn.setLayout(null);
		logoutbtn.setBounds(210, 540, 45, 40);
		logoutbtn.setBackground(Color.black);
		userInfosection.add(logoutbtn);
		// ----------------------------------------

		// ------------------------label--------------------
		ImageIcon userimg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\userIcon.png");
		JLabel userIconImgLabel = new JLabel();
		userIconImgLabel.setIcon(userimg);
		userIconImgLabel.setBounds(60, 30, 158, 160);
		userIconImgLabel.setBorder(userbor);

		userInfosection.add(userIconImgLabel);
		userInfosection.setLayout(null);
		userInfosection.setBounds(5, 85, 280, 590);
		userInfosection.setBackground(Color.LIGHT_GRAY);
		customerDash.add(userInfosection);
//--------------------------------------------------------------------------------------------------------
		Border userbor2 = BorderFactory.createLineBorder(Color.white, 6);
		ImageIcon proImg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\promotion.png");
		bookNowsec = new JPanel();
		// --------label---------
		JLabel promotionImg = new JLabel(proImg);
		promotionImg.setBounds(225, 10, 518, 278);
		promotionImg.setBorder(userbor2);
		bookNowsec.add(promotionImg);
		// -----------------lutton label--------------------------
		JLabel lulabel = new JLabel("<html>L<br>U<br>T<br>T<br>O<br>N</html>");
		lulabel.setBounds(35, 10, 150, 278);
		lulabel.setForeground(Color.WHITE);
		lulabel.setFont(new Font("Times new roman", Font.BOLD, 40));
		bookNowsec.add(lulabel);
		// -------------btn---------------------------
		bookNowButton = new JButton("<html>BOOK<br>NOW</html>");
		bookNowButton.setBounds(90, 10, 120, 278);
		bookNowButton.setFocusPainted(false);
		bookNowButton.setForeground(Color.black);
		bookNowButton.setFont(new Font("Times new roman", Font.BOLD, 25));
		bookNowButton.setBackground(Color.LIGHT_GRAY);
		bookNowButton.addActionListener(this);
		bookNowsec.add(bookNowButton);

		bookNowsec.setLayout(null);
		bookNowsec.setBounds(310, 85, 750, 300);
		bookNowsec.setBackground(Color.DARK_GRAY);
		customerDash.add(bookNowsec);
//--------------------------------------------------------------------------------------------------------
		ImageIcon viewBookImg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\viewBook.png");
		viewBooksection = new JPanel();
		Border userbor3 = BorderFactory.createLineBorder(Color.white, 6);
		// ------------label+++++++++++++--------------------------------------
		// --------------button-----------------------------------------------
		viewButton = new JButton("MY BOOKINGS");
		viewButton.setBackground(Color.gray);
		viewButton.setBorderPainted(false);
		viewButton.setForeground(Color.black);
		viewButton.setBackground(Color.white);
		viewButton.setFont(new Font("times new roman", Font.BOLD, 18));
		viewButton.setBounds(70, 220, 180, 28);
		viewButton.addActionListener(this);
		viewBooksection.add(viewButton);

		JLabel viewlabelimg = new JLabel(viewBookImg);
		viewlabelimg.setBounds(0, 0, 320, 285);
		viewBooksection.add(viewlabelimg);
		viewlabelimg.setBorder(userbor3);

		viewBooksection.setLayout(null);
		viewBooksection.setBounds(310, 390, 320, 285);
		viewBooksection.setBackground(Color.LIGHT_GRAY);
		customerDash.add(viewBooksection);

		// ------------------------------------------------------------------------------------------------------------
		ImageIcon restImage = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\restauraant.png");
		JPanel restaurant = new JPanel();
		// ----------------------------------------------------------------------------
		restButton = new JButton("RESTAURANT");
		restButton.setBackground(Color.gray);
		restButton.setBorderPainted(false);
		restButton.setForeground(Color.black);
		restButton.setBackground(Color.white);
		restButton.setFont(new Font("times new roman", Font.BOLD, 16));
		restButton.setBounds(30, 220, 150, 25);
		restButton.addActionListener(this);
		restaurant.add(restButton);
		// ------------------------------------------------------------
		JLabel restimg = new JLabel();
		restimg.setIcon(restImage);
		restimg.setBounds(0, 0, 205, 285);
		restaurant.add(restimg);

		restaurant.setLayout(null);
		restimg.setBorder(userbor3);
		restaurant.setBounds(635, 390, 205, 285);
		restaurant.setBackground(Color.LIGHT_GRAY);
		customerDash.add(restaurant);
//---------------------------------------------------------------------------------------------------------
		ImageIcon minibarimg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\minibar.png");

		JPanel minibar = new JPanel();
		// ---------------------------------------------
		JButton barButton = new JButton("MINI-BAR");
		barButton.setBackground(Color.gray);
		barButton.setBorderPainted(false);
		barButton.setForeground(Color.black);
		barButton.setBackground(Color.white);
		barButton.setFont(new Font("times new roman", Font.BOLD, 16));
		barButton.setBounds(30, 220, 150, 25);
		minibar.add(barButton);
		// -------------------------------------

		JLabel miniimg = new JLabel();
		miniimg.setBorder(userbor3);
		miniimg.setIcon(minibarimg);
		miniimg.setBounds(0, 0, 215, 285);
		minibar.add(miniimg);

		minibar.setLayout(null);
		minibar.setBounds(845, 390, 215, 285);
		minibar.setBackground(Color.LIGHT_GRAY);
		customerDash.add(minibar);
		// ----------------------------------------

		// ----------------------TO PLACE THE WINDOW IN
		// CENTER-------------------------------------------------------------------------------------------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int windowWidth = 1080;
		int windowHeight = 720;

		int windowX = (screenWidth - windowWidth) / 2;
		int windowY = (screenHeight - windowHeight) / 2;

		customerDash.setSize(windowWidth, windowHeight);
		customerDash.setLocation(windowX, windowY);
		// --------------------------------------------------------------------------------------------------------------------

		customerDash.setResizable(false);
		customerDash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customerDash.setSize(1080, 720);
		customerDash.setLayout(null);
		customerDash.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bookNowButton) {
			bookingDashboard openBookDash = new bookingDashboard();
			customerDash.dispose();

		}
		if (e.getSource() == restButton) {
			Restaurant openfoodmeals = new Restaurant();
			customerDash.dispose();
		}
		if (e.getSource() == viewButton) {
			ViewBooking mybooking = new ViewBooking();
			customerDash.dispose();
		}

		if (e.getSource() == logoutToLogin) {
			LoginPage oplo = new LoginPage();
			customerDash.dispose();
		}
	}

	public static void main(String[] args) {
		new CustomerDashboard();
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

				thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}

	public void printTime() {
		digitalCLock33.setText(timeString);
	}
}
