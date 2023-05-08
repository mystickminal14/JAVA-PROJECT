
package LuttonHotelView;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleRoomDashboard implements ActionListener{
	private JFrame singlebookingDash;
	private JPanel headerdouble;
private   JButton backtobooking;
	
	
	SingleRoomDashboard(){
		singlebookingDash= new JFrame();
		//singlebookingDash.getContentPane().setBackground(new Color(84, 84, 84));
		singlebookingDash.getContentPane().setBackground(Color.darkGray);
		//---------------header-------------------
		headerdouble= new JPanel();
		headerdouble.setBackground(Color.decode("#726F6F"));
	
	        JLabel headerdoublelabel = new JLabel("SINGLE ROOM");
	        headerdoublelabel.setForeground(Color.decode("#FEF3EA"));
	        headerdoublelabel.setFont(new Font("Times new roman",Font.BOLD,80));
	       
	        headerdouble.add(headerdoublelabel);
	        
	   
		headerdouble.setBounds(0,0,1100,110);
		singlebookingDash.add(headerdouble);
		Border border8= BorderFactory.createLineBorder(Color.WHITE,5);
		
	//----------------------------------ANOTHER FRAME PANE;---------------------------------
		JPanel left1= new JPanel();
		//-------------img----------
		ImageIcon left1img= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\singlebed1.png");
		JLabel label1= new JLabel();
		label1.setIcon(left1img);
		label1.setBounds(0,0,320,220);
		left1.add(label1);
		left1.setBounds(50,140,320,220);
		left1.setBackground(Color.black);
		label1.setBorder(border8);
		left1.setLayout(null);
		singlebookingDash.add(left1);
		//---------------------------left down ------------------
		ImageIcon leftdown1= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\leftdown1.png");
		
		JPanel leftdown= new JPanel();
		leftdown.setBounds(50,390,150,250);
		JLabel leftlabel2= new JLabel();
		leftlabel2.setIcon(leftdown1);
		leftlabel2.setBounds(0,0,150,250);
		leftlabel2.setBorder(border8);
		leftdown.setBackground(Color.black);
		leftdown.setBounds(50,390,150,250);
		leftdown.setLayout(null);
		leftdown.add(leftlabel2);
		singlebookingDash.add(leftdown);
		
		//-------------------------left down 2---------------------
		ImageIcon leftdown2img= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\leftdown2.png");
		
		JPanel leftdown2= new JPanel();
		JLabel leftdown2Label= new JLabel();
		leftdown2Label.setIcon(leftdown2img);
		leftdown2Label.setBounds(0,0,150,250);
		leftdown2Label.setBorder(border8);

		leftdown2.setBounds(220,390,150,250);
		leftdown2.add(leftdown2Label);
		leftdown2.setLayout(null);
		leftdown2.setBackground(Color.black);
		singlebookingDash.add(leftdown2);
		
		//----------------price-------------------
		JPanel price= new JPanel();

        JLabel priceLabel = new JLabel("PRICE: 3500");
        priceLabel.setForeground(Color.RED);
        priceLabel.setFont(new Font("Times new roman",Font.BOLD,18));
        price.add(priceLabel);
        price.setBounds(130,650,150,30);
        singlebookingDash.add(price);
        
		//---------------------
		ImageIcon right1img= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\right1.png");
		JPanel right1= new JPanel();
		JLabel right1label= new JLabel();
		right1label.setIcon(right1img);
		right1label.setBounds(0,0,300,340);
		right1label.setBorder(border8);

		right1.setBounds(220,390,300,340);
		right1.add(right1label);
		right1.setLayout(null);
		
		right1.setBounds(750,140,300,340);
		right1.setBackground(Color.black);
		singlebookingDash.add(right1);
		//----------------image8---------------------
		ImageIcon rightdown22= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\rightdown22.png");
		JPanel rightdown= new JPanel();
		JLabel right1label2= new JLabel();
		right1label2.setIcon(rightdown22);
		right1label2.setBounds(0,0,300,200);
		right1label2.setBorder(border8);
		rightdown.add(right1label2);

		rightdown.setBounds(750,500,300,200);
		rightdown.setBackground(Color.black);
		rightdown.setLayout(null);
		singlebookingDash.add(rightdown);
		
		
		
		
		
		
		JPanel centerPanel= new JPanel();
		centerPanel.setBorder(border8);
		JLabel detaILS=new JLabel("---SPECIFICATION---");
		detaILS.setBounds(50,0,220,50);
	     String specify="<html><i>-80 square feet <br><br>-ceiling height is about 9 feet<br><br>-adequate lightining<br>wall sconces and lamps<br><br>-fan and television<br><br>-single bed with comfortable cushion<br><br>-high quality curtains<br><br>-desk and well fursnished closet<br><br>-free use of water and shower<br><br>-window and a small balcony</p></html>";
	        JLabel specificationn= new JLabel(specify);
	        specificationn.setForeground(Color.white);
	        specificationn.setBounds(20,0,300,570);
	        specificationn.setFont(new Font("times new roman",Font.ITALIC,20));
	        centerPanel.add(specificationn);
	        
		detaILS.setForeground(Color.white);
		detaILS.setFont(new Font("times new roman",Font.BOLD,18));
		
		Border border9= BorderFactory.createLineBorder(Color.white,3);
		   backtobooking=new JButton("BOOK NOW!");
		  backtobooking .setBounds(80,525,130,30);
		  backtobooking.setForeground(Color.white);
		  backtobooking.setFont(new Font("times new roman",Font.BOLD,13));
		  //backtobooking.setOpaque(false);
		  
		   
		  backtobooking.setBackground(Color.DARK_GRAY); 
		  backtobooking.setFocusPainted(false);
	      backtobooking.setBorder(border9);
	      backtobooking.addActionListener(this);
		  centerPanel.add(backtobooking);	
		
		centerPanel.add(detaILS);
		
		centerPanel.setBackground(Color.gray);
		//centerPanel.setBackground(new Color(214, 133, 133));
		centerPanel.setLayout(null);
		centerPanel.setBounds(410,140,300,570);
		singlebookingDash.add(centerPanel);
		
		
		//----------------------TO PLACE THE WINDOW IN CENTER-------------------------------------------------------------------------------------------
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	int screenWidth = screenSize.width;
    	int screenHeight = screenSize.height;

    	int windowWidth = 1100; 
    	int windowHeight =780; 

    	int windowX = (screenWidth - windowWidth) / 2;
    	int windowY = (screenHeight - windowHeight) / 2;

    	singlebookingDash.setSize(windowWidth, windowHeight);
    	singlebookingDash.setLocation(windowX, windowY);
    	//--------------------------------------------------------------------------------------------------------------------

		
		singlebookingDash.setResizable(false);
		singlebookingDash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		singlebookingDash.setSize(1100, 780);
		singlebookingDash.setLayout(null); 
		singlebookingDash.setVisible(true); 
    
		
	}

	public void actionPerformed(ActionEvent e) {
		singlebookingDash.dispose();
	    if (e.getSource() == backtobooking) {
	        bookingDashboard reopen = new bookingDashboard();
	       
	    }
	} 

	public static void main(String[] args) {
	    new SingleRoomDashboard();
	}
}
