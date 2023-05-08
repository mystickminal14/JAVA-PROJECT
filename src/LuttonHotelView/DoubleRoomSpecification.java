package LuttonHotelView;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleRoomSpecification implements ActionListener{
	private JFrame doubleBookingDash;
	private JPanel headerdouble;
private   JButton backtobooking;

   DoubleRoomSpecification(){
	   doubleBookingDash = new JFrame();
	   doubleBookingDash.getContentPane().setBackground(Color.gray);
	   JPanel upperTitlePanel= new JPanel();
	   upperTitlePanel.setBackground(Color.DARK_GRAY);
	   //-----------------label------------
	   JLabel doubRoom= new JLabel("DOUBLE  ROOM");
	   doubRoom.setForeground(Color.white);
	   doubRoom.setFont(new Font("times new roman",Font.BOLD,85));
	   upperTitlePanel.add(doubRoom);
	   upperTitlePanel.setBounds(0,0,1100,110);
	   doubleBookingDash.add(upperTitlePanel);
	   
   //-----------------------------PANEL-------------------------------------------------------------------
	   Border imageBorder= BorderFactory.createLineBorder(Color.white,6);
	   ImageIcon imageOne=new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\Imageone.png");
	   JPanel pan1= new JPanel();
	   JLabel imgOneLabel= new JLabel(imageOne);
	   imgOneLabel.setBorder(imageBorder);
	   imgOneLabel.setBounds(0,0,340,250);
	   pan1.setLayout(null);
	   pan1.add(imgOneLabel);
	   pan1.setBackground(Color.DARK_GRAY);
	   
	   pan1.setBounds(10,120,340,250);
	   doubleBookingDash.add(pan1);
	   //----------------------------pan2---------------------------------------------------
	   ImageIcon iamgeTwo=new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\Imagetwo.png");
	   JPanel pan2= new JPanel();
	   JLabel imgTwo= new JLabel(iamgeTwo);
	   imgTwo.setBounds(0,0,240,250);
	   imgTwo.setBorder(imageBorder);
	   pan2.add(imgTwo);
	   pan2.setLayout(null);
	   pan2.setBackground(Color.DARK_GRAY);
	   pan2.setBounds(360,120,240,250);
	   doubleBookingDash.add(pan2);
	   //----------------------------pan3---------------------------------------------------
	   ImageIcon img4= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\img4.png");
	   JPanel pan3= new JPanel();
	   JLabel img4label= new JLabel(img4);
	   img4label.setBounds(0,0,150,250);
	   img4label.setBorder(imageBorder);
	   pan3.add(img4label);
	   pan3.setLayout(null);
	   pan3.setBackground(Color.DARK_GRAY);
	   pan3.setBounds(610,120,150,250);
	   doubleBookingDash.add(pan3);
	   
	   
	   
	   
	   
	   //-------------------------pan2--------------------------------------------
	   JPanel pan4= new JPanel();
	   JLabel detaILSofdouble=new JLabel("---AMENITIES---");
	   detaILSofdouble.setBounds(80,0,220,40);
	   detaILSofdouble.setForeground(Color.white);
	   detaILSofdouble.setFont(new Font("times new roman",Font.BOLD,18));
	    pan4.add(detaILSofdouble);
	    //--------------------------------------
	    Border vv= BorderFactory.createLineBorder(Color.white,3);
	    JLabel am1= new JLabel("<html>- A luggage rack for convenient storage<br>-  A flat-screen TV with cable or satellite<BR> channels for entertainment<br>- a mini-bar or refrigerator containing snacks <br>and beverages<br>- A safe for securing valuables<br>- air conditioning and heating to ensure<br> a comfortable temperature for guests<br>-  A private sauna, steam room<BR>- A complimentary Wi-Fi </html>");
	    am1.setBounds(10,5,400,250);
		am1.setForeground(Color.white);
        am1.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan4.add(am1);

	   pan4.setLayout(null);
	   pan4.setBackground(Color.DARK_GRAY);
	   pan4.setBorder(vv);
	   pan4.setBounds(770,120,305,250);
	   doubleBookingDash.add(pan4);
	   
	   
	   
	   //--------------------pan5-----------------------------
	   
	   JPanel pan5= new JPanel();
	   JLabel doubleSpecify=new JLabel("---SPECIFICATION---");
	   doubleSpecify.setBounds(100,0,220,50);
	   doubleSpecify.setForeground(Color.lightGray);
	   doubleSpecify.setFont(new Font("times new roman",Font.BOLD,22));
	   pan5.add(doubleSpecify);
	 //label to specify
	   JLabel labelOfSpecify= new JLabel("- A full-sized comfortable bed with high-quality linens");
	   labelOfSpecify.setBounds(20,43,400,50);
	   labelOfSpecify.setForeground(Color.white);
	   labelOfSpecify.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecify);
	   
	   //---------------------------
	   JLabel labelOfSpecify2= new JLabel("<html>- Hight quality pillows, and a duvet for a comfortable <br>night's sleep.</html>");
	   labelOfSpecify2.setBounds(20,72,400,50);
	   labelOfSpecify2.setForeground(Color.white);
	   labelOfSpecify2.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecify2);
	   //-----------------------------
	   JLabel labelOfSpecify3= new JLabel("<HTML>- A dresser or wardrobe for storing clothes, a nightstand <BR> or bedside table</HTML>");
	   labelOfSpecify3.setBounds(20,118,400,50);
	   labelOfSpecify3.setForeground(Color.white);
	   labelOfSpecify3.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecify3);
	   
	   //-------------------------
	   JLabel labelOfSpecify4= new JLabel("-  An en-suite bathroom with a toilet, sink");
	   labelOfSpecify4.setBounds(20,155,400,50);
	   labelOfSpecify4.setForeground(Color.white);
	   labelOfSpecify4.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecify4);
	   //-----------------------------
	   //-------------------------
	   JLabel labelOfSpecif5= new JLabel("-  A shower and bathtub.");
	   labelOfSpecif5.setBounds(20,175,400,50);
	   labelOfSpecif5.setForeground(Color.white);
	   labelOfSpecif5.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecif5);
	   //------------------------------
	   
	   JLabel labelOfSpecify6= new JLabel("<html>-  An air conditioning or heating to ensure a comfortable<br> temperature for guests<br>- A great private balcony view <br>- Luxurious and upgraded furniture</html>");
	   labelOfSpecify6.setBounds(20,202,400,100);
	   labelOfSpecify6.setForeground(Color.white);
	   labelOfSpecify6.setFont(new Font("CALIBRI",Font.ITALIC,16));
	   pan5.add(labelOfSpecify6);
	   
	   //price panel--------------------
	   JPanel pricePanel= new JPanel();
	   JLabel priceof= new JLabel("Price:5500");
	   priceof.setFont(new Font("times new roman",Font.BOLD,22));
	   pricePanel.add(priceof);
	   pricePanel.setBackground(Color.gray);
	   priceof.setForeground(Color.white);
	   pricePanel.setBounds(280,250,130,50);
	   pricePanel.setBorder(imageBorder);
	   pan5.add(pricePanel);
	   //-----------------------------------------
		
		Border border19= BorderFactory.createLineBorder(Color.white,3);
		   backtobooking=new JButton("BOOK NOW!");
		  backtobooking .setBounds(120,310,130,30);
		  backtobooking.setForeground(Color.white);
		  backtobooking.setFont(new Font("times new roman",Font.BOLD,13));
		 
		  
		   
		  backtobooking.setBackground(Color.DARK_GRAY); 
		  backtobooking.setFocusPainted(false);
	      backtobooking.setBorder(border19);
	      backtobooking.addActionListener(this);
	      pan5.add(backtobooking);	
	   //-----------------------------------
	   pan5.setBounds(10,380,420,355);
	   pan5.setLayout(null);
	   pan5.setBorder(border19);
	   pan5.setBackground(Color.DARK_GRAY);
	   doubleBookingDash.add(pan5);
	   //-----------------pan6-----------------------------
	   
	   ImageIcon img5= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\image64.png");
	   JPanel pan6= new JPanel();
	   JLabel image5label= new JLabel();
	   image5label.setBorder(imageBorder);
	   image5label.setIcon(img5);
	   image5label.setBounds(0,0,250,355);
	   pan6.add(image5label);
	   pan6.setLayout(null);
	   pan6.setBackground(Color.DARK_GRAY);
	   pan6.setBounds(440,380,250,355);
	   doubleBookingDash.add(pan6);
	   //---------------------------pan7-----------------
	   ImageIcon img6= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\6img.png");
	   JPanel pan7= new JPanel();
	   JLabel imagesixlabel=new JLabel(img6);
	   imagesixlabel.setBorder(imageBorder);
	   imagesixlabel.setBounds(0,0,210,355);
	   pan7.add(imagesixlabel);
	   pan7.setLayout(null);
	   pan7.setBackground(Color.DARK_GRAY);
	   pan7.setBounds(700,380,210,355);
	   doubleBookingDash.add(pan7);
	   //------------------------pan8-----------------
	   JPanel pan8= new JPanel();
	   ImageIcon img8= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\immgu.png");
	 
	   JLabel image8label=new JLabel(img8);
	   image8label.setBorder(imageBorder);
	   image8label.setBounds(0,0,155,355);
	   pan8.add(image8label);
	   pan8.setLayout(null);
	   pan8.setBackground(Color.DARK_GRAY);
	   pan8.setBounds(920,380,155,355);
	   doubleBookingDash.add(pan8);
	   
	   
	   
	      //----------------------TO PLACE THE WINDOW IN CENTER-------------------------------------------------------------------------------------------
	    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    	int screenWidth = screenSize.width;
	    	int screenHeight = screenSize.height;

	    	int windowWidth = 1100; 
	    	int windowHeight = 780; 

	    	int windowX = (screenWidth - windowWidth) / 2;
	    	int windowY = (screenHeight - windowHeight) / 2;

	    	doubleBookingDash.setSize(windowWidth, windowHeight);
	    	doubleBookingDash.setLocation(windowX, windowY);
	    	//--------------------------------------------------------------------------------------------------------------------

	   
	   
	   doubleBookingDash.setResizable(false);
	   doubleBookingDash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   doubleBookingDash.setSize(1100, 780);
	   doubleBookingDash.setLayout(null); 
	   doubleBookingDash.setVisible(true); 
   
		
}

@Override
public void actionPerformed(ActionEvent e) {
	doubleBookingDash.dispose();
	if(e.getSource()==backtobooking) {
		bookingDashboard openit= new bookingDashboard();
	}
	
}
	public static void main(String[]args) {
		new DoubleRoomSpecification();
	}


}
