package LuttonHotelView;

import javax.swing.*;
import javax.swing.border.Border;

import HotelLutonConnection.CustomerRegistrationConnector;

import HotelLutonModel.registernon;
import HotelLutonConnection.registerInuser;

import HotelLutonModel.userregister;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NonCorporate implements ActionListener {
	private JFrame non_corp_reg;
	private JPanel mainTitle;
	private JPanel registerImage;
	JTextField fname;
	JLabel lastName;
	JTextField lname;
	JTextField ageField;
	JLabel gender;
	JRadioButton female;
	JRadioButton male;
	JRadioButton other;
	ButtonGroup group;
	JTextField emallField;
	JPasswordField pwUser;
	JTextField useraddress;
	JComboBox customertype;
	JComboBox countryChoose;
	JTextField creditinfotext;
	private JButton backTobutton;
	private JButton goRegisterBtn;

	NonCorporate() {
		non_corp_reg = new JFrame();
		non_corp_reg.getContentPane().setBackground(Color.LIGHT_GRAY);
		// -----------title: non corporate-----------------------------
		mainTitle = new JPanel();
		JLabel customerz = new JLabel("NON-CORPORATE  REGISTRATION");
		customerz.setFont(new Font("Times new roman", Font.BOLD, 60));
		customerz.setForeground(Color.LIGHT_GRAY);
		mainTitle.add(customerz);
		mainTitle.setBackground(Color.DARK_GRAY);
		mainTitle.setBounds(0, 0, 1080, 80);
		non_corp_reg.add(mainTitle);
		// ------------------------------------------------------------
		ImageIcon regsImg = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\REGSIMAGE.png");
		// ---------------picture----------------------------------------
		Border newbord = BorderFactory.createLineBorder(Color.GRAY, 10);
		registerImage = new JPanel();
		JLabel Luton_title = new JLabel("L  U  T  T  O  N");
		Luton_title.setFont(new Font("Times new roman", Font.BOLD, 55));
		Luton_title.setBounds(70, 40, 400, 50);
		Luton_title.setForeground(Color.white);
		registerImage.add(Luton_title);
		// ------------------------------------------------\
		JLabel Lutondashtitle = new JLabel("__________________");
		Lutondashtitle.setFont(new Font("Times new roman", Font.BOLD, 40));
		Lutondashtitle.setBounds(70, 105, 400, 50);
		Lutondashtitle.setForeground(Color.white);
		registerImage.add(Lutondashtitle);
		// ----------------------quote---------------
		JLabel quote = new JLabel("<HTML><p><center>EXPERIENCE<br>LUXURY<br>AND<br>COMFORT<br>AT<br>IT'S FINEST");
		quote.setFont(new Font("Times new roman", Font.BOLD, 38));
		quote.setBounds(120, 80, 410, 400);
		quote.setForeground(Color.white);
		registerImage.add(quote);
		// ------------------------------------------------------
		JLabel Lutondashtitle2 = new JLabel("__________________");
		Lutondashtitle2.setFont(new Font("Times new roman", Font.BOLD, 40));
		Lutondashtitle2.setBounds(70, 430, 400, 50);
		Lutondashtitle2.setForeground(Color.white);
		registerImage.add(Lutondashtitle2);
		// -----------------img-------------------------------------
		JLabel regsimglabel = new JLabel();
		regsimglabel.setIcon(regsImg);
		regsimglabel.setBounds(0, 0, 500, 680);
		registerImage.add(regsimglabel);
		regsimglabel.setBorder(newbord);
		registerImage.setLayout(null);
		registerImage.setBackground(Color.gray);
		registerImage.setBounds(0, 80, 500, 720);
		non_corp_reg.add(registerImage);
		// -----------------------------------------------------------------------

		JPanel nextOne = new JPanel();
		nextOne.setBackground(Color.DARK_GRAY);
		JLabel register = new JLabel("R       E        G        I        S        T        E        R");
		register.setBounds(80, 20, 650, 40);
		register.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		register.setForeground(new Color(132, 151, 199));
		nextOne.add(register);

		JLabel firstName = new JLabel("First Name    :");
		firstName.setBounds(40, 80, 150, 30);
		firstName.setForeground(Color.lightGray);
		firstName.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		nextOne.add(firstName);

		fname = new JTextField();
		fname.setBounds(180, 80, 300, 30);
		fname.setBackground(Color.gray);
		fname.setCaretColor(Color.yellow);
		fname.setForeground(Color.white);
		fname.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		nextOne.add(fname);

		lastName = new JLabel("Last Name    :");
		lastName.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		lastName.setBounds(40, 125, 150, 30);
		lastName.setForeground(Color.LIGHT_GRAY);
		nextOne.add(lastName);

		lname = new JTextField();
		lname.setBackground(Color.gray);
		lname.setBounds(180, 125, 300, 30);
		lname.setCaretColor(Color.yellow);
		lname.setForeground(Color.white);
		lname.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		nextOne.add(lname);

		JLabel age = new JLabel("Age     :");
		age.setBounds(80, 170, 150, 30);
		age.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		age.setForeground(Color.LIGHT_GRAY);
		nextOne.add(age);

		ageField = new JTextField();
		ageField.setBounds(180, 170, 300, 30);
		ageField.setBackground(Color.gray);
		ageField.setCaretColor(Color.yellow);
		ageField.setForeground(Color.white);
		ageField.setFont(new Font("sans serif", Font.BOLD, 16));
		nextOne.add(ageField);

		gender = new JLabel("Gender  :");
		gender.setBounds(70, 215, 150, 30);
		gender.setFont(new Font("times new roman", Font.BOLD, 16));
		gender.setForeground(Color.LIGHT_GRAY);
		nextOne.add(gender);
		// --------------------------------------
		male = new JRadioButton("Male");
		nextOne.add(male);
		male.setBounds(180, 215, 62, 30);
		male.setForeground(Color.LIGHT_GRAY);
		male.setBackground(Color.DARK_GRAY);
		// -----------------------------
		female = new JRadioButton("Female");
		female.setBounds(240, 215, 70, 30);
		female.setForeground(Color.LIGHT_GRAY);
		female.setBackground(Color.DARK_GRAY);
		nextOne.add(female);
		// ************************************
		other = new JRadioButton("other");
		other.setBounds(320, 215, 100, 30);
		other.setForeground(Color.LIGHT_GRAY);
		other.setBackground(Color.DARK_GRAY);
		nextOne.add(other);
		// --------------------------------------
		group = new ButtonGroup();
		group.add(female);
		group.add(male);
		group.add(other);

		// ----------------------email-----------------------------------------
		JLabel email = new JLabel("Email   :");
		email.setBounds(40, 260, 150, 30);
		email.setFont(new Font("times new roman", Font.BOLD, 16));
		email.setForeground(Color.LIGHT_GRAY);
		nextOne.add(email);

		emallField = new JTextField();
		emallField.setBounds(180, 260, 300, 30);
		emallField.setCaretColor(Color.yellow);
		emallField.setForeground(Color.white);
		emallField.setFont(new Font("times new roman", Font.BOLD, 16));
		emallField.setBackground(Color.gray);
		nextOne.add(emallField);

		JLabel passwordLabel = new JLabel("Password   :");
		passwordLabel.setBounds(53, 305, 150, 30);
		passwordLabel.setFont(new Font("times new roman", Font.BOLD, 16));
		passwordLabel.setForeground(Color.LIGHT_GRAY);
		nextOne.add(passwordLabel);

		pwUser = new JPasswordField();
		pwUser.setBounds(180, 305, 300, 30);
		pwUser.setCaretColor(Color.yellow);
		pwUser.setForeground(Color.black);
		pwUser.setFont(new Font("times new roman", Font.BOLD, 16));
		pwUser.setBackground(Color.gray);

		nextOne.add(pwUser);

		JLabel rePasswordLabel = new JLabel("Re-Password  :");
		rePasswordLabel.setFont(new Font("times new roman", Font.BOLD, 16));
		rePasswordLabel.setBounds(40, 350, 150, 30);
		rePasswordLabel.setForeground(Color.LIGHT_GRAY);
		nextOne.add(rePasswordLabel);

		JPasswordField repwUser = new JPasswordField();
		repwUser.setBounds(180, 350, 300, 30);
		repwUser.setCaretColor(Color.yellow);
		repwUser.setForeground(Color.black);
		repwUser.setFont(new Font("times new roman", Font.BOLD, 16));
		repwUser.setBackground(Color.gray);
		nextOne.add(repwUser);

		// --------------------------address--------------------------
		JLabel address = new JLabel("Address   :");
		address.setFont(new Font("times new roman", Font.BOLD, 16));
		address.setBounds(40, 395, 150, 30);
		address.setForeground(Color.LIGHT_GRAY);
		nextOne.add(address);

		useraddress = new JTextField();
		useraddress.setBounds(180, 395, 300, 30);
		useraddress.setCaretColor(Color.yellow);
		useraddress.setForeground(Color.white);
		useraddress.setFont(new Font("times new roman", Font.BOLD, 16));
		useraddress.setBackground(Color.gray);
		nextOne.add(useraddress);
		// ---------------------------postalcode--------------------------
		JLabel postalcode = new JLabel("Customer Type  :");
		postalcode.setBounds(40, 440, 150, 30);
		postalcode.setForeground(Color.LIGHT_GRAY);
		postalcode.setFont(new Font("times new roman", Font.BOLD, 16));

		nextOne.add(postalcode);

		String[] arcm = { "normal" };
		customertype = new JComboBox(arcm);
		customertype.setBounds(180, 440, 300, 30);

		customertype.setForeground(Color.black);
		customertype.setFont(new Font("times new roman", Font.BOLD, 16));
		customertype.setBackground(Color.white);
		nextOne.add(customertype);

		JLabel country = new JLabel("Country   :");
		country.setBounds(40, 485, 150, 30);
		country.setFont(new Font("times new roman", Font.BOLD, 16));

		country.setForeground(Color.LIGHT_GRAY);
		nextOne.add(country);
		// -------------------------------------------------------------------------------
		String[] countries = { "UK", "Australia", "India", "Usa", "India", "Japan", "Canada", "Nepal", "Indonesia" };
		countryChoose = new JComboBox(countries);
		countryChoose.setBounds(180, 485, 300, 30);
		countryChoose.setBackground(Color.gray);
		countryChoose.setForeground(Color.white);
		countryChoose.setEditable(true);
		nextOne.add(countryChoose);
//---------------------------------------------------------------------------------------------------------
		JLabel creditinfo = new JLabel("CreditCard-Info :");
		creditinfo.setBounds(40, 530, 150, 30);
		creditinfo.setForeground(Color.LIGHT_GRAY);
		creditinfo.setFont(new Font("times new roman", Font.BOLD, 16));

		nextOne.add(creditinfo);

		creditinfotext = new JTextField();
		creditinfotext.setBounds(180, 530, 300, 30);
		creditinfotext.setCaretColor(Color.yellow);
		creditinfotext.setForeground(Color.white);
		creditinfotext.setFont(new Font("times new roman", Font.BOLD, 16));
		creditinfotext.setBackground(Color.gray);
		nextOne.add(creditinfotext);
		// -----------------------------------------------------------
		// BUTTON-
		Border btnbordrr = BorderFactory.createLineBorder(Color.black, 3);

		backTobutton = new JButton("Back to LOGIN");
		backTobutton.setBounds(66, 582, 180, 35);
		backTobutton.setForeground(Color.white);
		backTobutton.setFont(new Font("Times new roman", Font.BOLD, 18));
		backTobutton.setBackground(Color.GRAY);
		backTobutton.setFocusPainted(false);
		backTobutton.setBorder(btnbordrr);
		// backTobutton.setBorderPainted(false);
		backTobutton.addActionListener(this);
		nextOne.add(backTobutton);

		goRegisterBtn = new JButton("REGISTER");
		goRegisterBtn.setBackground(Color.GRAY);
		goRegisterBtn.setForeground(Color.white);
		goRegisterBtn.setFocusPainted(false);
		goRegisterBtn.setBorder(btnbordrr);
		/// goRegisterBtn.setBorderPainted(false);
		goRegisterBtn.setFont(new Font("Times new roman", Font.BOLD, 18));
		goRegisterBtn.addActionListener(this);

		goRegisterBtn.setBounds(300, 582, 180, 35);
		nextOne.add(goRegisterBtn);

		nextOne.setBorder(newbord);
		nextOne.setBounds(520, 80, 546, 683);
		nextOne.setLayout(null);

		// -------------------------------------------------------------------------------------------------------------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int windowWidth = 1080;
		int windowHeight = 800;

		int windowX = (screenWidth - windowWidth) / 2;
		int windowY = (screenHeight - windowHeight) / 2;

		non_corp_reg.setSize(windowWidth, windowHeight);
		non_corp_reg.setLocation(windowX, windowY);
//-------------------------------------------------------------------------------------------------------
		non_corp_reg.add(nextOne);
		non_corp_reg.setLayout(null);
		non_corp_reg.setResizable(false);
		non_corp_reg.setSize(1080, 800);
		non_corp_reg.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == goRegisterBtn) {

			String firstName = fname.getText();
			String lastnam = lname.getText();
			int age = Integer.parseInt(ageField.getText());
			String gender = "";
			if (male.isSelected()) {
				gender = "Male";
			} else if (female.isSelected()) {
				gender = "Female";
			} else if (other.isSelected()) {
				gender = "Other";
			}

			String add = useraddress.getText();

			String count = "";
			if (countryChoose.getSelectedItem() != null) {
				count = countryChoose.getSelectedItem().toString();
			}

			String emId = emallField.getText();
			String pass = pwUser.getText();
			if (!emId.matches(".+@.+\\..+")) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
				JOptionPane.showMessageDialog(null, "A valid email address is required!!");
				return;
			}

			if (pass.length() < 8) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
				JOptionPane.showMessageDialog(null, "A minimum of 8 characters must be included in the password!!");
				return;
			}

			int creditInfo = Integer.parseInt(creditinfotext.getText());
			String type = "";
			if (customertype.getSelectedItem() != null) {
				type = customertype.getSelectedItem().toString();
			}
			int userid = 0;
			String emailAddressUser = emallField.getText();
			String userpass = pwUser.getText();
			if (!emailAddressUser.matches(".+@.+\\..+")) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
				JOptionPane.showMessageDialog(null, "A valid email address is required!!");
				return;
			}

			// Validate password
			if (userpass.length() < 8) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
				JOptionPane.showMessageDialog(null, "A minimum of 8 characters must be included in the password!!");
				return;
			}

			// -------------------------------------rules-------------------------------------

			// -------------------------------------------------------
			userregister s2 = new userregister(userid, emailAddressUser, userpass);
			registernon s1 = new registernon(firstName, lastnam, age, gender, add, count, emId, pass, creditInfo, type);

			registerInuser std2 = new registerInuser();
			CustomerRegistrationConnector std = new CustomerRegistrationConnector();
			boolean result2 = std2.save(s2);
			boolean result1 = std.save(s1);

			if (result2 && result1) {
				UIManager.put("OptionPane.messageForeground", Color.white);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.gray);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

				JOptionPane.showMessageDialog(null, "Congratulations!! You are officially part of Hotel LUTTON");
				int resultop = JOptionPane.showOptionDialog(null, "Click OK to open LoginPage", "Message",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				if (resultop == JOptionPane.OK_OPTION) {

					LoginPage newFrame = new LoginPage();
					non_corp_reg.dispose();
				}
				fname.setText("");
				lname.setText("");
				ageField.setText("");
				group.clearSelection();
				useraddress.setText("");

				countryChoose.setSelectedIndex(0);
				creditinfotext.setText("");
				customertype.setSelectedIndex(0);
				emallField.setText("");
				pwUser.setText("");

			} else {
				JOptionPane.showMessageDialog(null, "ERRORR");
			}
		}

		if (e.getSource() == backTobutton) {
			LuttonHomePage obj = new LuttonHomePage();
			non_corp_reg.dispose();
		}
	}

	public static void main(String[] args) {
		new NonCorporate();
	}
}
