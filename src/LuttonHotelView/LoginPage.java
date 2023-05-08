package LuttonHotelView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

import HotelLutonConnection.customerLogin;
import HotelLutonConnection.receptioistlogingarne;
import HotelLutonModel.ForeignkeyTester;
import HotelLutonModel.receptionistModel;
import HotelLutonModel.userModCon;
import HotelLutonModel.userregister;

public class LoginPage implements ActionListener {

	private JFrame window2;
	private JButton registerNow;
	JPasswordField passwordField;
	JTextField userField;
	JPasswordField passField;
	private JButton loginButton;
	JCheckBox showPassword;

	public LoginPage() {
		window2 = new JFrame();
		window2.getContentPane().setBackground(Color.decode("#545454"));

		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.decode("#A6A6A6"));
		mainPanel.setBounds(180, 105, 500, 320);

		// ------------LABEL++++++++++++++++++++++++++++++
		JLabel login = new JLabel("LOGIN");
		login.setFont(new Font("times new roman", Font.BOLD, 40));
		login.setBounds(180, 10, 150, 40);
		mainPanel.add(login);

		// --------------------------------------------------
		JLabel username = new JLabel("<html><b>USERNAME   :</b></html>");
		username.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		username.setForeground(Color.black);
		username.setBounds(60, 83, 150, 40);
		mainPanel.add(username);

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++
		Border multiverse = BorderFactory.createLineBorder(Color.white, 3);
		userField = new JTextField();
		userField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		userField.setBounds(200, 85, 220, 40);
		userField.setBorder(multiverse);
        userField.setCaretColor(Color.white);
		userField.setBackground(Color.gray);
		userField.setForeground(Color.black);
		mainPanel.add(userField);
		// ------------------------------

		JLabel passwordLabel = new JLabel("<html><b>PASSWORD  :</b></html>");
		passwordLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		passwordLabel.setForeground(Color.black);
		passwordLabel.setBounds(60, 140, 150, 40);
		mainPanel.add(passwordLabel);

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++

		passField = new JPasswordField();
		passField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		passField.setBounds(200, 140, 220, 40);
		passField.setCaretColor(Color.white);
		passField.setBorder(multiverse);

		passField.setCaretColor(Color.red);
		passField.setBackground(Color.gray);
		passField.setForeground(Color.black);
		mainPanel.add(passField);
		mainPanel.setLayout(null);
		window2.add(mainPanel);
		mainPanel.setLayout(null);

		// -----------see password----------------------------------
		JCheckBox showPassword = new JCheckBox();
		showPassword.setText("Show Password");
		showPassword.setFocusable(false);
		showPassword.setFont(new Font("consolas", Font.BOLD, 13));
		showPassword.setForeground(Color.BLACK);
		showPassword.setOpaque(false);
		showPassword.setBounds(300, 180, 200, 30);
		showPassword.addActionListener(ae -> {
			JCheckBox c = (JCheckBox) ae.getSource();
			passField.setEchoChar(c.isSelected() ? '\u0000' : (char) UIManager.get("PasswordField.echoChar"));
		});

		mainPanel.add(showPassword);

		// -----------------------LOGIN
		// BUTTON-------------------------------------------------

		loginButton = new JButton("LOGIN");
		loginButton.setBounds(60, 215, 360, 30);
		loginButton.setBackground(Color.black);
		loginButton.setForeground(Color.white);
		loginButton.setFocusPainted(false);
		loginButton.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		loginButton.addActionListener(this);
		mainPanel.add(loginButton);

		// ------------------------------DONT
		// HAVE--------------------------------------------
		JLabel dontHave = new JLabel("Don't have an account?");
		dontHave.setBounds(180, 245, 300, 30);
		dontHave.setForeground(Color.black);
		dontHave.setFont(new Font("calibri", Font.BOLD, 15));
		mainPanel.add(dontHave);

		registerNow = new JButton("<html><u>REGISTER NOW!</u></html>");
		registerNow.setBounds(302, 242, 150, 30);
		registerNow.setForeground(Color.decode("#5C1072"));
		registerNow.setFont(new Font("calibri", Font.BOLD, 14));
		registerNow.setOpaque(false);
		registerNow.setBackground(new Color(0, 0, 0, 0));
		registerNow.setFocusPainted(false);
		registerNow.setBorderPainted(false);
		registerNow.addActionListener(this);
		mainPanel.add(registerNow);

		window2.add(mainPanel);
//-------------------------------------------------------------------------------------------------------------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int windowWidth = 1000;
		int windowHeight = 600;

		int windowX = (screenWidth - windowWidth) / 2;
		int windowY = (screenHeight - windowHeight) / 2;

		window2.setSize(windowWidth, windowHeight);
		window2.setLocation(windowX, windowY);
//-------------------------------------------------------------------------------------------------------
		window2.setResizable(false);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window2.setSize(850, 600);
		window2.setLayout(null);
		window2.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginButton) {

			/*
			 * String emailAddressUser = userField.getText();
			 * 
			 * String userPass = passField.getText();
			 */

			String receptionistEmail = userField.getText();

			String receptionistPassword = passField.getText();

			userregister loginCust = new userregister();
			userModCon pleaselog = new userModCon();
			loginCust.setEmailAddressUser(userField.getText());
			loginCust.setUserPass(passField.getText());
			pleaselog.setUser(loginCust);
			pleaselog.min();
			loginCust = pleaselog.getUser();
			 if(userField.getText().length()==0 && passField.getText().length()==0) {
				 UIManager.put("OptionPane.messageForeground", Color.black);
					UIManager.put("OptionPane.background", Color.darkGray);
					UIManager.put("Panel.background", Color.yellow);

	                JOptionPane.showMessageDialog(null,"Please enter your Email and Password","INVALID",JOptionPane.ERROR_MESSAGE);
	            }
	            else if(userField.getText().length()==0){
	            	UIManager.put("OptionPane.messageForeground", Color.black);
					UIManager.put("OptionPane.background", Color.darkGray);
					UIManager.put("Panel.background", Color.yellow);

	                JOptionPane.showMessageDialog(null,"Please enter your login");
	            }
	            else if (userField.getText().length()==0) {

	                JOptionPane.showMessageDialog(null,"please enter your Password");
	            }

			receptionistModel relogcepio = new receptionistModel(receptionistEmail, receptionistPassword);

			// customerLogin plzlogin= new customerLogin();

			receptioistlogingarne logRecepionist = new receptioistlogingarne();

			boolean resultofrecep = logRecepionist.save(relogcepio);

			if (loginCust.getGuestId() >= 1) {
				ForeignkeyTester.userid = loginCust.getGuestId();

				userField.setText("");

				passField.setText("");

				UIManager.put("OptionPane.messageForeground", Color.white);

				UIManager.put("OptionPane.background", Color.darkGray);

				UIManager.put("Panel.background", Color.gray);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

				JOptionPane.showMessageDialog(null, "Successfull Login");

				CustomerDashboard opemDashboard = new CustomerDashboard();
				window2.dispose();

			}

			else if (resultofrecep == true) {

				userField.setText("");
				passField.setText("");

				UIManager.put("OptionPane.messageForeground", Color.white);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.gray);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

				JOptionPane.showMessageDialog(null, "Successfull Login");

				ManagerDashboard opemDashboard = new ManagerDashboard();
				window2.dispose();
			} else {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);

				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

				JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);

			}

		}
		if (e.getSource() == registerNow) {
			ChooseRegisterPage specify = new ChooseRegisterPage();
			window2.dispose();

		}
	}

	public static void main(String[] args) {
		new LoginPage();

	}
}
