package LuttonHotelView;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChooseRegisterPage implements ActionListener{
	
	private JFrame chooseWindow;

	private JButton CustomerButton;
	private JButton CorporateButton;
	ChooseRegisterPage(){
		
		chooseWindow=new JFrame();
		chooseWindow.getContentPane().setBackground(Color.DARK_GRAY);
		Border wholeBorder= BorderFactory.createLineBorder(Color.white,4);
		
		JPanel wholePanel= new JPanel();
		wholePanel.setBorder(wholeBorder);
		wholePanel.setBackground(Color.gray);
		//---------------------JLABEL CUSTOMER----------------------------
		JLabel noNcorporate= new JLabel("NON-CORPORATE");
		noNcorporate.setBounds(81,143,100,50);
		noNcorporate.setForeground(Color.white);
		noNcorporate.setFont(new Font("Calibri",Font.BOLD,13));
		wholePanel.add(noNcorporate);
		
		//---------------------JLABEL Corporate----------------------------
				JLabel corporate= new JLabel("CORPORATE");
				corporate.setBounds(285,143,100,50);
				corporate.setForeground(Color.white);
				corporate.setFont(new Font("Calibri",Font.BOLD,13));
				wholePanel.add(corporate);
		
		//--------------------Jbutton for normal  customer---------------------------------
				
		Border btnbor= BorderFactory.createLineBorder(Color.white,3);
		CustomerButton=new JButton("REGISTER");
		CustomerButton.setBounds(85,180,90,30);
		CustomerButton.setBorder(btnbor);
		CustomerButton.setBackground(new Color(0,0,0,0)); 
		CustomerButton.setForeground(Color.YELLOW);
		CustomerButton.setFont(new Font("Calibri",Font.BOLD,15));
		CustomerButton.setOpaque(false);
		CustomerButton.setFocusPainted(false);
		CustomerButton.addActionListener(this);
		wholePanel.add(CustomerButton);
		
		//-------------------------JButton for corporate customer---------------
		CorporateButton=new JButton("REGISTER");
		CorporateButton.setBounds(275,180,90,30);
		CorporateButton.setBackground(new Color(0,0,0,0)); 
		CorporateButton.setBorder(btnbor);
		CorporateButton.setForeground(Color.white);
		CorporateButton.setFont(new Font("Calibri",Font.BOLD,15));
		CorporateButton.setOpaque(false);
		CorporateButton.setFocusPainted(false);
		CorporateButton.addActionListener(this);
		wholePanel.add(CorporateButton);
		
		//-----------------------images for normal customer and corporate-----------------------------
		Border square = BorderFactory.createLineBorder(Color.black, 4);
		ImageIcon custImage = new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\CustomerChoose.png");
		JLabel chooseCustLabel = new JLabel(custImage);
		chooseCustLabel.setBounds(80,50,100,100);
		chooseCustLabel.setBorder(square);
		wholePanel.add(chooseCustLabel);
		
		Border corpsqe = BorderFactory.createLineBorder(Color.black, 4);
		ImageIcon corporateImg = new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\CorporateRegister.png");
		JLabel chooseCorprateLabel = new JLabel(corporateImg);
		chooseCorprateLabel.setBorder(corpsqe);
		chooseCorprateLabel.setBounds(270,50,100,100);
		wholePanel.add(chooseCorprateLabel);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = 450; 
        int windowHeight = 250; 

        int windowX = (screenWidth - windowWidth) / 2;
        int windowY = (screenHeight - windowHeight) / 2;

        chooseWindow.setSize(windowWidth, windowHeight);
        chooseWindow.setLocation(windowX, windowY);

		wholePanel.setBounds(0,0,450,250);
        wholePanel.setLayout(null);
        chooseWindow.add(wholePanel);
	//	chooseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chooseWindow.setUndecorated(true);
		chooseWindow.setLayout(null);
		chooseWindow.setSize(450,250);
		chooseWindow.setResizable(false);
		chooseWindow.setVisible(true);
		
		//CustomerButton.setBorderPainted(false);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == CustomerButton) {
			NonCorporate openCustomerRegisterPage = new NonCorporate();
			chooseWindow.dispose();
		}
		if(e.getSource() == CorporateButton) {
			CorporateRegistrationPage openCorporateRegisterPage = new CorporateRegistrationPage();
			chooseWindow.dispose();
		}	
	}
	public static void main(String[]args) {
		 new ChooseRegisterPage();
	}
	
}
