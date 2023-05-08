package LuttonHotelView;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LuttonHomePage implements ActionListener {
    JFrame window;
     JButton loginBtn;
     JButton registerBtn;
    public LuttonHomePage() {
    	//----------------panel1 --------------------
    	JPanel firstPanel= new JPanel();
        window = new JFrame();
        JLabel title = new JLabel("L  U  T  T  O  N");
        title.setFont(new Font("Times new roman",Font.BOLD,70));
        title.setBounds(300,50,600,50);
        title.setForeground(Color.white);
        window.add(title);
      
   //-------------------second label--------------------------------
        
        //----------label---------------------------------------------------------------------------------------------
        JLabel dash = new JLabel("----------------------------------");
        dash.setFont(new Font("Times new roman",Font.PLAIN,40));
        dash.setBounds(300,110,600,50);
        dash.setForeground(Color.white);
        window.add(dash);
        
        JLabel welcome = new JLabel("E x p é r i m e n t e z  l e ");
        welcome.setFont(new Font("Georgia",Font.BOLD,25));
        welcome.setBounds(385,140,600,60);
        welcome.setForeground(Color.white);
        window.add(welcome);
        
      
        JLabel here = new JLabel("c o n f o r t   e t   l e   l u x e ");
        here.setFont(new Font("Georgia",Font.BOLD,25));
        here.setBounds(370,170,600,60);
        here.setForeground(Color.white);
        window.add(here);
        
        //--------------------join us label------------------------/
    JLabel letsBegin= new JLabel("JOIN US");
    letsBegin.setFont(new Font("Georgia",Font.BOLD,25));
    letsBegin.setBounds(465,280,600,50);
    letsBegin.setForeground(Color.white);
    window.add( letsBegin);
    
    
   
    
    JLabel contact= new JLabel("-----CONTACT US-----");
    contact.setBounds(830,500,400,50);
    contact.setForeground(Color.white);
    contact.setFont(new Font("Georgia",Font.BOLD,15));
    window.add(contact);
    JLabel EmailidHotel= new JLabel("Lutton20Hotel@gmail.com");
    EmailidHotel.setForeground(Color.white);
    EmailidHotel.setFont(new Font("Georgia",Font.BOLD,12));
    EmailidHotel.setBounds(830,520,200,50);
    window.add(EmailidHotel);
    
    JLabel contactNO= new JLabel("9564944944");
    contactNO.setForeground(Color.white);
    contactNO.setFont(new Font("Georgia",Font.BOLD,14));
    contactNO.setBounds(865,537,100,50);
    window.add(contactNO);

    JLabel AddressofHotel= new JLabel("London,UK");
    AddressofHotel.setForeground(Color.white);
    AddressofHotel.setFont(new Font("Georgia",Font.BOLD,15));
    AddressofHotel.setBounds(867,557,100,50);
    window.add(AddressofHotel);
    
    //-----------------------button--------------------
    loginBtn= new JButton("Login");
    loginBtn.setBounds(390,350,100,25);
    loginBtn.setForeground(Color.white);
    loginBtn.setFont(new Font("Georgia",Font.BOLD,20));
    loginBtn.setOpaque(false);
    loginBtn.setFocusPainted(false);
    loginBtn.setBorderPainted(false);
    loginBtn.setBackground(Color.black);
    loginBtn.addActionListener(this);
    window.add(loginBtn);
    
    //-------------register-----------------------------------------
    registerBtn= new JButton("Register");
    registerBtn.setBounds(510,350,140,25);
    registerBtn.setForeground(Color.white);
    registerBtn.setFont(new Font("Georgia",Font.BOLD,20));
    registerBtn.setOpaque(false);
    registerBtn.setBackground(Color.black);
    registerBtn.addActionListener(this);
   registerBtn.setFocusPainted(false);
   registerBtn.setBorderPainted(false);
    window.add(registerBtn);
    

   
        window.add(firstPanel);  
        //--------------image label
ImageIcon image= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\Bienvenue.png");

JLabel imageLabel= new JLabel();
imageLabel.setIcon(image);

imageLabel.setBounds(0,0,1080,720);
firstPanel.setBounds(0,0,1080,720);
firstPanel.add(imageLabel);


//----------------------TO PLACE THE WINDOW IN CENTER-------------------------------------------------------------------------------------------
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
int screenWidth = screenSize.width;
int screenHeight = screenSize.height;

int windowWidth = 1080; 
int windowHeight = 720; 

int windowX = (screenWidth - windowWidth) / 2;
int windowY = (screenHeight - windowHeight) / 2;

window.setSize(windowWidth, windowHeight);
window.setLocation(windowX, windowY);

//--------------------------------------------------------------------------------------------------------------------


        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1080, 720);
        window.setLayout(null);
      
        window.setVisible(true);
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginBtn) {
			LoginPage openHomePage = new LoginPage();
			window.dispose();
		}else if(e.getSource() == registerBtn) {
			ChooseRegisterPage openChooseRegisterPage = new ChooseRegisterPage();
			window.dispose();
		}
		
	}

    public static void main(String[] args) {
        new LuttonHomePage();
    }

	
}