package LuttonHotelView;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwinRoomDashboard implements ActionListener {
    private JFrame twinRoomSpecification;
    private JButton backtobooking;

    TwinRoomDashboard() {
        twinRoomSpecification = new JFrame();
        twinRoomSpecification.getContentPane().setBackground(Color.DARK_GRAY);

        JPanel twinTile = new JPanel();
        JLabel twintitlelabel = new JLabel("TWIN  ROOM");
        twintitlelabel.setFont(new Font("times new roman", Font.BOLD, 85));
        twinTile.setBackground(Color.decode("#C5D8AD"));
        twintitlelabel.setForeground(Color.black);
        twinTile.add(twintitlelabel);
        twinTile.setBounds(0, 0, 1100, 110);
        twinRoomSpecification.add(twinTile);

        //------------------panels--------------------------
       ImageIcon imgtwin1 = new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\d1.png"); 
        JPanel twinpan1 = new JPanel();
     //  ----JLABEL OF IMAGE---------------\
        Border newBorder= BorderFactory.createLineBorder(Color.white,6);
        JLabel twinimg1 = new JLabel();
        twinimg1.setBounds(0, 0, 210, 165);
        twinimg1.setBorder(newBorder);
        twinimg1.setIcon(imgtwin1);
        twinpan1.add(twinimg1);
        //-------------------------------------
        twinpan1.setLayout(null);
        twinpan1.setBounds(10, 120, 210, 165);
        twinpan1.setBackground(Color.decode("#C5D8AD"));
        twinRoomSpecification.add(twinpan1); 
        
        //------------------panels--------------------------
         ImageIcon imgtwin2 = new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\e6.png"); 
         JPanel twinpan2 = new JPanel();
        //----JLABEL OF IMAGE---------------\
         JLabel twinimg2 = new JLabel();
         twinimg2.setBounds(0, 0, 380, 165);
         twinimg2.setBorder(newBorder);
         twinimg2.setIcon(imgtwin2);
         twinpan2.add(twinimg2);
         //-------------------------------------
         twinpan2.setLayout(null);
         twinpan2.setBounds(230, 120, 380, 165);
         twinpan2.setBackground(Color.decode("#C5D8AD"));
         twinRoomSpecification.add(twinpan2); 
         //------------------panels--------------------------
          ImageIcon imgtwin3= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\a1.png"); 
          JPanel twinpan4 = new JPanel();
         //----JLABEL OF IMAGE---------------\
          //Border newBorder= BorderFacatory.createLineBorder(Color.white,8);
          JLabel twinimg3 = new JLabel();
          twinimg3.setBounds(0, 0, 195, 250);
          twinimg3.setBorder(newBorder);
          twinimg3.setIcon(imgtwin3);
          twinpan4.add(twinimg3);
          //-------------------------------------
          twinpan4.setLayout(null);
          twinpan4.setBounds(620, 120, 195, 250);
          twinpan4.setBackground(Color.decode("#C5D8AD"));
          twinRoomSpecification.add(twinpan4); 
          
        //------------------panels--------------------------
           ImageIcon imgtwin5= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\b1.png"); 
           JPanel twinpan5 = new JPanel();
          //---JLABEL OF IMAGE---------------\
       //    Border newBorder= BorderFacatory.createLineBorder(Color.white,8);
           JLabel twinimg5 = new JLabel();
           twinimg5.setBounds(0, 0, 250, 120);
           twinimg5.setBorder(newBorder);
           twinimg5.setIcon(imgtwin5);
           twinpan5.add(twinimg5);
           //-------------------------------------
           twinpan5.setLayout(null);
           twinpan5.setBounds(825, 120, 250, 120);
           twinpan5.setBackground(Color.decode("#C5D8AD"));
           twinRoomSpecification.add(twinpan5); 
           //---------------------------------------------------------------
           
           
           ImageIcon d5= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\hh.png"); 
           JPanel d5panel = new JPanel();
          //---JLABEL OF IMAGE---------------\
          // Border newBorder= BorderFacatory.createLineBorder(Color.white,8);
           JLabel dgimg5 = new JLabel();
           dgimg5.setBounds(0, 0, 170, 260);
           dgimg5.setBorder(newBorder);
           dgimg5.setIcon(d5);
           d5panel.add(dgimg5);
           //-------------------------------------
           d5panel.setLayout(null);
           d5panel.setBounds(440, 295, 170, 260);
           d5panel.setBackground(Color.decode("#C5D8AD"));
           twinRoomSpecification.add(d5panel); 
          
           
            ImageIcon e5= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\gg.png"); 
           JPanel e5panel = new JPanel();
           
          //----JLABEL OF IMAGE---------------\
           //Border newBorder= BorderFacatory.createLineBorder(Color.white,8);
           JLabel egimg5 = new JLabel();
           egimg5.setBounds(0, 0, 195, 175);
           egimg5.setBorder(newBorder);
           egimg5.setIcon(e5);
           e5panel.add(egimg5);
           //-------------------------------------
           e5panel.setBounds(620, 380, 195, 175);
           e5panel.setLayout(null);
           e5panel.setBackground(Color.decode("#C5D8AD"));
           twinRoomSpecification.add(e5panel); 
           
           //----------------
           
            ImageIcon k5= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\ll.png"); 
           JPanel lowerPanel1 = new JPanel();
           
          //----JLABEL OF IMAGE---------------\
           //Border newBorder= BorderFacatory.createLineBorder(Color.white,8);
           JLabel lowerlabel = new JLabel();
           lowerlabel.setBounds(0, 0, 375, 170);
           lowerlabel.setBorder(newBorder);
           lowerlabel.setIcon(k5);
           lowerPanel1.add(lowerlabel);
           //-------------------------------------
           lowerPanel1.setLayout(null);
           lowerPanel1.setBounds(440, 565, 375, 170);
           lowerPanel1.setBackground(Color.decode("#C5D8AD"));
           twinRoomSpecification.add(lowerPanel1); 



           Border whiteximborder= BorderFactory.createLineBorder(Color.white,6);
        JPanel twinpan3 = new JPanel();
        twinpan3.setBorder(whiteximborder);
        //---label-----------------
        JLabel twinSpecify=new JLabel("---SPECIFICATION---");
        twinSpecify.setBounds(110,0,220,40);
        twinSpecify.setForeground(Color.darkGray);
        twinSpecify.setFont(new Font("times new roman",Font.BOLD,20));
        twinpan3.add(twinSpecify);
        //----------------------------------------------------
        JLabel labelOfSpecification= new JLabel("<html>- Luxurious, comfy, cozy, and having two separate beds <br> - Equipped with clean and comfortable bedding, including sheets, pillows, duvets, and comforters<br>- furniture such as a bedside table or nightstand, a desk or writing table, and chairs or seating for relaxation or work purposes <br>- A luxurious en-suite bathroom<br>-   Features stylish and upscale furniture, such as designer or custom-made pieces<br>- Elegant decor and ambiance<br> - large windows for natural light and may offer views of desirable surroundings, such as cityscapes, ocean views, or scenic landscapes<Br>- A dressing area, or a walk-in closet for added comfort and convenience.</html>");
        labelOfSpecification.setBounds(20,0,400,400);
        labelOfSpecification.setForeground(Color.DARK_GRAY);
        labelOfSpecification.setFont(new Font("CALIBRI",Font.ITALIC,16));
        twinpan3.add(labelOfSpecification);
        //price panel--------------------
 	   JPanel pricePanel= new JPanel();
 	   JLabel priceof= new JLabel("Price:8500");
 	   priceof.setFont(new Font("times new roman",Font.BOLD,22));
 	   pricePanel.add(priceof);
 	   pricePanel.setBackground(Color.gray);
 	   priceof.setForeground(Color.white);
 	   pricePanel.setBounds(280,350,130,50);
 	   pricePanel.setBorder(newBorder);
 	  twinpan3.add(pricePanel);
 	   //-----------------------------------------
 		
 		Border border19= BorderFactory.createLineBorder(Color.white,3);
 		backtobooking=new JButton("BOOK NOW!");
 	    backtobooking .setBounds(120,370,130,40);
 		backtobooking.setForeground(Color.white);
 		backtobooking.setFont(new Font("times new roman",Font.BOLD,15));
 		 
 		  
 		   
 	     backtobooking.setBackground(Color.DARK_GRAY); 
 	     backtobooking.setFocusPainted(false);
 	     backtobooking.setBorder(border19);
 	     backtobooking.addActionListener(this);;
 	    twinpan3.add(backtobooking);
        twinpan3.setBounds(10, 295, 420, 440);
        twinpan3.setBackground(Color.decode("#C5D8AD"));
        twinpan3.setLayout(null);
        twinRoomSpecification.add(twinpan3);
//-------------------------------------------------------------------------------
        
        
        JPanel twinpan10 = new JPanel();
        twinpan10.setBorder(whiteximborder);
        JLabel twindetails=new JLabel("---AMENITIES---");
        twindetails.setBounds(50,0,220,40);
        twindetails.setForeground(Color.DARK_GRAY);
        twindetails.setFont(new Font("times new roman",Font.BOLD,18));
 	    twinpan10.add(twindetails);
 	   //-------------------------------
 	   JLabel amentiteslabel= new JLabel("<html>- Personalized concierge service<br>- Turndown service with chocolates<br> - Complimentary breakfast <BR>- Evening cocktails<br>- Minibar with premium Beverages<br>-  A Nespresso coffee machine <BR>- A wine chiller<br>- A personal safe<BR> - Bluetooth speaker <BR>-  A smart TV with premium channels<BR>-  High-speed Wi-Fi <BR>- In-room spa and massages<br>- steam room, and hot tub<br>- fitness center and gym <br>- Complimentary chauffeu <br>-  A dedicated butler  <br>- Private balcony or terrace<br>- Exclusive lounges, private pools<br>- Private Jacuzzi<BR>- High quality towel and wardrobe</html>");
 	  amentiteslabel.setBounds(5,0,400,480);
 	 amentiteslabel.setForeground(Color.DARK_GRAY);
 	amentiteslabel.setFont(new Font("CALIBRI",Font.ITALIC,16));
       twinpan10.add(amentiteslabel);
 	    //----------------------------------------------------------------
        twinpan10.setBounds(825, 250, 250, 487);
        twinpan10.setBackground(Color.decode("#C8F68D"));
        twinpan10.setLayout(null);
        twinRoomSpecification.add(twinpan10);
        
        
      //----------------------TO PLACE THE WINDOW IN CENTER-------------------------------------------------------------------------------------------
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	int screenWidth = screenSize.width;
    	int screenHeight = screenSize.height;

    	int windowWidth = 1100; 
    	int windowHeight =780; 

    	int windowX = (screenWidth - windowWidth) / 2;
    	int windowY = (screenHeight - windowHeight) / 2;

    	twinRoomSpecification.setSize(windowWidth, windowHeight);
    	twinRoomSpecification.setLocation(windowX, windowY);
    	//--------------------------------------------------------------------------------------------------------------------
        
        //--------------------------------------------//-----------------------------------------
        twinRoomSpecification.setResizable(false);
        twinRoomSpecification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        twinRoomSpecification.setSize(1100, 780);
        twinRoomSpecification.setLayout(null);
        twinRoomSpecification.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
    	twinRoomSpecification.dispose();
    	if(e.getSource()==backtobooking) {
    		bookingDashboard openbookit= new bookingDashboard();
    	}
    }

    public static void main(String[] args) {
        new TwinRoomDashboard();
    }
}

