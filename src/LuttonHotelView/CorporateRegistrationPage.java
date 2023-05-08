package LuttonHotelView;

import javax.swing.*;
import javax.swing.border.Border;
import com.toedter.calendar.JDateChooser;

import HotelLutonConnection.CorporateConn;
import HotelLutonConnection.CustomerRegistrationConnector;
import HotelLutonConnection.registerInuser;
import HotelLutonModel.coprorateModel;
import HotelLutonModel.userregister;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CorporateRegistrationPage implements ActionListener {
	private JFrame corporateWindow;
	private JPanel corporateAccPanel;
	private JLabel corporateAccount;
	private JButton corpRegister;
	private JButton backTobutton;
	private JTextField nameField;
	JTextField compADFIELD;
	private JTextField budgetfield;
	JTextField sizefield;
	JTextField paymentField;
	JTextField emailField;
	JPasswordField passlabelfield;
	JPasswordField rePasswordcodedield;
	private JDateChooser establishmentDate;

	CorporateRegistrationPage() {
		corporateWindow = new JFrame();
		corporateWindow.getContentPane().setBackground(Color.black);
		// -----------------------------jlabel---------------------------------------------------

		corporateAccPanel = new JPanel();
		corporateAccount = new JLabel("CORPORATE  REGISTRATION");
		corporateAccount.setForeground(Color.white);
		corporateAccount.setBounds(15, 20, 700, 40);
		corporateAccount.setFont(new Font("Times new roman", Font.BOLD, 45));
		corporateAccPanel.add(corporateAccount);
		corporateAccPanel.setBounds(0, 0, 1080, 80);
		corporateAccPanel.setLayout(null);
		corporateAccPanel.setBackground(Color.gray);
		;
		corporateWindow.add(corporateAccPanel);

		// ----------------------------lower leftside image
		// panel--------------------------------------
		ImageIcon corp = new ImageIcon(
				"..\\OnlineHotelBooking\\src\\LuttonHotelView\\corpreg.png");
		Border bborderofimag = BorderFactory.createLineBorder(Color.WHITE, 8);
//ImageIcon corp= new ImageIcon("C:\\Users\\user\\eclipse-workspace\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\corpreg1..png");
		JPanel leftSidePanel = new JPanel();
		JLabel Luton_title = new JLabel("<html>L<br>U<br>T<br>T<br>O<br>N");
		Luton_title.setFont(new Font("Times new roman", Font.BOLD, 75));
		Luton_title.setBounds(30, 20, 450, 600);
		Luton_title.setForeground(Color.white);
		leftSidePanel.add(Luton_title);
		JLabel corplabel = new JLabel();
		corplabel.setBorder(bborderofimag);
		corplabel.setBounds(0, 0, 465, 675);
		corplabel.setIcon(corp);
		leftSidePanel.setBounds(5, 85, 100, 675);
		leftSidePanel.setLayout(null);
		leftSidePanel.setBackground(Color.gray);
		leftSidePanel.add(corplabel);
		corporateWindow.add(leftSidePanel);
		// ---------------------------lower right side
		// panel------------------------------------
		JPanel rightSidePanel = new JPanel();
		rightSidePanel.setBorder(bborderofimag);
		/*----------------------------------------------------------------------------------------
		|---------------------------------------LABELING------------------------------------------|
		|---------------------------------------------------------------------------------------*/
		JLabel registerH = new JLabel("R       E        G        I        S        T        E        R");
		registerH.setBounds(120, 20, 650, 80);
		registerH.setFont(new Font("times new roman", Font.BOLD, 20));
		registerH.setForeground(Color.black);
		rightSidePanel.add(registerH);
		// **************************company name with text
		// field----------------------------------------
		JLabel Company_name = new JLabel("Company Name  :");
		Company_name.setForeground(Color.white);
		Company_name.setFont(new Font("times new roman", Font.BOLD, 16));
		Company_name.setBounds(50, 90, 150, 50);
		rightSidePanel.add(Company_name);

		nameField = new JTextField();
		nameField.setBounds(190, 100, 340, 30);
		nameField.setBackground(Color.lightGray);
		nameField.setCaretColor(Color.red);
		nameField.setForeground(Color.BLACK);
		nameField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(nameField);

		// **************************establishment
		// Date************************************

		JLabel EstDate = new JLabel("Establishment Date  :");
		EstDate.setForeground(Color.white);
		EstDate.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		EstDate.setBounds(25, 138, 150, 50);
		rightSidePanel.add(EstDate);

		// ----------------------------------------
		/*
		 * String [] min= {"min","kk"}; EstDateField= new JComboBox(min);
		 * EstDateField.setBounds(190,150,340,30);
		 * EstDateField.setBackground(Color.lightGray);
		 * EstDateField.setForeground(Color.black); EstDateField.setFont(new
		 * Font("TIMES NEW ROMAN",Font.BOLD,16)); rightSidePanel.add(EstDateField);
		 */
		establishmentDate = new JDateChooser();
		establishmentDate.setBounds(190, 150, 340, 30);
		establishmentDate.setBackground(Color.gray);
		establishmentDate.setForeground(Color.black);

		rightSidePanel.add(establishmentDate);
		// ******************************company
		// budget******************************************

		JLabel compAD = new JLabel("Address   :");
		compAD.setForeground(Color.white);
		compAD.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		compAD.setBounds(98, 185, 150, 50);
		rightSidePanel.add(compAD);

		compADFIELD = new JTextField();
		compADFIELD.setBounds(190, 195, 340, 30);
		compADFIELD.setBackground(Color.lightGray);
		compADFIELD.setCaretColor(Color.red);
		compADFIELD.setForeground(Color.black);
		compADFIELD.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(compADFIELD);

		// -------------------budget----------------------------------------
		JLabel budget = new JLabel("Budget   :");
		budget.setForeground(Color.white);
		budget.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		budget.setBounds(103, 230, 150, 50);
		rightSidePanel.add(budget);

		budgetfield = new JTextField();
		budgetfield.setBounds(190, 242, 340, 30);
		budgetfield.setBackground(Color.lightGray);
		budgetfield.setCaretColor(Color.red);
		budgetfield.setForeground(Color.black);
		budgetfield.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(budgetfield);
		// -------------------------------------------------------------
		// Company size

		JLabel size = new JLabel("Company size  :");
		size.setForeground(Color.white);
		size.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		size.setBounds(60, 275, 150, 50);
		rightSidePanel.add(size);

		sizefield = new JTextField();
		sizefield.setBounds(190, 285, 340, 30);
		sizefield.setBackground(Color.LIGHT_GRAY);
		sizefield.setCaretColor(Color.red);
		sizefield.setForeground(Color.black);
		sizefield.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(sizefield);

		// --------------------------------------------------------------
		// -------payment

		JLabel payment = new JLabel("Payment Terms  :");
		payment.setForeground(Color.white);
		payment.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		payment.setBounds(48, 320, 160, 50);
		rightSidePanel.add(payment);

		paymentField = new JTextField();
		paymentField.setBounds(190, 330, 340, 30);
		paymentField.setBackground(Color.LIGHT_GRAY);
		paymentField.setCaretColor(Color.red);
		paymentField.setForeground(Color.black);
		paymentField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(paymentField);
		// --------------username--------------------------------------------------------------------------------------------------

		// ****************************email----------------------------------------------------
		JLabel emailcom = new JLabel("Email-ID   :");
		emailcom.setForeground(Color.white);
		emailcom.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		emailcom.setBounds(90, 365, 150, 50);
		rightSidePanel.add(emailcom);

		emailField = new JTextField();
		emailField.setBounds(190, 375, 340, 30);
		emailField.setBackground(Color.LIGHT_GRAY);
		emailField.setCaretColor(Color.red);
		emailField.setForeground(Color.black);
		emailField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rightSidePanel.add(emailField);
		// ************************password-------------------------------------------------------
		JLabel passlabel = new JLabel("Passcode   :");
		passlabel.setBounds(85, 418, 150, 30);
		passlabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		passlabel.setForeground(Color.white);
		rightSidePanel.add(passlabel);

		passlabelfield = new JPasswordField();
		passlabelfield.setBounds(190, 420, 340, 30);
		passlabelfield.setCaretColor(Color.yellow);
		passlabelfield.setForeground(Color.black);
		passlabelfield.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		passlabelfield.setBackground(Color.LIGHT_GRAY);
		rightSidePanel.add(passlabelfield);

//---------------------------------------------re password---------------------------------
		JLabel rePasswordcode = new JLabel("Re-Passcode :");
		rePasswordcode.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rePasswordcode.setBounds(60, 460, 150, 30);
		rePasswordcode.setForeground(Color.white);
		rightSidePanel.add(rePasswordcode);

		rePasswordcodedield = new JPasswordField();
		rePasswordcodedield.setBounds(190, 464, 340, 30);
		rePasswordcodedield.setCaretColor(Color.yellow);
		rePasswordcodedield.setForeground(Color.black);
		rePasswordcodedield.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
		rePasswordcodedield.setBackground(Color.lightGray);
		rightSidePanel.add(rePasswordcodedield);

		// ********button***********----------------------------------------button------------------------
		Border btnbordrr = BorderFactory.createLineBorder(Color.black, 3);

		backTobutton = new JButton("Back to LOGIN");
		backTobutton.setBounds(86, 530, 180, 35);
		backTobutton.setForeground(Color.white);
		backTobutton.setFont(new Font("Times new roman", Font.BOLD, 18));
		backTobutton.setBackground(Color.GRAY);
		backTobutton.setFocusPainted(false);
		backTobutton.setBorder(btnbordrr);
		// backTobutton.setBorderPainted(false);
		backTobutton.addActionListener(this);
		rightSidePanel.add(backTobutton);

		corpRegister = new JButton("REGISTER");
		corpRegister.setBackground(Color.GRAY);
		corpRegister.setForeground(Color.white);
		corpRegister.setFocusPainted(false);
		corpRegister.setBorder(btnbordrr);
		/// corpRegister.setBorderPainted(false);
		corpRegister.setFont(new Font("Times new roman", Font.BOLD, 18));
		corpRegister.addActionListener(this);
		corpRegister.setBounds(320, 530, 180, 35);
		rightSidePanel.add(corpRegister);

		rightSidePanel.setLayout(null);
		rightSidePanel.setBounds(100, 85, 585, 675);
		rightSidePanel.setBackground(Color.decode("#726F6F"));
		;
		corporateWindow.add(rightSidePanel);

		// ----------------------TO PLACE THE WINDOW IN
		// CENTER-------------------------------------------------------------------------------------------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int windowWidth = 1080;
		int windowHeight = 850;

		int windowX = (screenWidth - windowWidth) / 2;
		int windowY = (screenHeight - windowHeight) / 2;

		corporateWindow.setSize(windowWidth, windowHeight);
		corporateWindow.setLocation(windowX, windowY);
		// --------------------------------------------------------------------------------------------------------------------

		corporateWindow.add(rightSidePanel);
		corporateWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		corporateWindow.setLayout(null);
		corporateWindow.setResizable(false);
		corporateWindow.setSize(700, 800);
		corporateWindow.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == corpRegister) {
			String emailid = emailField.getText();
			String password = passlabelfield.getText();
			if (!emailid.matches(".+@.+\\..+")) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
			    JOptionPane.showMessageDialog(null, "A valid email address is required!!");
			    return;
			}

			if (password.length() < 8) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
			    JOptionPane.showMessageDialog(null, "A minimum of 8 characters must be included in the password!!");
			    return;
			}

			int corporateId = 0;
			String companyname = nameField.getText();
			String date = ((JTextField) establishmentDate.getDateEditor().getUiComponent()).getText();
			String address = compADFIELD.getText();
			int budget = Integer.parseInt(budgetfield.getText());
			int payterms = Integer.parseInt(paymentField.getText());
			int companySize = Integer.parseInt(sizefield.getText());
          
			int uid=0;
			String emailAddressUser = emailField.getText();
			String userpass = passlabelfield.getText();
			
			if (!emailAddressUser.matches(".+@.+\\..+")) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
			    JOptionPane.showMessageDialog(null, "A valid email address is required!!");
			    return;
			}

			if (userpass.length() < 8) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));
			    JOptionPane.showMessageDialog(null, "A minimum of 8 characters must be included in the password!!");
			    return;
			}
			userregister s2 = new userregister(uid,emailAddressUser, userpass);
			coprorateModel companyCorp = new coprorateModel(corporateId, companyname, date, address, budget, payterms,
					companySize, emailid, password);

			registerInuser std2 = new registerInuser();
			CorporateConn con2 = new CorporateConn();

			boolean result2 = std2.save(s2);
			boolean result3 = con2.save(companyCorp);

			if (result3 && result2) {
				UIManager.put("OptionPane.messageForeground", Color.white);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.gray);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

				JOptionPane.showMessageDialog(null, "Congratulations!! You are officially part of Hotel LUTTON",
						"title", JOptionPane.INFORMATION_MESSAGE);
				int resultop = JOptionPane.showOptionDialog(null, "Click OK to open LoginPage", "Message",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				if (resultop == JOptionPane.OK_OPTION) {
					LoginPage newFrame = new LoginPage();
					corporateWindow.dispose();
				} else {
					LuttonHomePage piper = new LuttonHomePage();
				}

				nameField.setText("");
				establishmentDate.setToolTipText("");
				compADFIELD.setText("");
				budgetfield.setText("");
				paymentField.setText("");
				sizefield.setText("");
				emailField.setText("");
				passlabelfield.setText("");

			} else {

			}
		}

		if (e.getSource() == backTobutton) {
			LuttonHomePage obj = new LuttonHomePage();
			corporateWindow.dispose();
		}
	}

	public static void main(String[] args) {
		new CorporateRegistrationPage();
	}
}