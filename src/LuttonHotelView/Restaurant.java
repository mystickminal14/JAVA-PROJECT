package LuttonHotelView;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restaurant implements ActionListener{
	private JFrame restaurantFrame;
	private JPanel panelofRest;
	JCheckBox one;
	JCheckBox two;
	JCheckBox three;
	JCheckBox four;
	JCheckBox five;
	JCheckBox six;
	JCheckBox seven;
	JCheckBox eight;
	JCheckBox nine;
	JCheckBox ten;
	JButton homebtnim;
	JButton generate;
	JButton orderit;
	 JTextField totalcal;
	
	CardLayout card;
 Restaurant(){
	 
	 restaurantFrame= new JFrame();
	 restaurantFrame.getContentPane().setBackground(Color.decode("#737373"));
	 Border necessaryWhiteBorder=BorderFactory.createLineBorder(Color.white,4);
	 //---------------------------------------------------------------------
	 JLabel titleofRestaurant= new JLabel("The Palate Pleaser: A Dining Adventure");
	 titleofRestaurant.setForeground(Color.black);
	 titleofRestaurant.setBounds(30,20,700,40);
	 titleofRestaurant.setFont(new Font("Times New Roman",Font.PLAIN,30));
	 restaurantFrame.add(titleofRestaurant);
	 
	 //--------------------------------------------------------------------------------------
	 JPanel homeButton= new JPanel();
	 ImageIcon homeButn= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\homeButton.png");
	 JLabel homeLab= new JLabel();
	 homeLab.setBounds(0,0,45,40);
	 homeLab.setIcon(homeButn);
	  homebtnim= new JButton();
	  homebtnim.addActionListener(this);
	 homebtnim.setBounds(0,0,45,40);
	 homebtnim.setLayout(null);
	 homebtnim.add(homeLab);
	 homeButton.add(homebtnim);
	 homeButton.setLayout(null);
	 homeButton.setBounds(980,30,45,40);
	 homeButton.setBackground(Color.black);
	 restaurantFrame.add(homeButton);
	 ///////////////////////////////////////////////
	
	 //-----------------------------------------------------------------------------------------------
	 JPanel logoutbtn= new JPanel();
	 ImageIcon outlog= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\LOGOUUT.png");
	 JLabel logoutbtnlabl= new JLabel();
	 logoutbtnlabl.setBounds(0,0,45,40);
	 logoutbtnlabl.setIcon(outlog);
	  JButton loghomebtnim= new JButton();
	  loghomebtnim.setBounds(0,0,45,40);
	  loghomebtnim.setLayout(null);
	  loghomebtnim.add(logoutbtnlabl);
	  logoutbtn.add(loghomebtnim);
	  logoutbtn.setLayout(null);
	  logoutbtn.setBounds(1030,30,45,40);
	  logoutbtn.setBackground(Color.black);
	 restaurantFrame.add(logoutbtn);
	 //////////////////////////////////////
	 panelofRest= new JPanel();

	 panelofRest.setBackground(Color.decode("#363B3B"));
	 JLabel titleoofLutton= new JLabel("L  U  T  T  O  N");
	 titleoofLutton.setBounds(60,5,450,80);
	 titleoofLutton.setForeground(Color.white);
	 titleoofLutton.setFont(new Font("times new roman",Font.BOLD,60));
	 panelofRest.add(titleoofLutton);
	 ///////////////////////////////////////////////////
	 
	 JPanel subsubpanel= new JPanel();
	 subsubpanel.setBorder(necessaryWhiteBorder);
	 subsubpanel.setBounds(40,80,430,200);
	 subsubpanel.setBackground(Color.gray);
	 JLabel  bookingId= new JLabel("Booking ID    :");
	 bookingId.setBounds(60,20,200,40);
	 bookingId.setFont(new Font("times new roman",Font.BOLD,20));
	 bookingId.setForeground(Color.darkGray);
	 subsubpanel.add(bookingId);
	 
	 JTextField bookinghorp= new JTextField();
	 bookinghorp.setBounds(200,25,150,30);
	 bookinghorp.setFont(new Font("times new roman",Font.BOLD,18));
	 bookinghorp.setForeground(Color.black);
	 bookinghorp.setBackground(Color.lightGray);
	 subsubpanel.add(bookinghorp);
	 
	 
	 JLabel  calctotal= new JLabel("Total         :");
	 calctotal.setBounds(87,70,200,40);
	 calctotal.setFont(new Font("times new roman",Font.BOLD,20));
	 calctotal.setForeground(Color.darkGray);
	 subsubpanel.add(calctotal);
	 
	  totalcal= new JTextField(10);
	  totalcal.setEditable(false);
	  totalcal.addActionListener(this);
	  
	 totalcal.setBounds(200,73,150,30);
	 totalcal.setFont(new Font("times new roman",Font.BOLD,18));
	 totalcal.setForeground(Color.black);
	 totalcal.setBackground(Color.lightGray);
	 
	 generate= new JButton("GENERATE");
	 generate.setBounds(80,130,120,35);
	 generate.setEnabled(false);
	 generate.addActionListener(this);
	 subsubpanel.add(generate);
	
	 orderit= new JButton("ORDER");
	 orderit.addActionListener(this);

	 orderit.setBounds(230,130,120,35);
	 subsubpanel.add(orderit);
	 subsubpanel.add(totalcal);
	 subsubpanel.setLayout(null);
	 panelofRest.add(subsubpanel);
	 //--------------------------------------------
	 JPanel newmpgPan= new JPanel();
	 

	 ImageIcon firsrnrest= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\firstnrest.png");
	 newmpgPan.setBackground(Color.black);
	 JLabel imgofrest123= new JLabel();
	 imgofrest123.setIcon(firsrnrest);
	 imgofrest123.setBorder(necessaryWhiteBorder);
	 imgofrest123.setBounds(0,0,345,280);
	 newmpgPan.add(imgofrest123);
	 newmpgPan.setBounds(750,10,345,280);
	 newmpgPan.setLayout(null);
	 panelofRest.add(newmpgPan);
	 //------------------------------------------------------------
	 card= new CardLayout();
	 JPanel panod= new JPanel();
	 panod.setLayout(card);
	 JPanel anotherSubPanel= new JPanel();
	 ImageIcon checkmenuImg= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\menu.png");
	 JLabel menu= new JLabel();
	 menu.setIcon(checkmenuImg);
	 menu.setBorder(necessaryWhiteBorder);
	 menu.setBounds(0,0,220,280);
	 anotherSubPanel.add(menu);
	 anotherSubPanel.setLayout(null);
	 anotherSubPanel.setBounds(0,0,220,280);
	 anotherSubPanel.setBorder(necessaryWhiteBorder);
	JPanel nexthh= new JPanel();
	nexthh.setBackground(Color.yellow);
	nexthh.setBounds(0,0,220,280);

	 panod.add(anotherSubPanel,"pan1");
	 panod.add(nexthh,"pan2");
	 panod.setBounds(510,10,220,280);
	 panelofRest.add(panod);
	 panelofRest.setLayout(null);
	 panelofRest.setBounds(0,80,1120,300);
	 restaurantFrame.add(panelofRest);
	 
	 JPanel menuBookItems= new JPanel();
	 menuBookItems.setBorder(necessaryWhiteBorder);
	
	 
	 //-----------------------------------------------
	 ImageIcon burgerim= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\burger.png");
	 JPanel burger= new JPanel();
	 JLabel burgerlabel= new JLabel();
	 burgerlabel.setIcon(burgerim);
	 burgerlabel.setBounds(0,0,120,100);
	 burger.add(burgerlabel);
	 burger.setBackground(Color.white);
	 burger.setLayout(null);
	 burger.setBounds(30,35,120,100);
	 menuBookItems.add(burger);
	 one= new JCheckBox();
	 one.setBounds(75,130,40,30);
	 one.setBackground(Color.gray);
	 menuBookItems.add(one);
	 
	 //--------------------------------------------------------
	 ImageIcon pizzasimg= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\pizzas.png");
	 JPanel pizza= new JPanel();
	 JLabel pizzalabel= new JLabel();
	 pizzalabel.setIcon(pizzasimg);
	 pizzalabel.setBounds(0,0,120,100);
	 pizza.add(pizzalabel);
	 pizza.setBackground(Color.white);
	 pizza.setLayout(null);
	 pizza.setBounds(180,35,120,100);
	
	 menuBookItems.add(pizza);
	 two= new JCheckBox();
	 two.setBounds(225,130,40,30);
	 two.setBackground(Color.gray);
	 two.addActionListener(this);
		   

	 menuBookItems.add(two);
	 
	 ImageIcon hotd= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\hotdog.png");
	 JPanel hotDog= new JPanel();
	 JLabel hotlabel= new JLabel();
	 hotlabel.setIcon(hotd);
	 hotlabel.setBounds(0,0,120,100);
	 hotDog.add(hotlabel);
	 hotDog.setBackground(Color.white);
	 hotDog.setLayout(null);
	 hotDog.setBounds(320,35,120,100);
	 menuBookItems.add(hotDog);
	 three= new JCheckBox();
	 three.setBounds(355,130,40,30);
	 three.setBackground(Color.gray);
	 menuBookItems.add(three);
	 
	 ImageIcon noodles= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\noodles.png");
	 JPanel noodle= new JPanel();
	 JLabel nod= new JLabel();
	 nod.setIcon(noodles);
	 nod.setBounds(0,0,120,100);
	 noodle.add(nod);
	 noodle.setBackground(Color.white);
	 noodle.setLayout(null);
	 noodle.setBounds(460,35,120,100);
	 menuBookItems.add(noodle);
	 four= new JCheckBox();
	 four.setBounds(510,130,40,30);
	 four.setBackground(Color.gray);
	 menuBookItems.add(four);
	 ImageIcon popcorn= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\pop.png");
	 JPanel pop= new JPanel();
	 JLabel popco= new JLabel();
	 popco.setIcon(popcorn);
	 popco.setBounds(0,0,120,100);
	 pop.add(popco);
	 pop.setBackground(Color.white);
	 pop.setLayout(null);
	 pop.setBounds(580,35,120,100);
	 menuBookItems.add(pop);
	 five= new JCheckBox();
	 five.setBounds(630,130,40,30);
	 five.setBackground(Color.gray);
	 menuBookItems.add(five);
	 
	 
	 ImageIcon tac= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\TACOS.png");
	 JPanel tacos= new JPanel();
	 JLabel tacoLabl= new JLabel();
	 tacoLabl.setIcon(tac);
	 tacoLabl.setBounds(0,0,120,100);
	 tacos.add(tacoLabl);
	 tacos.setBackground(Color.white);
	 tacos.setLayout(null);
	 tacos.setBounds(30,210,120,100);
	 menuBookItems.add(tacos);
	 six= new JCheckBox();
	 six.setBounds(75,300,40,30);
	 six.setBackground(Color.gray);
	 menuBookItems.add(six);
	 
	 ImageIcon burrit= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\burrito.png");
	 JPanel burritos= new JPanel();
	 JLabel buritlan= new JLabel();
	 buritlan.setIcon(burrit);
	 buritlan.setBounds(0,0,120,100);
	 burritos.add(buritlan);
	 burritos.setBackground(Color.white);
	 burritos.setLayout(null);
	 burritos.setBounds(180,210,120,100);
	 menuBookItems.add(burritos);
	 seven= new JCheckBox();
	 seven.setBounds(225,300,40,30);
	 seven.setBackground(Color.gray);
	 menuBookItems.add(seven); 
	 
	 ImageIcon pan= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\managerImages\\pancake.png");
	 JPanel pancake= new JPanel();
	 JLabel panlab= new JLabel();
	 panlab.setIcon(pan);
	 panlab.setBounds(0,0,120,100);
	 pancake.add(panlab);
	 pancake.setBackground(Color.white);
	 pancake.setLayout(null);
	 pancake.setBounds(320,210,120,100);
	 menuBookItems.add(pancake);
	 eight= new JCheckBox();
	 eight.setBounds(365,300,40,30);
	 eight.setBackground(Color.gray);
	 menuBookItems.add(eight);
	 
	 ImageIcon sushi= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\sushi.png");
	 JPanel sushipan= new JPanel();
	 JLabel sus= new JLabel();
	 sus.setIcon(sushi);
	 sus.setBounds(0,0,120,100);
	 sushipan.add(sus);
	 sushipan.setBackground(Color.white);
	 sushipan.setLayout(null);
	 sushipan.setBounds(460,202,120,100);
	 menuBookItems.add(sushipan);
	 nine= new JCheckBox();
	 nine.setBounds(510,300,40,30);
	 nine.setBackground(Color.gray);
	 menuBookItems.add(nine);
	 menuBookItems.setBounds(10,390,720,380);
	 
	 ImageIcon kfcffc= new ImageIcon("..\\OnlineHotelBooking\\src\\LuttonHotelView\\picture\\kfc.png");
	 JPanel kfc= new JPanel();
	 JLabel bucket= new JLabel();
	 bucket.setIcon(kfcffc);
	 bucket.setBounds(0,0,120,100);
	 kfc.add(bucket);
	 kfc.setBackground(Color.white);
	 kfc.setLayout(null);
	 kfc.setBounds(580,202,120,100);
	 menuBookItems.add(kfc);
	 ten= new JCheckBox();
	 ten.setBounds(630,300,40,30);
	 ten.setBackground(Color.gray);
	 menuBookItems.add(ten);
	 
	 
	 menuBookItems.setLayout(null);
	 menuBookItems.setBackground(Color.gray);
	 restaurantFrame.add(menuBookItems);
	 
	 JPanel menuSection= new JPanel();
	 //-----------------------------------------
	 JLabel menus= new JLabel("MENU");
	 menus.setBounds(150,10,120,40);
	 menus.setForeground(Color.white);
	 menus.setFont(new Font("times new roman",Font.BOLD,22));
	 menuSection.add(menus);
	 
	 //------------
	 JLabel menusitems= new JLabel("<html><i>Burger.............................RS.320<BR>Pizza...............................RS.400<BR>Hotdog...........................RS.350<BR>KFC...............................RS.999<BR>Noodles.........................RS.300<br><br>Popcorn........................RS.250<br>Tacos...........................RS.280<br>burrito...........................RS.350<br>pancake...........................RS.260<BR>Sushi...............................Rs.440");
	 menusitems.setBounds(50,50,280,250);
	 menusitems.setForeground(Color.white);
	 menusitems.setFont(new Font("times new roman",Font.BOLD,18));
	 menuSection.add(menusitems);
	 menuSection.setBackground(Color.darkGray);
	 menuSection.setBorder(necessaryWhiteBorder);
	 menuSection.setBounds(740,390,355,380);
	 menuSection.setLayout(null);
	 restaurantFrame.add(menuSection);
	 
	 restaurantFrame.setSize(1120,820);
	 restaurantFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 restaurantFrame.setLayout(null);
	 restaurantFrame.setResizable(false);
	 restaurantFrame.setLocationRelativeTo(null);
	 restaurantFrame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {

	if (e.getSource()==homebtnim) {
		CustomerDashboard newopendashpl= new CustomerDashboard();
		restaurantFrame.dispose();
	}
	if (e.getSource() == orderit) {
        double total =0;

        if (one.isSelected()) {
            total +=320 ;
        }

        if (two.isSelected()) {
            total += 400;
        }

        if (three.isSelected()) {
            total += 350;
        }

        if (four.isSelected()) {
            total += 300;
        }

        if (five.isSelected()) {
            total += 250;
        }

        if (six.isSelected()) {
            total += 250;
        }
        if (seven.isSelected()) {
            total += 280;
        }

        if (eight.isSelected()) {
            total += 350;
        }

        if (nine.isSelected()) {
            total += 440;
        }

        if (ten.isSelected()) {
            total += 999;
        }


        totalcal.setText(String.format("%.2f", total));
        UIManager.put("OptionPane.messageForeground", Color.black);
		UIManager.put("OptionPane.background", Color.yellow);
		UIManager.put("Panel.background", Color.decode("#5CE1E6"));

		UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

		JOptionPane.showMessageDialog(null, "Successfully Ordered!!");
        generate.setEnabled(true);
    }

}






	
public static void main(String[]args) {
	new Restaurant();
}
}
